package view;

import javax.swing.JOptionPane;

public class Tela_Editar extends javax.swing.JFrame {

    private model.Jogo jogoOriginal;
    private dao.jogoDAO jogoDAO = new dao.jogoDAO();
    
    public Tela_Editar() {
        initComponents();
    }
    
    public Tela_Editar(model.Jogo jogo) {
        initComponents();
        this.jogoOriginal = jogo;
        txt_Titulo.setText(jogo.getTitulo());
        txt_IdadeRecomendada.setText(jogo.getIdadeRecomendada());
        txt_Modalidade.setText(jogo.getModalidade());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Titulo = new javax.swing.JTextField();
        txt_IdadeRecomendada = new javax.swing.JTextField();
        txt_Modalidade = new javax.swing.JTextField();
        btn_Voltar = new javax.swing.JButton();
        btn_SalvarAlteracoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Edite as informações do seu jogo!");

        jLabel2.setText("Título:");

        jLabel3.setText("Idade recomendada:");

        jLabel4.setText("Modalidade");

        txt_Modalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ModalidadeActionPerformed(evt);
            }
        });

        btn_Voltar.setText("Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        btn_SalvarAlteracoes.setText("Salvar alterações");
        btn_SalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarAlteracoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Voltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_SalvarAlteracoes))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_IdadeRecomendada))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Modalidade)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txt_IdadeRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Modalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Voltar)
                    .addComponent(btn_SalvarAlteracoes))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ModalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ModalidadeActionPerformed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        Tela_GerenciamentoDeJogos telaGer = new Tela_GerenciamentoDeJogos();
        telaGer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

    private void btn_SalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarAlteracoesActionPerformed
        String idadeStr = txt_IdadeRecomendada.getText();
        int idade;

        // 1. Validação: Tentar converter o texto para número
        try {
            idade = Integer.parseInt(idadeStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "A idade deve ser um número válido (sem letras).");
            return; // Interrompe o salvamento se não for número
        }

        // 2. Validação: Checar o limite de 0 a 130
        if (idade < 0 || idade > 130) {
            JOptionPane.showMessageDialog(this, "A idade deve estar entre 0 e 130 anos.");
            return; // Interrompe o salvamento se for fora do limite
        }

        // 3. Se passou pelas validações, salva o jogo
        model.Jogo jogoEditado = new model.Jogo(
            txt_Titulo.getText(), 
            String.valueOf(idade), // Converte o int validado de volta para String
            txt_Modalidade.getText(), 
            jogoOriginal.getStatus()
        );
        
        jogoDAO.atualizarJogo(jogoOriginal.getTitulo(), jogoEditado);
        
        JOptionPane.showMessageDialog(this, "Alterações salvas!");
        
        Tela_GerenciamentoDeJogos telaGer = new Tela_GerenciamentoDeJogos();
        telaGer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_SalvarAlteracoesActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SalvarAlteracoes;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_IdadeRecomendada;
    private javax.swing.JTextField txt_Modalidade;
    private javax.swing.JTextField txt_Titulo;
    // End of variables declaration//GEN-END:variables
}
