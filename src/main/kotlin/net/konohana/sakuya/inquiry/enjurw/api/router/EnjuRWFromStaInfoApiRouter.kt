package net.konohana.sakuya.inquiry.enjurw.api.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW01FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW02FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW03FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW04FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW05FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW06FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.notFoundFromStaInfoController

fun Route.enjuRWFromStaInfoApiRouter() {
    enjuRW01FromStaInfoController()
    enjuRW02FromStaInfoController()
    enjuRW03FromStaInfoController()
    enjuRW04FromStaInfoController()
    enjuRW05FromStaInfoController()
    enjuRW06FromStaInfoController()
    notFoundFromStaInfoController()
}
