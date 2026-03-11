package oop_00000106013_Michael.week05

// Abstract class tidak bisa dibuat objeknya langsung
abstract class Pegawai(val nama: String) {
    // Abstract function tidak memiliki body (tanpa kurung kurawal)
    // WAJIB di-override oleh semua class anak
    abstract fun bekerja()
}