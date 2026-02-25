package oop_00000106013_Michael.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000.0  // Harusnya print Error
    e.salary = 5000000.0
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5 // Uncomment ini pasti error (private)

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}