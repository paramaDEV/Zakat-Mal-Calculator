/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakat.mal;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    public calculator() {
        initComponents();
         setTitle("Zakat Mal Calculator V 1.0.1");
        setResizable(false);
        txnisab.setEditable(false);
        txzakat.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txnisab = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txemas = new javax.swing.JTextField();
        btnhitung = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txharta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txzakat = new javax.swing.JTextField();
        btnhitung2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(761, 450));
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Total");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 108, 43, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Harga emas per gram  : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 137, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Rp");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 137, -1, -1));
        getContentPane().add(txnisab, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 183, 100, 31));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jumlah nisab                : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 188, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Rp");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 188, -1, -1));
        getContentPane().add(txemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 133, 102, 29));

        btnhitung.setBackground(new java.awt.Color(51, 102, 255));
        btnhitung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnhitung.setForeground(new java.awt.Color(255, 255, 255));
        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 245, 113, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("* Jumlah nisab = 85 g emas x harga emas per gram");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 226, -1, -1));

        btnclear.setBackground(new java.awt.Color(255, 51, 51));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Reset");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 369, 110, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nisab");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 108, 43, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Jumlah harta                       :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 137, -1, -1));
        getContentPane().add(txharta, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 131, 166, 33));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Rp");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 137, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Zakat yang harus dibayar    :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 188, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Rp");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 188, -1, -1));
        getContentPane().add(txzakat, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 182, 166, 33));

        btnhitung2.setBackground(new java.awt.Color(51, 102, 255));
        btnhitung2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnhitung2.setForeground(new java.awt.Color(255, 255, 255));
        btnhitung2.setText("Hitung");
        btnhitung2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitung2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnhitung2, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 245, 123, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel13.setText("* Jumlah zakat = 2.5 % * total harta");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 226, -1, -1));

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 369, 117, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 450));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Calculator");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel2)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 323, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
       try{
        int a = Integer.parseInt(txemas.getText());
       int x = 85;
       int y = a*x;
        txnisab.setText(""+y);
       }catch(NumberFormatException xe){
          JOptionPane.showMessageDialog(null,"Masukkan nominal dengan benar");
       }
       
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txemas.setText(null);
        txnisab.setText(null);
        txharta.setText(null);
        txzakat.setText(null);
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnhitung2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitung2ActionPerformed
       try{
           long a=Integer.parseInt(txharta.getText());
           long b= 25 ;
           long c =Integer.parseInt(txnisab.getText());
           long x=a*b/1000;
           if(a < c ){
           JOptionPane.showMessageDialog(null,"Jumlah harta tidak memenuhi batas minimal nisab");
       }else{
           
           txzakat.setText(""+x);
       }
       }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null,"Masukkan nominal dengan benar");
       }
       
    }//GEN-LAST:event_btnhitung2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        main xy = new main();
        
        this.setVisible(false);
        xy.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnhitung2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txemas;
    private javax.swing.JTextField txharta;
    private javax.swing.JTextField txnisab;
    private javax.swing.JTextField txzakat;
    // End of variables declaration//GEN-END:variables
}
