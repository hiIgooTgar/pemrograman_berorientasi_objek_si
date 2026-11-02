package praktikum_5.myEntity;

public class Supplier {

    private String nama, alamat, telp, email;
    private int kode_supplier;

    public Supplier() {}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getKode_supplier() {
        return kode_supplier;
    }

    public void setKode_supplier(int kode_supplier) {
        this.kode_supplier = kode_supplier;
    }

    public Supplier(String nama, String alamat, String telp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.email = email;
    }
}
