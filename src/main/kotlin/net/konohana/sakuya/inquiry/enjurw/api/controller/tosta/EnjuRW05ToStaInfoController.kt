package net.konohana.sakuya.inquiry.enjurw.api.controller.tosta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.tosta.EnjuRW05ToStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW05ToStaInfoData

fun Route.enjuRW05ToStaInfoController() {
    route("api") {
        route("tosta") {
            route("enjurw05") {
                get("{toStaCode}") {
                    val toStaCode = call.parameters["toStaCode"] ?: throw IllegalArgumentException("Invalid toStaCode")
                    val enjuRW05ToStaInfoData = EnjuRW05ToStaInfoService.findByToStaCode(toStaCode)
                    if (enjuRW05ToStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW05ToStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW05ToStaInfoData(
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
