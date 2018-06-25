
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jussara Andrade
 */
public class VendasProdutos extends javax.swing.JFrame {

    int quantidadePermitida = 5, item, qtd;
    double valorTotal = 0, preco;

    public VendasProdutos() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelJanela = new javax.swing.JPanel();
        jButtonAdicionar = new javax.swing.JButton();
        jScrollPaneCompras = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSair = new javax.swing.JButton();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jScrollPaneProdutos = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelUnidades = new javax.swing.JLabel();
        jComboBoxUnidades = new javax.swing.JComboBox<>();
        jLabelValorTotal = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelJanela.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendas Produtos"));

        jButtonAdicionar.setText("Add >>");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneCompras.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonFinalizar.setText("Comprar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pão Integral - R$ 4.00", "Sabão em Pó - R$ 6.00", "Feijão - R$ 5.00", "Arroz - R$ 8.00", "Café - R$ 7.00", "Leite - R$ 2.99" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneProdutos.setViewportView(jList1);

        jLabelUnidades.setText("Unidades");

        jComboBoxUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jLabelValorTotal.setText("Valor Total: R$ 0,00");

        jLabelQuantidade.setText("Quantidade permitida: 5");

        javax.swing.GroupLayout jPanelJanelaLayout = new javax.swing.GroupLayout(jPanelJanela);
        jPanelJanela.setLayout(jPanelJanelaLayout);
        jPanelJanelaLayout.setHorizontalGroup(
            jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelJanelaLayout.createSequentialGroup()
                            .addComponent(jScrollPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabelUnidades)
                        .addComponent(jComboBoxUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValorTotal)
                    .addComponent(jScrollPaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJanelaLayout.setVerticalGroup(
            jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJanelaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButtonDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFinalizar)
                        .addGap(94, 94, 94)
                        .addComponent(jButtonSair))
                    .addGroup(jPanelJanelaLayout.createSequentialGroup()
                        .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPaneProdutos)
                            .addComponent(jScrollPaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUnidades)
                            .addComponent(jLabelValorTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuantidade))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelJanela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelJanela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        JOptionPane.showMessageDialog(jPanelJanela, "Operação cancelada!");
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed

        item = jList1.getSelectedIndex();
        qtd = (int) 1 + jComboBoxUnidades.getSelectedIndex();

        if (quantidadePermitida == 0) {
            JOptionPane.showMessageDialog(null, "Quantidade de produtos excedido apenas 5 item!");
        } else {
            switch (item) {
                case 0:
                    preco = preco + (4.00 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Pão Integral - R$" + preco);
                    break;
                case 1:
                    preco = preco + (6.00 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Sabão em Pó - R$" + preco);
                    break;
                case 2:
                    preco = preco + (5.00 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Feijão - R$" + preco);
                    break;
                case 3:
                    preco = preco + (8.00 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Arroz - R$" + preco);
                    break;
                case 4:
                    preco = preco + (4.00 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Café - R$" + preco);
                    break;
                case 5:
                    preco = preco + (2.99 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Leite - R$" + preco);
                    break;

            }

            jLabelQuantidade.setText("Quantidade permitida: " + (quantidadePermitida = (quantidadePermitida - 1)));

            if (jList1.getSelectedValue().equals("") || jComboBoxUnidades.getSelectedItem().toString().equals("")) {
                try {

                    JOptionPane.showMessageDialog(null, "Por favor, selecione os Produtos e a quantidade!", "Erro", JOptionPane.ERROR_MESSAGE);

                } catch (Exception e) {

                }
            }
        }


    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed

        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();

        model1.addRow(new Object[]{jList1.getSelectedValue(), jComboBoxUnidades.getSelectedItem()});
        


    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
      DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        if (jTable1.getSelectedRow() >= 0){
            dtm.removeRow(jTable1.getSelectedRow());
            jTable1.setModel(dtm);
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }

        jComboBoxUnidades.setSelectedIndex(0);


    }//GEN-LAST:event_jButtonDeletarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxUnidades;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelUnidades;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanelJanela;
    private javax.swing.JScrollPane jScrollPaneCompras;
    private javax.swing.JScrollPane jScrollPaneProdutos;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
