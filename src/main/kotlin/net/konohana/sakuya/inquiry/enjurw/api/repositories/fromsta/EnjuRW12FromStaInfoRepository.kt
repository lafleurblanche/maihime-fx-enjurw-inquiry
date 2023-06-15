package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW12FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW12FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW12FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW12FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW12FromStaInfo.select {
                EnjuRW12FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW12FromStaInfoData(
                    it[EnjuRW12FromStaInfo.id],
                    it[EnjuRW12FromStaInfo.fromStaCode],
                    it[EnjuRW12FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
