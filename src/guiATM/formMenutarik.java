/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiATM;
import atm.Transaksi;
import atm.DatabaseAtm;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Diptha
 */
public class formMenutarik extends javax.swing.JFrame {
     private String norek;

    public void setNorek(String norek) {
        this.norek = norek;
    }

    public String getNorek() {
        return norek;
    }
    /**
     * Creates new form formMenutarik
     */
    public formMenutarik() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b_100rb = new javax.swing.JButton();
        b_sejuta5ratus = new javax.swing.JButton();
        b_500rb = new javax.swing.JButton();
        b_Sejuta = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        tariklainbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU PENARIKAN UANG");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SILAHKAN PILIH JUMLAH PENARIKAN");

        b_100rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_100rbActionPerformed(evt);
            }
        });

        b_sejuta5ratus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sejuta5ratusActionPerformed(evt);
            }
        });

        b_500rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_500rbActionPerformed(evt);
            }
        });

        b_Sejuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_SejutaActionPerformed(evt);
            }
        });

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        tariklainbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tariklainbuttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("100.000");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("500.000");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Penarikan Lain");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("1.000.000");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("1.500.000");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kembali ke Menu");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("( MAKSIMAL PENARIKAN Rp 1.500.000 )");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59))
                    .addComponent(jLabel2))
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b_Sejuta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b_500rb, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(45, 45, 45))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tariklainbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b_sejuta5ratus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_100rb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_500rb, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addComponent(b_Sejuta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b_100rb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b_sejuta5ratus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)))
                    .addComponent(tariklainbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_SejutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_SejutaActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
         String datestring = dateFormat.format(date);
        int sisa_saldo1;
        ResultSet rs=null;
        DatabaseAtm db=new DatabaseAtm();
        Transaksi tr =new Transaksi();
        sisa_saldo1=tr.getSaldo(this.norek);
        if(sisa_saldo1>1050000){
            sisa_saldo1=sisa_saldo1-1000000;
             try {
                tr.tambahTransaksi(this.norek, tr.getNama(norek), "Tarik Tunai", datestring, 1000000, sisa_saldo1);
                db.quey("update nasabah set Saldo='"+sisa_saldo1+"' where Norek='"+this.norek+"';");
                formMenutarik3 fMt3=new formMenutarik3();
                fMt3.setNorek(this.norek);
                fMt3.setVisible(true);
                setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
         }else{
              JOptionPane.showMessageDialog(null, "Sisa saldo anda tidak memenuhi penarikan");
          }
    }//GEN-LAST:event_b_SejutaActionPerformed

    private void b_100rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_100rbActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
         String datestring = dateFormat.format(date);
        int sisa_saldo2;
        ResultSet rs=null;
        DatabaseAtm db=new DatabaseAtm();
        Transaksi tr =new Transaksi();
        sisa_saldo2=tr.getSaldo(this.norek);
        if(sisa_saldo2>150000){
            sisa_saldo2=sisa_saldo2-100000;
             try {
                tr.tambahTransaksi(this.norek, tr.getNama(norek), "Tarik Tunai", datestring, 100000, sisa_saldo2);
                db.quey("update nasabah set Saldo='"+sisa_saldo2+"' where Norek='"+this.norek+"';");
                formMenutarik3 fMt3=new formMenutarik3();
                fMt3.setNorek(this.norek);
                fMt3.setVisible(true);
                setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
         }else{
              JOptionPane.showMessageDialog(null, "Sisa saldo anda tidak memenuhi penarikan");
          }
    }//GEN-LAST:event_b_100rbActionPerformed

    private void b_sejuta5ratusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sejuta5ratusActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String datestring = dateFormat.format(date);
        int sisa_saldo3;
        ResultSet rs=null;
        DatabaseAtm db=new DatabaseAtm();
        Transaksi tr =new Transaksi();
        sisa_saldo3=tr.getSaldo(this.norek);
        if(sisa_saldo3>1550000){
            sisa_saldo3=sisa_saldo3-1500000;
             try {
                tr.tambahTransaksi(this.norek, tr.getNama(norek), "Tarik Tunai", datestring, 1500000, sisa_saldo3);
                db.quey("update nasabah set Saldo='"+sisa_saldo3+"' where Norek='"+this.norek+"';");
                formMenutarik3 fMt3=new formMenutarik3();
                fMt3.setNorek(this.norek);
                fMt3.setVisible(true);
                setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
         }else{
              JOptionPane.showMessageDialog(null, "Sisa saldo anda tidak memenuhi penarikan");
          }
    }//GEN-LAST:event_b_sejuta5ratusActionPerformed

    private void b_500rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_500rbActionPerformed
        // TODO add your handling code here:
       DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
         String datestring = dateFormat.format(date);
        int sisa_saldo4;
        ResultSet rs=null;
        DatabaseAtm db=new DatabaseAtm();
        Transaksi tr =new Transaksi();
        sisa_saldo4=tr.getSaldo(this.norek);
        if(sisa_saldo4>550000){
            sisa_saldo4=sisa_saldo4-500000;
             try {
                tr.tambahTransaksi(this.norek, tr.getNama(norek), "Tarik Tunai", datestring, 500000, sisa_saldo4);
                db.quey("update nasabah set Saldo='"+sisa_saldo4+"' where Norek='"+this.norek+"';");
                formMenutarik3 fMt3=new formMenutarik3();
                fMt3.setNorek(this.norek);
                fMt3.setVisible(true);
                setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } 
         }else{
              JOptionPane.showMessageDialog(null, "Sisa saldo anda tidak memenuhi penarikan");
          }
    }//GEN-LAST:event_b_500rbActionPerformed

    private void tariklainbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tariklainbuttonActionPerformed
        // TODO add your handling code here:
        formMenutarik2 fMt2=new formMenutarik2();
        fMt2.setNorek(this.norek);
        fMt2.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tariklainbuttonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        formMenu fM=new formMenu();
        fM.setNorek(this.norek);
        fM.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(formMenutarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMenutarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMenutarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMenutarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMenutarik().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_100rb;
    private javax.swing.JButton b_500rb;
    private javax.swing.JButton b_Sejuta;
    private javax.swing.JButton b_sejuta5ratus;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tariklainbutton;
    // End of variables declaration//GEN-END:variables
}