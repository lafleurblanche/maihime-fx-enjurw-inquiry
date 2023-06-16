package net.konohana.sakuya.inquiry.enjurw.api.controller.tosta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.tosta.EnjuRW03ToStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW03ToStaInfoData

fun Route.enjuRW03ToStaInfoController() {
    route("api") {
        route("tosta") {
            route("enjurw03") {
                get("{toStaCode}") {
                    val toStaCode = call.parameters["toStaCode"] ?: throw IllegalArgumentException("Invalid toStaCode")
                    val enjuRW03ToStaInfoData = EnjuRW03ToStaInfoService.findByToStaCode(toStaCode)
                    if (enjuRW03ToStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW03ToStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW03ToStaInfoData(
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
