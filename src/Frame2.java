/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Frame2 extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
    public Frame2() {
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

        jPanel1 = new javax.swing.JPanel();
        Alamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Kelas = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nama1 = new javax.swing.JTextField();
        Kelas1 = new javax.swing.JTextField();
        Alamat1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Alamat2 = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Kelas2 = new javax.swing.JTextField();
        Nama2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Telp = new javax.swing.JLabel();
        Telepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(Alamat);
        Alamat.setBounds(180, 120, 140, 30);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(210, 170, 90, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 40, 80, 20);
        jPanel1.add(Kelas);
        Kelas.setBounds(180, 80, 140, 30);
        jPanel1.add(Nama);
        Nama.setBounds(180, 40, 140, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 210, 60, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kelas");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 250, 70, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 290, 70, 20);
        jPanel1.add(Nama1);
        Nama1.setBounds(190, 210, 130, 30);

        Kelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kelas1ActionPerformed(evt);
            }
        });
        jPanel1.add(Kelas1);
        Kelas1.setBounds(190, 250, 130, 30);

        Alamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alamat1ActionPerformed(evt);
            }
        });
        jPanel1.add(Alamat1);
        Alamat1.setBounds(190, 290, 130, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(Alamat2);
        Alamat2.setBounds(180, 120, 140, 30);

        Submit.setForeground(new java.awt.Color(0, 153, 153));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel2.add(Submit);
        Submit.setBounds(200, 220, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 50, 80, 20);

        Kelas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kelas2ActionPerformed(evt);
            }
        });
        jPanel2.add(Kelas2);
        Kelas2.setBounds(180, 80, 140, 30);

        Nama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama2ActionPerformed(evt);
            }
        });
        jPanel2.add(Nama2);
        Nama2.setBounds(180, 40, 140, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kelas");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(90, 90, 80, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Alamat");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(90, 130, 80, 20);

        Telp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Telp.setForeground(new java.awt.Color(255, 255, 255));
        Telp.setText("No. HP");
        jPanel2.add(Telp);
        Telp.setBounds(90, 170, 60, 20);

        Telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeleponActionPerformed(evt);
            }
        });
        jPanel2.add(Telepon);
        Telepon.setBounds(180, 160, 140, 30);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(90, 270, 270, 120);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Biodata Siswa");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 0, 120, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 460, 420);

        setBounds(0, 0, 472, 466);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        Nama1.setText(nama);
        String kelas = Kelas.getText();
        Kelas1.setText(kelas);
        String alamat = Alamat.getText();
        Alamat1.setText(alamat);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Kelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kelas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kelas1ActionPerformed

    private void Alamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alamat1ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String Nama = Nama2.getText();
        String Kelas = Kelas2.getText();
        String Alamat = Alamat2.getText();
        int Telp = Integer.parseInt(Telepon.getText());
        
        TA.append("Nama siswa : "+Nama+"\n Kelas anda : "+Kelas+"\n Alamat anda : "+Alamat+"\n No. Telepon anda : "+Telp);
    }//GEN-LAST:event_SubmitActionPerformed

    private void Nama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama2ActionPerformed

    private void Kelas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kelas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kelas2ActionPerformed

    private void TeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeleponActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Alamat1;
    private javax.swing.JTextField Alamat2;
    private javax.swing.JTextField Kelas;
    private javax.swing.JTextField Kelas1;
    private javax.swing.JTextField Kelas2;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nama1;
    private javax.swing.JTextField Nama2;
    private javax.swing.JButton Submit;
    private javax.swing.JTextArea TA;
    private javax.swing.JTextField Telepon;
    private javax.swing.JLabel Telp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}