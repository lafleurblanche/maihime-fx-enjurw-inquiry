package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW05ToStaInfoRepository

object EnjuRW05ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW05ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
