package account

actual fun LocalDateTime(text: String) = LocalDateTime(JSJoda.LocalDateTime.parse(text))

actual data class LocalDateTime(val js: JSJoda.LocalDateTime) {
    actual val yearMonth: YearMonth
        get() = YearMonth(JSJoda.YearMonth.from(js))
}

actual data class YearMonth(val js: JSJoda.YearMonth) {
    actual val year: Int
        get() = js.year().unsafeCast<Int>()

    actual val monthValue: Int
        get() = js.monthValue().unsafeCast<Int>()
}

