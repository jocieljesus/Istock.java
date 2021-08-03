/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jociel
 */
public class listarVIEW extends javax.swing.JFrame {

    /**
     * Creates new form listarView
     */
    public listarVIEW() {
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
        btnListarProdutos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnNovoCadastro = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCarregar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnExluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Produtos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnListarProdutos.setBackground(new java.awt.Color(51, 51, 51));
        btnListarProdutos.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnListarProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnListarProdutos.setText("Listar Produtos");
        btnListarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProdutosActionPerformed(evt);
            }
        });

        tabelaProduto.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CÓDIGO", "DESCRIÇÃO", "CATEGORIA", "QUANTIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProduto.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaProduto.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(tabelaProduto);
        tabelaProduto.getAccessibleContext().setAccessibleName("");

        btnNovoCadastro.setBackground(new java.awt.Color(51, 51, 51));
        btnNovoCadastro.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnNovoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCadastro.setText("Novo Cadastro");
        btnNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCadastroActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(51, 51, 51));
        btnSair.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ISTOCK");

        btnCarregar.setBackground(new java.awt.Color(51, 51, 51));
        btnCarregar.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnCarregar.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregar.setText("Carregar");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtQuantidade.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel5.setText("Id");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setText("Código");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel4.setText("Descrição");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel6.setText("Quantidade");

        txtId.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnExluir.setBackground(new java.awt.Color(51, 51, 51));
        btnExluir.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnExluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExluir.setText("Exluir");
        btnExluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExluirActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(51, 51, 51));
        btnAlterar.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnListarProdutos)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCarregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExluir)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarProdutos)
                    .addComponent(btnSair)
                    .addComponent(btnNovoCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregar)
                    .addComponent(btnExluir)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProdutosActionPerformed
        listarProdutos();
    }//GEN-LAST:event_btnListarProdutosActionPerformed

    private void btnNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroActionPerformed
        cadastrarVIEW objcadastrar = new cadastrarVIEW();

        objcadastrar.setVisible(true);

        dispose();

    }//GEN-LAST:event_btnNovoCadastroActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        loginVIEW objlogin = new loginVIEW();
        objlogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        carregarProduto();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnExluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExluirActionPerformed

        try {
            excluirProduto();
            listarProdutos();
            limparCampos();
            JOptionPane.showMessageDialog(null, "Produto Excluir com sucesso! ");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Por favor, carregue os campos antes de tentar apagar. ");

        }
    }//GEN-LAST:event_btnExluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        try {
            alterarProduto();
            listarProdutos();
            limparCampos();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso! ");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Por favor, carregue os campos antes de tentar alterar. ");

        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

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
            java.util.logging.Logger.getLogger(listarVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listarVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listarVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listarVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listarVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnExluir;
    private javax.swing.JButton btnListarProdutos;
    private javax.swing.JButton btnNovoCadastro;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

    private void listarProdutos() {
        try {
            ProdutoDAO objprodutodao = new ProdutoDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
            model.setNumRows(0);

            ArrayList<ProdutoDTO> lista = objprodutodao.listarProduto();

            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getCodigo(),
                    lista.get(i).getNome(),
                    lista.get(i).getNomeCategoria(),
                    lista.get(i).getQuantidade()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar produtos" + erro);
        }
    }

    private void carregarProduto() {
        try {
            int setar = tabelaProduto.getSelectedRow();
            txtId.setText(tabelaProduto.getModel().getValueAt(setar, 0).toString());
            txtCodigo.setText(tabelaProduto.getModel().getValueAt(setar, 1).toString());
            txtNome.setText(tabelaProduto.getModel().getValueAt(setar, 2).toString());
            txtQuantidade.setText(tabelaProduto.getModel().getValueAt(setar, 4).toString());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um produto que deseja carregar.");

        }

    }

    private void alterarProduto() {

        int id, quantidade;
        String nome;

        id = Integer.parseInt(txtId.getText());
        nome = txtNome.getText();
        quantidade = Integer.parseInt(txtQuantidade.getText());

        ProdutoDTO objprodutodto = new ProdutoDTO();
        objprodutodto.setId(id);
        objprodutodto.setNome(nome);
        objprodutodto.setQuantidade(quantidade);

        ProdutoDAO objprodutoDAO = new ProdutoDAO();
        objprodutoDAO.alterarProduto(objprodutodto);
    }

    private void limparCampos() {
        txtId.setText("");
        txtCodigo.setText("");
        txtNome.setText("");
        txtQuantidade.setText("");
        txtCodigo.requestFocus();
    }

    private void excluirProduto() {

        int id;

        id = Integer.parseInt(txtId.getText());
        ProdutoDTO objprodutodto = new ProdutoDTO();
        objprodutodto.setId(id);

        ProdutoDAO objprodutodao = new ProdutoDAO();
        objprodutodao.excluirProduto(objprodutodto);

    }

}
