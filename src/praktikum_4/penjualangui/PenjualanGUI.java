package praktikum_4.penjualangui;

public class PenjualanGUI {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() {
                new frmUtama().setVisible(true);
            }
        });
    }
    
}
