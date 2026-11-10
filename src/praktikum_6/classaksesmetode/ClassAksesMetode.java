package praktikum_6.classaksesmetode;

public class ClassAksesMetode {

    public static void main(String[] args) {
        Lingkaran bulatan = new Lingkaran();
        
        bulatan.isiJariJari(75);
        
        System.out.println("Keliling : " + bulatan.perolehKeliling());
        
//        System.out.println("Pi : " + bulatan.perolehPi());
    }
    
}
