package praktikum_2.input_joptionpane;
import javax.swing.JOptionPane;

public class input_joptionpane {

    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Nama");
        
        JOptionPane.showMessageDialog(null, "Hello " + nama);
    }
}