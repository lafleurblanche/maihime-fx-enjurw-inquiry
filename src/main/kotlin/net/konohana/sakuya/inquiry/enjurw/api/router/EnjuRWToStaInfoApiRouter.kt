package net.konohana.sakuya.inquiry.enjurw.api.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW01ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW02ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW03ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW04ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW05ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW06ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW07ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW08ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW09ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW10ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW11ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW12ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW13ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW14ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW15ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW16ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW17ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW18ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.enjuRW19ToStaInfoController
import net.konohana.sakuya.inquiry.enjurw.api.controller.tosta.notFoundToStaInfoController

fun Route.enjuRWToStaInfoApiRouter() {
    enjuRW01ToStaInfoController()
    enjuRW02ToStaInfoController()
    enjuRW03ToStaInfoController()
    enjuRW04ToStaInfoController()
    enjuRW05ToStaInfoController()
    enjuRW06ToStaInfoController()
    enjuRW07ToStaInfoController()
    enjuRW08ToStaInfoController()
    enjuRW09ToStaInfoController()
    enjuRW09ToStaInfoController()
    enjuRW10ToStaInfoController()
    enjuRW11ToStaInfoController()
    enjuRW12ToStaInfoController()
    enjuRW13ToStaInfoController()
    enjuRW14ToStaInfoController()
    enjuRW15ToStaInfoController()
    enjuRW16ToStaInfoController()
    enjuRW17ToStaInfoController()
    enjuRW18ToStaInfoController()
    enjuRW19ToStaInfoController()
    notFoundToStaInfoController()
}
