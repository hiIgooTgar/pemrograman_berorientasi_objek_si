package praktikum_3.tryPenjualan;
import java.sql.*;
import praktikum_3.myConnection.Koneksi;
import praktikum_3.myEntity.Supplier;

public class TryPenjualan {
    static Connection conn;
    static Statement stat;
    static Koneksi kon = new Koneksi();
    static PreparedStatement prd;
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        conn = kon.getConnection();
        stat = conn.createStatement();
        
        try {
            Supplier sp = new Supplier("PT Abadi", "Purwokerto", "0281271627", "abadi@gmail.com");
            
            String sql = "INSERT INTO supplier (nama_supplier, alamat, telp, email) " + 
                    "VALUES('" + sp.getNama() + "', '" + sp.getAlamat() + "', '" + sp.getTelp() +
                    "', '" + sp.getEmail() + "')";
            
            stat.executeUpdate(sql);
            
            sql = "UPDATE supplier SET nama_supplier=?, alamat=? WHERE kode_supplier=?";
            
            prd = conn.prepareStatement(sql);
            prd.setString(1, "PT Permata");
            prd.setString(2, "Ajibarang");
            prd.setInt(3, 1);
            prd.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        finally {
            stat.close();
            prd.close();
            conn.close();
        }
    }
}