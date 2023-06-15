package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW13FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW13FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW13FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW13FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW13FromStaInfo.select {
                EnjuRW13FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW13FromStaInfoData(
                    it[EnjuRW13FromStaInfo.id],
                    it[EnjuRW13FromStaInfo.fromStaCode],
                    it[EnjuRW13FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
