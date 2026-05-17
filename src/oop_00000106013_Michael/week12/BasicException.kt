package oop_00000106013_Michael.week12

fun main() {
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    // try langsung mengembalikan hasil parsing, atau -1 jika gagal
    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }

    println("Hasil parsing: $result")
}