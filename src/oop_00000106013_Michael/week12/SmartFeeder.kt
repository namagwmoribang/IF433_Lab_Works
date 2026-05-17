package oop_00000106013_Michael.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    require(availableGram >= 0) { "Gram yang tersedia tidak boleh negatif" }

    if (isJammed) return 0

    return if (requestedGram <= availableGram) {
        requestedGram
    } else {
        availableGram
    }
}