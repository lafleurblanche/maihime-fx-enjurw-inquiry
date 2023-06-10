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
            call.respond(FreeMarkerContent("index_enjurw01.ftl", mapOf("fromStaInfo" to dao.allEnjuRW01FromStaInfo())))
        }
    }
    route("enjurw02") {
        get {
            call.respond(FreeMarkerContent("index_enjurw02.ftl", mapOf("fromStaInfo" to dao.allEnjuRW02FromStaInfo())))
        }
    }
    route("enjurw03") {
        get {
            call.respond(FreeMarkerContent("index_enjurw03.ftl", mapOf("fromStaInfo" to dao.allEnjuRW03FromStaInfo())))
        }
    }
    route("enjurw04") {
        get {
            call.respond(FreeMarkerContent("index_enjurw04.ftl", mapOf("fromStaInfo" to dao.allEnjuRW04FromStaInfo())))
        }
    }
    route("enjurw05") {
        get {
            call.respond(FreeMarkerContent("index_enjurw05.ftl", mapOf("fromStaInfo" to dao.allEnjuRW05FromStaInfo())))
        }
    }
    route("enjurw06") {
        get {
            call.respond(FreeMarkerContent("index_enjurw06.ftl", mapOf("fromStaInfo" to dao.allEnjuRW06FromStaInfo())))
        }
    }
    route("enjurw07") {
        get {
            call.respond(FreeMarkerContent("index_enjurw07.ftl", mapOf("fromStaInfo" to dao.allEnjuRW07FromStaInfo())))
        }
    }
    route("enjurw08") {
        get {
            call.respond(FreeMarkerContent("index_enjurw08.ftl", mapOf("fromStaInfo" to dao.allEnjuRW08FromStaInfo())))
        }
    }
}
