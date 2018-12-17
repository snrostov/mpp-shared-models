package account

import kotlinx.serialization.*
import kotlinx.serialization.internal.StringDescriptor
import kotlin.js.JsName

expect fun LocalDateTime(text: String): LocalDateTime

expect class LocalDateTime {
    val yearMonth: YearMonth
}

expect class YearMonth {
    val year: Int
    val monthValue: Int
}

object LocalDateTimeSerializer : KSerializer<LocalDateTime> {
    override val descriptor: SerialDescriptor
        get() = StringDescriptor

    override fun serialize(output: Encoder, obj: LocalDateTime) {
        output.encodeString(obj.toString())
    }

    override fun deserialize(input: Decoder) = LocalDateTime(input.decodeString())
}