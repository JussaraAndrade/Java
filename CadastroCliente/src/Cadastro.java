
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
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void validador() {

        if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jComboBox1.getSelectedItem().toString().equals("Selecione...")) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione o estado civil!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldIdade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Idade está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jComboBoxSexo.getSelectedItem().toString().equals("Selecione...")) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione o Sexo!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jTextFieldRg.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo RG está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo CPF está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jTextFieldRua.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Rua está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jTextFieldNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Número está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jTextFieldBairro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Bairro está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Cidade está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldEstado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Estado está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jTextFieldPais.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo País está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);

        } else if (jTextFieldTelefoneFixo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Telefone fixo está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldCelular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Celular está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (jTextFieldEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo E-mail está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
           
        } else {
            JOptionPane.showMessageDialog(null, "Dados salvo com sucesso! " + "\n\nPessoais:" + "\nNome: " + jTextFieldNome.getText() + "\nEstado Civil: " + jComboBox1.getSelectedItem()
                    + "\nIdade: " + jTextFieldIdade.getText() + "\nSexo: " + jComboBoxSexo.getSelectedItem()
                    + "\nRG: " + jTextFieldRg.getText() + "\nCPF: " + jTextFieldCpf.getText()
                    + "\n\nEndreço: " + "\nRua: " + jTextFieldRua.getText() + "\nNúmero: " + jTextFieldRua.getText()
                    + "\nBairro: " + jTextFieldBairro.getText() + "\nCidade: " + jTextFieldCidade.getText()
                    + "\nEstado: " + jTextFieldEstado.getText() + "\nPaís:   " + jTextFieldPais.getText()
                    + "\n\nContato:" + "\nTelefone Fixo: " + jTextFieldTelefoneFixo.getText() + "\nCelular: " + jTextFieldCelular.getText()
                    + "\nE-mail: " + jTextFieldEmail.getText()
            );

        }
        if (jTextFieldIdade.getText().length() > 0) {
            try {
                int idade = Integer.parseInt(jTextFieldIdade.getText());

            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Por favor, digite somente Números", "Erro", JOptionPane.ERROR_MESSAGE);
                jTextFieldIdade.setText("");
            }
            if (jTextFieldNumero.getText().length() > 0) {
                try {
                    
                    int numero = Integer.parseInt(jTextFieldNumero.getText());

                } catch (NumberFormatException error) {
                    JOptionPane.showMessageDialog(null, "Por favor, digite somente Números", "Erro", JOptionPane.ERROR_MESSAGE);
                    jTextFieldNumero.setText("");

                }
            }
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

        jLabel1 = new javax.swing.JLabel();
        jPanelJanelaInformações = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelIdade = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabelRg = new javax.swing.JLabel();
        jTextFieldRg = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanelJanelaEndereço = new javax.swing.JPanel();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabelPais = new javax.swing.JLabel();
        jTextFieldPais = new javax.swing.JTextField();
        jPanelContato = new javax.swing.JPanel();
        jLabelTelefoneFixo = new javax.swing.JLabel();
        jTextFieldTelefoneFixo = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelJanelaInformações.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabelNome.setText("Nome:");

        jLabelIdade.setText("Idade: ");

        jLabelSexo.setText("Sexo: ");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Feminino", "Masculino" }));

        jLabelRg.setText("RG: ");

        jLabelCpf.setText("CPF:");

        jLabelEstadoCivil.setText("Estado Civil: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Solteiro", "Casado" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJanelaInformaçõesLayout = new javax.swing.GroupLayout(jPanelJanelaInformações);
        jPanelJanelaInformações.setLayout(jPanelJanelaInformaçõesLayout);
        jPanelJanelaInformaçõesLayout.setHorizontalGroup(
            jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJanelaInformaçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelJanelaInformaçõesLayout.createSequentialGroup()
                        .addGroup(jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                    .addGroup(jPanelJanelaInformaçõesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelRg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRg)))
                .addGap(18, 18, 18)
                .addGroup(jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelJanelaInformaçõesLayout.createSequentialGroup()
                            .addComponent(jLabelSexo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxSexo, 0, 109, Short.MAX_VALUE))
                        .addGroup(jPanelJanelaInformaçõesLayout.createSequentialGroup()
                            .addComponent(jLabelCpf)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCpf)))
                    .addGroup(jPanelJanelaInformaçõesLayout.createSequentialGroup()
                        .addComponent(jLabelEstadoCivil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanelJanelaInformaçõesLayout.setVerticalGroup(
            jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJanelaInformaçõesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstadoCivil)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade)
                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexo)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelJanelaInformaçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRg)
                    .addComponent(jLabelCpf)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanelJanelaEndereço.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabelRua.setText("Rua: ");

        jLabelNumero.setText("Número:");

        jLabelBairro.setText("Bairro:");

        jLabelCidade.setText("Cidade:");

        jLabelEstado.setText("Estado:");

        jLabelPais.setText("País:");

        javax.swing.GroupLayout jPanelJanelaEndereçoLayout = new javax.swing.GroupLayout(jPanelJanelaEndereço);
        jPanelJanelaEndereço.setLayout(jPanelJanelaEndereçoLayout);
        jPanelJanelaEndereçoLayout.setHorizontalGroup(
            jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJanelaEndereçoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJanelaEndereçoLayout.createSequentialGroup()
                        .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRua)
                            .addComponent(jLabelBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanelJanelaEndereçoLayout.createSequentialGroup()
                        .addComponent(jLabelEstado)
                        .addGap(5, 5, 5)))
                .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(jTextFieldRua)))
                .addGap(30, 30, 30)
                .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelJanelaEndereçoLayout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelJanelaEndereçoLayout.createSequentialGroup()
                        .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCidade)
                            .addComponent(jLabelPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCidade)
                            .addComponent(jTextFieldPais))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelJanelaEndereçoLayout.setVerticalGroup(
            jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJanelaEndereçoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPais)
                        .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelJanelaEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEstado)
                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanelContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        jLabelTelefoneFixo.setText("Telefone Fixo: ");

        jLabelCelular.setText("Celular:");

        jLabelEmail.setText("E-mail:");

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContatoLayout = new javax.swing.GroupLayout(jPanelContato);
        jPanelContato.setLayout(jPanelContatoLayout);
        jPanelContatoLayout.setHorizontalGroup(
            jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContatoLayout.createSequentialGroup()
                        .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelContatoLayout.createSequentialGroup()
                                .addComponent(jLabelTelefoneFixo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelContatoLayout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(jPanelContatoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)))
                .addContainerGap())
        );
        jPanelContatoLayout.setVerticalGroup(
            jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefoneFixo)
                    .addComponent(jTextFieldTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSalvar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanelJanelaEndereço, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelContato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelJanelaInformações, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelJanelaInformações, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelJanelaEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

        jTextFieldBairro.setText("");
        jTextFieldCelular.setText("");
        jTextFieldCidade.setText("");
        jTextFieldCpf.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEstado.setText("");
        jTextFieldIdade.setText("");
        jTextFieldNome.setText("");
        jTextFieldNumero.setText("");
        jTextFieldPais.setText("");
        jTextFieldRg.setText("");
        jTextFieldRua.setText("");
        jTextFieldTelefoneFixo.setText("");
        jComboBoxSexo.setSelectedIndex(0);
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        JOptionPane.showMessageDialog(jPanelJanelaInformações, "Operação cancelada!");
        System.exit(0);


    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        validador();


    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefoneFixo;
    private javax.swing.JPanel jPanelContato;
    private javax.swing.JPanel jPanelJanelaEndereço;
    private javax.swing.JPanel jPanelJanelaInformações;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefoneFixo;
    // End of variables declaration//GEN-END:variables
}
