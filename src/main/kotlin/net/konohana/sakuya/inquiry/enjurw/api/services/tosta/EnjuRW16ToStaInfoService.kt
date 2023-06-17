package net.konohana.sakuya.inquiry.enjurw.api.services.tosta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.tosta.EnjuRW16ToStaInfoRepository

object EnjuRW16ToStaInfoService {
    suspend fun findByToStaCode(
        toStaCode: String
    ) = EnjuRW16ToStaInfoRepository.read(
        toStaCode = toStaCode
    )
}
