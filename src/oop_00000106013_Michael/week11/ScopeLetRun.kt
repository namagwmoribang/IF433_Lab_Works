package oop_00000106013_Michael.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Mengeksekusi blok hanya jika objek tidak null
    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    } ?: 0  // ← tambahkan default value

    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length * 2  // ← pastikan tanda * adalah asterisk biasa
    }
    println("Hasil kalkulasi run: $result")
}
