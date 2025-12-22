package dao;
import javax.swing.*;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class solicitanteDAO {
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

    public void crearSolicitante(){
        String crear = "";
        Connection con = getConection();
        try(con; PreparedStatement pstm = con.prepareStatement(crear) ){

        }catch(SQLException e){
            e.getMessage();
        }
    }


}
