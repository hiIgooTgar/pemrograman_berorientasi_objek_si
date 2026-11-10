package praktikum_6.classmobilmetode;

public class Mobil {
    String warna;
    int tahunProduksi;
    
    void isiData(String warnaMobil, int tahunProduksiMobil) {
        warna = warnaMobil;
        tahunProduksi = tahunProduksiMobil;
    }
    
    String ambilWarna() {
        return warna;
    }
    
    int ambilTahunProduksi() {
        return tahunProduksi;
    }
}
