package net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.fromsta.EnjuRW13FromStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW13FromStaInfoData

fun Route.enjuRW13FromStaInfoController() {
    route("api") {
        route("fromsta") {
            route("enjurw13") {
                get("{fromStaCode}") {
                    val fromStaCode = call.parameters["fromStaCode"] ?: throw IllegalArgumentException("Invalid fromStaCode")
                    val enjuRW13FromStaInfoData = EnjuRW13FromStaInfoService.findByFromStaCode(fromStaCode)
                    if (enjuRW13FromStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW13FromStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW13FromStaInfoData(
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
