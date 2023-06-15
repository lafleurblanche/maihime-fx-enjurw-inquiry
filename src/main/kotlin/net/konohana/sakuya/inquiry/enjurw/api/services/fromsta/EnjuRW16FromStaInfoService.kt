package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW16FromStaInfoRepository

object EnjuRW16FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW16FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
