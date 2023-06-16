package net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW08ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW08ToStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW08ToStaInfoRepository {
    suspend fun read(toStaCode: String): EnjuRW08ToStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW08ToStaInfo.select {
                EnjuRW08ToStaInfo.toStaCode eq toStaCode
            }.map {
                EnjuRW08ToStaInfoData(
                    it[EnjuRW08ToStaInfo.id],
                    it[EnjuRW08ToStaInfo.toStaCode],
                    it[EnjuRW08ToStaInfo.toStaName],
                )
            }.singleOrNull()
        }
    }
}
