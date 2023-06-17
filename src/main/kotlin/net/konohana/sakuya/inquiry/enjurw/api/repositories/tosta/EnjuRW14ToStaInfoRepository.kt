package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW14ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW14ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW14ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW14ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW14ToStaInfo.select {
                EnjuRW14ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW14ToStaInfoData(
                    it[EnjuRW14ToStaInfo.id],
                    it[EnjuRW14ToStaInfo.toStaCode],
                    it[EnjuRW14ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}