package net.konohana.sakuya.inquiry.enjurw.api.services

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW05FromStaInfoRepository

object EnjuRW05FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW05FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
