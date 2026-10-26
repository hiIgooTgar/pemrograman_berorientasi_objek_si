package praktikum_4.penjualangui;

public class frmUtama extends javax.swing.JFrame {

    public frmUtama() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnMaster = new javax.swing.JMenu();
        mnSupplier = new javax.swing.JMenuItem();
        mnBarang = new javax.swing.JMenuItem();
        mnKeluar = new javax.swing.JMenuItem();
        mnTransaksi = new javax.swing.JMenu();
        mnPembelian = new javax.swing.JMenuItem();
        mnPenjulan = new javax.swing.JMenuItem();
        mnLaporan = new javax.swing.JMenu();
        mnRekapPembelian = new javax.swing.JMenuItem();
        mnRekapPenjualan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Halaman GUI Utama");

        mnMaster.setText("Master");

        mnSupplier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSupplier.setText("Supplier");
        mnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSupplierActionPerformed(evt);
            }
        });
        mnMaster.add(mnSupplier);

        mnBarang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnBarang.setText("Barang");
        mnMaster.add(mnBarang);

        mnKeluar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        mnKeluar.setText("Keluar");
        mnMaster.add(mnKeluar);

        jMenuBar1.add(mnMaster);

        mnTransaksi.setText("Transaksi");

        mnPembelian.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnPembelian.setText("Pembelian");
        mnTransaksi.add(mnPembelian);

        mnPenjulan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        mnPenjulan.setText("Penjualan");
        mnTransaksi.add(mnPenjulan);

        jMenuBar1.add(mnTransaksi);

        mnLaporan.setText("Laporan");

        mnRekapPembelian.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        mnRekapPembelian.setText("Rekap Pembelian");
        mnLaporan.add(mnRekapPembelian);

        mnRekapPenjualan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_MASK));
        mnRekapPenjualan.setText("Rekap Penjualan");
        mnLaporan.add(mnRekapPenjualan);

        jMenuBar1.add(mnLaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSupplierActionPerformed
        frmSupplier sp = new frmSupplier();
        sp.setVisible(true);
    }//GEN-LAST:event_mnSupplierActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnBarang;
    private javax.swing.JMenuItem mnKeluar;
    private javax.swing.JMenu mnLaporan;
    private javax.swing.JMenu mnMaster;
    private javax.swing.JMenuItem mnPembelian;
    private javax.swing.JMenuItem mnPenjulan;
    private javax.swing.JMenuItem mnRekapPembelian;
    private javax.swing.JMenuItem mnRekapPenjualan;
    private javax.swing.JMenuItem mnSupplier;
    private javax.swing.JMenu mnTransaksi;
    // End of variables declaration//GEN-END:variables
}
