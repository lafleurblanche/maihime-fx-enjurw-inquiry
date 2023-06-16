package net.konohana.sakuya.inquiry.enjurw.api.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW01ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW02ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW03ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW04ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.notFoundToStaInfoController

fun Route.enjuRWToStaInfoApiRouter() {
    enjuRW01ToStaInfoController()
    enjuRW02ToStaInfoController()
    enjuRW03ToStaInfoController()
    enjuRW04ToStaInfoController()
    notFoundToStaInfoController()
}
