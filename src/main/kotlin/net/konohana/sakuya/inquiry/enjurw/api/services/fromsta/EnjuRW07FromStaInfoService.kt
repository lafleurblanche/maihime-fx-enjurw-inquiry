package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW07FromStaInfoRepository

object EnjuRW07FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW07FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
