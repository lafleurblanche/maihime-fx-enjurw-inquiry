package net.konohana.sakuya.inquiry.enjurw.plugins

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.application.install
import io.ktor.server.freemarker.FreeMarkerContent
import io.ktor.server.http.content.staticResources
import io.ktor.server.plugins.statuspages.StatusPages
import io.ktor.server.response.respond
import io.ktor.server.response.respondRedirect
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import net.konohana.sakuya.inquiry.enjurw.dao.dao
import net.konohana.sakuya.inquiry.enjurw.router.stylesRouter

fun Application.configureRouting() {
    
    install(StatusPages) {
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause" , status = HttpStatusCode.InternalServerError)
        }
    }
    routing {
        get("/") {
            call.respondRedirect("enjurw01")
        }
        // Static plugin. Try to access `/static/index.html`
        staticResources("/static", "static")
        route("enjurw01") {
            get {
                call.respond(FreeMarkerContent("index.ftl", mapOf("articles" to dao.allEnjuRW01FromStaInfo())))
            }
        }
        stylesRouter()
    }
}
