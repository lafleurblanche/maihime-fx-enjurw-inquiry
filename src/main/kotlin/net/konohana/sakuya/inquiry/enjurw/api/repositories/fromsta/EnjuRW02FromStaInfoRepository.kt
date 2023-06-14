package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory.dbQuery
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW02FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW02FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW02FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW02FromStaInfoData? {
        return dbQuery {
            EnjuRW02FromStaInfo.select {
                EnjuRW02FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW02FromStaInfoData(
                    it[EnjuRW02FromStaInfo.id],
                    it[EnjuRW02FromStaInfo.fromStaCode],
                    it[EnjuRW02FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
