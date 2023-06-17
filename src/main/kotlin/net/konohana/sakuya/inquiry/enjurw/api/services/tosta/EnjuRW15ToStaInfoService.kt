package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW15ToStaInfoRepository

object EnjuRW15ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW15ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
