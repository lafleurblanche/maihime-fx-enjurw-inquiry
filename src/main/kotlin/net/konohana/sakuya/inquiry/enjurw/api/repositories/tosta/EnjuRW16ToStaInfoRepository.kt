package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW16ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW16ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW16ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW16ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW16ToStaInfo.select {
                EnjuRW16ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW16ToStaInfoData(
                    it[EnjuRW16ToStaInfo.id],
                    it[EnjuRW16ToStaInfo.toStaCode],
                    it[EnjuRW16ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
