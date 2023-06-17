package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW17ToStaInfoRepository

object EnjuRW17ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW17ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
