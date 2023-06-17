package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW18ToStaInfoRepository

object EnjuRW18ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW18ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
