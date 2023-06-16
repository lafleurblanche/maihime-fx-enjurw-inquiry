package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW07ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW07ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW07ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW07ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW07ToStaInfo.select {
                EnjuRW07ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW07ToStaInfoData(
                    it[EnjuRW07ToStaInfo.id],
                    it[EnjuRW07ToStaInfo.toStaCode],
                    it[EnjuRW07ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
