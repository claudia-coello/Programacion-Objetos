package ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame{
    private JPanel panel1;
    private JLabel lblBienvenido;
    private JLabel lblNombre;
    private JLabel lblClave;
    private JTextField inputNombre;
    private JPasswordField inputClave;

    public Login(){
        setSize(500,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        setTitle("Sistema de matriculacion");
        panel1.setBorder(new EmptyBorder(1,1,1,1));
    }
}
