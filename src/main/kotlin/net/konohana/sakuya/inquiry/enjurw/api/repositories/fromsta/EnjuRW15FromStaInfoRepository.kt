package net.konohana.sakuya.inquiry.enjurw.api.repositories.fromsta

import net.konohana.sakuya.inquiry.enjurw.dao.DatabaseFactory
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.EnjuRW15FromStaInfo
import net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto.EnjuRW15FromStaInfoData
import org.jetbrains.exposed.sql.select

object EnjuRW15FromStaInfoRepository {
    suspend fun read(fromStaCode: String): EnjuRW15FromStaInfoData? {
        return DatabaseFactory.dbQuery {
            EnjuRW15FromStaInfo.select {
                EnjuRW15FromStaInfo.fromStaCode eq fromStaCode
            }.map {
                EnjuRW15FromStaInfoData(
                    it[EnjuRW15FromStaInfo.id],
                    it[EnjuRW15FromStaInfo.fromStaCode],
                    it[EnjuRW15FromStaInfo.fromStaName],
                )
            }.singleOrNull()
        }
    }
}
