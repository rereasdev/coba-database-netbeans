
package mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    public static Connection mykoneksi;
    public static Connection koneksiDB() throws SQLException{
        if(mykoneksi == null){
            try{
                String DB = "jdbc:mysql://localhost:3306/cobadatabasemahasiswa";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mykoneksi = (Connection) DriverManager.getConnection(DB, user, pass);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"gagal koneksi");
            }
        }
        return mykoneksi;
    }
    
}
