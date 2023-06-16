package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW05ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW05ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW05ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW05ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW05ToStaInfo.select {
                EnjuRW05ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW05ToStaInfoData(
                    it[EnjuRW05ToStaInfo.id],
                    it[EnjuRW05ToStaInfo.toStaCode],
                    it[EnjuRW05ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
