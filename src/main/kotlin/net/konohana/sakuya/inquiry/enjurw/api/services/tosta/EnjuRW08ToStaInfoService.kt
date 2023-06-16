package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW08ToStaInfoRepository

object EnjuRW08ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW08ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
