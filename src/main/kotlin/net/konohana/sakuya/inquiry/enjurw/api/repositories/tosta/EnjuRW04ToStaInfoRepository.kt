package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW04ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW04ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW04ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW04ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW04ToStaInfo.select {
                EnjuRW04ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW04ToStaInfoData(
                    it[EnjuRW04ToStaInfo.id],
                    it[EnjuRW04ToStaInfo.toStaCode],
                    it[EnjuRW04ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
