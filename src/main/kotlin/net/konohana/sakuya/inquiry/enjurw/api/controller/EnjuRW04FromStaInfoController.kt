package net.konohana.sakuya.inquiry.enjurw.api.controller

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.EnjuRW04FromStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW04FromStaInfoData

fun Route.enjuRW04FromStaInfoController() {
    route("api") {
        route("fromsta") {
            route("enjurw04") {
                get("{fromStaCode}") {
                    val fromStaCode = call.parameters["fromStaCode"] ?: throw IllegalArgumentException("Invalid fromStaCode")
                    val enjuRW04FromStaInfoData = EnjuRW04FromStaInfoService.findByFromStaCode(fromStaCode)
                    if (enjuRW04FromStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW04FromStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW04FromStaInfoData(
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
