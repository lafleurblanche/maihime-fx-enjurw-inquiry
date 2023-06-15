package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW09FromStaInfoRepository

object EnjuRW09FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW09FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
