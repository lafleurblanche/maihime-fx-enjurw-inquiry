package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW19FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW19FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW19FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW19FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW19FromStaInfo.select {
                EnjuRW19FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW19FromStaInfoData(
                    it[EnjuRW19FromStaInfo.id],
                    it[EnjuRW19FromStaInfo.fromStaCode],
                    it[EnjuRW19FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
