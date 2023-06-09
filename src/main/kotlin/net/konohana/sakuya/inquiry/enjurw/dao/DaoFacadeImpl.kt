package net.konohana.sakuya.inquiry.enjurw.dao

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory.dbQuery
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW01FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW01FromStaInfoData
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll

class DaoFacadeImpl : DaoFacade {
    private fun resultRowToEnjuRW01(row: ResultRow) = EnjuRW01FromStaInfoData(
        id = row[EnjuRW01FromStaInfo.id],
        fromStaCode = row[EnjuRW01FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW01FromStaInfo.fromStaName],
    )

    override suspend fun allEnjuRW01FromStaInfo(): List<EnjuRW01FromStaInfoData> = dbQuery {
        EnjuRW01FromStaInfo.selectAll().map(::resultRowToEnjuRW01)
    }
}

val dao: DaoFacade = DaoFacadeImpl()
