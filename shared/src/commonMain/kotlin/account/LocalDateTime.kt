package account

import kotlinx.serialization.Decoder
import kotlinx.serialization.Encoder
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer

expect fun LocalDateTime(text: String): LocalDateTime

expect class LocalDateTime {
    val yearMonth: YearMonth
}

expect class YearMonth {
    val year: Int
    val monthValue: Int
}

@Serializer(LocalDateTime::class)
object LocalDateTimeSerializer : KSerializer<LocalDateTime> {
    override fun serialize(output: Encoder, obj: LocalDateTime) {
        output.encodeString(obj.toString())
    }

    override fun deserialize(input: Decoder) = LocalDateTime(input.decodeString())
}