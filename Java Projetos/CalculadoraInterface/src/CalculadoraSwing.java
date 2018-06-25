/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jussara Andrade
 */
public class CalculadoraSwing extends javax.swing.JFrame {

    double primeiroNum;
    double segundoNum;
    double resultado;
    String operacao;

    public CalculadoraSwing() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void operacao() {
        String ans;
        segundoNum = Double.parseDouble(jTextFieldResultadoTela.getText());

        switch (operacao) {
            case "+": 
                resultado = primeiroNum + segundoNum;
                ans = String.format("%.0f", resultado);
                jTextFieldResultadoTela.setText(ans);
                break;
            case "-":   
                resultado = primeiroNum - segundoNum;
                ans = String.format("%.0f", resultado);
                jTextFieldResultadoTela.setText(ans);
                break;
            case "*":    
                resultado = primeiroNum * segundoNum;
                ans = String.format("%.0f", resultado);
                jTextFieldResultadoTela.setText(ans);
                break;
            case "/": 
                resultado = primeiroNum / segundoNum;
                ans = String.format("%.0f", resultado);
                jTextFieldResultadoTela.setText(ans);
                break;

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelJanela = new javax.swing.JPanel();
        jButtonNumero7 = new javax.swing.JButton();
        jButtonNumero8 = new javax.swing.JButton();
        jButtonNumero9 = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jButtonNumero11 = new javax.swing.JButton();
        jButtonNumero12 = new javax.swing.JButton();
        jButtonNumero13 = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButtonNumero15 = new javax.swing.JButton();
        jButtonNumero16 = new javax.swing.JButton();
        jButtonNumero17 = new javax.swing.JButton();
        jButtonSubtracao = new javax.swing.JButton();
        jButtonSoma = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jTextFieldResultadoTela = new javax.swing.JTextField();
        jButtonNumero18 = new javax.swing.JButton();
        jButtonNumero20 = new javax.swing.JButton();
        jButtonSoma1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelJanela.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculadora"));

        jButtonNumero7.setText("7");
        jButtonNumero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero7ActionPerformed(evt);
            }
        });

        jButtonNumero8.setText("8");
        jButtonNumero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero8ActionPerformed(evt);
            }
        });

        jButtonNumero9.setText("9");
        jButtonNumero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero9ActionPerformed(evt);
            }
        });

        jButtonDivisao.setText("/");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });

        jButtonNumero11.setText("4");
        jButtonNumero11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero11ActionPerformed(evt);
            }
        });

        jButtonNumero12.setText("5");
        jButtonNumero12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero12ActionPerformed(evt);
            }
        });

        jButtonNumero13.setText("6");
        jButtonNumero13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero13ActionPerformed(evt);
            }
        });

        jButtonMultiplicacao.setText("*");
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacaoActionPerformed(evt);
            }
        });

        jButtonNumero15.setText("1");
        jButtonNumero15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero15ActionPerformed(evt);
            }
        });

        jButtonNumero16.setText("2");
        jButtonNumero16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero16ActionPerformed(evt);
            }
        });

        jButtonNumero17.setText("3");
        jButtonNumero17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero17ActionPerformed(evt);
            }
        });

        jButtonSubtracao.setText("-");
        jButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtracaoActionPerformed(evt);
            }
        });

        jButtonSoma.setText("+");
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomaActionPerformed(evt);
            }
        });

        jButtonPonto.setText(".");
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("C");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonNumero18.setText("0");
        jButtonNumero18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero18ActionPerformed(evt);
            }
        });

        jButtonNumero20.setText("=");
        jButtonNumero20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumero20ActionPerformed(evt);
            }
        });

        jButtonSoma1.setText("Sair");
        jButtonSoma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSoma1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJanelaLayout = new javax.swing.GroupLayout(jPanelJanela);
        jPanelJanela.setLayout(jPanelJanelaLayout);
        jPanelJanelaLayout.setHorizontalGroup(
            jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJanelaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJanelaLayout.createSequentialGroup()
                        .addComponent(jButtonNumero7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNumero8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNumero9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelJanelaLayout.createSequentialGroup()
                        .addComponent(jButtonNumero11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNumero12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNumero13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldResultadoTela)
                    .addGroup(jPanelJanelaLayout.createSequentialGroup()
                        .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonNumero18, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jButtonNumero15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jButtonNumero16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelJanelaLayout.createSequentialGroup()
                                .addComponent(jButtonNumero17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelJanelaLayout.createSequentialGroup()
                                .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSoma, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))))
                    .addGroup(jPanelJanelaLayout.createSequentialGroup()
                        .addComponent(jButtonNumero20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSoma1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanelJanelaLayout.setVerticalGroup(
            jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldResultadoTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumero11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumero15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumero18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSoma1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumero20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelJanela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelJanela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldResultadoTela.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonNumero15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero15ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero15.getText();
        jTextFieldResultadoTela.setText(tomar);


    }//GEN-LAST:event_jButtonNumero15ActionPerformed

    private void jButtonNumero16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero16ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero16.getText();
        jTextFieldResultadoTela.setText(tomar);


    }//GEN-LAST:event_jButtonNumero16ActionPerformed

    private void jButtonNumero17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero17ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero17.getText();
        jTextFieldResultadoTela.setText(tomar);


    }//GEN-LAST:event_jButtonNumero17ActionPerformed

    private void jButtonNumero11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero11ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero11.getText();
        jTextFieldResultadoTela.setText(tomar);


    }//GEN-LAST:event_jButtonNumero11ActionPerformed

    private void jButtonNumero12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero12ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero12.getText();
        jTextFieldResultadoTela.setText(tomar);

    }//GEN-LAST:event_jButtonNumero12ActionPerformed

    private void jButtonNumero13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero13ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero13.getText();
        jTextFieldResultadoTela.setText(tomar);

    }//GEN-LAST:event_jButtonNumero13ActionPerformed

    private void jButtonNumero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero7ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero7.getText();
        jTextFieldResultadoTela.setText(tomar);


    }//GEN-LAST:event_jButtonNumero7ActionPerformed

    private void jButtonNumero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero8ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero8.getText();
        jTextFieldResultadoTela.setText(tomar);

    }//GEN-LAST:event_jButtonNumero8ActionPerformed

    private void jButtonNumero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero9ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero9.getText();
        jTextFieldResultadoTela.setText(tomar);

    }//GEN-LAST:event_jButtonNumero9ActionPerformed

    private void jButtonSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomaActionPerformed
        primeiroNum = Double.parseDouble(jTextFieldResultadoTela.getText());
        jTextFieldResultadoTela.setText("");
        operacao = "+";

    }//GEN-LAST:event_jButtonSomaActionPerformed

    private void jButtonSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtracaoActionPerformed
        primeiroNum = Double.parseDouble(jTextFieldResultadoTela.getText());
        jTextFieldResultadoTela.setText("");
        operacao = "-";


    }//GEN-LAST:event_jButtonSubtracaoActionPerformed

    private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacaoActionPerformed
        primeiroNum = Double.parseDouble(jTextFieldResultadoTela.getText());
        jTextFieldResultadoTela.setText("");
        operacao = "*";


    }//GEN-LAST:event_jButtonMultiplicacaoActionPerformed

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
        primeiroNum = Double.parseDouble(jTextFieldResultadoTela.getText());
        jTextFieldResultadoTela.setText("");
        operacao = "/";


    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jButtonNumero18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero18ActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonNumero18.getText();
        jTextFieldResultadoTela.setText(tomar);

    }//GEN-LAST:event_jButtonNumero18ActionPerformed

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        String tomar;

        tomar = jTextFieldResultadoTela.getText() + jButtonPonto.getText();
        jTextFieldResultadoTela.setText(tomar);


    }//GEN-LAST:event_jButtonPontoActionPerformed

    private void jButtonNumero20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumero20ActionPerformed
        operacao();
    }//GEN-LAST:event_jButtonNumero20ActionPerformed

    private void jButtonSoma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSoma1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSoma1ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonNumero11;
    private javax.swing.JButton jButtonNumero12;
    private javax.swing.JButton jButtonNumero13;
    private javax.swing.JButton jButtonNumero15;
    private javax.swing.JButton jButtonNumero16;
    private javax.swing.JButton jButtonNumero17;
    private javax.swing.JButton jButtonNumero18;
    private javax.swing.JButton jButtonNumero20;
    private javax.swing.JButton jButtonNumero7;
    private javax.swing.JButton jButtonNumero8;
    private javax.swing.JButton jButtonNumero9;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSoma1;
    private javax.swing.JButton jButtonSubtracao;
    private javax.swing.JPanel jPanelJanela;
    private javax.swing.JTextField jTextFieldResultadoTela;
    // End of variables declaration//GEN-END:variables
}
