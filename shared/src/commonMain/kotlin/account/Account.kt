package account

import kotlin.js.JsName

typealias Money = Double
typealias Account = String

fun Rub(amount: Double = 0.0): Money = amount

data class MoneyTransfer(
    val target: Account,
    val description: String,
    val amount: Money,
    val ts: Instant
)

@JsName("balance")
fun List<MoneyTransfer>.balance(): Money {
    var balance = Rub()
    forEach {
        balance -= it.amount
    }
    return balance
}

@JsName("balanceByAccount")
fun List<MoneyTransfer>.balanceByAccount(): Map<Account, Money> =
    groupBy { it.target }.mapValues { it.value.balance() }

@JsName("byMonth")
fun List<MoneyTransfer>.byMonth(zoneId: ZoneId): Map<YearMonth, List<MoneyTransfer>> =
    groupBy { it.ts.toLocalDate(zoneId).yearMonth }
