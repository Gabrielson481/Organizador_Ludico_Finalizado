package view;

import dao.jogoDAO;
import model.Jogo;
import model.sessao;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tela_Principal extends javax.swing.JFrame {

    private jogoDAO dao = new jogoDAO();
    private javax.swing.table.DefaultTableModel tableModel;
    
    public Tela_Principal() {
        initComponents();
        // Define as colunas da tabela
        tableModel = new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Título", "Idade Recomendada", "Modalidade"}
        );
        jTable1.setModel(tableModel);
        carregarJogosDisponiveis();
    }

    private void carregarJogosDisponiveis() {
        tableModel.setRowCount(0); // Limpa a tabela
        ArrayList<Jogo> jogos = dao.listarPorStatus("Disponível");
        for (Jogo j : jogos) {
            tableModel.addRow(new Object[]{j.getTitulo(), j.getIdadeRecomendada(), j.getModalidade()});
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btn_FazerEmprestimo = new javax.swing.JButton();
        btn_GerenciarJogos = new javax.swing.JButton();
        btn_Voltar = new javax.swing.JButton();
        btn_FazerDevolucao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_Pesquisar = new javax.swing.JButton();
        txt_Pesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ORGANIZADOR LUDICO");

        btn_FazerEmprestimo.setText("Fazer empréstimo");
        btn_FazerEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FazerEmprestimoActionPerformed(evt);
            }
        });

        btn_GerenciarJogos.setText("Gerenciar jogos*");
        btn_GerenciarJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GerenciarJogosActionPerformed(evt);
            }
        });

        btn_Voltar.setText("Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPrincipal(evt);
            }
        });

        btn_FazerDevolucao.setText("Fazer devolução");
        btn_FazerDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FazerDevolucaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquise o item desejado:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Pesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_Voltar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_GerenciarJogos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_FazerDevolucao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_FazerEmprestimo))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Pesquisar)
                    .addComponent(txt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_GerenciarJogos)
                    .addComponent(btn_Voltar)
                    .addComponent(btn_FazerEmprestimo)
                    .addComponent(btn_FazerDevolucao))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GerenciarJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GerenciarJogosActionPerformed
    if (sessao.isMembroLogado) {
            Tela_GerenciamentoDeJogos telaGerenciamento = new Tela_GerenciamentoDeJogos();
            telaGerenciamento.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Acesso Negado: Apenas membros do projeto têm permissão para acessar esta área.");
        }
    }//GEN-LAST:event_btn_GerenciarJogosActionPerformed

    private void btnVoltarPrincipal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPrincipal
        Tela_Inicial telaInicial = new Tela_Inicial();
        telaInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarPrincipal

    private void btn_FazerDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FazerDevolucaoActionPerformed
        Tela_Devolucao telaDevolucao = new Tela_Devolucao();
        telaDevolucao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_FazerDevolucaoActionPerformed

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
        String termoPesquisa = txt_Pesquisar.getText().toLowerCase();
        tableModel.setRowCount(0); // Limpa a tabela
        ArrayList<Jogo> jogos = dao.listarPorStatus("Disponível");
        for (Jogo j : jogos) {
            if (termoPesquisa.isEmpty() || j.getTitulo().toLowerCase().contains(termoPesquisa)) {
                tableModel.addRow(new Object[]{j.getTitulo(), j.getIdadeRecomendada(), j.getModalidade()});
            }
        }
    }//GEN-LAST:event_btn_PesquisarActionPerformed

    private void btn_FazerEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FazerEmprestimoActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        
        if (linhaSelecionada != -1) {
            // Pega o título da coluna 0 (Título)
            String jogoSelecionado = jTable1.getValueAt(linhaSelecionada, 0).toString();
            
            dao.atualizarStatusComUsuario(jogoSelecionado, "Emprestado", model.sessao.emailUsuarioLogado);
            
            carregarJogosDisponiveis();
            JOptionPane.showMessageDialog(this, "Obrigado por utilizar nosso acervo! Item emprestado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um item na tabela para realizar o empréstimo.");
        }
    }//GEN-LAST:event_btn_FazerEmprestimoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_FazerDevolucao;
    private javax.swing.JButton btn_FazerEmprestimo;
    private javax.swing.JButton btn_GerenciarJogos;
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_Pesquisar;
    // End of variables declaration//GEN-END:variables
}
