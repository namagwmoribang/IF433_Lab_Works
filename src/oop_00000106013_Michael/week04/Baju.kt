package oop_00000106013_Michael.week04

class Baju: Pakaian() {
    private var stock: Int = 10

    public fun update_stock(){
        super.harga = stock * 100
        println("Stok $stock baju terupdate, " +
                "harga ${super.harga}")
    }

    override public fun jumlah_penjualan(){
        println("Pakaian terjual")
    }
}