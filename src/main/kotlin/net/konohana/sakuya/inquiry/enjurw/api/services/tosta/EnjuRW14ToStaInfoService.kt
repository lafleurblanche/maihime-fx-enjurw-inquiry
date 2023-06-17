package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW14ToStaInfoRepository

object EnjuRW14ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW14ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
