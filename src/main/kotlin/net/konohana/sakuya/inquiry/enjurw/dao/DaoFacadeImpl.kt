package net.konohana.sakuya.inquiry.enjurw.dao

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory.dbQuery
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW01FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW02FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW03FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW04FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW05FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW06FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW07FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW08FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW09FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW10FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW11FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW12FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW13FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW14FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW15FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.EnjuRW16FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW01FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW02FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW03FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW04FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW05FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW06FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW07FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW08FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW09FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW10FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW11FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW12FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW13FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW14FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW15FromStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.dto.EnjuRW16FromStaInfoData
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

    private fun resultRowToEnjuRW05(row: ResultRow) = EnjuRW05FromStaInfoData(
        id = row[EnjuRW05FromStaInfo.id],
        fromStaCode = row[EnjuRW05FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW05FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW06(row: ResultRow) = EnjuRW06FromStaInfoData(
        id = row[EnjuRW06FromStaInfo.id],
        fromStaCode = row[EnjuRW06FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW06FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW07(row: ResultRow) = EnjuRW07FromStaInfoData(
        id = row[EnjuRW07FromStaInfo.id],
        fromStaCode = row[EnjuRW07FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW07FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW08(row: ResultRow) = EnjuRW08FromStaInfoData(
        id = row[EnjuRW08FromStaInfo.id],
        fromStaCode = row[EnjuRW08FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW08FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW09(row: ResultRow) = EnjuRW09FromStaInfoData(
        id = row[EnjuRW09FromStaInfo.id],
        fromStaCode = row[EnjuRW09FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW09FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW10(row: ResultRow) = EnjuRW10FromStaInfoData(
        id = row[EnjuRW10FromStaInfo.id],
        fromStaCode = row[EnjuRW10FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW10FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW11(row: ResultRow) = EnjuRW11FromStaInfoData(
        id = row[EnjuRW11FromStaInfo.id],
        fromStaCode = row[EnjuRW11FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW11FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW12(row: ResultRow) = EnjuRW12FromStaInfoData(
        id = row[EnjuRW12FromStaInfo.id],
        fromStaCode = row[EnjuRW12FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW12FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW13(row: ResultRow) = EnjuRW13FromStaInfoData(
        id = row[EnjuRW13FromStaInfo.id],
        fromStaCode = row[EnjuRW13FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW13FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW14(row: ResultRow) = EnjuRW14FromStaInfoData(
        id = row[EnjuRW14FromStaInfo.id],
        fromStaCode = row[EnjuRW14FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW14FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW15(row: ResultRow) = EnjuRW15FromStaInfoData(
        id = row[EnjuRW15FromStaInfo.id],
        fromStaCode = row[EnjuRW15FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW15FromStaInfo.fromStaName],
    )

    private fun resultRowToEnjuRW16(row: ResultRow) = EnjuRW16FromStaInfoData(
        id = row[EnjuRW16FromStaInfo.id],
        fromStaCode = row[EnjuRW16FromStaInfo.fromStaCode],
        fromStaName = row[EnjuRW16FromStaInfo.fromStaName],
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

    override suspend fun allEnjuRW05FromStaInfo(): List<EnjuRW05FromStaInfoData> = dbQuery {
        EnjuRW05FromStaInfo.selectAll().map(::resultRowToEnjuRW05)
    }

    override suspend fun allEnjuRW06FromStaInfo(): List<EnjuRW06FromStaInfoData> = dbQuery {
        EnjuRW06FromStaInfo.selectAll().map(::resultRowToEnjuRW06)
    }

    override suspend fun allEnjuRW07FromStaInfo(): List<EnjuRW07FromStaInfoData> = dbQuery {
        EnjuRW07FromStaInfo.selectAll().map(::resultRowToEnjuRW07)
    }

    override suspend fun allEnjuRW08FromStaInfo(): List<EnjuRW08FromStaInfoData> = dbQuery {
        EnjuRW08FromStaInfo.selectAll().map(::resultRowToEnjuRW08)
    }

    override suspend fun allEnjuRW09FromStaInfo(): List<EnjuRW09FromStaInfoData> = dbQuery {
        EnjuRW09FromStaInfo.selectAll().map(::resultRowToEnjuRW09)
    }

    override suspend fun allEnjuRW10FromStaInfo(): List<EnjuRW10FromStaInfoData> = dbQuery {
        EnjuRW10FromStaInfo.selectAll().map(::resultRowToEnjuRW10)
    }

    override suspend fun allEnjuRW11FromStaInfo(): List<EnjuRW11FromStaInfoData> = dbQuery {
        EnjuRW11FromStaInfo.selectAll().map(::resultRowToEnjuRW11)
    }

    override suspend fun allEnjuRW12FromStaInfo(): List<EnjuRW12FromStaInfoData> = dbQuery {
        EnjuRW12FromStaInfo.selectAll().map(::resultRowToEnjuRW12)
    }

    override suspend fun allEnjuRW13FromStaInfo(): List<EnjuRW13FromStaInfoData> = dbQuery {
        EnjuRW13FromStaInfo.selectAll().map(::resultRowToEnjuRW13)
    }

    override suspend fun allEnjuRW14FromStaInfo(): List<EnjuRW14FromStaInfoData> = dbQuery {
        EnjuRW14FromStaInfo.selectAll().map(::resultRowToEnjuRW14)
    }

    override suspend fun allEnjuRW15FromStaInfo(): List<EnjuRW15FromStaInfoData> = dbQuery {
        EnjuRW15FromStaInfo.selectAll().map(::resultRowToEnjuRW15)
    }

    override suspend fun allEnjuRW16FromStaInfo(): List<EnjuRW16FromStaInfoData> = dbQuery {
        EnjuRW16FromStaInfo.selectAll().map(::resultRowToEnjuRW16)
    }
}

val dao: DaoFacade = DaoFacadeImpl()
