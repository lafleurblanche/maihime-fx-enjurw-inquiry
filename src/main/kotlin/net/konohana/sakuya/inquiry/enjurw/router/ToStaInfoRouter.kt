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
        route("enjurw05") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw05.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW05ToStaInfo())
                    )
                )
            }
        }
        route("enjurw06") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw06.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW06ToStaInfo())
                    )
                )
            }
        }
        route("enjurw06") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw06.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW06ToStaInfo())
                    )
                )
            }
        }
        route("enjurw07") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw07.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW07ToStaInfo())
                    )
                )
            }
        }
        route("enjurw08") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw08.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW08ToStaInfo())
                    )
                )
            }
        }
        route("enjurw09") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw09.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW09ToStaInfo())
                    )
                )
            }
        }
        route("enjurw10") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw10.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW10ToStaInfo())
                    )
                )
            }
        }
        route("enjurw11") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw11.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW11ToStaInfo())
                    )
                )
            }
        }
        route("enjurw12") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw12.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW12ToStaInfo())
                    )
                )
            }
        }
        route("enjurw13") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw13.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW13ToStaInfo())
                    )
                )
            }
        }
        route("enjurw14") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw14.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW14ToStaInfo())
                    )
                )
            }
        }
        route("enjurw15") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw15.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW15ToStaInfo())
                    )
                )
            }
        }
        route("enjurw16") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw16.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW16ToStaInfo())
                    )
                )
            }
        }
        route("enjurw17") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw17.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW17ToStaInfo())
                    )
                )
            }
        }
        route("enjurw18") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw18.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW12ToStaInfo())
                    )
                )
            }
        }
        route("enjurw19") {
            get {
                call.respond(
                    FreeMarkerContent(
                        "tosta/index_enjurw19.ftl",
                        mapOf("toStaInfo" to daoToStaInfo.allEnjuRW19ToStaInfo())
                    )
                )
            }
        }
    }
}
