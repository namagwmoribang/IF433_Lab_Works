package oop_00000106013_Michael.week03

fun main() {
    // === KODE EMPLOYEE DAN WEAPON TETAP ADA ===
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== TEST WEAPON ===")
    val sword = Weapon("Excalibur")
    sword.damage = -50
    println("Damage setelah set -50: ${sword.damage}")
    sword.damage = 9999
    println("Damage setelah set 9999: ${sword.damage}")
    println("Tier: ${sword.tier}")

    // === TAMBAHKAN KODE PLAYER DI BAWAH INI ===
    println("\n=== TEST PLAYER ===")
    val player = Player("ProGamer123")

    // Coba akses player.xp (uncomment untuk test - pasti error)
    // println(player.xp) // Error: private

    println("Level awal: ${player.level}") // Level 1

    // Tambah 50 XP (masih level 1)
    player.addXp(50)
    println("Level setelah +50 XP: ${player.level}") // Level 1

    // Tambah 60 XP (total 110, level up ke 2)
    player.addXp(60)
    println("Level setelah +60 XP: ${player.level}") // Level 2

    // Test XP negatif
    player.addXp(-10) // Error message
}
```

**Jalankan dan test**

**Output yang diharapkan:**
```
Level awal: 1
Level setelah +50 XP: 1
Level Up! Selamat ProGamer123 naik ke level 2
Level setelah +60 XP: 2
ERROR: XP yang ditambahkan harus positif!