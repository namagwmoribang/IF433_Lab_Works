package oop_00000106013_Michael.week07

class Hitungan private constructor(var halaman:String) {
    companion object {
        const val namaKampus:String = "UMN"
        const val noIndukKampus:String = "123455"

        fun penambahan(a:Int,b:Int):Int{
            return a+b
        }
        fun pindah_halaman(namaHal:String) {
            Hitungan(halaman=namaHal)
        }

    }

    init {
        if (halaman=="home") {
            println("Welcome Home ")
        } else {
            println("Halaman lainnya ")
        }
    }
}