package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW13ToStaInfoRepository

object EnjuRW13ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW13ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
