package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW18ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW18ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW18ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW18ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW18ToStaInfo.select {
                EnjuRW18ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW18ToStaInfoData(
                    it[EnjuRW18ToStaInfo.id],
                    it[EnjuRW18ToStaInfo.toStaCode],
                    it[EnjuRW18ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
