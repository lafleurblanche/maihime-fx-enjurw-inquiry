package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW14FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW14FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW14FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW14FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW14FromStaInfo.select {
                EnjuRW14FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW14FromStaInfoData(
                    it[EnjuRW14FromStaInfo.id],
                    it[EnjuRW14FromStaInfo.fromStaCode],
                    it[EnjuRW14FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
