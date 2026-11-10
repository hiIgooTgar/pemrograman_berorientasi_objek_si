package praktikum_6.classmobilthis;

public class ClassMobilThis {

    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        
        mobilku.isiData("Merah", 2003);
        
        System.out.println("Warna Mobil : " + mobilku.warna);
        System.out.println("Tahun Produksi : " + mobilku.tahunProduksi);
    }
    
}
