/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mca.view;

import br.com.mca.controller.ClienteController;
import br.com.mca.model.Cliente;
import br.com.mca.util.ConnectionFactory;
import br.com.mca.util.OperacoesCRUD;
import br.com.mca.util.Util;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaoa
 */
public class ClienteView extends javax.swing.JFrame {
    
    public Integer operacao;
    private String sexo;
    private DefaultTableModel model;
    
    //Variáveis em tempo de execução
    
    private Integer codigo;
    private String nomeCliente;
    
    
    public ClienteView() {
        initComponents();
        
        painelBotoesAcao.setVisible(false);
        
        carregarDadosTabela();
        
        limparCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBtnAcoesPrincipais = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        rbFeminino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        txtDtNasc = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        painelBotoesAcao = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de clientes");

        painelBtnAcoesPrincipais.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBtnAcoesPrincipaisLayout = new javax.swing.GroupLayout(painelBtnAcoesPrincipais);
        painelBtnAcoesPrincipais.setLayout(painelBtnAcoesPrincipaisLayout);
        painelBtnAcoesPrincipaisLayout.setHorizontalGroup(
            painelBtnAcoesPrincipaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBtnAcoesPrincipaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelBtnAcoesPrincipaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        painelBtnAcoesPrincipaisLayout.setVerticalGroup(
            painelBtnAcoesPrincipaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBtnAcoesPrincipaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNome.setEditable(false);
        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCPF.setEditable(false);
        txtCPF.setEnabled(false);

        txtEndereco.setEditable(false);
        txtEndereco.setEnabled(false);
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo:");

        jLabel2.setText("CPF");

        jLabel1.setText("Nome:");

        jLabel4.setText("Data de Nasc.");

        jLabel5.setText("Telefone");

        jLabel6.setText("Endereço");

        txtTelefone.setEditable(false);
        txtTelefone.setEnabled(false);

        rbFeminino.setText("Feminino");
        rbFeminino.setEnabled(false);
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        rbMasculino.setText("Masculino");
        rbMasculino.setEnabled(false);
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(rbFeminino)
                .addGap(58, 58, 58))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(rbMasculino)
                    .addContainerGap(164, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rbFeminino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(rbMasculino)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        txtDtNasc.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(432, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(259, Short.MAX_VALUE)))
        );

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Sexo", "Data de Nasc.", "Telefone"
            }
        ));
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesAcaoLayout = new javax.swing.GroupLayout(painelBotoesAcao);
        painelBotoesAcao.setLayout(painelBotoesAcaoLayout);
        painelBotoesAcaoLayout.setHorizontalGroup(
            painelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesAcaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesAcaoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(painelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        painelBotoesAcaoLayout.setVerticalGroup(
            painelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelBtnAcoesPrincipais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(painelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelBtnAcoesPrincipais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(painelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        operacao = OperacoesCRUD.EDITAR.getOperacao();
        
        if (tabelaCliente.getSelectedRow() == -1){
            if(tabelaCliente.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A tabela está vazia!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Um cliente deve ser selecionado!");
            }
        }
        else{
            // Quando um cliente for selecionado
            btnExcluir.setEnabled(false);
            btnNovo.setEnabled(false);  
            painelBotoesAcao.setVisible(true);
            btnSalvar.setVisible(false);
            btnAtualizar.setEnabled(true);
            btnAtualizar.setVisible(true);
            btnCancelar.setEnabled(true);
            
            abrirCampos(); 
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        operacao = OperacoesCRUD.NOVO.getOperacao();
        btnEditar.setEnabled(false);
        btnAtualizar.setVisible(false);
        btnExcluir.setEnabled(false);
        
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnSalvar.setVisible(true);
        btnNovo.setEnabled(false);
        
        painelBotoesAcao.setVisible(true);
        
        abrirCampos();
        limparCampos();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        gravarAtualizarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        gravarAtualizarDados();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        rbFeminino.setSelected(false);
        
        sexo = rbMasculino.getText();
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        rbMasculino.setSelected(false);
        sexo = rbFeminino.getText();
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        //recupera informações da tabela
        
        ListSelectionModel tableSelectionModel = tabelaCliente.getSelectionModel();
        
        // refresh - limpeza do cache da tabela
        tabelaCliente.setSelectionModel(tableSelectionModel);
        
        //armazena a linha selectionada nas variáveis de instância para utilizar nas operações
        // de atualização e exclusão
        setCodigo(Integer.parseInt(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString()));
        setNomeCliente(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 1).toString());
        
        
        String rowCpf = tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 2).toString();
        
        String rowSexo = tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 3).toString();
        String rowTelefone = tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 5).toString();
        //String rowEndereco = tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 6).toString();
        
        txtNome.setText(getNomeCliente());
        txtCPF.setText(rowCpf);
        
        getSexoSelecionado(rowSexo);
        
        txtDtNasc.setDate(Util.convertToDate(
                           tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 4).toString()
                           ));
        
        txtTelefone.setText(rowTelefone);
        
        txtEndereco.setText(retornaEndereco(getCodigo()));
        
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnNovo.setEnabled(true);
      
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        
        painelBotoesAcao.setVisible(false);
        
        fecharCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaCliente.getSelectedRow() == -1){
            if(tabelaCliente.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A tabela está vazia!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Um cliente deve ser selecionado!");
            }
        }
        else{
            // Quando um cliente for selecionado
            
            btnNovo.setEnabled(false);  
            painelBotoesAcao.setVisible(true);
            btnSalvar.setVisible(false);
            btnAtualizar.setEnabled(false);
            btnAtualizar.setVisible(true);
            btnCancelar.setEnabled(true);
            
            excluirDados();
            
            limparCampos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBotoesAcao;
    private javax.swing.JPanel painelBtnAcoesPrincipais;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtCPF;
    private com.toedter.calendar.JDateChooser txtDtNasc;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void gravarAtualizarDados() {
        
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        Date dtNasc = new Date(txtDtNasc.getDate().getTime());
        String endereco = txtEndereco.getText();
        String telefone = txtTelefone.getText();
        
        
        Cliente cliente  = new Cliente();
        
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setNascimento(dtNasc);
        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);
        cliente.setSexo(formatarCampoSexo(sexo));
        
        
        ClienteController clienteController = new ClienteController();
        try {
             
            if (operacao == OperacoesCRUD.NOVO.getOperacao()){
                clienteController.cadastrar(cliente);
                model.addRow(new Object[]{clienteController.getCodigo(cliente),
                            nome, cpf, sexo, Util.convertToString(cliente.getNascimento()), telefone });
                limparCampos();
            }
            else if(operacao == OperacoesCRUD.EDITAR.getOperacao()){
                cliente.setCodigo(getCodigo());
                //chamada do controller para realizar a persistência
                
                clienteController.atualizar(cliente);
                
                //recuperar as informações inseridas nos campos e atualizar as linhas da tabela
                
                model.setValueAt(nome, tabelaCliente.getSelectedRow(), 1);
                model.setValueAt(cpf, tabelaCliente.getSelectedRow(), 2);
                model.setValueAt(sexo, tabelaCliente.getSelectedRow(), 3);
                model.setValueAt(Util.convertToString(dtNasc), tabelaCliente.getSelectedRow(), 4);
                model.setValueAt(telefone,  tabelaCliente.getSelectedRow(), 5);
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    private void abrirCampos() {
        txtNome.setEditable(true);
        txtNome.setEnabled(true);
        
        txtCPF.setEditable(true);
        txtCPF.setEnabled(true);
        
        txtDtNasc.setEnabled(true);
        
        txtEndereco.setEditable(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEditable(true);
        txtTelefone.setEnabled(true);
        
        rbMasculino.setEnabled(true);
        rbFeminino.setEnabled(true);
    }

    
    private void limparCampos(){
        txtNome.setText("");
        txtCPF.setText("");
        txtDtNasc.setDate(null);
        txtEndereco.setText("");
        txtTelefone.setText("");
        
        rbMasculino.setSelected(false);
        rbFeminino.setSelected(false);
    }
    
    private String formatarCampoSexo(String sexo) {
        if (sexo == "Masculino")
            sexo = "M";
        else
            sexo = "F";
        
        return sexo;
    }
    
    private void carregarDadosTabela(){
        String sql = "select cli_cod, cli_nome, cli_cpf, cli_sexo,"
                + " cli_dt_nasc, cli_telefone, cli_endereco from cliente order by cli_cod";
        
        try {
            Connection conn = ConnectionFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            tabelaCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            
            tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(180);
            tabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabelaCliente.getColumnModel().getColumn(5).setPreferredWidth(100);
            //tabelaCliente.getColumnModel().getColumn(6).setPreferredWidth(180);
           
            model = (DefaultTableModel) tabelaCliente.getModel();
            
            while(rs.next()){
                Integer rsCodigo = rs.getInt("cli_cod");
                String rsNome = rs.getString("cli_nome");
                String rsCpf = rs.getString("cli_cpf");
                String rsSexo = rs.getString("cli_sexo");
                if(rsSexo.equals("M"))
                    rsSexo = "Masculino";
                else
                    rsSexo = "Feminino";
                
                Date rsNasc = rs.getDate("cli_dt_nasc");
                String rsTelefone = rs.getString("cli_telefone");
                //String rsEndereco = rs.getString("cli_endereco");
                //Preenche os dados na JTable que estão retornando do  banco de dados
                
                model.addRow(new Object[]{rsCodigo, rsNome, rsCpf, rsSexo, Util.convertToString(rsNasc), rsTelefone});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    private void getSexoSelecionado(String rowSexo) {
        if(rowSexo.equals("Masculino")){
            rbMasculino.setSelected(true);
            rbFeminino.setSelected(false);
        }
        else{
            rbMasculino.setSelected(false);
            rbFeminino.setSelected(true);
        }
    }

    private String retornaEndereco(Integer codigo) {
        String sql = "select cli_endereco from cliente where cli_cod = ?";
        
        try {
            Connection conn = ConnectionFactory.getConexao();
            PreparedStatement ps = null;
            String rsEndereco = null;
            try {
                ps = conn.prepareStatement(sql);
                ps.setString(1, codigo.toString());
                
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                   rsEndereco = rs.getString("cli_endereco");
                }
                
                return rsEndereco;
            }
            finally{
                try{
                    ConnectionFactory.closeConnection(conn, ps);
                    
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }

    private void fecharCampos() {
       
        txtNome.setEnabled(false);
        
       
        txtCPF.setEnabled(false);
        
        txtDtNasc.setEnabled(false);
        
       
        txtEndereco.setEnabled(false);
       
        
        txtTelefone.setEnabled(false);
        
        rbMasculino.setEnabled(false);
        rbFeminino.setEnabled(false);
    }

    private void excluirDados() {
        String msg = "Excluir o cliente " + getNomeCliente() + " ?";
        
        int opcaoEscolhida = JOptionPane.showConfirmDialog(null, msg, "Exclusão", JOptionPane.YES_NO_OPTION);
        
        if (opcaoEscolhida == JOptionPane.YES_OPTION){
            Cliente cliente = new Cliente();
            cliente.setCodigo(getCodigo());

            try {
                ClienteController clienteController = new ClienteController();

                clienteController.excluir(cliente);
                
                //remover a linha selecionada da tabela
                model.removeRow(tabelaCliente.getSelectedRow());
                JOptionPane.showMessageDialog(null, "O cliente " + getNomeCliente() +
                        " foi excluido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            catch (Exception e2) {
                e2.printStackTrace();
                
            }
        }
        
        
        
    }
    
}
