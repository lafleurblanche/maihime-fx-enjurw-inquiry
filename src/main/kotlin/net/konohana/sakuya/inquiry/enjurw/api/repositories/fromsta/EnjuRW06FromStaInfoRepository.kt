package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW06FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW06FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW06FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW06FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW06FromStaInfo.select {
                EnjuRW06FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW06FromStaInfoData(
                    it[EnjuRW06FromStaInfo.id],
                    it[EnjuRW06FromStaInfo.fromStaCode],
                    it[EnjuRW06FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
