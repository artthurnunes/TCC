
package telas;

import classes.ClasseCadastro_modalidades;
import conexoesbancodedados.DeleteBd;
import conexoesbancodedados.InsertBd;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaCadastroModalidades extends javax.swing.JFrame {

    InsertBd inserts = new InsertBd();
    DeleteBd deletes = new DeleteBd();
    ClasseCadastro_modalidades mod = new ClasseCadastro_modalidades();
    ArrayList<String> listaMod = new ArrayList();

    public TelaCadastroModalidades() {
        initComponents();
        try {
            mod.populandoCombMod();
            listaMod = mod.getListaMod();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroModalidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0; i < listaMod.size();i++){ //populando o combobox com os dados
                combMod.addItem(listaMod.get(i));
            }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblMod = new javax.swing.JTextField();
        btnSalvarMod = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combMod = new javax.swing.JComboBox<>();
        btnExcluirMod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de cadastro de modalidades");

        jLabel1.setText("CADASTRO DE MODALIDADES PARA TELA DE TREINOS");

        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Cadastrar MODALIDADE:");

        btnSalvarMod.setText("Salvar");
        btnSalvarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarModActionPerformed(evt);
            }
        });

        jLabel10.setText("_______________________________________________________________________");

        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Excluir MODALIDADE:");

        jLabel5.setText("Modalidades cadastradas:");

        combMod.setSelectedIndex(-1);

        btnExcluirMod.setText("Excluir");
        btnExcluirMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblMod, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSalvarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combMod, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirMod, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarMod))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirMod))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarModActionPerformed
        if("".equals(lblMod.getText())){
            JOptionPane.showMessageDialog(null, "Campo modalidade está vazio !!");
        }else{
            inserts.insereModalidade(lblMod.getText().toUpperCase()); //Envia o nome para o banco
            new TelaCadastroModalidades().setVisible(true); //atualizar a tela abrindo uma nova
            this.dispose(); //fechando a velha
        }
    }//GEN-LAST:event_btnSalvarModActionPerformed

    private void btnExcluirModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirModActionPerformed
        mod.setNm_modalidade((String)combMod.getSelectedItem());
            if(combMod.getSelectedItem() == ""){
                JOptionPane.showMessageDialog(null,"Nenhuma modalidade foi selecionada.");
            }else{
                try {
                    deletes.apagarModalidade(mod);
                    new TelaCadastroModalidades().setVisible(true); //atualizar a tela abrindo uma nova
                    this.dispose(); //fechando a velha
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btnExcluirModActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroModalidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirMod;
    private javax.swing.JButton btnSalvarMod;
    private javax.swing.JComboBox<String> combMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lblMod;
    // End of variables declaration//GEN-END:variables
}
