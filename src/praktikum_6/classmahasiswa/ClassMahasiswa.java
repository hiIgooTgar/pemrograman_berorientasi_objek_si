package praktikum_6.classmahasiswa;

public class ClassMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.setNama("Marcha");
        System.out.println("Nama = " + mhs.getNama());
        
        mhs.setNim("24SA21A011");
        System.out.println("NIM = " + mhs.getNim());
    }
}
