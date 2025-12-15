import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class database {
    String url = "jdbc:mysql://u3zwyyki3i87b4lr:LVsvlV1izQO4TDjBYDcC@b4ouuqhohvqpu841fnxs-mysql.services.clever-cloud.com:3306/b4ouuqhohvqpu841fnxs";
    String user = "u3zwyyki3i87b4lr";
    String password = "LVsvlV1izQO4TDjBYDcC";

    public void datosClientes(){
        List<Cliente> clientes = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null){
                System.out.println("Conexion exitosa");
            }

            String sql = "Select * from clientes";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("id_cliente");
                String nombre = rs.getString("nombre");
                String cedula =rs.getString("cedula");
                String clave =rs.getString("password");

                Cliente cliente = new Cliente(id, nombre,cedula,clave);
                clientes.add(cliente);

            }
        }catch (SQLException e){
            System.out.println("Error en la conexion" + e.getMessage());
        }
    }
}
