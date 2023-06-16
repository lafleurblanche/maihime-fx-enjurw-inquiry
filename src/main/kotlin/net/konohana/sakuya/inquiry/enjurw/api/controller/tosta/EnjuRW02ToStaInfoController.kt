package net.konohana.sakuya.inquiry.enjurw.api.controller.tosta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.tosta.EnjuRW02ToStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW02ToStaInfoData

fun Route.enjuRW02ToStaInfoController() {
    route("api") {
        route("tosta") {
            route("enjurw02") {
                get("{toStaCode}") {
                    val toStaCode = call.parameters["toStaCode"] ?: throw IllegalArgumentException("Invalid toStaCode")
                    val enjuRW02ToStaInfoData = EnjuRW02ToStaInfoService.findByToStaCode(toStaCode)
                    if (enjuRW02ToStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW02ToStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW02ToStaInfoData(
                                id = 0,
                                toStaCode = "TORW9999",
                                toStaName = "該当駅なし",
                            )
                        )
                    }
                }
            }
        }
    }
}
