package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW07FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW07FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW07FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW07FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW07FromStaInfo.select {
                EnjuRW07FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW07FromStaInfoData(
                    it[EnjuRW07FromStaInfo.id],
                    it[EnjuRW07FromStaInfo.fromStaCode],
                    it[EnjuRW07FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
