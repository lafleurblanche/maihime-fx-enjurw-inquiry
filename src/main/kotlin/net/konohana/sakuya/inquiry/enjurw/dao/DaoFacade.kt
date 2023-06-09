package net.konohana.sakuya.inquiry.enjurw.dao

import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW01FromStaInfoData

interface DaoFacade {
    suspend fun allEnjuRW01FromStaInfo(): List<EnjuRW01FromStaInfoData>
}
