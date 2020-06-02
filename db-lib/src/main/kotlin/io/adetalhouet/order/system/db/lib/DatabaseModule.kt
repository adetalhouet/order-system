package io.adetalhouet.order.system.db.lib

import com.google.inject.AbstractModule
import com.google.inject.Key
import com.google.inject.name.Names

class DatabaseModule : AbstractModule() {
    companion object {
        val DEFAULT_INSTANCE: Key<DatabaseService> = Key.get(DatabaseService::class.java, Names.named("Default"))
    }

    override fun configure() {
        bind(DatabaseService::class.java)
            .annotatedWith(Names.named("Default"))
            .toInstance(defaultDatabaseConnection())
    }
}