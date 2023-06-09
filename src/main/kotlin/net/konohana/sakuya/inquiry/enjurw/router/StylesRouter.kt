package net.konohana.sakuya.inquiry.enjurw.router

import io.ktor.server.application.call
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import kotlinx.css.BorderCollapse
import kotlinx.css.Color
import kotlinx.css.TextAlign
import kotlinx.css.border
import kotlinx.css.borderCollapse
import kotlinx.css.color
import kotlinx.css.fontFamily
import kotlinx.css.margin
import kotlinx.css.px
import kotlinx.css.textAlign
import kotlinx.css.width
import net.konohana.sakuya.inquiry.enjurw.plugins.respondCss

fun Route.stylesRouter() {
    get("/styles.css") {
        call.respondCss {
            kotlinx.css.body {
                margin(25.px)
            }
            kotlinx.css.h2 {
                fontFamily = "Meiryo, sans-serif"
            }
            kotlinx.css.h3 {
                fontFamily = "Meiryo, sans-serif"
            }
            kotlinx.css.table {
                border = "1px solid #000"
                borderCollapse = BorderCollapse.collapse
            }
            kotlinx.css.th {
                border = "1px solid #000"
                fontFamily = "Meiryo, sans-serif"
            }
            kotlinx.css.td {
                width = 135.px
                border = "1px solid #000"
                textAlign = TextAlign.center
                fontFamily = "Meiryo,sans-serif"
            }
            rule("h1.page-title") {
                color = Color.white
            }
        }
    }
}
