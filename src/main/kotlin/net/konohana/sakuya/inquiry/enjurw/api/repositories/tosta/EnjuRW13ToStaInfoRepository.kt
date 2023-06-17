package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW13ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW13ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW13ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW13ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW13ToStaInfo.select {
                EnjuRW13ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW13ToStaInfoData(
                    it[EnjuRW13ToStaInfo.id],
                    it[EnjuRW13ToStaInfo.toStaCode],
                    it[EnjuRW13ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
