package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW06ToStaInfoRepository

object EnjuRW06ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW06ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
