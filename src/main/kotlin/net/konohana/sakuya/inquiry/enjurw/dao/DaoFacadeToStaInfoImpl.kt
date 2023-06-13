package net.konohana.sakuya.inquiry.enjurw.dao

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory.dbQuery
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW01ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW02ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW03ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW04ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW05ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW06ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW07ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW08ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW09ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW10ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW11ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW12ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW13ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW14ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW15ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW16ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW17ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW18ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.EnjuRW19ToStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW01ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW02ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW03ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW04ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW05ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW06ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW07ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW08ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW09ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW10ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW11ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW12ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW13ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW14ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW15ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW16ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW17ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW18ToStaInfoData
import net.konohana.sakuya.inquiry.enjurw.models.tosta.dto.EnjuRW19ToStaInfoData
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

    private fun resultRowToEnjuRW07(row: ResultRow) = EnjuRW07ToStaInfoData(
        id = row[EnjuRW07ToStaInfo.id],
        toStaCode = row[EnjuRW07ToStaInfo.toStaCode],
        toStaName = row[EnjuRW07ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW08(row: ResultRow) = EnjuRW08ToStaInfoData(
        id = row[EnjuRW08ToStaInfo.id],
        toStaCode = row[EnjuRW08ToStaInfo.toStaCode],
        toStaName = row[EnjuRW08ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW09(row: ResultRow) = EnjuRW09ToStaInfoData(
        id = row[EnjuRW09ToStaInfo.id],
        toStaCode = row[EnjuRW09ToStaInfo.toStaCode],
        toStaName = row[EnjuRW09ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW10(row: ResultRow) = EnjuRW10ToStaInfoData(
        id = row[EnjuRW10ToStaInfo.id],
        toStaCode = row[EnjuRW10ToStaInfo.toStaCode],
        toStaName = row[EnjuRW10ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW11(row: ResultRow) = EnjuRW11ToStaInfoData(
        id = row[EnjuRW11ToStaInfo.id],
        toStaCode = row[EnjuRW11ToStaInfo.toStaCode],
        toStaName = row[EnjuRW11ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW12(row: ResultRow) = EnjuRW12ToStaInfoData(
        id = row[EnjuRW12ToStaInfo.id],
        toStaCode = row[EnjuRW12ToStaInfo.toStaCode],
        toStaName = row[EnjuRW12ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW13(row: ResultRow) = EnjuRW13ToStaInfoData(
        id = row[EnjuRW13ToStaInfo.id],
        toStaCode = row[EnjuRW13ToStaInfo.toStaCode],
        toStaName = row[EnjuRW13ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW14(row: ResultRow) = EnjuRW14ToStaInfoData(
        id = row[EnjuRW14ToStaInfo.id],
        toStaCode = row[EnjuRW14ToStaInfo.toStaCode],
        toStaName = row[EnjuRW14ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW15(row: ResultRow) = EnjuRW15ToStaInfoData(
        id = row[EnjuRW15ToStaInfo.id],
        toStaCode = row[EnjuRW15ToStaInfo.toStaCode],
        toStaName = row[EnjuRW15ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW16(row: ResultRow) = EnjuRW16ToStaInfoData(
        id = row[EnjuRW16ToStaInfo.id],
        toStaCode = row[EnjuRW16ToStaInfo.toStaCode],
        toStaName = row[EnjuRW16ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW17(row: ResultRow) = EnjuRW17ToStaInfoData(
        id = row[EnjuRW17ToStaInfo.id],
        toStaCode = row[EnjuRW17ToStaInfo.toStaCode],
        toStaName = row[EnjuRW17ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW18(row: ResultRow) = EnjuRW18ToStaInfoData(
        id = row[EnjuRW18ToStaInfo.id],
        toStaCode = row[EnjuRW18ToStaInfo.toStaCode],
        toStaName = row[EnjuRW18ToStaInfo.toStaName],
    )

    private fun resultRowToEnjuRW19(row: ResultRow) = EnjuRW19ToStaInfoData(
        id = row[EnjuRW19ToStaInfo.id],
        toStaCode = row[EnjuRW19ToStaInfo.toStaCode],
        toStaName = row[EnjuRW19ToStaInfo.toStaName],
    )

    override suspend fun allEnjuRW01ToStaInfo(): List<EnjuRW01ToStaInfoData> = dbQuery {
        EnjuRW01ToStaInfo.selectAll().map(::resultRowToEnjuRW01)
    }

    override suspend fun allEnjuRW02ToStaInfo(): List<EnjuRW02ToStaInfoData> = dbQuery {
        EnjuRW02ToStaInfo.selectAll().map(::resultRowToEnjuRW02)
    }

    override suspend fun allEnjuRW03ToStaInfo(): List<EnjuRW03ToStaInfoData> = dbQuery {
        EnjuRW03ToStaInfo.selectAll().map(::resultRowToEnjuRW03)
    }

    override suspend fun allEnjuRW04ToStaInfo(): List<EnjuRW04ToStaInfoData> = dbQuery {
        EnjuRW04ToStaInfo.selectAll().map(::resultRowToEnjuRW04)
    }

    override suspend fun allEnjuRW05ToStaInfo(): List<EnjuRW05ToStaInfoData> = dbQuery {
        EnjuRW05ToStaInfo.selectAll().map(::resultRowToEnjuRW05)
    }

    override suspend fun allEnjuRW06ToStaInfo(): List<EnjuRW06ToStaInfoData> = dbQuery {
        EnjuRW06ToStaInfo.selectAll().map(::resultRowToEnjuRW06)
    }

    override suspend fun allEnjuRW07ToStaInfo(): List<EnjuRW07ToStaInfoData> = dbQuery {
        EnjuRW07ToStaInfo.selectAll().map(::resultRowToEnjuRW07)
    }

    override suspend fun allEnjuRW08ToStaInfo(): List<EnjuRW08ToStaInfoData> = dbQuery {
        EnjuRW08ToStaInfo.selectAll().map(::resultRowToEnjuRW08)
    }

    override suspend fun allEnjuRW09ToStaInfo(): List<EnjuRW09ToStaInfoData> = dbQuery {
        EnjuRW09ToStaInfo.selectAll().map(::resultRowToEnjuRW09)
    }

    override suspend fun allEnjuRW10ToStaInfo(): List<EnjuRW10ToStaInfoData> = dbQuery {
        EnjuRW10ToStaInfo.selectAll().map(::resultRowToEnjuRW10)
    }

    override suspend fun allEnjuRW11ToStaInfo(): List<EnjuRW11ToStaInfoData> = dbQuery {
        EnjuRW11ToStaInfo.selectAll().map(::resultRowToEnjuRW11)
    }

    override suspend fun allEnjuRW12ToStaInfo(): List<EnjuRW12ToStaInfoData> = dbQuery {
        EnjuRW12ToStaInfo.selectAll().map(::resultRowToEnjuRW12)
    }

    override suspend fun allEnjuRW13ToStaInfo(): List<EnjuRW13ToStaInfoData> = dbQuery {
        EnjuRW13ToStaInfo.selectAll().map(::resultRowToEnjuRW13)
    }

    override suspend fun allEnjuRW14ToStaInfo(): List<EnjuRW14ToStaInfoData> = dbQuery {
        EnjuRW14ToStaInfo.selectAll().map(::resultRowToEnjuRW14)
    }

    override suspend fun allEnjuRW15ToStaInfo(): List<EnjuRW15ToStaInfoData> = dbQuery {
        EnjuRW15ToStaInfo.selectAll().map(::resultRowToEnjuRW15)
    }

    override suspend fun allEnjuRW16ToStaInfo(): List<EnjuRW16ToStaInfoData> = dbQuery {
        EnjuRW16ToStaInfo.selectAll().map(::resultRowToEnjuRW16)
    }

    override suspend fun allEnjuRW17ToStaInfo(): List<EnjuRW17ToStaInfoData> = dbQuery {
        EnjuRW17ToStaInfo.selectAll().map(::resultRowToEnjuRW17)
    }

    override suspend fun allEnjuRW18ToStaInfo(): List<EnjuRW18ToStaInfoData> = dbQuery {
        EnjuRW18ToStaInfo.selectAll().map(::resultRowToEnjuRW18)
    }

    override suspend fun allEnjuRW19ToStaInfo(): List<EnjuRW19ToStaInfoData> = dbQuery {
        EnjuRW19ToStaInfo.selectAll().map(::resultRowToEnjuRW19)
    }
}

val daoToStaInfo: DaoFacadeToStaInfo = DaoFacadeToStaInfoImpl()
