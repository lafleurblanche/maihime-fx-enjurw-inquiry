package net.konohana.sakuya.inquiry.enjurw.router

import io.ktor.server.application.call
import io.ktor.server.freemarker.FreeMarkerContent
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.dao.daoToStaInfo

fun Route.toStaInfoRouter() {
    route("tostainfo") {
        route("enjurw01") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw01.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW01ToStaInfo())
                    )
                )
            }
        }
        route("enjurw02") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw02.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW02ToStaInfo())
                    )
                )
            }
        }
        route("enjurw03") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw03.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW03ToStaInfo())
                    )
                )
            }
        }
        route("enjurw04") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw04.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW04ToStaInfo())
                    )
                )
            }
        }
    }
}
