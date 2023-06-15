package net.konohana.sakuya.inquiry.enjurw.api.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW01ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.notFoundToStaInfoController

fun Route.enjuRWToStaInfoApiRouter() {
    enjuRW01ToStaInfoController()
    notFoundToStaInfoController()
}
