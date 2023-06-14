package net.konohana.sakuya.inquiry.enjurw.models.fromsta.dto

import kotlinx.serialization.Serializable

@Serializable
data class EnjuRW12FromStaInfoData(
    val id: Int,
    val fromStaCode: String,
    val fromStaName: String,
)
