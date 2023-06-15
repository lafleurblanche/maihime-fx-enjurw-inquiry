package net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.fromsta.EnjuRW10FromStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW10FromStaInfoData

fun Route.enjuRW10FromStaInfoController() {
    route("api") {
        route("fromsta") {
            route("enjurw10") {
                get("{fromStaCode}") {
                    val fromStaCode = call.parameters["fromStaCode"] ?: throw IllegalArgumentException("Invalid fromStaCode")
                    val enjuRW10FromStaInfoData = EnjuRW10FromStaInfoService.findByFromStaCode(fromStaCode)
                    if (enjuRW10FromStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW10FromStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW10FromStaInfoData(
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
