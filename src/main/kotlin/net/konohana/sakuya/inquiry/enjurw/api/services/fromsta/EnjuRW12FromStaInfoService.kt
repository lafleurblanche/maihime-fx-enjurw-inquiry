package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW12FromStaInfoRepository

object EnjuRW12FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW12FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
