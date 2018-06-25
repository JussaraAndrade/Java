
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
public class Banco extends javax.swing.JFrame {

    int contaCaracteres = 5;
    int agenciaCaracteres = 7;

    public Banco() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void BancoOperacao() {

        if (jTextFieldCont.getText().length() >= contaCaracteres) {
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas 5 digitos");
            jTextFieldCont.setText("");
        } else if (jTextFieldAgencia.getText().length() >= agenciaCaracteres) {
            jTextFieldAgencia.setText("");
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas 8 digitos na Agência ");
        } else if (jComboBoxContas.getSelectedItem().equals("Selecione...")) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione a Conta! ", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldCont.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Conta está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldAgencia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Agência está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldDestinario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Destinário está vazio", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (!jRadioButtonSaque.isSelected() && !jRadioButtonTransferencia.isSelected()) {
            JOptionPane.showMessageDialog(null, "Por favor selecione a opção Saque ou Transferência!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jTextFieldEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Endereço está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Telefone está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jTextFieldCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(jPanelConta, "Campo Cpf está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
           
        } else if (jRadioButtonSaque.isSelected()) {

            JOptionPane.showMessageDialog(null, "Saque feito com sucesso! " + "\nNúmero da Conta: " + jTextFieldCont.getText() + " \nAgência: " + jTextFieldAgencia.getText() + "\nConta: " + jComboBoxContas.getSelectedItem()
                    + "\n\nDados Pessoais" + "\nNome: " + jTextFieldNome.getText() + " \nEndereço: " + jTextFieldEndereco.getText()
                    + "\nTelefone: " + jTextFieldTelefone.getText() + " \nCPF: " + jTextFieldCpf.getText());

        } else if (jRadioButtonTransferencia.isSelected()) {

            JOptionPane.showMessageDialog(null, "Transfêrencia feita com sucesso! " + "\nNúmero da Conta: " + jTextFieldCont.getText() + " \nAgência: " + jTextFieldAgencia.getText() + " \nConta: " + jComboBoxContas.getSelectedItem() + "\nDestinário: " + jTextFieldDestinario.getText()
                    + "\n\nDados Pessoais" + "\nNome: " + jTextFieldNome.getText() + " \nEndereço: " + jTextFieldEndereco.getText()
                    + "\nTelefone: " + jTextFieldTelefone.getText() + " \nCPF: " + jTextFieldCpf.getText());

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelDadosPessoais = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelConta = new javax.swing.JPanel();
        jLabelConta = new javax.swing.JLabel();
        jTextFieldCont = new javax.swing.JTextField();
        jLabelAgencia = new javax.swing.JLabel();
        jTextFieldAgencia = new javax.swing.JTextField();
        jRadioButtonTransferencia = new javax.swing.JRadioButton();
        jRadioButtonSaque = new javax.swing.JRadioButton();
        jComboBoxContas = new javax.swing.JComboBox<>();
        jLabelDestinario = new javax.swing.JLabel();
        jTextFieldDestinario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabelNome.setText("Nome: ");

        jLabel4.setText("Endereço:");

        jLabelTelefone.setText("Telefone:");

        jLabelCpf.setText("CPF:");

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTelefone)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabelCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTelefone)
                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCpf)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanelConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta"));

        jLabelConta.setText("Conta:");

        jLabelAgencia.setText("Agência: ");

        buttonGroup1.add(jRadioButtonTransferencia);
        jRadioButtonTransferencia.setText("Transfêrencia");
        jRadioButtonTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTransferenciaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonSaque);
        jRadioButtonSaque.setText("Saque");

        jComboBoxContas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Conta Corrente", "Conta Poupança" }));

        jLabelDestinario.setText("Destinário:");

        javax.swing.GroupLayout jPanelContaLayout = new javax.swing.GroupLayout(jPanelConta);
        jPanelConta.setLayout(jPanelContaLayout);
        jPanelContaLayout.setHorizontalGroup(
            jPanelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContaLayout.createSequentialGroup()
                        .addComponent(jLabelConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContaLayout.createSequentialGroup()
                                .addComponent(jTextFieldCont, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelAgencia)
                                .addGap(2, 2, 2)
                                .addComponent(jTextFieldAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxContas, 0, 129, Short.MAX_VALUE))
                            .addGroup(jPanelContaLayout.createSequentialGroup()
                                .addComponent(jRadioButtonTransferencia)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonSaque)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelContaLayout.createSequentialGroup()
                        .addComponent(jLabelDestinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDestinario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelContaLayout.setVerticalGroup(
            jPanelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConta)
                    .addComponent(jTextFieldCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAgencia)
                    .addComponent(jTextFieldAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDestinario)
                    .addComponent(jTextFieldDestinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanelContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonTransferencia)
                    .addComponent(jRadioButtonSaque)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTransferenciaActionPerformed

    }//GEN-LAST:event_jRadioButtonTransferenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextFieldCont.setText("");
        jTextFieldCpf.setText("");
        jTextFieldDestinario.setText("");
        jTextFieldNome.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldAgencia.setText("");
        jComboBoxContas.setSelectedIndex(0);
        
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BancoOperacao();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(jPanelConta, "Operação cancelada!");
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Banco.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxContas;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAgencia;
    private javax.swing.JLabel jLabelConta;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDestinario;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelConta;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JRadioButton jRadioButtonSaque;
    private javax.swing.JRadioButton jRadioButtonTransferencia;
    private javax.swing.JTextField jTextFieldAgencia;
    private javax.swing.JTextField jTextFieldCont;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldDestinario;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}