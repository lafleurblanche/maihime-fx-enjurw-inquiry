package net.konohana.sakuya.inquiry.enjurw.dao

import kotlinx.coroutines.Dispatchers
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction

object DatabaseFactory {
    fun initMioriDB(url: String, username: String, password: String) = Database.connect(
        url = url,
        driver = "org.postgresql.Driver",
        user = username,
        password = password
    )

    suspend fun <T> dbQuery(block: suspend () -> T): T =
        newSuspendedTransaction(Dispatchers.IO) { block() }
}
