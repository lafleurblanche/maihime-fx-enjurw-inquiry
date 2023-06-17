package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW19ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW19ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW19ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW19ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW19ToStaInfo.select {
                EnjuRW19ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW19ToStaInfoData(
                    it[EnjuRW19ToStaInfo.id],
                    it[EnjuRW19ToStaInfo.toStaCode],
                    it[EnjuRW19ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
