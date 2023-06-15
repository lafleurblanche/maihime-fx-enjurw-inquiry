package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW14FromStaInfoRepository

object EnjuRW14FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW14FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
