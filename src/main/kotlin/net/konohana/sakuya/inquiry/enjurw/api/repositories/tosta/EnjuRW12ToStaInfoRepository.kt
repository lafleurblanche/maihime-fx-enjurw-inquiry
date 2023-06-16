package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW12ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW12ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW12ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW12ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW12ToStaInfo.select {
                EnjuRW12ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW12ToStaInfoData(
                    it[EnjuRW12ToStaInfo.id],
                    it[EnjuRW12ToStaInfo.toStaCode],
                    it[EnjuRW12ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
