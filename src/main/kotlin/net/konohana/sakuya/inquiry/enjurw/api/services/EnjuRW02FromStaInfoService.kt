package net.konohana.sakuya.inquiry.enjurw.api.services

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW02FromStaInfoRepository

object EnjuRW02FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW02FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
