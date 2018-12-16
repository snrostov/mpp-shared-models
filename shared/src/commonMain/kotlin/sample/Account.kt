package sample

import kotlinx.serialization.Serializable

typealias Money = Double
typealias Instant = Long
typealias Account = String

fun Rub(amount: Double = 0.0): Money = amount
fun Timestamp(ts: Long): Instant = ts

@Serializable
data class MoneyTransfer(
    val target: Account,
    val description: String,
    val amount: Money,
    val ts: Instant
)


fun List<MoneyTransfer>.balance(): Money {
    var balance = Rub()
    forEach {
        balance -= it.amount
    }
    return balance
}

fun List<MoneyTransfer>.balanceByAccount(): Map<Account, Money> =
    groupBy { it.target }.mapValues { it.value.balance() }