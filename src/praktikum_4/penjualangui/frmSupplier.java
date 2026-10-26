package praktikum_4.penjualangui;

public class frmSupplier extends javax.swing.JFrame {

    public frmSupplier() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
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

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Halaman GUI Supplier");

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
        mnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBarangActionPerformed(evt);
            }
        });
        mnMaster.add(mnBarang);

        mnKeluar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        mnKeluar.setText("Keluar");
        mnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKeluarActionPerformed(evt);
            }
        });
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
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSupplierActionPerformed

    private void mnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnBarangActionPerformed

    private void mnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKeluarActionPerformed
        frmUtama ut = new frmUtama();
        ut.setVisible(true);
    }//GEN-LAST:event_mnKeluarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
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
