package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW17ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW17ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW17ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW17ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW17ToStaInfo.select {
                EnjuRW17ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW17ToStaInfoData(
                    it[EnjuRW17ToStaInfo.id],
                    it[EnjuRW17ToStaInfo.toStaCode],
                    it[EnjuRW17ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
