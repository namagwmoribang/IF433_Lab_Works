package oop_00000106013_Michael.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)  // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    // === SMART HOME SYSTEM ===
    println("\n=== SMART HOME SYSTEM ===")

    val lamp = SmartLamp(id = "L001", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "S001", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "C001", name = "Ezviz Garasi")
}