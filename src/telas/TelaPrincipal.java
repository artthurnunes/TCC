
package telas;

import telas_internas_main.cadastro.TelaCadastro;
import telas_internas_main.TelaEquipamentos;
import telas_internas_main.TelaFinanceiro;
import telas_internas_main.TelaTreinos;

public class TelaPrincipal extends javax.swing.JFrame {

    TelaCadastro telaCadastro = new TelaCadastro();
    TelaTreinos telaTreinos = new TelaTreinos();
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
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();

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

        btnAtalhoTreinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/utilities-system-monitor-icon_37689.png"))); // NOI18N
        btnAtalhoTreinos.setText("TREINOS");
        btnAtalhoTreinos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtalhoTreinos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtalhoTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoTreinosActionPerformed(evt);
            }
        });

        btnAtalhoEquipamentos.setText("EQUIPAMENTOS");
        btnAtalhoEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtalhoEquipamentosActionPerformed(evt);
            }
        });

        btnAtalhoFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bill (1).png"))); // NOI18N
        btnAtalhoFinanceiro.setText("FINANCEIRO");
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
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnAtalhoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
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
            .addGap(0, 743, Short.MAX_VALUE)
        );
        espacoTelasLayout.setVerticalGroup(
            espacoTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 204));

        jMenu8.setText("Sobre Ruthra Softwares    (icone)");
        jMenuBar1.add(jMenu8);

        jMenu1.setText("Arquivo");

        jMenu13.setText("Exportar backup");
        jMenu1.add(jMenu13);

        jMenu14.setText("Importar backup");
        jMenu1.add(jMenu14);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem1.setText("Cadastros");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Exibir");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ferramentas");
        jMenuBar1.add(jMenu4);

        jMenu11.setText("Administração");

        jMenu12.setText("Funcionários");
        jMenu11.add(jMenu12);

        jMenuBar1.add(jMenu11);

        jMenu5.setText("Opções");

        jMenu9.setText("Alteração de senha");
        jMenu5.add(jMenu9);

        jMenu10.setText("Criação de novo usuário");
        jMenu5.add(jMenu10);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajuda");

        jMenu15.setText("Contato");
        jMenu6.add(jMenu15);

        jMenu16.setText("Relatar Problemas");
        jMenu6.add(jMenu16);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAtalhoEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoEquipamentosActionPerformed
        this.limpaFundoInternalFrame();
        telaEquipamentos.setVisible(true);
    }//GEN-LAST:event_btnAtalhoEquipamentosActionPerformed

    private void btnAtalhoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoCadastroActionPerformed
        this.limpaFundoInternalFrame();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_btnAtalhoCadastroActionPerformed

    private void btnAtalhoTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoTreinosActionPerformed
        this.limpaFundoInternalFrame();
        telaTreinos.setVisible(true);
    }//GEN-LAST:event_btnAtalhoTreinosActionPerformed

    private void btnAtalhoFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtalhoFinanceiroActionPerformed
        this.limpaFundoInternalFrame();
        telaFinanceiro.setVisible(true);
    }//GEN-LAST:event_btnAtalhoFinanceiroActionPerformed

    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*
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
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtalhoCadastro;
    private javax.swing.JButton btnAtalhoEquipamentos;
    private javax.swing.JButton btnAtalhoFinanceiro;
    private javax.swing.JButton btnAtalhoTreinos;
    private javax.swing.JDesktopPane espacoTelas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
