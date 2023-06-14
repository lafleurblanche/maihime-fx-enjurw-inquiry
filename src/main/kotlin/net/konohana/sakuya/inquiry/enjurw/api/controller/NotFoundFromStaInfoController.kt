package net.konohana.sakuya.inquiry.enjurw.api.controller

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.NotFoundFromStaInfoData

fun Route.notFoundFromStaInfoController() {
    route("api") {
        route("fromsta") {
            route("notfound") {
                get("{fromStaCode}") {
                    call.respond(
                        HttpStatusCode.OK,
                        NotFoundFromStaInfoData(
                            id = 0,
                            fromStaCode = "NotFound",
                            fromStaName = "該当駅なし",
                        )
                    )
                }
            }
        }
    }
}
