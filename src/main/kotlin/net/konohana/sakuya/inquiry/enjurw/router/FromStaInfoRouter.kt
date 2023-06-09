package net.konohana.sakuya.inquiry.enjurw.router

import io.ktor.server.application.call
import io.ktor.server.freemarker.FreeMarkerContent
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.dao.dao

fun Route.fromStaInfoRouter() {
    route("enjurw01") {
        get {
            call.respond(FreeMarkerContent("index.ftl", mapOf("fromStaInfo" to dao.allEnjuRW01FromStaInfo())))
        }
    }
    route("enjurw02") {
        get {
            call.respond(FreeMarkerContent("index_enjurw02.ftl", mapOf("fromStaInfo" to dao.allEnjuRW02FromStaInfo())))
        }
    }
}
