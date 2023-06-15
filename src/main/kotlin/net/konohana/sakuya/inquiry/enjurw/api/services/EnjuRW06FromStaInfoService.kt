package net.konohana.sakuya.inquiry.enjurw.api.services

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW06FromStaInfoRepository

object EnjuRW06FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW06FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
