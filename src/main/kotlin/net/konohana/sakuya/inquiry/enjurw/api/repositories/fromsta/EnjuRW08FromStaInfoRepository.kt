package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW08FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW08FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW08FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW08FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW08FromStaInfo.select {
                EnjuRW08FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW08FromStaInfoData(
                    it[EnjuRW08FromStaInfo.id],
                    it[EnjuRW08FromStaInfo.fromStaCode],
                    it[EnjuRW08FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
