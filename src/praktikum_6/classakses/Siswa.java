package praktikum_6.classakses;

public class Siswa {
    public String nama;
//    private String nama;
    
    void isiData(String nama) {
        this.nama = nama;
    }
    
    String ambilNama() {
        return this.nama;
    }
}
