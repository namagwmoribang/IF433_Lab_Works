package oop_00000106013_Michael.week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // Ini akan crash!
}