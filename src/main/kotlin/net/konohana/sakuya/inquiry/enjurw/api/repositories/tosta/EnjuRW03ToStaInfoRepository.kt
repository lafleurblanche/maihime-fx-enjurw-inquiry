package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW03ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW03ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW03ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW03ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW03ToStaInfo.select {
                EnjuRW03ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW03ToStaInfoData(
                    it[EnjuRW03ToStaInfo.id],
                    it[EnjuRW03ToStaInfo.toStaCode],
                    it[EnjuRW03ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
