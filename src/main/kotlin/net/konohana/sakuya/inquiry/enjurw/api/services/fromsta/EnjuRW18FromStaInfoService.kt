package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW18FromStaInfoRepository

object EnjuRW18FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW18FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
