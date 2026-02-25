package oop_00000106013_Michael.week04

class Celana: Pakaian() {
    private var stock: Int = 20

    public fun update_stock() {
        super.harga = stock * 120
        println("Stok $stock celana terupdate, " +
                "harga ${super.harga}")
    }
}

