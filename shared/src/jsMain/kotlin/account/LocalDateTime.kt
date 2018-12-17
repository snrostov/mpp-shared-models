package account

@JsName("localDateTimeFromText")
actual fun LocalDateTime(text: String) = LocalDateTime(JSJoda.LocalDateTime.parse(text))

actual class LocalDateTime(val js: JSJoda.LocalDateTime) {
    actual val yearMonth: YearMonth
        get() = YearMonth(JSJoda.YearMonth.from(js))

    override fun toString() = js.toString()
    override fun equals(other: Any?) = other is LocalDateTime && other.js.isEqual(js)
    override fun hashCode(): Int = js.hashCode().unsafeCast<Int>()
}

actual class YearMonth(val js: JSJoda.YearMonth) {
    actual val year: Int
        get() = js.year().unsafeCast<Int>()

    actual val monthValue: Int
        get() = js.monthValue().unsafeCast<Int>()

    override fun toString() = js.toString()
    override fun equals(other: Any?) = other is YearMonth && other.js.equals(js)
    override fun hashCode(): Int = year * 12 + monthValue
}

