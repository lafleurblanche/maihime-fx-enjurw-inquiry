package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW17FromStaInfoRepository

object EnjuRW17FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW17FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
