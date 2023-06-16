package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW02ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW02ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW02ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW02ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW02ToStaInfo.select {
                EnjuRW02ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW02ToStaInfoData(
                    it[EnjuRW02ToStaInfo.id],
                    it[EnjuRW02ToStaInfo.toStaCode],
                    it[EnjuRW02ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
