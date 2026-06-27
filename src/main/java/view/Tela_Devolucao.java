package view;

import dao.jogoDAO;
import model.Jogo;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Tela_Devolucao extends javax.swing.JFrame {
    private jogoDAO dao = new jogoDAO();
    private DefaultListModel<String> listModel;
    
    public Tela_Devolucao() {
        initComponents();
        listModel = new DefaultListModel<>();
        list_Devolucao.setModel(listModel);
        carregarJogosEmprestados();
    }

    private void carregarJogosEmprestados() {
        listModel.clear();
        // Usa o filtro por usuário da sessão
        ArrayList<Jogo> jogos = dao.listarEmprestadosPorUsuario(model.sessao.emailUsuarioLogado);
        for (Jogo j : jogos) {
            listModel.addElement(j.getTitulo());
        }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list_Devolucao = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txt_Pesquisar = new javax.swing.JTextField();
        btn_Pesquisar = new javax.swing.JButton();
        btn_FazerDevolucao = new javax.swing.JButton();
        btn_Voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list_Devolucao.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_Devolucao);

        jLabel1.setText("Selecione o ítem que deseja devolver:");

        btn_Pesquisar.setText("Pesquisar");
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });

        btn_FazerDevolucao.setText("Fazer devolução");
        btn_FazerDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FazerDevolucaoActionPerformed(evt);
            }
        });

        btn_Voltar.setText("Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        jLabel2.setText("SEUS JOGOS EMPRESTADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Voltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_FazerDevolucao))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Pesquisar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(289, 289, 289))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Pesquisar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Voltar)
                    .addComponent(btn_FazerDevolucao))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
        String termoPesquisa = txt_Pesquisar.getText().toLowerCase();
        listModel.clear();
        ArrayList<Jogo> jogos = dao.listarPorStatus("Emprestado");
        for (Jogo j : jogos) {
            if (j.getTitulo().toLowerCase().contains(termoPesquisa)) {
                listModel.addElement(j.getTitulo());
            }
        }
    }//GEN-LAST:event_btn_PesquisarActionPerformed

    private void btn_FazerDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FazerDevolucaoActionPerformed
        String jogoSelecionado = list_Devolucao.getSelectedValue();

        if (jogoSelecionado != null) {
            dao.atualizarStatus(jogoSelecionado, "Disponível");
            carregarJogosEmprestados();
            JOptionPane.showMessageDialog(this, "Seu item foi devolvido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item na lista para devolver.");
        }
    }//GEN-LAST:event_btn_FazerDevolucaoActionPerformed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        Tela_Principal telaPrincipal = new Tela_Principal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Devolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Devolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Devolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Devolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Devolucao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_FazerDevolucao;
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_Devolucao;
    private javax.swing.JTextField txt_Pesquisar;
    // End of variables declaration//GEN-END:variables
}
