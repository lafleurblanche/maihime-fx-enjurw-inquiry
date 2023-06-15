package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW10FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW10FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW10FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW10FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW10FromStaInfo.select {
                EnjuRW10FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW10FromStaInfoData(
                    it[EnjuRW10FromStaInfo.id],
                    it[EnjuRW10FromStaInfo.fromStaCode],
                    it[EnjuRW10FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
