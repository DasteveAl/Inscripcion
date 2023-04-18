import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inscripcion extends JDialog{
    private JTextField txtInscripcion;
    private JTextField txtNames;
    private JTextField txtPatrimonio;
    private JTextField txtEstrato;
    private JButton borrarButton;
    private JButton calcularButton;
    private JButton salirButton;
    private JPanel Main;

    public Inscripcion(JFrame parent) {
        super(parent);
        setTitle("Inscripcion");
        setContentPane(Main);
        setMinimumSize(new Dimension(450,300));
        setModal(true);
        setLocationRelativeTo(parent);


        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                NumInscripcion miInscripcion = new NumInscripcion();
                Names miNombre = new Names();
                Matricula miMatricula = new Matricula();

                int inscripcion = Integer.parseInt(txtInscripcion.getText());
                miInscripcion.setInscripcion(inscripcion);
                String names = txtNames.getText();
                miNombre.setNames(names);
                double patrimonio = Double.parseDouble(txtPatrimonio.getText());
                miMatricula.setPatrimonio(patrimonio);
                int estrato = Integer.parseInt(txtEstrato.getText());
                miMatricula.setEstrato(estrato);
                double matricula = miMatricula.getMatricula();

                JOptionPane.showMessageDialog(null, "El numero de inscripcion" +
                        "es: "+ inscripcion + "\nNombres: "+ names + "\nPago por Matricula: "+ matricula);
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtInscripcion.setText("");
                txtNames.setText("");
                txtPatrimonio.setText("");
                txtEstrato.setText("");
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public static void main(String args[]) {
        Inscripcion form = new Inscripcion(null);
    }
}
