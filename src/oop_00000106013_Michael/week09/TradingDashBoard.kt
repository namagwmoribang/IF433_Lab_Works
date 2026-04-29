package oop_00000106013_Michael.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),  // WIN  - BTC
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),  // LOSS - ETH
        TradeLog("SOLUSDT", "LONG", 15, 22.8, "CLOSED"),  // WIN  - SOL
        TradeLog("BTCUSDT", "SHORT", 5, -12.3, "CLOSED"),  // LOSS - BTC
        TradeLog("ETHUSDT", "LONG", 10, 8.9, "CLOSED"),  // WIN  - ETH
        TradeLog("SOLUSDT", "SHORT", 20, -3.7, "CLOSED"),  // LOSS - SOL
        TradeLog("BTCUSDT", "LONG", 10, 0.0, "CLOSED"),  // BREAKEVEN
        TradeLog("BNBUSDT", "LONG", 25, 30.1, "OPEN"),    // WIN  - masih OPEN
        TradeLog("ETHUSDT", "SHORT", 5, -8.0, "OPEN"),    // LOSS - masih OPEN
        TradeLog("BTCUSDT", "SHORT", 15, 18.4, "CLOSED"),  // WIN  - BTC
    )
}
