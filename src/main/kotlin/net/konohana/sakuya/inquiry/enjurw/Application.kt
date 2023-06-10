package net.konohana.sakuya.inquiry.enjurw

import io.ktor.server.application.Application
import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.plugins.configureRouting
import net.konohana.sakuya.inquiry.enjurw.plugins.configureSerialization
import net.konohana.sakuya.inquiry.enjurw.plugins.configureTemplating

fun main(args: Array<String>): Unit =
    io.ktor.server.jetty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val url = environment.config.property("ktor.mioridb.uri").getString()
    val username = environment.config.property("ktor.mioridb.username").getString()
    val password = environment.config.property("ktor.mioridb.password").getString()
    DatabaseFactory.initMioriDB(url, username, password)
    configureSerialization()
    configureTemplating()
    configureRouting()
}
