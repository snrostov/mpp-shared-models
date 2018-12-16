@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("js-joda")
package JSJoda

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external open class TemporalAccessor {
    open fun get(field: TemporalField): Number = definedExternally
    open fun query(query: TemporalQuery): Any = definedExternally
    open fun range(field: TemporalField): ValueRange = definedExternally
}
external open class Temporal : TemporalAccessor
external open class Clock {
    open fun instant(): Instant = definedExternally
    open fun millis(): Number = definedExternally
    open fun zone(): Any = definedExternally
    companion object {
        fun fixed(fixedInstant: Instant, zoneOffset: ZoneOffset): Clock = definedExternally
        fun system(zone: ZoneId): Clock = definedExternally
        fun systemDefaultZone(): Clock = definedExternally
        fun systemUTC(): Clock = definedExternally
    }
}
external open class DayOfWeek : Temporal {
    open fun adjustInto(temporal: TemporalAdjuster): DayOfWeek /* this */ = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    open fun getDisplayName(style: TextStyle, locale: Locale): String = definedExternally
    open fun getLong(field: TemporalField): Number = definedExternally
    open fun isSupported(field: TemporalField): Boolean = definedExternally
    open fun minus(days: Number): DayOfWeek = definedExternally
    open fun name(): String = definedExternally
    open fun ordinal(): Number = definedExternally
    open fun plus(days: Number): DayOfWeek = definedExternally
    override fun toString(): String = definedExternally
    open fun value(): Number = definedExternally
    companion object {
        var MONDAY: DayOfWeek = definedExternally
        var TUESDAY: DayOfWeek = definedExternally
        var WEDNESDAY: DayOfWeek = definedExternally
        var THURSDAY: DayOfWeek = definedExternally
        var FRIDAY: DayOfWeek = definedExternally
        var SATURDAY: DayOfWeek = definedExternally
        var SUNDAY: DayOfWeek = definedExternally
        fun from(temporal: TemporalAccessor): DayOfWeek = definedExternally
        fun of(dayOfWeek: Number): DayOfWeek = definedExternally
        fun valueOf(name: String): DayOfWeek = definedExternally
        fun values(): Array<DayOfWeek> = definedExternally
    }
}
external open class TemporalAmount {
    open fun <T : Temporal> addTo(temporal: T): T = definedExternally
    open fun get(unit: TemporalUnit): Number = definedExternally
    open fun units(): Array<TemporalUnit> = definedExternally
    open fun <T : Temporal> subtractFrom(temporal: T): T = definedExternally
}
external open class Duration : TemporalAmount {
    open fun abs(): Duration = definedExternally
    override fun <T : Temporal> addTo(temporal: T): T = definedExternally
    open fun compareTo(otherDuration: Duration): Number = definedExternally
    open fun dividedBy(divisor: Number): Duration = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    override fun get(unit: TemporalUnit): Number = definedExternally
    open fun isNegative(): Boolean = definedExternally
    open fun isZero(): Boolean = definedExternally
    open fun minus(durationOrNumber: Number, unit: ChronoUnit): Duration = definedExternally
    open fun minus(durationOrNumber: Duration, unit: ChronoUnit): Duration = definedExternally
    open fun minusAmountUnit(amountToSubtract: Number, unit: TemporalUnit): Duration = definedExternally
    open fun minusDays(daysToSubtract: Number): Duration = definedExternally
    open fun minusDuration(duration: Duration): Duration = definedExternally
    open fun minusHours(hoursToSubtract: Number): Duration = definedExternally
    open fun minusMillis(millisToSubtract: Number): Duration = definedExternally
    open fun minusMinutes(minutesToSubtract: Number): Duration = definedExternally
    open fun minusNanos(nanosToSubtract: Number): Duration = definedExternally
    open fun minusSeconds(secondsToSubtract: Number): Duration = definedExternally
    open fun multipliedBy(multiplicand: Number): Duration = definedExternally
    open fun nano(): Number = definedExternally
    open fun negated(): Duration = definedExternally
    open fun plus(durationOrNumber: Number, unitOrNumber: Number): Duration = definedExternally
    open fun plus(durationOrNumber: Number, unitOrNumber: TemporalUnit): Duration = definedExternally
    open fun plus(durationOrNumber: Duration, unitOrNumber: Number): Duration = definedExternally
    open fun plus(durationOrNumber: Duration, unitOrNumber: TemporalUnit): Duration = definedExternally
    open fun plusAmountUnit(amountToAdd: Number, unit: TemporalUnit): Duration = definedExternally
    open fun plusDays(daysToAdd: Number): Duration = definedExternally
    open fun plusDuration(duration: Duration): Duration = definedExternally
    open fun plusHours(hoursToAdd: Number): Duration = definedExternally
    open fun plusMillis(millisToAdd: Number): Duration = definedExternally
    open fun plusMinutes(minutesToAdd: Number): Duration = definedExternally
    open fun plusNanos(nanosToAdd: Number): Duration = definedExternally
    open fun plusSeconds(secondsToAdd: Number): Duration = definedExternally
    open fun plusSecondsNanos(secondsToAdd: Number, nanosToAdd: Number): Duration = definedExternally
    open fun seconds(): Number = definedExternally
    override fun <T : Temporal> subtractFrom(temporal: T): T = definedExternally
    open fun toDays(): Number = definedExternally
    open fun toHours(): Number = definedExternally
    open fun toJSON(): String = definedExternally
    open fun toMillis(): Number = definedExternally
    open fun toMinutes(): Number = definedExternally
    open fun toNanos(): Number = definedExternally
    override fun toString(): String = definedExternally
    override fun units(): Any = definedExternally
    open fun withNanos(nanoOfSecond: Number): Duration = definedExternally
    open fun withSeconds(seconds: Number): Duration = definedExternally
    companion object {
        var ZERO: Duration = definedExternally
        fun between(startInclusive: Temporal, endExclusive: Temporal): Duration = definedExternally
        fun from(amount: TemporalAmount): Duration = definedExternally
        fun of(amount: Number, unit: TemporalUnit): Duration = definedExternally
        fun ofDays(days: Number): Duration = definedExternally
        fun ofHours(hours: Number): Duration = definedExternally
        fun ofMillis(millis: Number): Duration = definedExternally
        fun ofMinutes(minutes: Number): Duration = definedExternally
        fun ofNanos(nanos: Number): Duration = definedExternally
        fun ofSeconds(seconds: Number): Duration = definedExternally
        fun parse(text: String): Duration = definedExternally
    }
}
external open class Instant : Temporal {
    open fun adjustInto(temporal: Temporal): Temporal = definedExternally
    open fun compareTo(otherInstant: Instant): Number = definedExternally
    open fun epochSecond(): Number = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    override fun get(field: TemporalField): Number = definedExternally
    open fun getLong(field: TemporalField): Number = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun isAfter(otherInstant: Instant): Boolean = definedExternally
    open fun isBefore(otherInstant: Instant): Boolean = definedExternally
    open fun isSupported(fieldOrUnit: TemporalField): Boolean = definedExternally
    open fun isSupported(fieldOrUnit: TemporalUnit): Boolean = definedExternally
    open fun minus(amount: TemporalAmount): Instant = definedExternally
    open fun minus(amountToSubtract: Number, unit: TemporalUnit): Instant = definedExternally
    open fun minusMillis(millisToSubtract: Number): Instant = definedExternally
    open fun minusNanos(nanosToSubtract: Number): Instant = definedExternally
    open fun minusSeconds(secondsToSubtract: Number): Instant = definedExternally
    open fun nano(): Number = definedExternally
    open fun plus(amount: TemporalAmount): Instant = definedExternally
    open fun plus(amountToAdd: Number, unit: TemporalUnit): Instant = definedExternally
    open fun plusMillis(millisToAdd: Number): Instant = definedExternally
    open fun plusNanos(nanosToAdd: Number): Instant = definedExternally
    open fun plusSeconds(secondsToAdd: Number): Instant = definedExternally
    override fun query(query: TemporalQuery): Any = definedExternally
    override fun range(field: TemporalField): ValueRange = definedExternally
    open fun toEpochMilli(): Number = definedExternally
    override fun toString(): String = definedExternally
    open fun truncatedTo(unit: TemporalUnit): Instant = definedExternally
    open fun until(endExclusive: Temporal, unit: TemporalUnit): Number = definedExternally
    open fun with(adjuster: TemporalAdjuster): Instant = definedExternally
    open fun with(field: TemporalField, newValue: Number): Instant = definedExternally
    open fun withTemporalAdjuster(adjuster: TemporalAdjuster): Instant = definedExternally
    companion object {
        var EPOCH: Instant = definedExternally
        var MIN: Instant = definedExternally
        var MAX: Instant = definedExternally
        var MIN_SECONDS: Instant = definedExternally
        var MAX_SECONDS: Instant = definedExternally
        fun from(temporal: TemporalAccessor): Instant = definedExternally
        fun now(clock: Clock? = definedExternally /* null */): Instant = definedExternally
        fun ofEpochMilli(epochMilli: Number): Instant = definedExternally
        fun ofEpochSecond(epochSecond: Number, nanoAdjustment: Number? = definedExternally /* null */): Instant = definedExternally
        fun parse(text: String): Instant = definedExternally
    }
}
external open class ResolverStyle {
    companion object {
        var STRICT: ResolverStyle = definedExternally
        var SMART: ResolverStyle = definedExternally
        var LENIENT: ResolverStyle = definedExternally
    }
}
external open class DateTimeFormatter {
    open fun chronology(): Any = definedExternally
    open fun decimalStyle(): Any = definedExternally
    open fun format(temporal: TemporalAccessor): String = definedExternally
    open fun locale(): Any = definedExternally
    open fun parse(text: String, type: TemporalQuery): TemporalAccessor = definedExternally
    open fun parse1(text: String): TemporalAccessor = definedExternally
    open fun parse2(text: Any, type: Any): Any = definedExternally
    open fun parseUnresolved(text: Any, position: Any): Any = definedExternally
    override fun toString(): String = definedExternally
    open fun withChronology(chrono: Any): Any = definedExternally
    open fun withLocale(): DateTimeFormatter = definedExternally
    open fun withResolverStyle(resolverStyle: ResolverStyle): DateTimeFormatter = definedExternally
    companion object {
        var ISO_LOCAL_DATE: DateTimeFormatter = definedExternally
        var ISO_LOCAL_TIME: DateTimeFormatter = definedExternally
        var ISO_LOCAL_DATE_TIME: DateTimeFormatter = definedExternally
        var ISO_INSTANT: DateTimeFormatter = definedExternally
        var ISO_OFFSET_DATE_TIME: DateTimeFormatter = definedExternally
        var ISO_ZONED_DATE_TIME: DateTimeFormatter = definedExternally
        fun ofPattern(pattern: String): DateTimeFormatter = definedExternally
        fun parsedExcessDays(): TemporalQuery = definedExternally
        fun parsedLeapSecond(): Boolean = definedExternally
    }
}
external open class DateTimeFormatterBuilder {
    open fun append(formatter: DateTimeFormatter): DateTimeFormatterBuilder = definedExternally
    open fun appendFraction(field: TemporalField, minWidth: Number, maxWidth: Number, decimalPoint: Boolean): DateTimeFormatterBuilder = definedExternally
    open fun appendInstant(fractionalDigits: Number): DateTimeFormatterBuilder = definedExternally
    open fun appendLiteral(literal: Any): DateTimeFormatterBuilder = definedExternally
    open fun appendOffset(pattern: String, noOffsetText: String): DateTimeFormatterBuilder = definedExternally
    open fun appendOffsetId(): DateTimeFormatterBuilder = definedExternally
    open fun appendPattern(pattern: String): DateTimeFormatterBuilder = definedExternally
    open fun appendValue(): DateTimeFormatterBuilder = definedExternally
    open fun appendValueReduced(): DateTimeFormatterBuilder = definedExternally
    open fun appendZoneId(): DateTimeFormatterBuilder = definedExternally
    open fun optionalEnd(): DateTimeFormatterBuilder = definedExternally
    open fun optionalStart(): DateTimeFormatterBuilder = definedExternally
    open fun padNext(): DateTimeFormatterBuilder = definedExternally
    open fun parseCaseInsensitive(): DateTimeFormatterBuilder = definedExternally
    open fun parseCaseSensitive(): DateTimeFormatterBuilder = definedExternally
    open fun parseLenient(): DateTimeFormatterBuilder = definedExternally
    open fun parseStrict(): DateTimeFormatterBuilder = definedExternally
    open fun toFormatter(resolverStyle: ResolverStyle): DateTimeFormatter = definedExternally
}
external open class Chronology
external open class LocalTime : Temporal {
    open fun adjustInto(temporal: TemporalAdjuster): Temporal = definedExternally
    open fun atDate(date: LocalDate): LocalDateTime = definedExternally
    open fun compareTo(other: LocalTime): Number = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    open fun format(formatter: DateTimeFormatter): String = definedExternally
    open fun get(field: ChronoField): Number = definedExternally
    open fun getLong(field: ChronoField): Number = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun hour(): Number = definedExternally
    open fun isAfter(other: LocalTime): Boolean = definedExternally
    open fun isBefore(other: LocalTime): Boolean = definedExternally
    open fun isSupported(fieldOrUnit: ChronoUnit): Boolean = definedExternally
    open fun isSupported(fieldOrUnit: ChronoField): Boolean = definedExternally
    open fun minus(amount: TemporalAmount): LocalTime = definedExternally
    open fun minus(amountToSubtract: Number, unit: ChronoUnit): LocalTime = definedExternally
    open fun minusHours(hoursToSubtract: Number): LocalTime = definedExternally
    open fun minusMinutes(minutesToSubtract: Number): LocalTime = definedExternally
    open fun minusNanos(nanosToSubtract: Number): LocalTime = definedExternally
    open fun minusSeconds(secondsToSubtract: Number): LocalTime = definedExternally
    open fun minute(): Number = definedExternally
    open fun nano(): Number = definedExternally
    open fun plus(amount: TemporalAmount): LocalTime = definedExternally
    open fun plus(amountToAdd: Number, unit: TemporalUnit): LocalTime = definedExternally
    open fun plusHours(hoursToAdd: Number): LocalTime = definedExternally
    open fun plusMinutes(minutesToAdd: Number): LocalTime = definedExternally
    open fun plusNanos(nanosToAdd: Number): LocalTime = definedExternally
    open fun plusSeconds(secondstoAdd: Number): LocalTime = definedExternally
    override fun query(query: TemporalQuery): Any = definedExternally
    open fun range(field: ChronoField): ValueRange = definedExternally
    open fun second(): Number = definedExternally
    open fun toJSON(): String = definedExternally
    open fun toNanoOfDay(): Number = definedExternally
    open fun toSecondOfDay(): Number = definedExternally
    override fun toString(): String = definedExternally
    open fun truncatedTo(unit: ChronoUnit): LocalTime = definedExternally
    open fun until(endExclusive: TemporalAccessor, unit: TemporalUnit): Number = definedExternally
    open fun with(adjuster: TemporalAdjuster): LocalTime = definedExternally
    open fun with(field: TemporalField, newValue: Number): LocalTime = definedExternally
    open fun withHour(hour: Number): LocalTime = definedExternally
    open fun withMinute(minute: Number): LocalTime = definedExternally
    open fun withNano(nanoOfSecond: Number): LocalTime = definedExternally
    open fun withSecond(second: Number): LocalTime = definedExternally
    open fun withTemporalAdjuster(adjuster: TemporalAdjuster): LocalTime = definedExternally
    companion object {
        var MIN: LocalTime = definedExternally
        var MAX: LocalTime = definedExternally
        var MIDNIGHT: LocalTime = definedExternally
        var NOON: LocalTime = definedExternally
        var HOURS_PER_DAY: Number = definedExternally
        var MINUTES_PER_HOUR: Number = definedExternally
        var MINUTES_PER_DAY: Number = definedExternally
        var SECONDS_PER_MINUTE: Number = definedExternally
        var SECONDS_PER_HOUR: Number = definedExternally
        var SECONDS_PER_DAY: Number = definedExternally
        var MILLIS_PER_DAY: Number = definedExternally
        var MICROS_PER_DAY: Number = definedExternally
        var NANOS_PER_SECOND: Number = definedExternally
        var NANOS_PER_MINUTE: Number = definedExternally
        var NANOS_PER_HOUR: Number = definedExternally
        var NANOS_PER_DAY: Number = definedExternally
        fun from(temporal: TemporalAccessor): LocalTime = definedExternally
        fun now(clockOrZone: Clock? = definedExternally /* null */): LocalTime = definedExternally
        fun now(clockOrZone: ZoneId? = definedExternally /* null */): LocalTime = definedExternally
        fun of(hour: Number? = definedExternally /* null */, minute: Number? = definedExternally /* null */, second: Number? = definedExternally /* null */, nanoOfSecond: Number? = definedExternally /* null */): LocalTime = definedExternally
        fun ofInstant(instant: Instant, zone: ZoneId? = definedExternally /* null */): LocalTime = definedExternally
        fun ofNanoOfDay(nanoOfDay: Number): LocalTime = definedExternally
        fun ofSecondOfDay(secondOfDay: Number? = definedExternally /* null */, nanoOfSecond: Number? = definedExternally /* null */): LocalTime = definedExternally
        fun parse(text: String, formatter: DateTimeFormatter? = definedExternally /* null */): LocalTime = definedExternally
        fun now(): LocalTime = definedExternally
    }
}
external open class MathUtil {
    companion object {
        fun compareNumbers(a: Number, b: Number): Number = definedExternally
        fun floorDiv(x: Number, y: Number): Number = definedExternally
        fun floorMod(x: Number, y: Number): Number = definedExternally
        fun intDiv(x: Number, y: Number): Number = definedExternally
        fun intMod(x: Number, y: Number): Number = definedExternally
        fun parseInt(value: Number): Number = definedExternally
        fun roundDown(r: Number): Number = definedExternally
        fun safeAdd(x: Number, y: Number): Number = definedExternally
        fun safeMultiply(x: Number, y: Number): Number = definedExternally
        fun safeSubtract(x: Number, y: Number): Number = definedExternally
        fun safeToInt(value: Number): Number = definedExternally
        fun safeZero(value: Number): Number = definedExternally
        fun verifyInt(value: Number): Unit = definedExternally
    }
}
external open class Month : Temporal {
    open fun adjustInto(temporal: Temporal): Temporal = definedExternally
    open fun firstDayOfYear(leapYear: Boolean): Number = definedExternally
    open fun firstMonthOfQuarter(): Month = definedExternally
    override fun get(field: TemporalField): Number = definedExternally
    open fun getDisplayName(style: TextStyle, locale: Locale): String = definedExternally
    open fun getLong(field: TemporalField): Number = definedExternally
    open fun isSupported(field: TemporalField): Boolean = definedExternally
    open fun length(leapYear: Boolean): Number = definedExternally
    open fun maxLength(): Number = definedExternally
    open fun minLength(): Number = definedExternally
    open fun minus(months: Number): Month = definedExternally
    open fun plus(months: Number): Month = definedExternally
    override fun query(query: TemporalQuery): Any = definedExternally
    override fun toString(): String = definedExternally
    open fun value(): Number = definedExternally
    companion object {
        var JANUARY: Month = definedExternally
        var FEBRUARY: Month = definedExternally
        var MARCH: Month = definedExternally
        var APRIL: Month = definedExternally
        var MAY: Month = definedExternally
        var JUNE: Month = definedExternally
        var JULY: Month = definedExternally
        var AUGUST: Month = definedExternally
        var SEPTEMBER: Month = definedExternally
        var OCTOBER: Month = definedExternally
        var NOVEMBER: Month = definedExternally
        var DECEMBER: Month = definedExternally
        fun from(temporal: TemporalAccessor): Month = definedExternally
        fun of(month: Number): Month = definedExternally
        fun values(): Array<Month> = definedExternally
    }
}
external open class MonthDay : Temporal {
    open fun adjustInto(temporal: Temporal): Temporal = definedExternally
    open fun atYear(year: Number): LocalDate = definedExternally
    open fun compareTo(other: MonthDay): Number = definedExternally
    open fun dayOfMonth(): Number = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    open fun format(formatter: DateTimeFormatter): String = definedExternally
    override fun get(field: TemporalField): Number = definedExternally
    open fun getLong(field: TemporalField): Number = definedExternally
    open fun isAfter(other: MonthDay): Boolean = definedExternally
    open fun isBefore(other: MonthDay): Boolean = definedExternally
    open fun isSupported(field: TemporalField): Boolean = definedExternally
    open fun isValidYear(year: Number): Boolean = definedExternally
    open fun month(): Month = definedExternally
    open fun monthValue(): Number = definedExternally
    override fun query(query: TemporalQuery): Any = definedExternally
    override fun range(field: TemporalField): ValueRange = definedExternally
    override fun toString(): String = definedExternally
    open fun with(month: Month): MonthDay = definedExternally
    open fun withDayOfMonth(dayOfMonth: Number): MonthDay = definedExternally
    open fun withMonth(month: Number): MonthDay = definedExternally
    companion object {
        fun from(temporal: TemporalAccessor): MonthDay = definedExternally
        fun now(arg1: Clock? = definedExternally /* null */): MonthDay = definedExternally
        fun now(arg1: ZoneId? = definedExternally /* null */): MonthDay = definedExternally
        fun of(monthOrNumber: Number, number: Number? = definedExternally /* null */): MonthDay = definedExternally
        fun of(monthOrNumber: Month, number: Number? = definedExternally /* null */): MonthDay = definedExternally
        fun ofMonthNumber(month: Month, dayOfMonth: Number): MonthDay = definedExternally
        fun ofNumberNumber(month: Number, dayOfMonth: Number): MonthDay = definedExternally
        fun parse(text: String, formatter: DateTimeFormatter? = definedExternally /* null */): MonthDay = definedExternally
        fun parseString(text: String): MonthDay = definedExternally
        fun parseStringFormatter(text: String, formatter: DateTimeFormatter): MonthDay = definedExternally
        fun now(): MonthDay = definedExternally
    }
}
external interface TemporalField
external open class ChronoField {
    open fun baseUnit(): Number = definedExternally
    open fun checkValidIntValue(value: Number): Number = definedExternally
    open fun checkValidValue(value: Number): Any = definedExternally
    open fun displayName(): String = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    open fun getFrom(temporal: TemporalAccessor): Number = definedExternally
    open fun isDateBased(): Boolean = definedExternally
    open fun isTimeBased(): Boolean = definedExternally
    open fun name(): String = definedExternally
    open fun range(): ValueRange = definedExternally
    open fun rangeRefinedBy(temporal: TemporalAccessor): ValueRange = definedExternally
    open fun rangeUnit(): Number = definedExternally
    override fun toString(): String = definedExternally
    companion object {
        var NANO_OF_SECOND: ChronoField = definedExternally
        var NANO_OF_DAY: ChronoField = definedExternally
        var MICRO_OF_SECOND: ChronoField = definedExternally
        var MICRO_OF_DAY: ChronoField = definedExternally
        var MILLI_OF_SECOND: ChronoField = definedExternally
        var MILLI_OF_DAY: ChronoField = definedExternally
        var SECOND_OF_MINUTE: ChronoField = definedExternally
        var SECOND_OF_DAY: ChronoField = definedExternally
        var MINUTE_OF_HOUR: ChronoField = definedExternally
        var MINUTE_OF_DAY: ChronoField = definedExternally
        var HOUR_OF_AMPM: ChronoField = definedExternally
        var CLOCK_HOUR_OF_AMPM: ChronoField = definedExternally
        var HOUR_OF_DAY: ChronoField = definedExternally
        var CLOCK_HOUR_OF_DAY: ChronoField = definedExternally
        var AMPM_OF_DAY: ChronoField = definedExternally
        var DAY_OF_WEEK: ChronoField = definedExternally
        var ALIGNED_DAY_OF_WEEK_IN_MONTH: ChronoField = definedExternally
        var ALIGNED_DAY_OF_WEEK_IN_YEAR: ChronoField = definedExternally
        var DAY_OF_MONTH: ChronoField = definedExternally
        var DAY_OF_YEAR: ChronoField = definedExternally
        var EPOCH_DAY: ChronoField = definedExternally
        var ALIGNED_WEEK_OF_MONTH: ChronoField = definedExternally
        var ALIGNED_WEEK_OF_YEAR: ChronoField = definedExternally
        var MONTH_OF_YEAR: ChronoField = definedExternally
        var PROLEPTIC_MONTH: ChronoField = definedExternally
        var YEAR_OF_ERA: ChronoField = definedExternally
        var YEAR: ChronoField = definedExternally
        var ERA: ChronoField = definedExternally
        var INSTANT_SECONDS: ChronoField = definedExternally
        var OFFSET_SECONDS: ChronoField = definedExternally
    }
}
external open class TemporalUnit {
    open fun <T : Temporal> addTo(temporal: T, amount: Number): T = definedExternally
    open fun between(temporal1: Temporal, temporal2: Temporal): Number = definedExternally
    open fun duration(): Duration = definedExternally
    open fun isDateBased(): Boolean = definedExternally
    open fun isDurationEstimated(): Boolean = definedExternally
    open fun isSupportedBy(temporal: Temporal): Boolean = definedExternally
    open fun isTimeBased(): Boolean = definedExternally
}
external open class ChronoUnit : TemporalUnit {
    override fun <T : Temporal> addTo(temporal: T, amount: Number): T = definedExternally
    override fun between(temporal1: Temporal, temporal2: Temporal): Number = definedExternally
    open fun compareTo(other: TemporalUnit): Number = definedExternally
    override fun duration(): Duration = definedExternally
    override fun isDateBased(): Boolean = definedExternally
    override fun isDurationEstimated(): Boolean = definedExternally
    override fun isSupportedBy(temporal: Temporal): Boolean = definedExternally
    override fun isTimeBased(): Boolean = definedExternally
    override fun toString(): String = definedExternally
    companion object {
        var MICROS: ChronoUnit = definedExternally
        var MILLIS: ChronoUnit = definedExternally
        var SECONDS: ChronoUnit = definedExternally
        var MINUTES: ChronoUnit = definedExternally
        var HOURS: ChronoUnit = definedExternally
        var HALF_DAYS: ChronoUnit = definedExternally
        var DAYS: ChronoUnit = definedExternally
        var WEEKS: ChronoUnit = definedExternally
        var MONTHS: ChronoUnit = definedExternally
        var YEARS: ChronoUnit = definedExternally
        var DECADES: ChronoUnit = definedExternally
        var CENTURIES: ChronoUnit = definedExternally
        var MILLENNIA: ChronoUnit = definedExternally
        var ERAS: ChronoUnit = definedExternally
        var FOREVER: ChronoUnit = definedExternally
    }
}
external open class IsoFields {
    companion object {
        var DAY_OF_QUARTER: IsoFields = definedExternally
        var QUARTER_OF_YEAR: IsoFields = definedExternally
        var WEEK_OF_WEEK_BASED_YEAR: IsoFields = definedExternally
        var WEEK_BASED_YEAR: IsoFields = definedExternally
        var WEEK_BASED_YEARS: IsoFields = definedExternally
        var QUARTER_YEARS: IsoFields = definedExternally
    }
}
external open class ChronoLocalDate : Temporal {
    open fun adjustInto(temporal: TemporalAdjuster): ChronoLocalDate /* this */ = definedExternally
    open fun format(formatter: DateTimeFormatter): String = definedExternally
    open fun isSupported(fieldOrUnit: TemporalField): Boolean = definedExternally
    open fun isSupported(fieldOrUnit: TemporalUnit): Boolean = definedExternally
}
external open class LocalDate : ChronoLocalDate {
    open fun atStartOfDay(): LocalDateTime = definedExternally
    open fun atStartOfDay(zone: ZoneId): ZonedDateTime = definedExternally
    open fun atStartOfDayWithZone(zone: ZoneId): ZonedDateTime = definedExternally
    open fun atTime(time: LocalTime): LocalDateTime = definedExternally
    open fun atTime(hour: Number, minute: Number, second: Number? = definedExternally /* null */, nanoOfSecond: Number? = definedExternally /* null */): LocalDateTime = definedExternally
    open fun chronology(): Chronology = definedExternally
    open fun compareTo(other: LocalDate): Number = definedExternally
    open fun dayOfMonth(): Number = definedExternally
    open fun dayOfWeek(): DayOfWeek = definedExternally
    open fun dayOfYear(): Number = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    override fun get(field: TemporalField): Number = definedExternally
    open fun getLong(field: TemporalField): Number = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun isAfter(other: LocalDate): Boolean = definedExternally
    open fun isBefore(other: LocalDate): Boolean = definedExternally
    open fun isEqual(other: LocalDate): Boolean = definedExternally
    open fun isLeapYear(): Boolean = definedExternally
    open fun isoWeekOfWeekyear(): Number = definedExternally
    open fun isoWeekyear(): Number = definedExternally
    open fun lengthOfMonth(): Number = definedExternally
    open fun lengthOfYear(): Number = definedExternally
    open fun minus(amount: TemporalAmount): LocalDate = definedExternally
    open fun minus(amountToSubtract: Number, unit: TemporalUnit): LocalDate = definedExternally
    open fun minusDays(daysToSubtract: Number): LocalDate = definedExternally
    open fun minusMonths(monthsToSubtract: Number): LocalDate = definedExternally
    open fun minusWeeks(weeksToSubtract: Number): LocalDate = definedExternally
    open fun minusYears(yearsToSubtract: Number): LocalDate = definedExternally
    open fun month(): Month = definedExternally
    open fun monthValue(): Number = definedExternally
    open fun plus(amount: TemporalAmount): LocalDate = definedExternally
    open fun plus(amountToAdd: Number, unit: TemporalUnit): LocalDate = definedExternally
    open fun plusDays(daysToAdd: Number): LocalDate = definedExternally
    open fun plusMonths(monthsToAdd: Number): LocalDate = definedExternally
    open fun plusWeeks(weeksToAdd: Number): LocalDate = definedExternally
    open fun plusYears(yearsToAdd: Number): LocalDate = definedExternally
    override fun query(query: TemporalQuery): Any = definedExternally
    override fun range(field: TemporalField): ValueRange = definedExternally
    open fun toEpochDay(): Number = definedExternally
    open fun toJSON(): String = definedExternally
    override fun toString(): String = definedExternally
    open fun until(endDate: TemporalAccessor): Period = definedExternally
    open fun until(endExclusive: TemporalAccessor, unit: TemporalUnit): Number = definedExternally
    open fun with(fieldOrAdjuster: TemporalField, newValue: Number): LocalDate = definedExternally
    open fun with(adjuster: TemporalAdjuster): LocalDate = definedExternally
    open fun withDayOfMonth(dayOfMonth: Number): LocalDate = definedExternally
    open fun withDayOfYear(dayOfYear: Number): LocalDate = definedExternally
    open fun withFieldAndValue(field: TemporalField, newValue: Number): LocalDate = definedExternally
    open fun withMonth(month: Number): LocalDate = definedExternally
    open fun withMonth(month: Month): LocalDate = definedExternally
    open fun withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDate = definedExternally
    open fun withYear(year: Number): LocalDate = definedExternally
    open fun year(): Number = definedExternally
    companion object {
        var MIN: LocalDate = definedExternally
        var MAX: LocalDate = definedExternally
        var EPOCH_0: LocalDate = definedExternally
        fun from(temporal: TemporalAccessor): LocalDate = definedExternally
        fun now(clockOrZone: Clock? = definedExternally /* null */): LocalDate = definedExternally
        fun now(clockOrZone: ZoneId? = definedExternally /* null */): LocalDate = definedExternally
        fun of(year: Number, month: Number, dayOfMonth: Number): LocalDate = definedExternally
        fun of(year: Number, month: Month, dayOfMonth: Number): LocalDate = definedExternally
        fun ofEpochDay(epochDay: Number): LocalDate = definedExternally
        fun ofInstant(instant: Instant, zoneId: ZoneId? = definedExternally /* null */): LocalDate = definedExternally
        fun ofYearDay(year: Number, dayOfYear: Number): LocalDate = definedExternally
        fun parse(text: String, formatter: DateTimeFormatter? = definedExternally /* null */): LocalDate = definedExternally
        fun now(): LocalDate = definedExternally
    }
}
external open class ChronoLocalDateTime : Temporal {
    open fun adjustInto(temporal: Any): Any = definedExternally
    open fun chronology(): Chronology = definedExternally
    open fun toEpochSecond(offset: ZoneOffset): Number = definedExternally
    open fun toInstant(offset: ZoneOffset): Instant = definedExternally
}
external open class LocalDateTime : ChronoLocalDateTime {
    open fun adjustInto(temporal: TemporalAdjuster): LocalDateTime = definedExternally
    open fun atZone(zone: ZoneId): ZonedDateTime = definedExternally
    open fun compareTo(other: LocalDateTime): Number = definedExternally
    open fun dayOfMonth(): Number = definedExternally
    open fun dayOfWeek(): DayOfWeek = definedExternally
    open fun dayOfYear(): Number = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    open fun format(formatter: DateTimeFormatter): String = definedExternally
    override fun get(field: TemporalField): Number = definedExternally
    open fun getLong(field: TemporalField): Number = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun hour(): Number = definedExternally
    open fun isAfter(other: LocalDateTime): Boolean = definedExternally
    open fun isBefore(other: LocalDateTime): Boolean = definedExternally
    open fun isEqual(other: Any): Boolean = definedExternally
    open fun isSupported(fieldOrUnit: TemporalField): Boolean = definedExternally
    open fun isSupported(fieldOrUnit: TemporalUnit): Boolean = definedExternally
    open fun minus(amount: TemporalAmount): LocalDateTime = definedExternally
    open fun minus(amountToSubtract: Number, unit: TemporalUnit): LocalDateTime = definedExternally
    open fun minusDays(days: Number): LocalDateTime = definedExternally
    open fun minusHours(hours: Number): LocalDateTime = definedExternally
    open fun minusMinutes(minutes: Number): LocalDateTime = definedExternally
    open fun minusMonths(months: Number): LocalDateTime = definedExternally
    open fun minusNanos(nanos: Number): LocalDateTime = definedExternally
    open fun minusSeconds(seconds: Number): LocalDateTime = definedExternally
    open fun minusTemporalAmount(amount: TemporalAmount): LocalDateTime = definedExternally
    open fun minusWeeks(weeks: Number): LocalDateTime = definedExternally
    open fun minusYears(years: Number): LocalDateTime = definedExternally
    open fun minute(): Number = definedExternally
    open fun month(): Month = definedExternally
    open fun monthValue(): Number = definedExternally
    open fun nano(): Number = definedExternally
    open fun plus(amount: TemporalAmount): LocalDateTime = definedExternally
    open fun plus(amountToAdd: Number, unit: TemporalUnit): LocalDateTime = definedExternally
    open fun plusDays(days: Number): LocalDateTime = definedExternally
    open fun plusHours(hours: Number): LocalDateTime = definedExternally
    open fun plusMinutes(minutes: Number): LocalDateTime = definedExternally
    open fun plusMonths(months: Number): LocalDateTime = definedExternally
    open fun plusNanos(nanos: Number): LocalDateTime = definedExternally
    open fun plusSeconds(seconds: Number): LocalDateTime = definedExternally
    open fun plusTemporalAmount(amount: TemporalAmount): LocalDateTime = definedExternally
    open fun plusWeeks(weeks: Number): LocalDateTime = definedExternally
    open fun plusYears(years: Number): LocalDateTime = definedExternally
    override fun query(query: TemporalQuery): Any = definedExternally
    override fun range(field: TemporalField): ValueRange = definedExternally
    open fun second(): Number = definedExternally
    open fun toJSON(): String = definedExternally
    open fun toLocalDate(): LocalDate = definedExternally
    open fun toLocalTime(): LocalTime = definedExternally
    override fun toString(): String = definedExternally
    open fun truncatedTo(unit: TemporalUnit): LocalDateTime = definedExternally
    open fun until(endExclusive: Temporal, unit: TemporalUnit): Number = definedExternally
    open fun with(adjuster: TemporalAdjuster): LocalDateTime = definedExternally
    open fun with(field: TemporalField, newValue: Number): LocalDateTime = definedExternally
    open fun withDayOfMonth(dayOfMonth: Number): LocalDateTime = definedExternally
    open fun withDayOfYear(dayOfYear: Number): LocalDateTime = definedExternally
    open fun withHour(hour: Number): LocalDateTime = definedExternally
    open fun withMinute(minute: Number): LocalDateTime = definedExternally
    open fun withMonth(month: Number): LocalDateTime = definedExternally
    open fun withMonth(month: Month): LocalDateTime = definedExternally
    open fun withNano(nanoOfSecond: Number): LocalDateTime = definedExternally
    open fun withSecond(second: Number): LocalDateTime = definedExternally
    open fun withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDateTime = definedExternally
    open fun withYear(year: Number): LocalDateTime = definedExternally
    open fun year(): Number = definedExternally
    companion object {
        var MIN: LocalDateTime = definedExternally
        var MAX: LocalDateTime = definedExternally
        fun from(temporal: TemporalAccessor): LocalDateTime = definedExternally
        fun now(clockOrZone: Clock? = definedExternally /* null */): LocalDateTime = definedExternally
        fun now(clockOrZone: ZoneId? = definedExternally /* null */): LocalDateTime = definedExternally
        fun of(date: LocalDate, time: LocalTime): LocalDateTime = definedExternally
        fun of(year: Number? = definedExternally /* null */, month: Number? = definedExternally /* null */, dayOfMonth: Number? = definedExternally /* null */, hour: Number? = definedExternally /* null */, minute: Number? = definedExternally /* null */, second: Number? = definedExternally /* null */, nanoSecond: Number? = definedExternally /* null */): LocalDateTime = definedExternally
        fun of(year: Number? = definedExternally /* null */, month: Month? = definedExternally /* null */, dayOfMonth: Number? = definedExternally /* null */, hour: Number? = definedExternally /* null */, minute: Number? = definedExternally /* null */, second: Number? = definedExternally /* null */, nanoSecond: Number? = definedExternally /* null */): LocalDateTime = definedExternally
        fun ofEpochSecond(epochSecond: Number, offset: ZoneOffset): LocalDateTime = definedExternally
        fun ofEpochSecond(epochSecond: Number, nanoOfSecond: Number, offset: ZoneOffset): LocalDateTime = definedExternally
        fun ofInstant(instant: Instant, zoneId: ZoneId? = definedExternally /* null */): LocalDateTime = definedExternally
        fun parse(text: String, formatter: DateTimeFormatter? = definedExternally /* null */): LocalDateTime = definedExternally
        fun now(): LocalDateTime = definedExternally
        fun of(): LocalDateTime = definedExternally
    }
}
external open class OffsetDateTime
external open class Period : TemporalAmount {
    override fun <T : Temporal> addTo(temporal: T): T = definedExternally
    open fun chronology(): IsoChronology = definedExternally
    open fun days(): Number = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    override fun get(unit: TemporalUnit): Number = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun isNegative(): Boolean = definedExternally
    open fun isZero(): Boolean = definedExternally
    open fun minus(amountToSubtract: TemporalAmount): Period = definedExternally
    open fun minusDays(daysToSubtract: Number): Period = definedExternally
    open fun minusMonths(monthsToSubtract: Number): Period = definedExternally
    open fun minusYears(yearsToSubtract: Number): Period = definedExternally
    open fun months(): Number = definedExternally
    open fun multipliedBy(scalar: Number): Period = definedExternally
    open fun negated(): Period = definedExternally
    open fun normalized(): Period = definedExternally
    open fun plus(amountToAdd: TemporalAmount): Period = definedExternally
    open fun plusDays(daysToAdd: Number): Period = definedExternally
    open fun plusMonths(monthsToAdd: Number): Period = definedExternally
    open fun plusYears(yearsToAdd: Number): Period = definedExternally
    override fun <T : Temporal> subtractFrom(temporal: T): T = definedExternally
    open fun toJSON(): String = definedExternally
    override fun toString(): String = definedExternally
    open fun toTotalMonths(): Number = definedExternally
    override fun units(): Array<ChronoUnit> = definedExternally
    open fun withDays(days: Number): Period = definedExternally
    open fun withMonths(months: Number): Period = definedExternally
    open fun withYears(years: Number): Period = definedExternally
    open fun years(): Number = definedExternally
    companion object {
        var ZERO: Period = definedExternally
        fun between(startDate: LocalDate, endDate: LocalDate): Period = definedExternally
        fun create(years: Number, months: Number, days: Number): Duration = definedExternally
        fun from(amount: TemporalAmount): Period = definedExternally
        fun of(years: Number, months: Number, days: Number): Period = definedExternally
        fun ofDays(days: Number): Period = definedExternally
        fun ofMonths(months: Number): Period = definedExternally
        fun ofWeeks(weeks: Number): Period = definedExternally
        fun ofYears(years: Number): Period = definedExternally
        fun parse(text: String): Period = definedExternally
    }
}
external open class TemporalAdjuster {
    open fun adjustInto(temporal: Temporal): Temporal = definedExternally
}
external open class TemporalAdjusters {
    companion object {
        fun dayOfWeekInMonth(ordinal: Number, dayOfWeek: DayOfWeek): TemporalAdjuster = definedExternally
        fun firstDayOfMonth(): TemporalAdjuster = definedExternally
        fun firstDayOfNextMonth(): TemporalAdjuster = definedExternally
        fun firstDayOfNextYear(): TemporalAdjuster = definedExternally
        fun firstDayOfYear(): TemporalAdjuster = definedExternally
        fun firstInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = definedExternally
        fun lastDayOfMonth(): TemporalAdjuster = definedExternally
        fun lastDayOfYear(): TemporalAdjuster = definedExternally
        fun lastInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = definedExternally
        fun next(dayOfWeek: DayOfWeek): TemporalAdjuster = definedExternally
        fun nextOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = definedExternally
        fun previous(dayOfWeek: DayOfWeek): TemporalAdjuster = definedExternally
        fun previousOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = definedExternally
    }
}
external open class TemporalQueries {
    companion object {
        fun chronology(): TemporalQuery = definedExternally
        fun localDate(): TemporalQuery = definedExternally
        fun localTime(): TemporalQuery = definedExternally
        fun offset(): TemporalQuery = definedExternally
        fun precision(): TemporalQuery = definedExternally
        fun zone(): TemporalQuery = definedExternally
        fun zoneId(): TemporalQuery = definedExternally
    }
}
external open class TemporalQuery {
    open fun queryFrom(temporal: TemporalAccessor): Any = definedExternally
}
external open class ValueRange {
    open fun checkValidIntValue(value: Number, field: TemporalField): Number = definedExternally
    open fun checkValidValue(value: Number, field: TemporalField): Any = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun isFixed(): Boolean = definedExternally
    open fun isIntValue(): Boolean = definedExternally
    open fun isValidIntValue(value: Number): Boolean = definedExternally
    open fun isValidValue(value: Any): Boolean = definedExternally
    open fun largestMinimum(): Number = definedExternally
    open fun maximum(): Number = definedExternally
    open fun minimum(): Number = definedExternally
    open fun smallestMaximum(): Number = definedExternally
    override fun toString(): String = definedExternally
    companion object {
        fun of(min: Number, max: Number): ValueRange = definedExternally
        fun of(min: Number, maxSmallest: Number, maxLargest: Number): ValueRange = definedExternally
        fun of(minSmallest: Number, minLargest: Number, maxSmallest: Number, maxLargest: Number): ValueRange = definedExternally
    }
}
external open class Year : Temporal {
    open fun atMonth(monthOrNumber: Number): YearMonth = definedExternally
    open fun atMonth(monthOrNumber: Month): YearMonth = definedExternally
    open fun plus(amountOrNumber: Number, unit: TemporalUnit? = definedExternally /* null */): Year = definedExternally
    open fun plus(amountOrNumber: TemporalAmount, unit: TemporalUnit? = definedExternally /* null */): Year = definedExternally
    open fun minus(amountOrNumber: Number, unit: TemporalUnit? = definedExternally /* null */): Year = definedExternally
    open fun minus(amountOrNumber: TemporalAmount, unit: TemporalUnit? = definedExternally /* null */): Year = definedExternally
    open fun value(): Number = definedExternally
    companion object {
        var MIN_VALUE: Number = definedExternally
        var MAX_VALUE: Number = definedExternally
        fun from(temporal: TemporalAccessor): Year = definedExternally
        fun isLeap(year: Number): Boolean = definedExternally
        fun now(zoneIdOrClock: Clock? = definedExternally /* null */): Year = definedExternally
        fun now(zoneIdOrClock: ZoneId? = definedExternally /* null */): Year = definedExternally
        fun of(isoYear: Number): Year = definedExternally
        fun parse(text: String, formatter: DateTimeFormatter? = definedExternally /* null */): Year = definedExternally
        fun now(): Year = definedExternally
    }
}
external open class YearMonth : Temporal {
    open fun minus(amount: TemporalAmount): YearMonth = definedExternally
    open fun minus(amountToSubtract: Number, unit: TemporalUnit): YearMonth = definedExternally
    open fun minusYears(yearsToSubtract: Number): YearMonth = definedExternally
    open fun minusMonths(monthsToSubtract: Number): YearMonth = definedExternally
    open fun plus(amount: TemporalAmount): YearMonth = definedExternally
    open fun plus(amountToAdd: Number, unit: TemporalUnit): YearMonth = definedExternally
    open fun plusYears(yearsToAdd: Number): YearMonth = definedExternally
    open fun plusMonths(monthsToAdd: Number): YearMonth = definedExternally
    open fun with(adjuster: TemporalAdjuster): YearMonth = definedExternally
    open fun with(field: TemporalField, value: Number): YearMonth = definedExternally
    open fun withYearMonth(newYear: Number, newMonth: Number): YearMonth = definedExternally
    open fun withYear(year: Number): YearMonth = definedExternally
    open fun withMonth(month: Number): YearMonth = definedExternally
    open fun isSupported(fieldOrUnit: TemporalField): Boolean = definedExternally
    open fun isSupported(fieldOrUnit: ChronoUnit): Boolean = definedExternally
    open fun year(): Number = definedExternally
    open fun monthValue(): Number = definedExternally
    open fun month(): Month = definedExternally
    open fun isLeapYear(): Boolean = definedExternally
    open fun isValidDay(): Boolean = definedExternally
    open fun lengthOfMonth(): Number = definedExternally
    open fun lengthOfYear(): Number = definedExternally
    open fun atDay(dayOfMonth: Number): LocalDate = definedExternally
    open fun atEndOfMonth(): LocalDate = definedExternally
    open fun compareTo(other: YearMonth): Number = definedExternally
    open fun isAfter(other: YearMonth): Boolean = definedExternally
    open fun isBefore(other: YearMonth): Boolean = definedExternally
    open fun equals(other: YearMonth): Boolean = definedExternally
    open fun toJSON(): String = definedExternally
    open fun format(formatter: DateTimeFormatter): String = definedExternally
    companion object {
        fun from(temporal: TemporalAccessor): YearMonth = definedExternally
        fun now(zoneIdOrClock: Clock? = definedExternally /* null */): YearMonth = definedExternally
        fun now(zoneIdOrClock: ZoneId? = definedExternally /* null */): YearMonth = definedExternally
        fun of(year: Number, monthOrNumber: Number): YearMonth = definedExternally
        fun of(year: Number, monthOrNumber: Month): YearMonth = definedExternally
        fun parse(text: String, formatter: DateTimeFormatter? = definedExternally /* null */): YearMonth = definedExternally
        fun now(): YearMonth = definedExternally
    }
}
external abstract class ZoneId {
    override fun equals(other: Any?): Boolean = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun normalized(): ZoneId = definedExternally
    open fun rules(): ZoneRules = definedExternally
    override fun toString(): String = definedExternally
    companion object {
        var SYSTEM: ZoneId = definedExternally
        var UTC: ZoneId = definedExternally
        fun systemDefault(): ZoneId = definedExternally
        fun of(zoneId: String): ZoneId = definedExternally
        fun ofOffset(prefix: String, offset: ZoneOffset): ZoneId = definedExternally
        fun from(temporal: TemporalAccessor): ZoneId = definedExternally
        fun getAvailableZoneIds(): Array<String> = definedExternally
    }
}
external open class ZoneOffset : ZoneId {
    open fun adjustInto(temporal: Temporal): Temporal = definedExternally
    open fun compareTo(other: ZoneOffset): Number = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    open fun get(field: TemporalField): Number = definedExternally
    open fun getLong(field: TemporalField): Number = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun id(): String = definedExternally
    open fun query(query: TemporalQuery): Any = definedExternally
    override fun rules(): ZoneRules = definedExternally
    override fun toString(): String = definedExternally
    open fun totalSeconds(): Number = definedExternally
    companion object {
        var MAX_SECONDS: ZoneOffset = definedExternally
        var UTC: ZoneOffset = definedExternally
        var MIN: ZoneOffset = definedExternally
        var MAX: ZoneOffset = definedExternally
        fun of(offsetId: String): ZoneOffset = definedExternally
        fun ofHours(hours: Number): ZoneOffset = definedExternally
        fun ofHoursMinutes(hours: Number, minutes: Number): ZoneOffset = definedExternally
        fun ofHoursMinutesSeconds(hours: Number, minutes: Number, seconds: Number): ZoneOffset = definedExternally
        fun ofTotalMinutes(totalMinutes: Number): ZoneOffset = definedExternally
        fun ofTotalSeconds(totalSeconds: Number): ZoneOffset = definedExternally
    }
}
external open class ZoneRegion : ZoneId {
    open fun id(): String = definedExternally
    override fun rules(): ZoneRules = definedExternally
    companion object {
        fun ofId(zoneId: String): ZoneId = definedExternally
    }
}
external open class ZoneRules {
    open fun isFixedOffset(): Boolean = definedExternally
    open fun isValidOffset(localDateTime: LocalDateTime, offset: ZoneOffset): Boolean = definedExternally
    open fun offset(instantOrLocalDateTime: Instant): ZoneOffset = definedExternally
    open fun offset(instantOrLocalDateTime: LocalDateTime): ZoneOffset = definedExternally
    open fun offsetOfEpochMilli(epochMilli: Number): ZoneOffset = definedExternally
    open fun offsetOfInstant(instant: Instant): ZoneOffset = definedExternally
    open fun offsetOfLocalDateTime(localDateTime: LocalDateTime): ZoneOffset = definedExternally
    companion object {
        fun of(offest: ZoneOffset): ZoneRules = definedExternally
    }
}
external open class ChronoZonedDateTime : Temporal {
    open fun compareTo(other: ChronoZonedDateTime): Number = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    open fun format(formatter: DateTimeFormatter): String = definedExternally
    open fun isAfter(other: ChronoZonedDateTime): Boolean = definedExternally
    open fun isBefore(other: ChronoZonedDateTime): Boolean = definedExternally
    open fun isEqual(other: ChronoZonedDateTime): Boolean = definedExternally
    open fun query(query: Any): Any = definedExternally
    open fun toEpochSecond(): Number = definedExternally
    open fun toInstant(): Instant = definedExternally
}
external open class ZonedDateTime : ChronoZonedDateTime {
    open fun dayOfMonth(): Number = definedExternally
    open fun dayOfWeek(): DayOfWeek = definedExternally
    open fun dayOfYear(): Number = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    override fun format(formatter: DateTimeFormatter): String = definedExternally
    override fun get(field: TemporalField): Number = definedExternally
    open fun getLong(field: TemporalField): Number = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun hour(): Number = definedExternally
    open fun isSupported(fieldOrUnit: TemporalField): Boolean = definedExternally
    open fun isSupported(fieldOrUnit: TemporalUnit): Boolean = definedExternally
    open fun minus(): Any = definedExternally
    open fun minus(amountToSubtract: Number, unit: TemporalUnit): ZonedDateTime = definedExternally
    open fun minusDays(days: Number): ZonedDateTime = definedExternally
    open fun minusHours(hours: Number): ZonedDateTime = definedExternally
    open fun minusMinutes(minutes: Number): ZonedDateTime = definedExternally
    open fun minusMonths(months: Number): ZonedDateTime = definedExternally
    open fun minusNanos(nanos: Number): ZonedDateTime = definedExternally
    open fun minusSeconds(seconds: Number): ZonedDateTime = definedExternally
    open fun minusTemporalAmount(amount: TemporalAmount): ZonedDateTime = definedExternally
    open fun minusWeeks(weeks: Number): ZonedDateTime = definedExternally
    open fun minusYears(years: Number): ZonedDateTime = definedExternally
    open fun minute(): Number = definedExternally
    open fun month(): Month = definedExternally
    open fun monthValue(): Number = definedExternally
    open fun nano(): Number = definedExternally
    open fun offset(): Any = definedExternally
    open fun plus(): Any = definedExternally
    open fun plus(amountToAdd: Number, unit: TemporalUnit): ZonedDateTime = definedExternally
    open fun plusDays(days: Number): Any = definedExternally
    open fun plusHours(hours: Number): ZonedDateTime = definedExternally
    open fun plusMinutes(minutes: Number): ZonedDateTime = definedExternally
    open fun plusMonths(months: Number): ZonedDateTime = definedExternally
    open fun plusNanos(nanos: Number): ZonedDateTime = definedExternally
    open fun plusSeconds(seconds: Number): ZonedDateTime = definedExternally
    open fun plusTemporalAmount(amount: TemporalAmount): ZonedDateTime = definedExternally
    open fun plusWeeks(weeks: Number): Any = definedExternally
    open fun plusYears(years: Number): ZonedDateTime = definedExternally
    override fun query(query: TemporalQuery): Any = definedExternally
    override fun range(field: TemporalField): ValueRange = definedExternally
    open fun second(): Number = definedExternally
    open fun toJSON(): String = definedExternally
    open fun toLocalDate(): LocalDate = definedExternally
    open fun toLocalDateTime(): LocalDateTime = definedExternally
    open fun toLocalTime(): LocalTime = definedExternally
    open fun toOffsetDateTime(): OffsetDateTime = definedExternally
    override fun toString(): String = definedExternally
    open fun truncatedTo(unit: TemporalUnit): ZonedDateTime = definedExternally
    open fun until(endExclusive: Temporal, unit: TemporalUnit): Number = definedExternally
    open fun with(): Any = definedExternally
    open fun with(field: TemporalField, newValue: Number): ZonedDateTime = definedExternally
    open fun withDayOfMonth(dayOfMonth: Number): ZonedDateTime = definedExternally
    open fun withDayOfYear(dayOfYear: Number): ZonedDateTime = definedExternally
    open fun withFixedOffsetZone(): ZonedDateTime = definedExternally
    open fun withHour(hour: Number): ZonedDateTime = definedExternally
    open fun withMinute(minute: Number): ZonedDateTime = definedExternally
    open fun withMonth(month: Number): ZonedDateTime = definedExternally
    open fun withNano(nanoOfSecond: Number): ZonedDateTime = definedExternally
    open fun withSecond(second: Number): ZonedDateTime = definedExternally
    open fun withTemporalAdjuster(adjuster: TemporalAdjuster): ZonedDateTime = definedExternally
    open fun withYear(year: Number): ZonedDateTime = definedExternally
    open fun withZoneSameInstant(zone: ZoneId): ZonedDateTime = definedExternally
    open fun withZoneSameLocal(zone: ZoneId): ZonedDateTime = definedExternally
    open fun year(): Number = definedExternally
    open fun zone(): ZoneId = definedExternally
    companion object {
        fun from(temporal: TemporalAccessor): ZonedDateTime = definedExternally
        fun now(clockOrZone: Clock? = definedExternally /* null */): ZonedDateTime = definedExternally
        fun now(clockOrZone: ZoneId? = definedExternally /* null */): ZonedDateTime = definedExternally
        fun of(): Any = definedExternally
        fun of(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime = definedExternally
        fun of(date: LocalDate, time: LocalTime, zone: ZoneId): ZonedDateTime = definedExternally
        fun of(year: Number, month: Number, dayOfMonth: Number, hour: Number, minute: Number, second: Number, nanoOfSecond: Number, zone: ZoneId): ZonedDateTime = definedExternally
        fun ofInstant(): ZonedDateTime = definedExternally
        fun ofInstant(instant: Instant, zone: ZoneId): ZonedDateTime = definedExternally
        fun ofInstant(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = definedExternally
        fun ofLocal(localDateTime: LocalDateTime, zone: ZoneId, preferredOffset: ZoneOffset): ZonedDateTime = definedExternally
        fun ofStrict(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime = definedExternally
        fun parse(text: String, formatter: DateTimeFormatter? = definedExternally /* null */): ZonedDateTime = definedExternally
        fun now(): ZonedDateTime = definedExternally
    }
}
external open class TextStyle {
    open fun asNormal(): TextStyle = definedExternally
    open fun asStandalone(): TextStyle = definedExternally
    open fun isStandalone(): Boolean = definedExternally
}
external open class Locale
external open class IsoChronology {
    open fun resolveDate(fieldValues: Any, resolverStyle: Any): Any = definedExternally
    override fun equals(other: Any?): Boolean = definedExternally
    override fun toString(): String = definedExternally
    companion object {
        fun isLeapYear(prolepticYear: Number): Boolean = definedExternally
    }
}
external fun nativeJs(date: Date, zone: ZoneId? = definedExternally /* null */): TemporalAccessor = definedExternally
external fun nativeJs(date: Any, zone: ZoneId? = definedExternally /* null */): TemporalAccessor = definedExternally
external interface `T$0` {
    var toDate: () -> Date
    var toEpochMilli: () -> Number
}
external fun convert(temporal: LocalDate, zone: ZoneId? = definedExternally /* null */): `T$0` = definedExternally
external fun convert(temporal: LocalDateTime, zone: ZoneId? = definedExternally /* null */): `T$0` = definedExternally
external fun convert(temporal: ZonedDateTime, zone: ZoneId? = definedExternally /* null */): `T$0` = definedExternally
external fun use(plugin: Function<*>): Any = definedExternally
external open class DateTimeParseException(message: String? = definedExternally /* null */) /*: Error*/
