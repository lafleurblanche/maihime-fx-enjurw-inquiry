package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW19FromStaInfoRepository

object EnjuRW19FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW19FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
