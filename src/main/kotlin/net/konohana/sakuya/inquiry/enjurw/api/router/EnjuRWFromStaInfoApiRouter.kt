package net.konohana.sakuya.inquiry.enjurw.api.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW01FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW02FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW03FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW04FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW05FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW06FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW07FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW08FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW09FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW10FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW11FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW12FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW13FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW14FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW15FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW16FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW17FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW18FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.enjuRW19FromStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.fromsta.notFoundFromStaInfoController

fun Route.enjuRWFromStaInfoApiRouter() {
    enjuRW01FromStaInfoController()
    enjuRW02FromStaInfoController()
    enjuRW03FromStaInfoController()
    enjuRW04FromStaInfoController()
    enjuRW05FromStaInfoController()
    enjuRW06FromStaInfoController()
    enjuRW07FromStaInfoController()
    enjuRW08FromStaInfoController()
    enjuRW09FromStaInfoController()
    enjuRW10FromStaInfoController()
    enjuRW11FromStaInfoController()
    enjuRW12FromStaInfoController()
    enjuRW13FromStaInfoController()
    enjuRW14FromStaInfoController()
    enjuRW15FromStaInfoController()
    enjuRW16FromStaInfoController()
    enjuRW17FromStaInfoController()
    enjuRW18FromStaInfoController()
    enjuRW19FromStaInfoController()
    notFoundFromStaInfoController()
}
