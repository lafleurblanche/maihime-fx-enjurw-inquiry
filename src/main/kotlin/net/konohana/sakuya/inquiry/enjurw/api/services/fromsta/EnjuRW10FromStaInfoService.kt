package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW10FromStaInfoRepository

object EnjuRW10FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW10FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
