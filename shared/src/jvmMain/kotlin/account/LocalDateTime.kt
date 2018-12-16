package account

actual fun LocalDateTime(text: String) = LocalDateTime(java.time.LocalDateTime.parse(text))

actual data class LocalDateTime(val jvm: java.time.LocalDateTime) {
    actual val yearMonth: YearMonth
        get() = YearMonth(java.time.YearMonth.from(jvm))

    override fun toString() = jvm.toString()
}

actual data class YearMonth(val jvm: java.time.YearMonth) {
    actual val year: Int
        get() = jvm.year

    actual val monthValue: Int
        get() = jvm.monthValue

    override fun toString() = jvm.toString()
}