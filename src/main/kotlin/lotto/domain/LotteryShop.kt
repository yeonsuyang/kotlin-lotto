package lotto.domain

private const val MANUAL_NUM_EXCEPTION = "구매한 개수보다 작은 개수만 수동으로 구매하실 수 있습니다"

object LotteryShop {
    private const val LOTTO_PRICE = 1000
    fun buy(money: Int): Int {
        return money / LOTTO_PRICE
    }

    fun getTickets(lottoCount: Int): Tickets {
        return Tickets(lottoCount, AutoNumGenerator())
    }

    fun validateManualNum(manualNum: Int, lottoCount: Int) {
        require(manualNum <= lottoCount) { MANUAL_NUM_EXCEPTION }
    }
}
