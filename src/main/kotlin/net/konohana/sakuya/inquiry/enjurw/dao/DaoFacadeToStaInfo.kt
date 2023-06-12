package net.konohana.sakuya.inquiry.enjurw.dao

import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW01ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW02ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW03ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW04ToStaInfoData

interface DaoFacadeToStaInfo {
    suspend fun allEnjuRW01ToStaInfo(): List<EnjuRW01ToStaInfoData>
    suspend fun allEnjuRW02ToStaInfo(): List<EnjuRW02ToStaInfoData>
    suspend fun allEnjuRW03ToStaInfo(): List<EnjuRW03ToStaInfoData>
    suspend fun allEnjuRW04ToStaInfo(): List<EnjuRW04ToStaInfoData>
}
