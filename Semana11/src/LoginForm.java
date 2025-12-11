import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JTextField ingresoUsuario;
    private JButton btnIngresar;
    private JLabel labelBienvenida;
    private JLabel labelUsuario;
    private JLabel labelClave;
    private JPasswordField ingresoClave;
    private JPanel panelPrincipal;

    public LoginForm(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Sistema bancario");
        setSize(400,200);
        setVisible(true);
        setContentPane(panelPrincipal);
        setLocationRelativeTo(null);
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nombreIngresado = ingresoUsuario.getText().strip();
                String claveIngresada = ingresoClave.getText();

                if (nombreIngresado.isBlank()) JOptionPane.showMessageDialog(LoginForm.this, "Por favor ingresa tu usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                else if (claveIngresada.isBlank()) JOptionPane.showMessageDialog(LoginForm.this, "Por favor ingresa tu clave.", "Error", JOptionPane.ERROR_MESSAGE);
                else{
                    if (claveIngresada.equals("clave456") && nombreIngresado.equals("cliente123")) JOptionPane.showMessageDialog(LoginForm.this, "Bienvenido " + nombreIngresado);
                }
            }
        });
    }
}
