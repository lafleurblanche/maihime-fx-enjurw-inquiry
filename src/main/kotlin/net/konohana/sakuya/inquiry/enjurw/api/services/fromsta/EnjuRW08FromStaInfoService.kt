package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW08FromStaInfoRepository

object EnjuRW08FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW08FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
