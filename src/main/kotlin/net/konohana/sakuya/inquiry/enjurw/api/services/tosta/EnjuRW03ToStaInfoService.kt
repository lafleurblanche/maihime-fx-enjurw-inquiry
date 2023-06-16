package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW03ToStaInfoRepository

object EnjuRW03ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW03ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
