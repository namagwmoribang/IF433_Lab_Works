package oop_00000106013_Michael.week03

class Employee(val name: String) {

    var salary: Double = 0.0
        set(value) {
            if (value < 0) {
                println("Error: Salary tidak boleh negatif!")
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 1

    fun increasePerformance() {
        performanceRating++
        println("Performance rating sekarang: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.10
}