
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jussara Andrade
 */
public class Renda extends javax.swing.JFrame {

    double resultado1, resultado2, resultado3;

    public Renda() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public void CalculoRenda() {

        try {
            double salarioRendaMensal = Double.parseDouble(jTextFieldRendaMensal.getText());
            double economizadoMeses = Double.parseDouble(jTextFieldMesesEconomizados.getText());
            double depositoMensal = Double.parseDouble(jTextFieldDepositoMensal.getText());

            resultado1 = salarioRendaMensal - depositoMensal;
            resultado2 = depositoMensal * economizadoMeses;

            JOptionPane.showMessageDialog(jPanelRenda, "Calculo Poupado!" + "\n\nRenda Mensal: " + salarioRendaMensal
                    + "\nMeses Economizados: " + economizadoMeses
                    + "\nDeposito Mensal: " + depositoMensal
                    + "\n\nTotal % Salário Mensal  : " + resultado1
                    + "\nMeses Ecnomizados: " + jTextFieldMesesEconomizados.getText() + " Meses"
                    + "\nValor Deposito:  " + resultado2);

        } catch (NumberFormatException nfe) {

        }

    }

    public void validador() {
        if ((jTextFieldRendaMensal.getText().length() > 0)
                && (jTextFieldMesesEconomizados.getText().length() > 0)
                && (jTextFieldDepositoMensal.getText().length() > 0)) {

        } else {
            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRenda = new javax.swing.JPanel();
        jLabelRendaMensal = new javax.swing.JLabel();
        jTextFieldRendaMensal = new javax.swing.JTextField();
        jLabelMesesEconomizados = new javax.swing.JLabel();
        jTextFieldMesesEconomizados = new javax.swing.JTextField();
        jLabelDepositoMensal = new javax.swing.JLabel();
        jTextFieldDepositoMensal = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonOk = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelRenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Renda"));

        jLabelRendaMensal.setText("Renda Mensal:");

        jLabelMesesEconomizados.setText("Meses Economizados:");

        jLabelDepositoMensal.setText("Depósito Mensal:");

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setActionCommand("");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRendaLayout = new javax.swing.GroupLayout(jPanelRenda);
        jPanelRenda.setLayout(jPanelRendaLayout);
        jPanelRendaLayout.setHorizontalGroup(
            jPanelRendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRendaLayout.createSequentialGroup()
                .addGroup(jPanelRendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelRendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelRendaLayout.createSequentialGroup()
                                .addComponent(jLabelRendaMensal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRendaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRendaLayout.createSequentialGroup()
                                .addComponent(jLabelMesesEconomizados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMesesEconomizados, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRendaLayout.createSequentialGroup()
                                .addComponent(jLabelDepositoMensal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDepositoMensal))))
                    .addGroup(jPanelRendaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanelRendaLayout.setVerticalGroup(
            jPanelRendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRendaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelRendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRendaMensal)
                    .addComponent(jTextFieldRendaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMesesEconomizados)
                    .addComponent(jTextFieldMesesEconomizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDepositoMensal)
                    .addComponent(jTextFieldDepositoMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanelRendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldDepositoMensal.setText("");
        jTextFieldMesesEconomizados.setText("");
        jTextFieldRendaMensal.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        JOptionPane.showMessageDialog(jPanelRenda, "Operação Cancelada");
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        CalculoRenda();
        validador();
    }//GEN-LAST:event_jButtonOkActionPerformed

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
            java.util.logging.Logger.getLogger(Renda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Renda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Renda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Renda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Renda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelDepositoMensal;
    private javax.swing.JLabel jLabelMesesEconomizados;
    private javax.swing.JLabel jLabelRendaMensal;
    private javax.swing.JPanel jPanelRenda;
    private javax.swing.JTextField jTextFieldDepositoMensal;
    private javax.swing.JTextField jTextFieldMesesEconomizados;
    private javax.swing.JTextField jTextFieldRendaMensal;
    // End of variables declaration//GEN-END:variables
}
