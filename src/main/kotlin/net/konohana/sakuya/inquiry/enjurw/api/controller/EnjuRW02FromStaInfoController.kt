package net.konohana.sakuya.inquiry.enjurw.api.controller

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.EnjuRW02FromStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW02FromStaInfoData

fun Route.enjuRW02FromStaInfoController() {
    route("api") {
        route("fromsta") {
            route("enjurw02") {
                get("{fromStaCode}") {
                    val fromStaCode = call.parameters["fromStaCode"] ?: throw IllegalArgumentException("Invalid fromStaCode")
                    val enjuRW02FromStaInfoData = EnjuRW02FromStaInfoService.findByFromStaCode(fromStaCode)
                    if (enjuRW02FromStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW02FromStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW02FromStaInfoData(
                                id = 0,
                                fromStaCode = "FRRW9999",
                                fromStaName = "該当駅なし",
                            )
                        )
                    }
                }
            }
        }
    }
}
