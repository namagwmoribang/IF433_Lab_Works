package oop_00000106013_Michael.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original Data: $numbers")

    println("\n=== HOF: FILTER ===")
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")

    val greaterThanFive = numbers.filter { it > 5 }
    println("Greater than 5: $greaterThanFive")

    println("\n=== HOF: MAP ===")

    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")

    println("\n=== HOF: SORTED & FOREACH ===")
    val sortedDesc = numbers.sortedByDescending { it }
    println("Sorted Descending: $sortedDesc")

    println("Printing each even number:")
    evens.forEach { println("  -> $it") }
}
