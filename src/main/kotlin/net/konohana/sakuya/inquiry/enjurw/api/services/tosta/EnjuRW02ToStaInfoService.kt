package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW02ToStaInfoRepository

object EnjuRW02ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW02ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
