package praktikum_5.myEntityManager;
import praktikum_5.myEntity.Supplier;
import praktikum_5.myFunction.Fungsi;


public class SupplierManager {
    int i;
    
    public int inputData(Supplier supp) {
        i = 0;
        
        try {
            String sql = "INSERT INTO supplier(nama_supplier, alamat, telp, email) " + 
                    "VALUES('" + supp.getNama() +"', '"+ supp.getAlamat()+"', '"+ supp.getTelp()+"', '"
                    + supp.getEmail()+ "')";
            
            i = Fungsi.EQuery(sql);
            return i;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return i;
        }
    }
    
    
    public int hapusData(int ID) {
        i = 0;
        try {
            String sql = "DELETE FROM supplier WHERE kode_supplier = " + ID + "";
            i = Fungsi.EQuery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }
        
}
