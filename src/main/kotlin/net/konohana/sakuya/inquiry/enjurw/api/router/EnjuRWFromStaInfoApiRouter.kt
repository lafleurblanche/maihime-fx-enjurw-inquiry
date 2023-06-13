package net.konohana.sakuya.inquiry.enjurw.api.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.inquiry.enjurw.api.controller.enjuRW01FromStaInfoController

fun Route.enjuRWFromStaInfoApiRouter() {
    enjuRW01FromStaInfoController()
}
