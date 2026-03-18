package oop_00000106013_Michael.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()

    // Default function
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}