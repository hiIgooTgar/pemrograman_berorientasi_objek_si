package praktikum_6.classmobil;

public class ClassMobil {

    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        
        mobilku.warna = "Merah";
        mobilku.tahunProduksi = 2003;
        
        System.out.println("Warna Mobil : " + mobilku.warna);
        System.out.println("Tahun Produksi : " + mobilku.tahunProduksi);
    }
    
}
