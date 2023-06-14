package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW03FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW03FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW03FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW03FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW03FromStaInfo.select {
                EnjuRW03FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW03FromStaInfoData(
                    it[EnjuRW03FromStaInfo.id],
                    it[EnjuRW03FromStaInfo.fromStaCode],
                    it[EnjuRW03FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
