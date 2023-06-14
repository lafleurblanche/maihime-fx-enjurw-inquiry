package net.konohana.sakuya.inquiry.enjurw.api.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.inquiry.enjurw.api.controller.enjuRW01FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.enjuRW02FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.enjuRW03FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.enjuRW04FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.enjuRW05FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.notFoundFromStaInfoController

fun Route.enjuRWFromStaInfoApiRouter() {
    enjuRW01FromStaInfoController()
    enjuRW02FromStaInfoController()
    enjuRW03FromStaInfoController()
    enjuRW04FromStaInfoController()
    enjuRW05FromStaInfoController()
    notFoundFromStaInfoController()
}
