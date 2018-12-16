package account

actual typealias Instant = JSJoda.Instant

actual fun fromEpoch(ms: Long): Instant = JSJoda.Instant.ofEpochMilli(ms)

actual typealias LocalDate = JSJoda.LocalDate

actual typealias ZoneId = JSJoda.ZoneId

actual fun Instant.toLocalDate(zoneId: ZoneId): LocalDate = LocalDate.ofInstant(this, zoneId)


actual val LocalDate.yearMonth: YearMonth
    get() = YearMonth(JSJoda.YearMonth.from(this))

actual class YearMonth(val js: JSJoda.YearMonth) {
    override fun equals(other: Any?): Boolean = other is YearMonth && js.equals(other.js)
    override fun hashCode(): Int = year * 12 + monthValue
}

actual val YearMonth.year: Int
    get() = js.year().unsafeCast<Int>()

actual val YearMonth.monthValue: Int
    get() = js.monthValue().unsafeCast<Int>()

actual fun localDate(year: Int, month: Int, day: Int): LocalDate = JSJoda.LocalDate.Companion.of(year, month, day)

actual fun LocalDate.toStartOfDayInstant(zoneId: ZoneId): Instant = atStartOfDay(zoneId).toInstant()

actual fun zoneIdOf(id: String): ZoneId = JSJoda.ZoneId.of(id)