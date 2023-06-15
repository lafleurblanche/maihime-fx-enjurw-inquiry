package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW11FromStaInfoRepository

object EnjuRW11FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW11FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
