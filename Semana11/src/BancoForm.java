import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class BancoForm extends JFrame {
    private JPanel bancoPanel;
    private JLabel labelBienvenida;
    private JButton depositarButton;
    private JButton retirarButton;
    private JButton salirButton;
    private JButton transferirButton;
    private JLabel saldoLabel;
    private JLabel saldoTextLabel;
    private JLabel historialLabelText;
    private JTextArea historialText;
    private double montoActual = 1000.00;
    private String nombreUsuario;
    private ArrayList<String> historial = new ArrayList<>();

    public BancoForm(String nombreUsuario) {
        setVisible(true);
        setContentPane(bancoPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,200);
        mostrarSaldo();

        labelBienvenida.setText(labelBienvenida.getText() + nombreUsuario);

        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    double monto = Double.parseDouble(JOptionPane.showInputDialog(BancoForm.this, "Ingrese el monto a depositar: "));
                    if (monto < 0) throw new FormatoIncorrectoException("El monto no puede ser negativo");
                    actualizarHistorial("Deposito: +", monto);
                    setMontoActual(montoActual + monto);
                    mostrarSaldo();
                }catch(FormatoIncorrectoException f){
                    JOptionPane.showMessageDialog(BancoForm.this, f.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(BancoForm.this, "Por favor ingrese un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        retirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    double monto = Double.parseDouble(JOptionPane.showInputDialog(BancoForm.this, "Ingrese el monto a retirar: "));
                    if (monto < 0) throw new FormatoIncorrectoException("El monto no puede ser negativo");
                    if (monto > montoActual) throw new FormatoIncorrectoException("Monto mayor al saldo disponible");

                    actualizarHistorial("Retiro: -", monto);
                    setMontoActual(montoActual - monto);
                    mostrarSaldo();
                }catch(FormatoIncorrectoException f){
                    JOptionPane.showMessageDialog(BancoForm.this, f.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(BancoForm.this, "Por favor ingrese un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        transferirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    double monto = Double.parseDouble(JOptionPane.showInputDialog(BancoForm.this, "Ingrese el monto a tranferir: "));
                    if (monto < 0) throw new FormatoIncorrectoException("El monto no puede ser negativo");
                    if (monto > montoActual) throw new FormatoIncorrectoException("Monto mayor al saldo disponible");

                    actualizarHistorial("Transferencia: -", monto);
                    setMontoActual(montoActual - monto);
                    mostrarSaldo();
                }catch(FormatoIncorrectoException f){
                    JOptionPane.showMessageDialog(BancoForm.this, f.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(BancoForm.this, "Por favor ingrese un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(BancoForm.this, "Gracias por preferirnos " + nombreUsuario);
                System.exit(0);
            }
        });
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }

    public void mostrarSaldo(){
        saldoLabel.setText(" $"+getMontoActual());
    }

    public ArrayList<String> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<String> historial) {
        this.historial = historial;
    }

    public void actualizarHistorial(String tipoAccion,double monto){
        historial.add(tipoAccion + " $" + monto);
        String texto = "";
        for (int i = 0; i < historial.size(); i++) {
            texto += historial.get(i) + "\n";
        }
        historialText.setText(texto);
    }
}
