package net.konohana.sakuya.inquiry.enjurw.api.controller.tosta

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.NotFoundToStaInfoData

fun Route.notFoundToStaInfoController() {
    route("api") {
        route("tosta") {
            route("notfound") {
                get("{toStaCode}") {
                    call.respond(
                        HttpStatusCode.OK,
                        NotFoundToStaInfoData(
                            id = 0,
                            toStaCode = "NotFound",
                            toStaName = "該当駅なし",
                        )
                    )
                }
            }
        }
    }
}
