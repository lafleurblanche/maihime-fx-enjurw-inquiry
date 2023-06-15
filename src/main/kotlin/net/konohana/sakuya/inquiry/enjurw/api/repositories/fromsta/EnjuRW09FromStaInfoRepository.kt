package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW09FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW09FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW09FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW09FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW09FromStaInfo.select {
                EnjuRW09FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW09FromStaInfoData(
                    it[EnjuRW09FromStaInfo.id],
                    it[EnjuRW09FromStaInfo.fromStaCode],
                    it[EnjuRW09FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
