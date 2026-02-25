package oop_00000106013_Michael.week04

open class Pakaian {
    private var merk: String = ""
    protected var harga: Int = 0

    init {
        this.merk = "Uniqlo"
        println("Merek ini ${this.merk}")
    }
    open public fun jumlah_penjualan(){
        println("Pakaian ter")
    }
}