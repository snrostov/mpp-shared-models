package account

actual typealias Instant = java.time.Instant

actual fun fromEpoch(ms: Long): Instant = java.time.Instant.ofEpochMilli(ms)

actual typealias LocalDate = java.time.LocalDate

actual val LocalDate.yearMonth: YearMonth
    get() = java.time.YearMonth.from(this)

actual typealias ZoneId = java.time.ZoneId

actual fun Instant.toLocalDate(zoneId: ZoneId) = atZone(zoneId).toLocalDate()

actual typealias YearMonth = java.time.YearMonth

actual val YearMonth.year: Int
    get() = year

actual val YearMonth.monthValue: Int
    get() = monthValue

actual fun localDate(year: Int, month: Int, day: Int): LocalDate = LocalDate.of(year, month, day)

actual fun LocalDate.toStartOfDayInstant(zoneId: ZoneId) = atStartOfDay().atZone(zoneId).toInstant()

actual fun zoneIdOf(id: String): ZoneId = java.time.ZoneId.of(id)