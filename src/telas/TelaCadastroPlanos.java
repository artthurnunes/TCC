
package telas;

import classes.ClasseCadastro_planos;
import conexoesbancodedados.DeleteBd;
import conexoesbancodedados.InsertBd;
import conexoesbancodedados.UpdateBd;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCadastroPlanos extends javax.swing.JFrame {

    ClasseCadastro_planos planos = new ClasseCadastro_planos();
    InsertBd inserts = new InsertBd();
    DeleteBd deletes = new DeleteBd();
    UpdateBd updates = new UpdateBd();
    
    private ArrayList<String> listaPlanos = new ArrayList();
    
    
    public TelaCadastroPlanos() {
        initComponents();
        this.limparCampos();
        //TRY PARA POPULAR A LISTA COM O SELECT DO BANCO
        try {
            planos.populandoCombPlanos();
            listaPlanos = planos.getListaPlanos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroModalidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FOR PARA POPULAR OS COMBOS
        for(int i=0; i < listaPlanos.size();i++){ //populando o combobox com os dados
                combPlanos.addItem(listaPlanos.get(i));
                combPlanos1.addItem(listaPlanos.get(i));
            }
        
        this.atualizarValorPlano();
    }
    
    public void atualizarValorPlano(){
        try {
            planos.setNm_plano((String)combPlanos.getSelectedItem());
            lblValorPlano.setText(Float.toString(planos.populandoValorPlano()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroPlanos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void limparCampos(){
        lblNmPlano.setText("");
        lblValorPlano.setText("");
        planos.setNm_plano("");
        planos.setValor_plano(0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNmPlano = new javax.swing.JTextField();
        btnSalvarNmPlano = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combPlanos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lblValorPlano = new javax.swing.JTextField();
        btnSalvarValorPlano = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        combPlanos1 = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Planos Financeiros");

        jLabel1.setText("CADASTRO DE PLANOS FINANCIEROS");

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Cadastrar o nome do plano : ");

        btnSalvarNmPlano.setText("Salvar");
        btnSalvarNmPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarNmPlanoActionPerformed(evt);
            }
        });

        jLabel3.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Cadastrar/Modificar valor do plano:");

        combPlanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combPlanosMouseClicked(evt);
            }
        });
        combPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combPlanosActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor:");

        btnSalvarValorPlano.setText("Salvar");
        btnSalvarValorPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarValorPlanoActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Excluir plano :");

        btnExcluir.setText("Exlcluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel8.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNmPlano)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSalvarNmPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(122, 122, 122))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(combPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblValorPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSalvarValorPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combPlanos1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNmPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarNmPlano))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblValorPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarValorPlano))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combPlanos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarNmPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarNmPlanoActionPerformed
        if("".equals(lblNmPlano.getText())){
            JOptionPane.showMessageDialog(null, "Nome do plano não pode ser em branco !");
        }else{
            planos.setNm_plano(lblNmPlano.getText());
            inserts.inserePlanosNovos(planos);
            this.dispose();
            new TelaCadastroPlanos().setVisible(true);
        }  
    }//GEN-LAST:event_btnSalvarNmPlanoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "<html>O plano <b>"+combPlanos1.getSelectedItem()+"</b> será excluído. <br>Deseja continuar ? </html>");
        if(i == 0){
            planos.setNm_plano((String)combPlanos1.getSelectedItem());
            try {
                deletes.apagarPlano(planos);
                this.dispose();
                new TelaCadastroPlanos().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroPlanos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarValorPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarValorPlanoActionPerformed
        if(combPlanos.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Nenhum plano foi selecionado.");
        }else{
            planos.setNm_plano((String)combPlanos.getSelectedItem());
            planos.setValor_plano(Float.parseFloat(lblValorPlano.getText()));
            updates.alteraValorPlanos(planos);
            this.dispose();
            new TelaCadastroPlanos().setVisible(true);
        }
    }//GEN-LAST:event_btnSalvarValorPlanoActionPerformed

    private void combPlanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combPlanosMouseClicked
        
    }//GEN-LAST:event_combPlanosMouseClicked

    private void combPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combPlanosActionPerformed
        this.atualizarValorPlano();
    }//GEN-LAST:event_combPlanosActionPerformed

    /**
     * @param args the command line arguments
     */
    /* ------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /* ------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    /* ------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPlanos().setVisible(true);
            }
        });
    } ------------------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvarNmPlano;
    private javax.swing.JButton btnSalvarValorPlano;
    private javax.swing.JComboBox<String> combPlanos;
    private javax.swing.JComboBox<String> combPlanos1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lblNmPlano;
    private javax.swing.JTextField lblValorPlano;
    // End of variables declaration//GEN-END:variables
}
