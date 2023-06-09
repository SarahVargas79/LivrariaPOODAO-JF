/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Editora;
import services.EditoraServicos;
import services.ServicosFactory;
import util.Validadores;

/**
 *
 * @author 182010049
 */
public class jfEditora extends javax.swing.JFrame {

    /**
     * Creates new form jfEditora
     */
    public jfEditora() {
        initComponents();
        addRowToTable();
        jbEditDeletar.setVisible(false);
        this.setLocationRelativeTo(null);//Para centralizar a janela
    }

    public boolean validaInputs() {
        if (jtfEditNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher nome!");
            jtfEditNome.requestFocus();
            return false;
        } else if (jtfEditCNPJ.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher CNPJ!");
            jtfEditCNPJ.requestFocus();
            return false;
        } else if (jftfEditTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher telefone!");
            jftfEditTelefone.requestFocus();
            return false;
        } else if (jtfEditEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher endereço!");
            jtfEditEndereco.requestFocus();
            return false;
        } else if (jtfEditGerente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preeencher gerente!");
            jtfEditGerente.requestFocus();
            return false;
        }
        return true;
    }//fim validaInputs

    public void addRowToTable() {//Pegar o model limpar essa tabela e popular a mesma, se não fizer isso ela fica estática.
        DefaultTableModel model = (DefaultTableModel) jtEditoras.getModel();
        model.getDataVector().removeAllElements();//Remove todas as linhas.
        model.fireTableDataChanged();
        Object rowData[] = new Object[5];//rowData é o vetor para popular a linha da tabela por coluna
        EditoraServicos editoraS = ServicosFactory.getEditoraServicos();
        for (Editora e : editoraS.getEditoras()) {//O vetor sempre começa em 0
            rowData[0] = e.getNomeEditora();
            rowData[1] = e.getCnpj();
            rowData[2] = e.getTelefone();
            rowData[3] = e.getEndereco();
            rowData[4] = e.getGerente();
            model.addRow(rowData);//Add para popular.
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfEditEndereco = new javax.swing.JTextField();
        jtfEditCNPJ = new javax.swing.JTextField();
        jftfEditTelefone = new javax.swing.JFormattedTextField();
        jtfEditNome = new javax.swing.JTextField();
        jtfEditGerente = new javax.swing.JTextField();
        jbEditLimpar = new javax.swing.JButton();
        jbEditEditar = new javax.swing.JButton();
        jbEditSalvar = new javax.swing.JButton();
        jbEditFechar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEditoras = new javax.swing.JTable();
        jbEditDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerência Editora");

        jPanel1.setBackground(new java.awt.Color(163, 0, 163));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerência Editora");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("*Nome: ");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("*CNPJ:");

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("*Endereço:");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("*Gerente:");

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("*Telefone:");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jtfEditEndereco.setBackground(new java.awt.Color(255, 255, 255));
        jtfEditEndereco.setToolTipText("Informe endereço completo");

        jtfEditCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        jtfEditCNPJ.setToolTipText("Informe somente números");
        jtfEditCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfEditCNPJFocusLost(evt);
            }
        });
        jtfEditCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEditCNPJActionPerformed(evt);
            }
        });
        jtfEditCNPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEditCNPJKeyTyped(evt);
            }
        });

        jftfEditTelefone.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jftfEditTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfEditTelefone.setToolTipText("Informe somente números");

        jtfEditNome.setBackground(new java.awt.Color(255, 255, 255));
        jtfEditNome.setToolTipText("Informe o nome completo");
        jtfEditNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEditNomeKeyTyped(evt);
            }
        });

        jtfEditGerente.setBackground(new java.awt.Color(255, 255, 255));
        jtfEditGerente.setToolTipText("Informe o nome completo");
        jtfEditGerente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEditGerenteKeyTyped(evt);
            }
        });

        jbEditLimpar.setBackground(new java.awt.Color(255, 255, 255));
        jbEditLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEditLimpar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditLimpar.setMnemonic('L');
        jbEditLimpar.setText("Limpar");
        jbEditLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditLimparActionPerformed(evt);
            }
        });

        jbEditEditar.setBackground(new java.awt.Color(255, 255, 255));
        jbEditEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEditEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditEditar.setMnemonic('E');
        jbEditEditar.setText("Editar");
        jbEditEditar.setEnabled(false);
        jbEditEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditEditarActionPerformed(evt);
            }
        });

        jbEditSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jbEditSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEditSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditSalvar.setMnemonic('S');
        jbEditSalvar.setText("Salvar");
        jbEditSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditSalvarActionPerformed(evt);
            }
        });

        jbEditFechar.setBackground(new java.awt.Color(255, 255, 255));
        jbEditFechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEditFechar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditFechar.setMnemonic('F');
        jbEditFechar.setText("Fechar");
        jbEditFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditFecharActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jtEditoras.setBackground(new java.awt.Color(255, 255, 255));
        jtEditoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "CNPJ", "Telefone", "Endereço", "Gerente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEditoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEditorasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEditoras);

        jbEditDeletar.setBackground(new java.awt.Color(255, 255, 255));
        jbEditDeletar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEditDeletar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditDeletar.setMnemonic('D');
        jbEditDeletar.setText("Deletar");
        jbEditDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEditEndereco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfEditCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftfEditTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfEditNome)
                            .addComponent(jtfEditGerente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbEditLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEditEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEditDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEditSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEditFechar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfEditNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfEditCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftfEditTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfEditEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfEditGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditLimpar)
                    .addComponent(jbEditEditar)
                    .addComponent(jbEditFechar)
                    .addComponent(jbEditSalvar)
                    .addComponent(jbEditDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEditCNPJKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEditCNPJKeyTyped
        // TODO add your handling code here:
        String number = "0123456789";
        if (jtfEditCNPJ.getText().length() < 14) {
            if (!number.contains(evt.getKeyChar() + "")) {//evento(evt) a tecla que foi teclada.
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfEditCNPJKeyTyped

    private void jtfEditCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEditCNPJFocusLost
        // TODO add your handling code here:
        if (!jtfEditCNPJ.getText().equals("")) {
            if (!Validadores.isCNPJ(jtfEditCNPJ.getText())) {
                JOptionPane.showMessageDialog(this, "CNPJ inválido.", "Erro CNPJ", JOptionPane.ERROR_MESSAGE);

                jtfEditCNPJ.requestFocus();
            }
        }
    }//GEN-LAST:event_jtfEditCNPJFocusLost

    private void jtfEditNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEditNomeKeyTyped
        // TODO add your handling code here:
        String nletras = "0123456789<>:?/~^}][{´`=+-_!|'\'@#$%¨&*()²³£¢¬§º°ª";
        if (nletras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfEditNomeKeyTyped

    private void jtfEditGerenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEditGerenteKeyTyped
        // TODO add your handling code here:
        String nletras = "0123456789<>:?/~^}][{´`=+-_!|'\'@#$%¨&*()²³£¢¬§º°ª";
        if (nletras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfEditGerenteKeyTyped

    private void jbEditLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditLimparActionPerformed
        // TODO add your handling code here:
        if (jbEditLimpar.getText().equals("Limpar")) {
            limparCampos();
        } else {
            limparCampos();
            jbEditLimpar.setText("Limpar");
            jbEditSalvar.setText("Salvar");
            jbEditEditar.setEnabled(false);
            jtfEditCNPJ.setEnabled(true);
            jbEditDeletar.setVisible(false);
        }
    }//GEN-LAST:event_jbEditLimparActionPerformed

    public void limparCampos() {
        jtfEditNome.setText("");
        jtfEditCNPJ.setText("");
        jftfEditTelefone.setText("");
        jtfEditEndereco.setText("");
        jtfEditGerente.setText("");
        jtfEditNome.requestFocus();
    }

    private void jtfEditCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEditCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEditCNPJActionPerformed

    private void jtEditorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEditorasMouseClicked
        // TODO add your handling code here:
        jbEditEditar.setEnabled(true);
        jbEditDeletar.setVisible(true);
    }//GEN-LAST:event_jtEditorasMouseClicked

    private void jbEditFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbEditFecharActionPerformed

    private void jbEditSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditSalvarActionPerformed
        // TODO add your handling code here:
        if (validaInputs()) {
            //Pegar dados da tela para salvar
            int idEditora = 0;
            String nomeEditora = jtfEditNome.getText().toUpperCase();
            String cnpj = jtfEditCNPJ.getText();
            String endereco = jtfEditEndereco.getText().toUpperCase();
            String telefone = jftfEditTelefone.getText();
            String gerente = jtfEditGerente.getText().toUpperCase();
            EditoraServicos editoraS = ServicosFactory.getEditoraServicos();

            Editora e = new Editora(idEditora, nomeEditora, cnpj, endereco, telefone, gerente);
            if (jbEditSalvar.getText().equals("Salvar")) {
                editoraS.cadEditora(e);
            } else {
                editoraS.atualizarEditora(e);
                jbEditLimpar.doClick();
            }
            limparCampos();
            addRowToTable();
        }
    }//GEN-LAST:event_jbEditSalvarActionPerformed

    private void jbEditEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditEditarActionPerformed
        //ActionPerformed ação de clicar
        jbEditSalvar.setText("Confirmar");
        jtfEditCNPJ.setEnabled(false);
        jbEditLimpar.setText("Cancelar");
        jbEditDeletar.setVisible(false);
        
        //Pegando dados da tabela e add em variaveis locais.
        int linha;
        linha = jtEditoras.getSelectedRow();
        String nome = (String) jtEditoras.getValueAt(linha, 0);
        String cnpj = (String) jtEditoras.getValueAt(linha, 1);
        String telefone = (String) jtEditoras.getValueAt(linha, 2);
        String endereco = (String) jtEditoras.getValueAt(linha, 3);
        String gerente = (String) jtEditoras.getValueAt(linha, 4);
        //Carregar dados da tabela no form
        jtfEditNome.setText(nome);
        jtfEditCNPJ.setText(cnpj);
        jftfEditTelefone.setText(telefone);
        jtfEditEndereco.setText(endereco);
        jtfEditGerente.setText(gerente);
        jtfEditNome.requestFocus();
    }//GEN-LAST:event_jbEditEditarActionPerformed

    private void jbEditDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditDeletarActionPerformed
        // TODO add your handling code here:
        int linha;
        String cnpj;
        linha = jtEditoras.getSelectedRow();
        cnpj = (String) jtEditoras.getValueAt(linha, 1);
        EditoraServicos editoraS = ServicosFactory.getEditoraServicos();
        Object[] resp = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this, "Deseja realmente deletar este CNPJ? ", "Deletar", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, resp, resp[0]);
        if (resposta == 0) {
            editoraS.deletarEditora(cnpj);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Editora deletada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Ok, entendo sua descisão!");
        }
        jbEditDeletar.setVisible(false);
    }//GEN-LAST:event_jbEditDeletarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbEditDeletar;
    private javax.swing.JButton jbEditEditar;
    private javax.swing.JButton jbEditFechar;
    private javax.swing.JButton jbEditLimpar;
    private javax.swing.JButton jbEditSalvar;
    private javax.swing.JFormattedTextField jftfEditTelefone;
    private javax.swing.JTable jtEditoras;
    private javax.swing.JTextField jtfEditCNPJ;
    private javax.swing.JTextField jtfEditEndereco;
    private javax.swing.JTextField jtfEditGerente;
    private javax.swing.JTextField jtfEditNome;
    // End of variables declaration//GEN-END:variables
}
