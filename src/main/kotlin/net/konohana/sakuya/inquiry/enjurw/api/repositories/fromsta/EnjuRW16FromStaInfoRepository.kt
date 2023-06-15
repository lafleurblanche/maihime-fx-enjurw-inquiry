package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW16FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW16FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW16FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW16FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW16FromStaInfo.select {
                EnjuRW16FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW16FromStaInfoData(
                    it[EnjuRW16FromStaInfo.id],
                    it[EnjuRW16FromStaInfo.fromStaCode],
                    it[EnjuRW16FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
