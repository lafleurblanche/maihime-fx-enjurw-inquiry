package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW18FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW18FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW18FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW18FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW18FromStaInfo.select {
                EnjuRW18FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW18FromStaInfoData(
                    it[EnjuRW18FromStaInfo.id],
                    it[EnjuRW18FromStaInfo.fromStaCode],
                    it[EnjuRW18FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
