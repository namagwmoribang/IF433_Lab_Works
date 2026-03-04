package oop_00000106013_Michael.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()    // Memanggil method milik sendiri
    myCar.honk()         // Memanggil method yang sudah di-override
    myCar.accelerate()   // Memanggil gabungan method Parent dan Child
}
```

**Jalankan dan lihat output:**
```
--- Testing Vehicle ---
Beep beep!
Sepeda Onthel melaju. Kecepatan: 10 km/jam

--- Testing Car ---
Bagasi mobil Toyota dengan 4 pintu dibuka.
TIN TIN! Mobil Toyota lewat!
Toyota melaju. Kecepatan: 10 km/jam
Mobil Toyota menggunakan transmisi gigi untuk menambah kecepatan.