package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW19ToStaInfoRepository

object EnjuRW19ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW19ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
