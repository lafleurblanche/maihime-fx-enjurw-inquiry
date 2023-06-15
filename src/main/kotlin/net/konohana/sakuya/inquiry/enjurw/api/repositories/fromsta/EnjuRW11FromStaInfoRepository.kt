package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW11FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW11FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW11FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW11FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW11FromStaInfo.select {
                EnjuRW11FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW11FromStaInfoData(
                    it[EnjuRW11FromStaInfo.id],
                    it[EnjuRW11FromStaInfo.fromStaCode],
                    it[EnjuRW11FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
