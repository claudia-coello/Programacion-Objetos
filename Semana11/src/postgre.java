import java.sql.*;

public class postgre {
    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/almacen";
        String user = "postgres";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null){
                System.out.println("Conexion exitosa");
            }

            String sql = "Select * from usuarios_cliente";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Datos de la tabla: ");

            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nombre"));
                System.out.println(rs.getString("correo"));
                System.out.println(rs.getString("password"));
            }

        }catch (SQLException e){
            System.out.println("Error en la conexion" + e.getMessage());
        }

    }
}
