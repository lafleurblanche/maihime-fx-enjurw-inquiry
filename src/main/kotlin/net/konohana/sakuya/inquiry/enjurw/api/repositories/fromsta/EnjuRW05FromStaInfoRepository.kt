package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW05FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW05FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW05FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW05FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW05FromStaInfo.select {
                EnjuRW05FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW05FromStaInfoData(
                    it[EnjuRW05FromStaInfo.id],
                    it[EnjuRW05FromStaInfo.fromStaCode],
                    it[EnjuRW05FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
