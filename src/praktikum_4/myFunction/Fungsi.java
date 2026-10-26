package praktikum_4.myFunction;
import java.sql.*;
import praktikum_4.myConnection.Koneksi;

public class Fungsi {
    static Connection Cnn;
    static Koneksi db = new Koneksi();
    static Statement st;
    static int i;
    
    public static int EQuery(String sql) throws SQLException {
        i = 0;
        
        try {
            Cnn = db.getConnection();
            st = Cnn.createStatement();
            i = st.executeUpdate(sql);
            return i;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return i;
        } finally {
            Cnn.close();
        }
    }
}
