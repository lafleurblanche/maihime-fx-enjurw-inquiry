package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW09ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW09ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW09ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW09ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW09ToStaInfo.select {
                EnjuRW09ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW09ToStaInfoData(
                    it[EnjuRW09ToStaInfo.id],
                    it[EnjuRW09ToStaInfo.toStaCode],
                    it[EnjuRW09ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
