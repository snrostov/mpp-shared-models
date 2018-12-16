package account

expect class Instant

expect fun fromEpoch(ms: Long): Instant

expect fun Instant.toLocalDate(zoneId: ZoneId): LocalDate

expect abstract class ZoneId

expect fun zoneIdOf(id: String): ZoneId

expect class LocalDate

expect val LocalDate.yearMonth: YearMonth

expect class YearMonth

expect val YearMonth.year: Int

expect val YearMonth.monthValue: Int

expect fun localDate(year: Int, month: Int, day: Int): LocalDate

expect fun LocalDate.toStartOfDayInstant(zoneId: ZoneId): Instant