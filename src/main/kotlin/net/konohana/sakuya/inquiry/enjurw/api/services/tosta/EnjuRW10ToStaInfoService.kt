package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW10ToStaInfoRepository

object EnjuRW10ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW10ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
