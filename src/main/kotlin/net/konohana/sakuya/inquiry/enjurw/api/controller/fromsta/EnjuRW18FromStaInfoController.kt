package net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.fromsta.EnjuRW18FromStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW18FromStaInfoData

fun Route.enjuRW18FromStaInfoController() {
    route("api") {
        route("fromsta") {
            route("enjurw18") {
                get("{fromStaCode}") {
                    val fromStaCode = call.parameters["fromStaCode"] ?: throw IllegalArgumentException("Invalid fromStaCode")
                    val enjuRW18FromStaInfoData = EnjuRW18FromStaInfoService.findByFromStaCode(fromStaCode)
                    if (enjuRW18FromStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW18FromStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW18FromStaInfoData(
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
