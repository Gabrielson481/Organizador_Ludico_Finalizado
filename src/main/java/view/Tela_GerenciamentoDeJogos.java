package view;

import dao.jogoDAO;
import model.Jogo;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tela_GerenciamentoDeJogos extends javax.swing.JFrame {
    private jogoDAO jogoDAO = new jogoDAO();
    private javax.swing.table.DefaultTableModel tableModel;
    
    public Tela_GerenciamentoDeJogos() {
        initComponents();
        carregarJogosNaTabela();
    }

    private void carregarJogosNaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); // Limpa a tabela
        ArrayList<Jogo> jogos = jogoDAO.listarTodos();

        for (Jogo j : jogos) {
            modelo.addRow(new Object[]{j.getTitulo(), j.getModalidade(), j.getIdadeRecomendada()});
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_CadastrarJogo = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_Pesquisar = new javax.swing.JButton();
        txt_Pesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_CadastrarJogo.setText("Cadastrar");
        btn_CadastrarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarJogoActionPerformed(evt);
            }
        });

        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        jLabel1.setText("ÁREA DOS MEMBROS");

        btn_Voltar.setText("Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarGerenciador(evt);
            }
        });

        jLabel2.setText("Pesquise um jogo:");

        btn_Pesquisar.setText("Pesquisar");
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Modalidade", "Idade Recomendada"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Voltar)
                                .addGap(303, 303, 303)
                                .addComponent(btn_Editar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Excluir)
                                .addGap(18, 18, 18)
                                .addComponent(btn_CadastrarJogo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Pesquisar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel1)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Pesquisar)
                        .addComponent(txt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Voltar)
                    .addComponent(btn_CadastrarJogo)
                    .addComponent(btn_Excluir)
                    .addComponent(btn_Editar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarGerenciador(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarGerenciador

        Tela_Principal telaPrincipal = new Tela_Principal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarGerenciador

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
String termo = txt_Pesquisar.getText().toLowerCase();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        
        ArrayList<Jogo> jogos = jogoDAO.listarTodos();
        for (Jogo j : jogos) {
            if (termo.isEmpty() || j.getTitulo().toLowerCase().contains(termo)) {
                modelo.addRow(new Object[]{j.getTitulo(), j.getModalidade(), j.getIdadeRecomendada()});
            }
        }
    }//GEN-LAST:event_btn_PesquisarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        int linha = jTable1.getSelectedRow();
        if (linha != -1) {
            // Pega o título da coluna 0
            String titulo = jTable1.getValueAt(linha, 0).toString();
            jogoDAO.excluirPorTitulo(titulo);
            carregarJogosNaTabela();
            JOptionPane.showMessageDialog(this, "Jogo excluído!");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um jogo na tabela.");
        }
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_CadastrarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarJogoActionPerformed
        Tela_Cadastro_Jogos telaCadastro = new Tela_Cadastro_Jogos();
        telaCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_CadastrarJogoActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        int linha = jTable1.getSelectedRow();
        if (linha != -1) {
            String titulo = jTable1.getValueAt(linha, 0).toString();
            model.Jogo jogoParaEditar = jogoDAO.buscarPorTitulo(titulo);
            
            Tela_Editar telaEditar = new Tela_Editar(jogoParaEditar);
            telaEditar.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um jogo na tabela!");
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_GerenciamentoDeJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_GerenciamentoDeJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_GerenciamentoDeJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_GerenciamentoDeJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GerenciamentoDeJogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CadastrarJogo;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_Pesquisar;
    // End of variables declaration//GEN-END:variables
}
