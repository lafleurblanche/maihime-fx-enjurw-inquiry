package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW04FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW04FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW04FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW04FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW04FromStaInfo.select {
                EnjuRW04FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW04FromStaInfoData(
                    it[EnjuRW04FromStaInfo.id],
                    it[EnjuRW04FromStaInfo.fromStaCode],
                    it[EnjuRW04FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
