package oop_00000106013_Michael.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50  // ✅ Fix 1: val → var

    try {
        dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Caught Domain Error: Dispenser macet. ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Domain Error: Stok tidak cukup. ${e.message}")
    } catch (_: Exception) {        // ✅ Fix 2: e → _ (parameter tidak dipakai)
        println("Caught General Error: Terjadi kesalahan tidak terduga.")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    runCatching { dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false) }
        .onSuccess { newStock ->
            currentKibbleStock = newStock
            println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
        }
}