package oop_00000106013_Michael.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0  // Pakai field, bukan this.salary
            } else {
                field = value
            }
        }
}