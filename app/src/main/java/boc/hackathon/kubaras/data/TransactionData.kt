package boc.hackathon.kubaras.data

import kotlinx.serialization.Serializable


@Serializable
data class TransactionData(
    val amount: Double = 0.0,
    val earned: Double = 0.0,
    val transactions: List<Transaction> = emptyList(),
    val transactionsFromSaveAccount: List<Transaction> = emptyList()
)