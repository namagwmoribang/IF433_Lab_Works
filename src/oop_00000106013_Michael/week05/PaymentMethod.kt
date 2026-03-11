package oop_00000106013_Michael.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}