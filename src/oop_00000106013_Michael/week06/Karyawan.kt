package oop_00000106013_Michael.week06

class Karyawan(override val namaKerjaan : String,
               override val gaji: Int,
               override val jmlHari: Int,
               override val nameGame: String,
               override val waktuMain: Int
) : Bekerja, Bermain {
    override fun ngoding () {
        println ("kerjaan kamu $namaKerjaan")
        println ( "gaji kamu ${super.GajiDidapat} dalam jml hari $jmlHari")
    }

    override fun main_game() {
        println ("main $nameGame selama $waktuMain jam")
    }

    override fun tester() {
        super<Bekerja>.tester()
        super<Bermain>.tester()
    }
}