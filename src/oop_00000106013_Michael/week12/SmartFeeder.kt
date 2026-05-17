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
    val currentKibbleStock = 50  // ubah var → val (warning: never modified)

    try {
        dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Caught Domain Error: Dispenser macet. ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Domain Error: Stok tidak cukup. ${e.message}")
    } catch (e: Exception) {        // parameter 'e' tidak perlu jika tidak dipakai
        println("Caught General Error: Terjadi kesalahan tidak terduga.")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    // Baris 27 — perbaiki runCatching
    runCatching { dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false) }
}