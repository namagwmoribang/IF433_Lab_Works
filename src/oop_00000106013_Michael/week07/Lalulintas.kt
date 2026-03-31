package oop_00000106013_Michael.week07

enum class LaluLintas(val arti: String) {
    Merah(arti = "Berhenti"),
    Kuning(arti = "Berhati-hati"),
    Hijau(arti = "Jalan");

    fun cetak_lalulintas() {
        println("LaluLintas $name: $arti")
    }
}