package io.adetalhouet.order.system.db.lib

import io.grpc.Status
import io.grpc.StatusException
import org.jetbrains.exposed.sql.SqlLogger
import org.jetbrains.exposed.sql.Transaction
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.statements.StatementContext
import org.jetbrains.exposed.sql.statements.expandArgs
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction
import org.slf4j.LoggerFactory

object DatabaseTransaction {
    private val log = LoggerFactory.getLogger(DatabaseTransaction::class.java)

    @Throws(StatusException::class)
    suspend fun <T> dbQuery(block: () -> T): T = newSuspendedTransaction {
        addLogger(SqlLogger(block.javaClass.name))

        try {
            block()
        } catch (e: Exception) {
            log.error("SQL(id=${this.id}) failed", e)
            throw StatusException(Status.INTERNAL.withDescription("Fail to perform database transaction(id= ${this.id})"))
        }
    }
}

private class SqlLogger(name: String) : SqlLogger {
    private val log = LoggerFactory.getLogger(name)

    override
    fun log(context: StatementContext, transaction: Transaction) {
        log.info("SQL(id=${transaction.id}): ${context.expandArgs(transaction)}")
    }
}