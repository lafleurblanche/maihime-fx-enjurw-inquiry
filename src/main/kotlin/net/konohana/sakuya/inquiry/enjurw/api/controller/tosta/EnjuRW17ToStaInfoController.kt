package net.konohana.sakuya.inquiry.enjurw.api.controller.tosta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.api.services.tosta.EnjuRW17ToStaInfoService
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW17ToStaInfoData

fun Route.enjuRW17ToStaInfoController() {
    route("api") {
        route("tosta") {
            route("enjurw17") {
                get("{toStaCode}") {
                    val toStaCode = call.parameters["toStaCode"] ?: throw IllegalArgumentException("Invalid toStaCode")
                    val enjuRW17ToStaInfoData = EnjuRW17ToStaInfoService.findByToStaCode(toStaCode)
                    if (enjuRW17ToStaInfoData != null) {
                        call.respond(HttpStatusCode.OK, enjuRW17ToStaInfoData)
                    } else {
                        call.respond(
                            HttpStatusCode.OK,
                            EnjuRW17ToStaInfoData(
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
