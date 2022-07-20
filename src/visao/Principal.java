package visao;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemMenuCadastrarCandidato = new javax.swing.JMenuItem();
        itemMenuCadastrarEmpresa = new javax.swing.JMenuItem();
        itemMenuCadastrarVaga = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemMenuVisualizarCandidato = new javax.swing.JMenuItem();
        itemMenuVisualizarEmpresa = new javax.swing.JMenuItem();
        itemMenuVisualizarVaga = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemMenuAlterarCandidato = new javax.swing.JMenuItem();
        itemMenuAlterarEmpresa = new javax.swing.JMenuItem();
        itemMenuAlterarVaga = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemMenuDeletarCandidato = new javax.swing.JMenuItem();
        itemMenuDeletarEmpresa = new javax.swing.JMenuItem();
        itemMenuDeletarVaga = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vagas Online");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoVagas.png"))); // NOI18N
        jLabel1.setText("   ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastrar");

        itemMenuCadastrarCandidato.setText("Candidato");
        itemMenuCadastrarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastrarCandidatoActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuCadastrarCandidato);

        itemMenuCadastrarEmpresa.setText("Empresa");
        itemMenuCadastrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastrarEmpresaActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuCadastrarEmpresa);

        itemMenuCadastrarVaga.setText("Vaga");
        itemMenuCadastrarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastrarVagaActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuCadastrarVaga);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Visualizar");

        itemMenuVisualizarCandidato.setText("Candidato");
        itemMenuVisualizarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVisualizarCandidatoActionPerformed(evt);
            }
        });
        jMenu3.add(itemMenuVisualizarCandidato);

        itemMenuVisualizarEmpresa.setText("Empresa");
        itemMenuVisualizarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVisualizarEmpresaActionPerformed(evt);
            }
        });
        jMenu3.add(itemMenuVisualizarEmpresa);

        itemMenuVisualizarVaga.setText("Vaga");
        itemMenuVisualizarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVisualizarVagaActionPerformed(evt);
            }
        });
        jMenu3.add(itemMenuVisualizarVaga);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Alterar");

        itemMenuAlterarCandidato.setText("Candidato");
        itemMenuAlterarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAlterarCandidatoActionPerformed(evt);
            }
        });
        jMenu2.add(itemMenuAlterarCandidato);

        itemMenuAlterarEmpresa.setText("Empresa");
        itemMenuAlterarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAlterarEmpresaActionPerformed(evt);
            }
        });
        jMenu2.add(itemMenuAlterarEmpresa);

        itemMenuAlterarVaga.setText("Vaga");
        itemMenuAlterarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAlterarVagaActionPerformed(evt);
            }
        });
        jMenu2.add(itemMenuAlterarVaga);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Deletar");

        itemMenuDeletarCandidato.setText("Candidato");
        itemMenuDeletarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuDeletarCandidatoActionPerformed(evt);
            }
        });
        jMenu4.add(itemMenuDeletarCandidato);

        itemMenuDeletarEmpresa.setText("Empresa");
        itemMenuDeletarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuDeletarEmpresaActionPerformed(evt);
            }
        });
        jMenu4.add(itemMenuDeletarEmpresa);

        itemMenuDeletarVaga.setText("Vaga");
        itemMenuDeletarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuDeletarVagaActionPerformed(evt);
            }
        });
        jMenu4.add(itemMenuDeletarVaga);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuCadastrarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastrarCandidatoActionPerformed
        this.dispose();
        new visao.candidato.Cadastrar().setVisible(true);
    }//GEN-LAST:event_itemMenuCadastrarCandidatoActionPerformed

    private void itemMenuVisualizarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVisualizarCandidatoActionPerformed
        this.dispose();
        new visao.candidato.Visualizar().setVisible(true);
    }//GEN-LAST:event_itemMenuVisualizarCandidatoActionPerformed

    private void itemMenuAlterarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAlterarCandidatoActionPerformed
        this.dispose();
        new visao.candidato.Alterar().setVisible(true);
    }//GEN-LAST:event_itemMenuAlterarCandidatoActionPerformed

    private void itemMenuDeletarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuDeletarCandidatoActionPerformed
        this.dispose();
        new visao.candidato.Deletar().setVisible(true);
    }//GEN-LAST:event_itemMenuDeletarCandidatoActionPerformed

    private void itemMenuCadastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastrarEmpresaActionPerformed
        this.dispose();
        new visao.empresa.Cadastrar().setVisible(true);
    }//GEN-LAST:event_itemMenuCadastrarEmpresaActionPerformed

    private void itemMenuVisualizarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVisualizarEmpresaActionPerformed
        this.dispose();
        new visao.empresa.Visualizar().setVisible(true);
    }//GEN-LAST:event_itemMenuVisualizarEmpresaActionPerformed

    private void itemMenuAlterarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAlterarEmpresaActionPerformed
        this.dispose();
        new visao.empresa.Alterar().setVisible(true);
    }//GEN-LAST:event_itemMenuAlterarEmpresaActionPerformed

    private void itemMenuDeletarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuDeletarEmpresaActionPerformed
        this.dispose();
        new visao.empresa.Deletar().setVisible(true);
    }//GEN-LAST:event_itemMenuDeletarEmpresaActionPerformed

    private void itemMenuCadastrarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastrarVagaActionPerformed
        this.dispose();
        new visao.vaga.Cadastrar().setVisible(true);
    }//GEN-LAST:event_itemMenuCadastrarVagaActionPerformed

    private void itemMenuVisualizarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVisualizarVagaActionPerformed
        this.dispose();
        new visao.vaga.Visualizar().setVisible(true);
    }//GEN-LAST:event_itemMenuVisualizarVagaActionPerformed

    private void itemMenuAlterarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAlterarVagaActionPerformed
        this.dispose();
        new visao.vaga.Alterar().setVisible(true);
    }//GEN-LAST:event_itemMenuAlterarVagaActionPerformed

    private void itemMenuDeletarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuDeletarVagaActionPerformed
        this.dispose();
        new visao.vaga.Deletar().setVisible(true);
    }//GEN-LAST:event_itemMenuDeletarVagaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuAlterarCandidato;
    private javax.swing.JMenuItem itemMenuAlterarEmpresa;
    private javax.swing.JMenuItem itemMenuAlterarVaga;
    private javax.swing.JMenuItem itemMenuCadastrarCandidato;
    private javax.swing.JMenuItem itemMenuCadastrarEmpresa;
    private javax.swing.JMenuItem itemMenuCadastrarVaga;
    private javax.swing.JMenuItem itemMenuDeletarCandidato;
    private javax.swing.JMenuItem itemMenuDeletarEmpresa;
    private javax.swing.JMenuItem itemMenuDeletarVaga;
    private javax.swing.JMenuItem itemMenuVisualizarCandidato;
    private javax.swing.JMenuItem itemMenuVisualizarEmpresa;
    private javax.swing.JMenuItem itemMenuVisualizarVaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}