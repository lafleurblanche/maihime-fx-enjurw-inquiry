package net.konohana.sakuya.inquiry.enjurw.models.tosta.dto

import kotlinx.serialization.Serializable

@Serializable
data class EnjuRW13ToStaInfoData(
    val id: Int,
    val toStaCode: String,
    val toStaName: String,
)
