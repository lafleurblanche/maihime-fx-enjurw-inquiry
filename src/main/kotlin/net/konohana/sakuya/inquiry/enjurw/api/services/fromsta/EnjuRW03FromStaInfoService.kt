package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW03FromStaInfoRepository

object EnjuRW03FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW03FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
