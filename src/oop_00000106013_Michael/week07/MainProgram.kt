package oop_00000106013_Michael.week07

fun main() {
    println("server" + Koneksi.alamatServer)
    Koneksi.konek_db()

    println("Kampus:" + Hitungan.namaKampus)
    println("Nomor:"+ Hitungan.noIndukKampus)
    println("penambahan:" + Hitungan.penambahan(a =10,b=10))

    Hitungan.pindah_halaman(namaHal = "home")

    val siswa = Murid (nama = "Andi", nim = "123", 2024)
    val siswa2 = siswa.copy( nama = "Ani", nim = "1111")

    println(siswa)
    println(siswa2)
    println("NAMA:"+ siswa.nama+ "ANGKATAN :"+ siswa.angkatan)


    LaluLintas.Merah.cetak_lalulintas()
    LaluLintas.Kuning.cetak_lalulintas()
    LaluLintas.Hijau.cetak_lalulintas()
}