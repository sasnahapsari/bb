/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class bbb extends javax.swing.JFrame {

    /**
     * Creates new form bbb
     */
    public bbb() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        l = new javax.swing.JRadioButton();
        w = new javax.swing.JRadioButton();
        hitung = new javax.swing.JButton();
        cobalagi = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        hbi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        h1 = new javax.swing.JTextField();
        h2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(157, 11, 87, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(75, 51, 27, 14);
        getContentPane().add(n);
        n.setBounds(120, 48, 160, 20);

        jLabel3.setText("Tinggi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(74, 89, 28, 14);
        getContentPane().add(t);
        t.setBounds(120, 86, 160, 20);

        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(43, 127, 59, 14);
        getContentPane().add(b);
        b.setBounds(120, 124, 160, 20);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(39, 166, 63, 14);

        l.setText("Laki-laki");
        getContentPane().add(l);
        l.setBounds(120, 162, 63, 23);

        w.setText("Perempuan");
        getContentPane().add(w);
        w.setBounds(201, 162, 79, 23);

        hitung.setForeground(new java.awt.Color(0, 204, 204));
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung);
        hitung.setBounds(73, 203, 63, 23);

        cobalagi.setForeground(new java.awt.Color(0, 204, 204));
        cobalagi.setText("Coba lagi");
        cobalagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobalagiActionPerformed(evt);
            }
        });
        getContentPane().add(cobalagi);
        cobalagi.setBounds(154, 203, 77, 23);

        exit.setForeground(new java.awt.Color(0, 204, 204));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(241, 203, 51, 23);

        jLabel7.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(85, 240, 146, 14);

        hbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbiActionPerformed(evt);
            }
        });
        getContentPane().add(hbi);
        hbi.setBounds(241, 237, 44, 20);

        jLabel6.setText("Kg");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(289, 240, 12, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 51, 255));
        jLabel8.setText("Hasil diagnosa kesehatan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(105, 268, 154, 15);

        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });
        getContentPane().add(h1);
        h1.setBounds(39, 289, 320, 20);

        h2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h2ActionPerformed(evt);
            }
        });
        getContentPane().add(h2);
        h2.setBounds(39, 315, 320, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        if(b.getText().equals("")||t.getText().equals("")||n.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kotak isian Belum diisi, maka harus diisi");
        }else if (w.isSelected()||l.isSelected())
        try{
            Proses();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Inputan ada yang salah");
        }
        else {
            JOptionPane.showMessageDialog(null, "Jenis Kelamin silahkan diisi");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_hitungActionPerformed

    private void cobalagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobalagiActionPerformed
        n.setText("");
        t.setText("");
        b.setText("");
        buttonGroup1.clearSelection();
        hbi.setText("");
        h1.setText("");
        h2.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_cobalagiActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void hbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hbiActionPerformed

    private void h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h1ActionPerformed

    private void h2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(bbb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bbb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bbb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bbb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bbb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b;
    private javax.swing.JButton cobalagi;
    private javax.swing.JButton exit;
    private javax.swing.JTextField h1;
    private javax.swing.JTextField h2;
    private javax.swing.JTextField hbi;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton l;
    private javax.swing.JTextField n;
    private javax.swing.JTextField t;
    private javax.swing.JRadioButton w;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class buttonGroup1 {

        private static void clearSelection() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public buttonGroup1() {
        }
    }
}
