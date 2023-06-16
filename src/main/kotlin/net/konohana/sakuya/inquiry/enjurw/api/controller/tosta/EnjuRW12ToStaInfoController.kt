package net.konohana.sakuya.inquiry.enjurw.api.controller.tosta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.tosta.EnjuRW12ToStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW12ToStaInfoData

fun Route.enjuRW12ToStaInfoController() {
    route("api") {
        route("tosta") {
            route("enjurw12") {
                get("{toStaCode}") {
                    val toStaCode = call.parameters["toStaCode"] ?: throw IllegalArgumentException("Invalid toStaCode")
                    val enjuRW12ToStaInfoData = EnjuRW12ToStaInfoService.findByToStaCode(toStaCode)
                    if (enjuRW12ToStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW12ToStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW12ToStaInfoData(
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
