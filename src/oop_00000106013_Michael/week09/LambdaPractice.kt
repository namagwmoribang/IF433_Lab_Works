package oop_00000106013_Michael.week09


fun main() {

    println("=== TEST LAMBDA ===")

    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")

    val greet: (String) -> String = { "Hello, $it!" }
    println(greet("Kotlin"))


    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    println("Is 8 even? ${isEven(8)}")
    println("Is 7 even? ${isEven(7)}")
}