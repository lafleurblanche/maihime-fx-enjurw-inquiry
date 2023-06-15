package net.konohana.sakuya.inquiry.enjurw.api.services.fromsta

import net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta.EnjuRW15FromStaInfoRepository

object EnjuRW15FromStaInfoService {
    suspend fun findByFromStaCode(
        fromStaCode: String
    ) = EnjuRW15FromStaInfoRepository.read(
        fromStaCode = fromStaCode
    )
}
