package koneksi;
import java.sql.*;

public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("gagal koneksi "+ex);
        }
        String url = "jdbc:mysql://localhost/penjualan";
        try {
            koneksi = DriverManager.getConnection(url,"root", "");
        } catch (SQLException ex) {
            System.out.println("gagal koneksi database "+ex);
        }
        return koneksi;
    }
}