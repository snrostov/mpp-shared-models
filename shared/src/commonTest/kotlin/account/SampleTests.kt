package account

import kotlin.test.Test
import kotlin.test.assertEquals

class AccountTests {
    val employer = "employer"
    val shop = "shop"
    val taxi = "taxi"

    @Test
    fun testMe() {
        val transfers = testData()

        assertEquals(8400, transfers.balance())

        val balanceByAccount = transfers.balanceByAccount()
        assertEquals(-1300, balanceByAccount[shop])
        assertEquals(-300, balanceByAccount[taxi])
    }

    @Test
    fun testMe2() {
        val transfers = testData()

        val byMonth = transfers.byMonth().map { (month, items) ->
            "${month.year}-${month.monthValue}: ${items.map { it.description }}"
        }.joinToString("; ")

        assertEquals("2018-12: [salary]; 2018-12: [food]; 2018-12: [travel]; 2018-12: [salary]", byMonth)
    }

    private fun testData(): List<Transfer> = listOf(
        Transfer(LocalDateTime("2018-12-20T09:42"), employer, "salary", 10000),
        Transfer(LocalDateTime("2018-12-20T10:00"), shop, "food", -700),
        Transfer(LocalDateTime("2018-01-21T09:42"), taxi, "travel", -300),
        Transfer(LocalDateTime("2018-02-22T09:42"), shop, "salary", -600)
    )
}