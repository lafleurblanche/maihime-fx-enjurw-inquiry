package net.konohana.sakuya.inquiry.enjurw.dao

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory.dbQuery
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW01FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW02FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW03FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW04FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW01FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW02FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW03FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW04FromStaInfoData
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll

class DaoFacadeImpl : DaoFacade {
    private fun resultRowToEnjuRW01(row: ResultRow) = EnjuRW01FromStaInfoData(
        id = row[EnjuRW01FromStaInfo.id],
        fromStaCode = row[EnjuRW01FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW01FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW02(row: ResultRow) = EnjuRW02FromStaInfoData(
        id = row[EnjuRW02FromStaInfo.id],
        fromStaCode = row[EnjuRW02FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW02FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW03(row: ResultRow) = EnjuRW03FromStaInfoData(
        id = row[EnjuRW03FromStaInfo.id],
        fromStaCode = row[EnjuRW03FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW03FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW04(row: ResultRow) = EnjuRW04FromStaInfoData(
        id = row[EnjuRW04FromStaInfo.id],
        fromStaCode = row[EnjuRW04FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW04FromStaInfo.fromStaName],
    )

    override suspend fun allEnjuRW01FromStaInfo(): List<EnjuRW01FromStaInfoData> = dbQuery {
        EnjuRW01FromStaInfo.selectAll().map(::resultRowToEnjuRW01)
    }

    override suspend fun allEnjuRW02FromStaInfo(): List<EnjuRW02FromStaInfoData> = dbQuery {
        EnjuRW02FromStaInfo.selectAll().map(::resultRowToEnjuRW02)
    }

    override suspend fun allEnjuRW03FromStaInfo(): List<EnjuRW03FromStaInfoData> = dbQuery {
        EnjuRW03FromStaInfo.selectAll().map(::resultRowToEnjuRW03)
    }

    override suspend fun allEnjuRW04FromStaInfo(): List<EnjuRW04FromStaInfoData> = dbQuery {
        EnjuRW04FromStaInfo.selectAll().map(::resultRowToEnjuRW04)
    }
}

val dao: DaoFacade = DaoFacadeImpl()
