package net.konohana.sakuya.inquiry.enjurw.dao

import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW01FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW02FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW03FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW04FromStaInfoData

interface DaoFacade {
    suspend fun allEnjuRW01FromStaInfo(): List<EnjuRW01FromStaInfoData>
    suspend fun allEnjuRW02FromStaInfo(): List<EnjuRW02FromStaInfoData>
    suspend fun allEnjuRW03FromStaInfo(): List<EnjuRW03FromStaInfoData>
    suspend fun allEnjuRW04FromStaInfo(): List<EnjuRW04FromStaInfoData>
}
