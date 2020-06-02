package io.adetalhouet.order.system.db.lib

data class DatabaseConnectionProperties(val driverName: String,
                                        val url: String,
                                        val username: String,
                                        val password: String)