package oop_00000106013_Michael.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Lampu menyala dengan brightness 100%")
    }

    override fun turnOff() {
        println("[$name] Lampu dimatikan")
    }
}