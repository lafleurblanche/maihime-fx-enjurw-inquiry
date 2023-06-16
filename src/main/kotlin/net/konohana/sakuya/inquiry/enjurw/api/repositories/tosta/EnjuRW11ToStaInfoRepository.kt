package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW11ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW11ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW11ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW11ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW11ToStaInfo.select {
                EnjuRW11ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW11ToStaInfoData(
                    it[EnjuRW11ToStaInfo.id],
                    it[EnjuRW11ToStaInfo.toStaCode],
                    it[EnjuRW11ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
