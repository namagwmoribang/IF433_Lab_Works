package oop_00000106013_Michael.week09

fun main(){
    println("=========LIST OF IMUT========")
    var arSiswa = listOf("Ali","Budi","Cica")
    println(arSiswa)
    println("Nama Siswa:"+ arSiswa[1])
    println("banyak siswa"+ arSiswa.size)

    for(i in arSiswa){
        println(i)
    }
    println("=========LIST OF IMUT=======")
    val arMatkul = mutableListOf("OOP","Matdis","GameDev")
    arMatkul.add("Kalkulus")
    arMatkul[2] ="Caireen"
    arMatkul.remove(element ="Matdis")
    println(arMatkul)

    println("=======SET OF MUTABLE========")
    var arNilai = setOf(80,90,20,30,90,70,20,10,100);
    println("banyak data: ${arNilai.size}");
    println("angka 20 ada ga? ${arNilai.contains(20)}")
    println(arNilai);

    println("=======SET OF MUTABLE========")
    var arMakanan = mutableSetOf("Nasi goreng","Tempe","Tahu","Bakpao","Tahu","Ayam")
    arMakanan.add("Mie")
    arMakanan.remove(element ="Tahu")
    arMakanan.add("Tempe")
    println(arMakanan)

    println("=======MAP IMUTABLE========")
    var arDataMhs = mapOf(
        "Acong" to 89,
        "Siska" to 20,
        "Udin" to 83
    );
    println("Banyak data: ${arDataMhs.size}")
    println("Si Acong nilainya: ${arDataMhs["Acong"]}")
    println("List Smua Mhs: ${arDataMhs.keys}")
    println("List Smua Nilai: ${arDataMhs.values}")
    println(arDataMhs)

    println("==============MAP MUTABLE=============")

    var arMenuResto = mutableMapOf(
        "Mie Ayam" to 5000,
        "Mie bakso" to 6000,
        "Mie pangsit" to 6500
    )

    arMenuResto["Mie bakso"] = 6200
    arMenuResto.remove("Mie pangsit")
    println(arMenuResto)
}