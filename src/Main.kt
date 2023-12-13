// Ogrenci sınıfı
data class Ogrenci(val ad: String, val soyad: String, val numara: String) {
    fun ogrenciBilgileri(): String {
        return "$ad $soyad - $numara"
    }
}

// Dersler
data class Ders(val ad: String, val kredi: Int) {
    fun dersBilgileri(): String {
        return "$ad - $kredi kredi"
    }
}

// OgrenciBilgiSistemi sınıfı
class OgrenciBilgiSistemi {
    val ogrenciler = mutableListOf<Ogrenci>()
    val dersler = mutableListOf<Ders>()

    fun ogrenciEkle(ogrenci: Ogrenci) {
        ogrenciler.add(ogrenci)
    }

    fun dersEkle(ders: Ders) {
        dersler.add(ders)
    }

    fun ogrenciBilgileriniGoster() {
        ogrenciler.forEach { println(it.ogrenciBilgileri()) }
    }

    fun dersBilgileriniGoster() {
        dersler.forEach { println(it.dersBilgileri()) }
    }
}

fun main() {
    val ogrenci1 = Ogrenci("Ali", "Veli", "12345")
    val ogrenci2 = Ogrenci("Ayşe", "Fatma", "67890")

    val ders1 = Ders("Matematik", 3)
    val ders2 = Ders("Fizik", 4)

    val sistem = OgrenciBilgiSistemi()
    sistem.ogrenciEkle(ogrenci1)
    sistem.ogrenciEkle(ogrenci2)

    sistem.dersEkle(ders1)
    sistem.dersEkle(ders2)

    sistem.ogrenciBilgileriniGoster()
    sistem.dersBilgileriniGoster()
}
