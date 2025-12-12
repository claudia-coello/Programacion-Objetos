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
        setContentPane(panelPrincipal);
        setLocationRelativeTo(null);
        setVisible(true);
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nombreIngresado = ingresoUsuario.getText().strip();
                String claveIngresada = ingresoClave.getText();

                if (nombreIngresado.isBlank() || claveIngresada.isBlank()) JOptionPane.showMessageDialog(LoginForm.this, "Por favor ingresa tu usuario y clave.", "Error", JOptionPane.ERROR_MESSAGE);
                else{
                    if (claveIngresada.equals("clave456") && nombreIngresado.equals("cliente123")) {
                        new BancoForm(nombreIngresado);
                        dispose();
                    }
                    else JOptionPane.showMessageDialog(LoginForm.this, "Usuario o clave incorrectos. Por favor intentelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
