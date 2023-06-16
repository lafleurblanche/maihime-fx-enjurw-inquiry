package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW07ToStaInfoRepository

object EnjuRW07ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW07ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
