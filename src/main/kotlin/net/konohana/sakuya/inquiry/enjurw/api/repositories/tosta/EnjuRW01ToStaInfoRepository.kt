package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW01ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW01ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW01ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW01ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW01ToStaInfo.select {
                EnjuRW01ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW01ToStaInfoData(
                    it[EnjuRW01ToStaInfo.id],
                    it[EnjuRW01ToStaInfo.toStaCode],
                    it[EnjuRW01ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
