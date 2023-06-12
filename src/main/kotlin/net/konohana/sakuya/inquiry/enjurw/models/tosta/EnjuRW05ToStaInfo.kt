package net.konohana.sakuya.inquiry.enjurw.models.tosta

import org.jetbrains.exposed.sql.Table

/**
 * ## EnjuRW05ToStaInfoモデル
 * * 筮谷線降車駅情報
 * @author lafleurblanche
 */
object EnjuRW05ToStaInfo : Table("enju_rw05_to_sta_info") {
    /** ID(自動採番) */
    val id = integer("id").autoIncrement()
    /** 降車駅コード */
    val toStaCode = varchar("to_sta_code", length = 20)
    /** 降車駅名 */
    val toStaName = varchar("to_sta_name", length = 20)
}
