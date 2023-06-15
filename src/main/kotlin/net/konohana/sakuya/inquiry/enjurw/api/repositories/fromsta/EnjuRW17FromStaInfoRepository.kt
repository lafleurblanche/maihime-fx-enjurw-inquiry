package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW17FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW17FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW17FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW17FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW17FromStaInfo.select {
                EnjuRW17FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW17FromStaInfoData(
                    it[EnjuRW17FromStaInfo.id],
                    it[EnjuRW17FromStaInfo.fromStaCode],
                    it[EnjuRW17FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
