package sample

import kotlin.test.Test
import kotlin.test.assertEquals

class AccountTests {
    @Test
    fun testMe() {
        val employer = "employer"
        val shop = "shop"
        val taxi = "taxi"

        val transfers = listOf(
            MoneyTransfer(employer, "salary", Rub(-50000.0), Timestamp(10)),
            MoneyTransfer(shop, "food", Rub(700.0), Timestamp(20)),
            MoneyTransfer(taxi, "travel", Rub(300.0), Timestamp(30)),
            MoneyTransfer(shop, "food", Rub(700.0), Timestamp(40))
        )

        assertEquals(Rub(48300.0), transfers.balance())

        val balanceByAccount = transfers.balanceByAccount()
        assertEquals(Rub(-1400.0), balanceByAccount[shop])
        assertEquals(Rub(-301.0), balanceByAccount[taxi])
    }
}