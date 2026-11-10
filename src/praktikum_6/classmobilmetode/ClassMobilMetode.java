package praktikum_6.classmobilmetode;

public class ClassMobilMetode {

    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        
        mobilku.isiData("Merah", 2003);
        
        System.out.println("Warna Mobil : " + mobilku.ambilWarna());
        System.out.println("Tahun Produksi : " + mobilku.ambilTahunProduksi());
    }
    
}
