
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class exemplo1 extends javax.swing.JFrame {

    /**
     * Creates new form exemplo1
     */
    public exemplo1() {
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
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        subtrair = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        multiplicação = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calculadora");

        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        subtrair.setText("-");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });

        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        multiplicação.setText("x");
        multiplicação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicaçãoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(multiplicação, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(resultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicação, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multiplicaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicaçãoActionPerformed
        int nume1 = Integer.parseInt(num1.getText());
        int nume2 = Integer.parseInt(num2.getText());
        result.setText(nume1*nume2+" ");
        JOptionPane.showMessageDialog(null,(nume1*nume2));
    }//GEN-LAST:event_multiplicaçãoActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        int nume1 = Integer.parseInt(num1.getText());
        int nume2 = Integer.parseInt(num2.getText());
        result.setText(nume1+nume2+" ");
        JOptionPane.showMessageDialog(null,(nume1+nume2));
    }//GEN-LAST:event_somaActionPerformed

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairActionPerformed
        int nume1 = Integer.parseInt(num1.getText());
        int nume2 = Integer.parseInt(num2.getText());
        result.setText(nume1-nume2+" ");
        JOptionPane.showMessageDialog(null,(nume1-nume2));
    }//GEN-LAST:event_subtrairActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        int nume1 = Integer.parseInt(num1.getText());
        int nume2 = Integer.parseInt(num2.getText());
        result.setText(nume1/nume2+" ");
        JOptionPane.showMessageDialog(null,(nume1/nume2));
    }//GEN-LAST:event_dividirActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

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
            java.util.logging.Logger.getLogger(exemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exemplo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exemplo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multiplicação;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JLabel result;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtrair;
    // End of variables declaration//GEN-END:variables
}
