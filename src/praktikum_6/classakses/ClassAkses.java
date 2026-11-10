package praktikum_6.classakses;

public class ClassAkses {

    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        
        siswa1.isiData("Marcha Putri Ramadhanti");
        
        System.out.println("Nama : " + siswa1.ambilNama());
        System.out.println("Nama : " + siswa1.nama);
    }
    
}
