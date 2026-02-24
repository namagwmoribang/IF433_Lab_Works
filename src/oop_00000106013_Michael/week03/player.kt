package oop_00000106013_Michael.week03

class Player(val username: String) {
    // Private - tidak bisa diakses dari luar
    private var xp: Int = 0

    // Computed Property - level dihitung dari XP
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("ERROR: XP yang ditambahkan harus positif!")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Level Up! Selamat $username naik ke level $newLevel")
        }
    }
}