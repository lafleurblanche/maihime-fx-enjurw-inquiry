package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW13FromStaInfoRepository

object EnjuRW13FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW13FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
