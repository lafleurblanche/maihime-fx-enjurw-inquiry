package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW06ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW06ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW06ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW06ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW06ToStaInfo.select {
                EnjuRW06ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW06ToStaInfoData(
                    it[EnjuRW06ToStaInfo.id],
                    it[EnjuRW06ToStaInfo.toStaCode],
                    it[EnjuRW06ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
