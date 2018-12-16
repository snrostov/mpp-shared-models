package account

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JSON
import kotlin.js.JsName

@Serializable
data class Transfer(
    @Serializable(LocalDateTimeSerializer::class)
    val time: LocalDateTime,
    val partner: String,
    val description: String,
    val amount: Int
) {
    fun toJson() = JSON.stringify(serializer(), this)

    companion object {
        fun fromJson(json: String) = JSON.parse(serializer(), json)
    }
}

@JsName("balance")
fun List<Transfer>.balance() = sumBy { it.amount }

@JsName("balanceByAccount")
fun List<Transfer>.balanceByAccount(): Map<String, Int> =
    groupBy { it.partner }.mapValues { it.value.balance() }

@JsName("byMonth")
fun List<Transfer>.byMonth(): Map<YearMonth, List<Transfer>> =
    groupBy { it.time.yearMonth }