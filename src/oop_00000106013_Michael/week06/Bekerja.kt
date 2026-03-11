package oop_00000106013_Michael.week06

interface Bekerja {
    public val namaKerjaan : String;
    val gaji:Int
    val jmlHari:Int
    val GajiDidapat:Int
        get() = gaji * jmlHari
    public fun ngoding ()

    public fun tester(){
        println("ngetest kodingan")
    }
}