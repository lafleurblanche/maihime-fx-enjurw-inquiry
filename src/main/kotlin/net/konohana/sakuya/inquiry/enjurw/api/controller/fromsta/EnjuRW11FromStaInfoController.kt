package net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.fromsta.EnjuRW11FromStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW11FromStaInfoData

fun Route.enjuRW11FromStaInfoController() {
    route("api") {
        route("fromsta") {
            route("enjurw11") {
                get("{fromStaCode}") {
                    val fromStaCode = call.parameters["fromStaCode"] ?: throw IllegalArgumentException("Invalid fromStaCode")
                    val enjuRW11FromStaInfoData = EnjuRW11FromStaInfoService.findByFromStaCode(fromStaCode)
                    if (enjuRW11FromStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW11FromStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW11FromStaInfoData(
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
