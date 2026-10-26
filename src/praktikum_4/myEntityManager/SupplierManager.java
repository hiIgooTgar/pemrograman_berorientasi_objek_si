package praktikum_4.myEntityManager;
import praktikum_4.myEntity.Supplier;
import praktikum_4.myFunction.Fungsi;


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
        
}
