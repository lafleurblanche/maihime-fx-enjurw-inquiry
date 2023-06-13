package net.konohana.sakuya.inquiry.enjurw.dao

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

interface DaoFacadeToStaInfo {
    suspend fun allEnjuRW01ToStaInfo(): List<EnjuRW01ToStaInfoData>
    suspend fun allEnjuRW02ToStaInfo(): List<EnjuRW02ToStaInfoData>
    suspend fun allEnjuRW03ToStaInfo(): List<EnjuRW03ToStaInfoData>
    suspend fun allEnjuRW04ToStaInfo(): List<EnjuRW04ToStaInfoData>
    suspend fun allEnjuRW05ToStaInfo(): List<EnjuRW05ToStaInfoData>
    suspend fun allEnjuRW06ToStaInfo(): List<EnjuRW06ToStaInfoData>
    suspend fun allEnjuRW07ToStaInfo(): List<EnjuRW07ToStaInfoData>
    suspend fun allEnjuRW08ToStaInfo(): List<EnjuRW08ToStaInfoData>
    suspend fun allEnjuRW09ToStaInfo(): List<EnjuRW09ToStaInfoData>
    suspend fun allEnjuRW10ToStaInfo(): List<EnjuRW10ToStaInfoData>
    suspend fun allEnjuRW11ToStaInfo(): List<EnjuRW11ToStaInfoData>
    suspend fun allEnjuRW12ToStaInfo(): List<EnjuRW12ToStaInfoData>
    suspend fun allEnjuRW13ToStaInfo(): List<EnjuRW13ToStaInfoData>
    suspend fun allEnjuRW14ToStaInfo(): List<EnjuRW14ToStaInfoData>
    suspend fun allEnjuRW15ToStaInfo(): List<EnjuRW15ToStaInfoData>
    suspend fun allEnjuRW16ToStaInfo(): List<EnjuRW16ToStaInfoData>
    suspend fun allEnjuRW17ToStaInfo(): List<EnjuRW17ToStaInfoData>
    suspend fun allEnjuRW18ToStaInfo(): List<EnjuRW18ToStaInfoData>
    suspend fun allEnjuRW19ToStaInfo(): List<EnjuRW19ToStaInfoData>
}
