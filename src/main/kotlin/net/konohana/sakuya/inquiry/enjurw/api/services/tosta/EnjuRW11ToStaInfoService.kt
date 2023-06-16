package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW11ToStaInfoRepository

object EnjuRW11ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW11ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
