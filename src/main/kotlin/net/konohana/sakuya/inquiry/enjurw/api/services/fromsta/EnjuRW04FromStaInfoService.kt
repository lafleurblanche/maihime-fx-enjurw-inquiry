package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW04FromStaInfoRepository

object EnjuRW04FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW04FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
