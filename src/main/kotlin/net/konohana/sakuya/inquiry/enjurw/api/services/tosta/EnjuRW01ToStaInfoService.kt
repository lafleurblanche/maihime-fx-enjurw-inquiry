package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW01ToStaInfoRepository

object EnjuRW01ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW01ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
