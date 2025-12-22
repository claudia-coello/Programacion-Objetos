import javax.swing.*;
import java.sql.*;
public class Conexion {
    private Connection getConection(){
        String url = "jdbc:mysql://localhost:3306/matriculas_db";
        String clave = "root";
        String usuario = "root";
        Connection con = null;
        try{
            con = DriverManager.getConnection(url,usuario,clave);

            if (con == null){
                throw new SQLException("No se pudo establecer una conexion con la base de datos exitosa");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return con;
    }

}
