package boc.hackathon.kubaras.data

import kotlinx.serialization.Serializable

@Serializable
data class Transaction(
    val amount: Double,
    val currency: String,
    val description: String,
    val fee: Int,
    val id: String,
    val receiver_account: String,
    val reference_number: String,
    val sender_account: String,
    val status: String,
    val timestamp: String,
    val transaction_type: String
)