package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW04ToStaInfoRepository

object EnjuRW04ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW04ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
