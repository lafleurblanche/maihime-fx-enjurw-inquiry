package net.konohana.sakuya.inquiry.enjurw.models

import org.jetbrains.exposed.sql.Table

/**
 * ## EnjuRW09FromStaInfoモデル
 * * 箬谷線乗車駅情報
 * @author lafleurblanche
 */
object EnjuRW09FromStaInfo : Table("enju_rw09_from_sta_info") {
    /** ID(自動採番) */
    val id = integer("id").autoIncrement()
    /** 乗車駅コード */
    val fromStaCode = varchar("from_sta_code", length = 20)
    /** 乗車駅名 */
    val fromStaName = varchar("from_sta_name", length = 20)
}