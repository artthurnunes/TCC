
package telas;

import javax.swing.JDesktopPane;
import telas_internas_main.cadastro.TelaCadastro;
import telas_internas_main.TelaEquipamentos;
import telas_internas_main.TelaFinanceiro;
import telas_internas_main.TelaCatraca;
import telas_internas_main.cadastro.TelaCadastro_financeiro;

public class TelaPrincipal extends javax.swing.JFrame {

    TelaCadastro telaCadastro = new TelaCadastro();
    TelaCatraca telaTreinos = new TelaCatraca();
    TelaEquipamentos telaEquipamentos = new TelaEquipamentos();
    TelaFinanceiro telaFinanceiro = new TelaFinanceiro();

    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        espacoTelas.add(telaCadastro);
        espacoTelas.add(telaTreinos);
        espacoTelas.add(telaEquipamentos);
        espacoTelas.add(telaFinanceiro);
    }    
    
    private void limpaFundoInternalFrame(){
        this.telaCadastro.setVisible(false);
        this.telaTreinos.setVisible(false);
        this.telaEquipamentos.setVisible(false);
        this.telaFinanceiro.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        btnAtalhoCadastro = new javax.swing.JButton();
        btnAtalhoTreinos = new javax.swing.JButton();
        btnAtalhoEquipamentos = new javax.swing.JButton();
        btnAtalhoFinanceiro = new javax.swing.JButton();
        espacoTelas = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        btnMenuImport = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnAlunosAtivos = new javax.swing.JMenuItem();
        btnAlunosInativos = new javax.swing.JMenuItem();
        btnAlunosAusentes = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        bntEquipamentosAtivos = new javax.swing.JMenuItem();
        bntEquipamentosInativos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnCadastroExercicios = new javax.swing.JMenuItem();
        btnCadastroModalidades = new javax.swing.JMenuItem();
        btnCadPlanos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnAltUserAcesso = new javax.swing.JMenuItem();
        btnNovoUsuarioAcesso = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        btnAtalhoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/system_users_22484 (1).png"))); // NOI18N
        btnAtalhoCadastro.setText("CADASTRO");
        btnAtalhoCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoCadastroActionPerformed(evt);
            }
        });

        btnAtalhoTreinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exitdoor_87195.png"))); // NOI18N
        btnAtalhoTreinos.setText("Liberação Catraca");
        btnAtalhoTreinos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoTreinos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoTreinosActionPerformed(evt);
            }
        });

        btnAtalhoEquipamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/muscle_icon-icons.com_59189.png"))); // NOI18N
        btnAtalhoEquipamentos.setText("EQUIPAMENTOS");
        btnAtalhoEquipamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoEquipamentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoEquipamentosActionPerformed(evt);
            }
        });

        btnAtalhoFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/notes_icon-icons.com_59177.png"))); // NOI18N
        btnAtalhoFinanceiro.setText("FINANCEIRO");
        btnAtalhoFinanceiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoFinanceiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoFinanceiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtalhoEquipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtalhoFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtalhoTreinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtalhoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnAtalhoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnAtalhoTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnAtalhoEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnAtalhoFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout espacoTelasLayout = new javax.swing.GroupLayout(espacoTelas);
        espacoTelas.setLayout(espacoTelasLayout);
        espacoTelasLayout.setHorizontalGroup(
            espacoTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );
        espacoTelasLayout.setVerticalGroup(
            espacoTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 204));

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arthur.png"))); // NOI18N
        jMenu8.setText("Sobre Ruthra Softwares       ");
        jMenu8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jMenuBar1.add(jMenu8);

        jMenu1.setText("Arquivo");

        btnMenuImport.setText("Importar/Exportar backup(fazer)");
        btnMenuImport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuImportMouseClicked(evt);
            }
        });
        btnMenuImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuImportActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuImport);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Exibir");

        jMenu2.setText("Alunos");

        btnAlunosAtivos.setText("Ativos");
        btnAlunosAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosAtivosActionPerformed(evt);
            }
        });
        jMenu2.add(btnAlunosAtivos);

        btnAlunosInativos.setText("Inativos");
        btnAlunosInativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosInativosActionPerformed(evt);
            }
        });
        jMenu2.add(btnAlunosInativos);

        btnAlunosAusentes.setText("Ausentes");
        btnAlunosAusentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosAusentesActionPerformed(evt);
            }
        });
        jMenu2.add(btnAlunosAusentes);

        jMenu3.add(jMenu2);

        jMenu7.setText("Equipamentos");

        bntEquipamentosAtivos.setText("Ativos");
        bntEquipamentosAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEquipamentosAtivosActionPerformed(evt);
            }
        });
        jMenu7.add(bntEquipamentosAtivos);

        bntEquipamentosInativos.setText("Inativos");
        bntEquipamentosInativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEquipamentosInativosActionPerformed(evt);
            }
        });
        jMenu7.add(bntEquipamentosInativos);

        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ferramentas");

        btnCadastroExercicios.setText("Cadastrar exercícios");
        btnCadastroExercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroExerciciosActionPerformed(evt);
            }
        });
        jMenu4.add(btnCadastroExercicios);

        btnCadastroModalidades.setText("Cadastrar modalidades");
        btnCadastroModalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroModalidadesActionPerformed(evt);
            }
        });
        jMenu4.add(btnCadastroModalidades);

        btnCadPlanos.setText("Cadastrar planos");
        btnCadPlanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadPlanosMouseClicked(evt);
            }
        });
        btnCadPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPlanosActionPerformed(evt);
            }
        });
        jMenu4.add(btnCadPlanos);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Opções");

        btnAltUserAcesso.setText("Alterar senha de acesso");
        btnAltUserAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltUserAcessoActionPerformed(evt);
            }
        });
        jMenu5.add(btnAltUserAcesso);

        btnNovoUsuarioAcesso.setText("Criar novo usuário de acesso");
        btnNovoUsuarioAcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoUsuarioAcessoMouseClicked(evt);
            }
        });
        btnNovoUsuarioAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioAcessoActionPerformed(evt);
            }
        });
        jMenu5.add(btnNovoUsuarioAcesso);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajuda");

        jMenuItem8.setText("Contato(fazer)");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Relatar problemas(Criar se o envio de email funcionar)");
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espacoTelas))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(espacoTelas)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtalhoEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoEquipamentosActionPerformed
        this.limpaFundoInternalFrame();
        telaEquipamentos.setVisible(true);
    }//GEN-LAST:event_btnAtalhoEquipamentosActionPerformed

    private void btnAtalhoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoCadastroActionPerformed
        this.limpaFundoInternalFrame();
        telaCadastro.setVisible(true);
        telaCadastro.limparCampos();
    }//GEN-LAST:event_btnAtalhoCadastroActionPerformed

    private void btnAtalhoTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoTreinosActionPerformed
        this.limpaFundoInternalFrame();
        telaTreinos.setVisible(true);
    }//GEN-LAST:event_btnAtalhoTreinosActionPerformed

    private void btnAtalhoFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoFinanceiroActionPerformed
        this.limpaFundoInternalFrame();
        telaFinanceiro.setVisible(true);
    }//GEN-LAST:event_btnAtalhoFinanceiroActionPerformed

    private void btnMenuImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuImportActionPerformed
        //Comando errado
    }//GEN-LAST:event_btnMenuImportActionPerformed

    private void btnMenuImportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuImportMouseClicked
        new TelaImportBackup(null,true).setVisible(true);
    }//GEN-LAST:event_btnMenuImportMouseClicked

    private void btnNovoUsuarioAcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoUsuarioAcessoMouseClicked
               
    }//GEN-LAST:event_btnNovoUsuarioAcessoMouseClicked

    private void btnNovoUsuarioAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioAcessoActionPerformed
        new TelaNovoUsuAcesso(null,true).setVisible(true);
    }//GEN-LAST:event_btnNovoUsuarioAcessoActionPerformed

    private void btnAlunosInativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosInativosActionPerformed
        new TelaListaAlunosInativos().setVisible(true);
    }//GEN-LAST:event_btnAlunosInativosActionPerformed

    private void btnCadastroExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroExerciciosActionPerformed
        new TelaCadastroExercicios().setVisible(true);
    }//GEN-LAST:event_btnCadastroExerciciosActionPerformed

    private void btnCadastroModalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroModalidadesActionPerformed
        new TelaCadastroModalidades().setVisible(true); 
    }//GEN-LAST:event_btnCadastroModalidadesActionPerformed

    private void btnCadPlanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadPlanosMouseClicked
        
    }//GEN-LAST:event_btnCadPlanosMouseClicked

    private void btnCadPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPlanosActionPerformed
        new TelaCadastroPlanos().setVisible(true);
    }//GEN-LAST:event_btnCadPlanosActionPerformed

    private void btnAlunosAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosAtivosActionPerformed
        new TelaListaAlunosAtivos().setVisible(true);
    }//GEN-LAST:event_btnAlunosAtivosActionPerformed

    private void bntEquipamentosInativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEquipamentosInativosActionPerformed
        new TelaListaEquipamentosInativos().setVisible(true);
    }//GEN-LAST:event_bntEquipamentosInativosActionPerformed

    private void bntEquipamentosAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEquipamentosAtivosActionPerformed
        new TelaListaEquipamentosAtivos().setVisible(true);
    }//GEN-LAST:event_bntEquipamentosAtivosActionPerformed

    private void btnAlunosAusentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosAusentesActionPerformed
        new TelaListaAlunosAusentes().setVisible(true);
    }//GEN-LAST:event_btnAlunosAusentesActionPerformed

    private void btnAltUserAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltUserAcessoActionPerformed
        new TelaAltSenhaAcesso(null,true).setVisible(true);
    }//GEN-LAST:event_btnAltUserAcessoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bntEquipamentosAtivos;
    private javax.swing.JMenuItem bntEquipamentosInativos;
    private javax.swing.JMenuItem btnAltUserAcesso;
    private javax.swing.JMenuItem btnAlunosAtivos;
    private javax.swing.JMenuItem btnAlunosAusentes;
    private javax.swing.JMenuItem btnAlunosInativos;
    private javax.swing.JButton btnAtalhoCadastro;
    private javax.swing.JButton btnAtalhoEquipamentos;
    private javax.swing.JButton btnAtalhoFinanceiro;
    private javax.swing.JButton btnAtalhoTreinos;
    private javax.swing.JMenuItem btnCadPlanos;
    private javax.swing.JMenuItem btnCadastroExercicios;
    private javax.swing.JMenuItem btnCadastroModalidades;
    private javax.swing.JMenu btnMenuImport;
    private javax.swing.JMenuItem btnNovoUsuarioAcesso;
    public javax.swing.JDesktopPane espacoTelas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
