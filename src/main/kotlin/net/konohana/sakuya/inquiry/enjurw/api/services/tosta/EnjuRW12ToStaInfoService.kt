package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW12ToStaInfoRepository

object EnjuRW12ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW12ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
