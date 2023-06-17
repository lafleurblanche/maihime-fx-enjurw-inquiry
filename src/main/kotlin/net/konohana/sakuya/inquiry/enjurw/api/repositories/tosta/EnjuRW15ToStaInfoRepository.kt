package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW15ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW15ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW15ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW15ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW15ToStaInfo.select {
                EnjuRW15ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW15ToStaInfoData(
                    it[EnjuRW15ToStaInfo.id],
                    it[EnjuRW15ToStaInfo.toStaCode],
                    it[EnjuRW15ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
