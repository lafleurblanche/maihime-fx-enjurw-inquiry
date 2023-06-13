package net.konohana.sakuya.inquiry.enjurw.api.services

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW01FromStaInfoRepository

object EnjuRW01FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW01FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
