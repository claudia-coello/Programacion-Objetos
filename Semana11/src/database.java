import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/almacen";
        String user = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null){
                System.out.println("Conexion exitosa");
            }
        }catch (SQLException e){
            System.out.println("Error en la conexion" + e.getMessage());
        }

    }

}
