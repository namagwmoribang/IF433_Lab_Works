package oop_00000106013_Michael.week03

fun main() {
    // === KODE EMPLOYEE TETAP ADA DI ATAS ===
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    // === TAMBAHKAN KODE WEAPON DI BAWAH INI ===
    println("\n=== TEST WEAPON ===")
    val sword = Weapon("Excalibur")

    // Test damage negatif (harus gagal)
    sword.damage = -50
    println("Damage setelah set -50: ${sword.damage}") // Tetap 0

    // Test damage overpowered (dipaksa jadi 1000)
    sword.damage = 9999
    println("Damage setelah set 9999: ${sword.damage}") // Jadi 1000

    // Test tier
    println("Tier: ${sword.tier}") // "Legendary"
}