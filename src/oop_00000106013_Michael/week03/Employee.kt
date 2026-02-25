package oop_00000106013_Michael.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE INI SALAH & BERBAHAYA!
            this.salary = value  // Ini akan recursive!
        }
}