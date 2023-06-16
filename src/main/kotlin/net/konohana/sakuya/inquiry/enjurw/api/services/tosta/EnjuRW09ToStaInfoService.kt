package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW09ToStaInfoRepository

object EnjuRW09ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW09ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
