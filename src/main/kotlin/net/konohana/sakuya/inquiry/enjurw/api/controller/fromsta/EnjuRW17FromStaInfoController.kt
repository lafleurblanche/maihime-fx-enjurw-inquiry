package net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.fromsta.EnjuRW17FromStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW17FromStaInfoData

fun Route.enjuRW17FromStaInfoController() {
    route("api") {
        route("fromsta") {
            route("enjurw17") {
                get("{fromStaCode}") {
                    val fromStaCode = call.parameters["fromStaCode"] ?: throw IllegalArgumentException("Invalid fromStaCode")
                    val enjuRW17FromStaInfoData = EnjuRW17FromStaInfoService.findByFromStaCode(fromStaCode)
                    if (enjuRW17FromStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW17FromStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW17FromStaInfoData(
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
