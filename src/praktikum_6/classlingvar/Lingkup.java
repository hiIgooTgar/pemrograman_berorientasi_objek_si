package praktikum_6.classlingvar;

public class Lingkup {
    String warna = "Merah";
    
    void infoLingkup() {
        String warna = "Biru";
        System.out.println("Warna pada metode : " + warna);
        System.out.println("Warna milik kelas : " + this.warna);
    }
}
