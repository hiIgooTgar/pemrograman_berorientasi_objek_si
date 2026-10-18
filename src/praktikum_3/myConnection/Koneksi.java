package praktikum_3.myConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
     public Connection getConnection() throws ClassNotFoundException{
         Connection cn = null;
         
         try {
             String driver = "com.mysql.jdbc.Driver";
             Class.forName(driver);
             
             String db = "24sa11a159_pbo_penjualan";
             String sv = "jdbc:mysql://localhost:3306/" + db;
             
             cn = DriverManager.getConnection(sv, "root", "");
             return cn;
         } catch (SQLException e) {
             System.out.println(e.getMessage());
             return null;
         }
         
         catch(Exception e) {
             System.out.println(e.getMessage());
             return null;
         }
    }
}
