package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory.dbQuery
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW01FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW01FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW01FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW01FromStaInfoData? {
        return dbQuery {
            EnjuRW01FromStaInfo.select {
                EnjuRW01FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW01FromStaInfoData(
                    it[EnjuRW01FromStaInfo.id],
                    it[EnjuRW01FromStaInfo.fromStaCode],
                    it[EnjuRW01FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
