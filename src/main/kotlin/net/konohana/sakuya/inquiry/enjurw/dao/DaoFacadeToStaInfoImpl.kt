package net.konohana.sakuya.inquiry.enjurw.dao

import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW01ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW02ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW03ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW04ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW05ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW06ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW01ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW02ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW03ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW04ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW05ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW06ToStaInfoData
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll

class DaoFacadeToStaInfoImpl : DaoFacadeToStaInfo {
    private fun resultRowToEnjuRW01(row: ResultRow) = EnjuRW01ToStaInfoData(
        id = row[EnjuRW01ToStaInfo.id],
        toStaCode = row[EnjuRW01ToStaInfo.toStaCode],
        toStaName = row[EnjuRW01ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW02(row: ResultRow) = EnjuRW02ToStaInfoData(
        id = row[EnjuRW02ToStaInfo.id],
        toStaCode = row[EnjuRW02ToStaInfo.toStaCode],
        toStaName = row[EnjuRW02ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW03(row: ResultRow) = EnjuRW03ToStaInfoData(
        id = row[EnjuRW03ToStaInfo.id],
        toStaCode = row[EnjuRW03ToStaInfo.toStaCode],
        toStaName = row[EnjuRW03ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW04(row: ResultRow) = EnjuRW04ToStaInfoData(
        id = row[EnjuRW04ToStaInfo.id],
        toStaCode = row[EnjuRW04ToStaInfo.toStaCode],
        toStaName = row[EnjuRW04ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW05(row: ResultRow) = EnjuRW05ToStaInfoData(
        id = row[EnjuRW05ToStaInfo.id],
        toStaCode = row[EnjuRW05ToStaInfo.toStaCode],
        toStaName = row[EnjuRW05ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW06(row: ResultRow) = EnjuRW06ToStaInfoData(
        id = row[EnjuRW06ToStaInfo.id],
        toStaCode = row[EnjuRW06ToStaInfo.toStaCode],
        toStaName = row[EnjuRW06ToStaInfo.toStaName],
    )

    override suspend fun allEnjuRW01ToStaInfo(): List<EnjuRW01ToStaInfoData> = DatabaseFactory.dbQuery {
        EnjuRW01ToStaInfo.selectAll().map(::resultRowToEnjuRW01)
    }

    override suspend fun allEnjuRW02ToStaInfo(): List<EnjuRW02ToStaInfoData> = DatabaseFactory.dbQuery {
        EnjuRW02ToStaInfo.selectAll().map(::resultRowToEnjuRW02)
    }

    override suspend fun allEnjuRW03ToStaInfo(): List<EnjuRW03ToStaInfoData> = DatabaseFactory.dbQuery {
        EnjuRW03ToStaInfo.selectAll().map(::resultRowToEnjuRW03)
    }

    override suspend fun allEnjuRW04ToStaInfo(): List<EnjuRW04ToStaInfoData> = DatabaseFactory.dbQuery {
        EnjuRW04ToStaInfo.selectAll().map(::resultRowToEnjuRW04)
    }

    override suspend fun allEnjuRW05ToStaInfo(): List<EnjuRW05ToStaInfoData> = DatabaseFactory.dbQuery {
        EnjuRW05ToStaInfo.selectAll().map(::resultRowToEnjuRW05)
    }

    override suspend fun allEnjuRW06ToStaInfo(): List<EnjuRW06ToStaInfoData> = DatabaseFactory.dbQuery {
        EnjuRW06ToStaInfo.selectAll().map(::resultRowToEnjuRW06)
    }
}

val daoToStaInfo: DaoFacadeToStaInfo = DaoFacadeToStaInfoImpl()
