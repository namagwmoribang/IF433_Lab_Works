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
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    println()

    val totalClosed = closedTrades.size
    val totalWin    = winningTrades.size
    val winRate     = if (totalClosed > 0) (totalWin.toDouble() / totalClosed * 100) else 0.0

    println("📊 Total Closed Trades : $totalClosed")
    println("✅ Winning Trades      : $totalWin")
    println("❌ Losing Trades       : ${losingTrades.size}")
    println("📈 Win Rate            : ${"%.1f".format(winRate)}%")
    println()

    println("--- TOP PERFORMERS (Profit) ---")
    topPerformersString.forEach { println("  $it") }
}
