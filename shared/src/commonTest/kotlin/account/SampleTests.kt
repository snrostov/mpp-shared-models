package account

import kotlin.test.Test
import kotlin.test.assertEquals

class AccountTests {
    val zoneId = zoneIdOf("GMT+4")

    val employer = "employer"
    val shop = "shop"
    val taxi = "taxi"

    @Test
    fun testMe() {
        val transfers = testData()

        assertEquals(Rub(48300.0), transfers.balance())

        val balanceByAccount = transfers.balanceByAccount()
        assertEquals(Rub(-1400.0), balanceByAccount[shop])
        assertEquals(Rub(-300.0), balanceByAccount[taxi])
    }

    @Test
    fun testMe2() {
        val transfers = testData()

        val byMonth = transfers.byMonth(zoneId).map { (month, items) ->
            "${month.year}-${month.monthValue}: ${items.map { it.description }}"
        }.joinToString("; ")

        assertEquals("2018-1: [salary, food]; 2018-2: [travel, food]", byMonth)
    }

    private fun testData(): List<MoneyTransfer> {
        val transfers = listOf(
            MoneyTransfer(employer, "salary", Rub(-50000.0), instant(1, 17)),
            MoneyTransfer(shop, "food", Rub(700.0), instant(1, 17)),
            MoneyTransfer(taxi, "travel", Rub(300.0), instant(2, 18)),
            MoneyTransfer(shop, "food", Rub(700.0), instant(2, 19))
        )
        return transfers
    }

    private fun instant(month: Int, day: Int) = localDate(2018, month, day).toStartOfDayInstant(zoneId)
}