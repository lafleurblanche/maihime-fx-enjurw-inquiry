package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW10ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW10ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW10ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW10ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW10ToStaInfo.select {
                EnjuRW10ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW10ToStaInfoData(
                    it[EnjuRW10ToStaInfo.id],
                    it[EnjuRW10ToStaInfo.toStaCode],
                    it[EnjuRW10ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
