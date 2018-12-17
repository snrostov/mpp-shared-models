package account

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JSON
import kotlinx.serialization.list
import kotlin.js.JsName

@Serializable
data class Transfer(
    @Serializable(LocalDateTimeSerializer::class)
    val time: LocalDateTime,
    val partner: String,
    val description: String,
    val amount: Int
)

@JsName("transfersToJson")
fun List<Transfer>.toJson() = JSON.stringify(Transfer.serializer().list, this)

@JsName("balance")
fun List<Transfer>.balance() = sumBy { it.amount }

@JsName("balanceByAccount")
fun List<Transfer>.balanceByAccount(): Map<String, Int> =
    groupBy { it.partner }.mapValues { it.value.balance() }

@JsName("byMonth")
fun List<Transfer>.byMonth(): Map<YearMonth, List<Transfer>> =
    groupBy { it.time.yearMonth }