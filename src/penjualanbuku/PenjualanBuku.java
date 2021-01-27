
package penjualanbuku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PenjualanBuku {
    private static Connection konek;
    
    public static Connection getConnection() throws SQLException{
        if(konek == null) {
            new Driver();
            konek = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/tokobuku","root","");
        }
        return konek;
    }
    
    public static void main(String[] args) {
        try {
            getConnection();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }    
}
