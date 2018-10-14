
package telas;

import conexoesbancodedados.ConectaBd;
import java.io.File;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TelaExportartBackup extends javax.swing.JDialog {

    Connection con;
    
    
    public TelaExportartBackup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arquivoSalvar = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        btnFazerBackup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exportando backup do bando de dados");

        arquivoSalvar.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

        jLabel1.setText("Selecione o caminho para salvar o arquivo :");

        btnFazerBackup.setText("INICIAR");
        btnFazerBackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFazerBackup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnFazerBackup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFazerBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerBackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arquivoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnFazerBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(arquivoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFazerBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFazerBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerBackupActionPerformed
        con = ConectaBd.getConnection();
        
        try {
            String arquivo = null;                       
            int result = arquivoSalvar.showSaveDialog(null);

            if(result == JFileChooser.APPROVE_OPTION){
            arquivo = arquivoSalvar.getSelectedFile().toString().concat(".sql");

            File file = new File(arquivo); 

            if(file.exists()){
               Object[] options = { "Sim", "Não" };
                            int opcao = JOptionPane.showOptionDialog(null,"Este arquivo já existe. Quer sobreescrever este arquivo?", "Atenção!!!",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,options, options[0]);
                                if (opcao == JOptionPane.YES_OPTION) {                
                                    Runtime bck = Runtime.getRuntime();   
                                    bck.exec("C:/Program Files/MySQL/MySQL Workbench 6.3 CE/mysqldump.exe -uroot -p --add-drop-database -B tcc -r "+arquivo);  
                                    JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Tudo OK!", 1);
                                }else{
                                    btnFazerBackupActionPerformed(evt);
                                }
            }else{
                Runtime bck = Runtime.getRuntime();   
                bck.exec("C:/Program Files/MySQL/MySQL Workbench 6.3 CE/mysqldump.exe -uroot -p --add-drop-database -B tcc -r "+arquivo);  
                JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Tudo OK!", 1);   
            }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", 2);
        }
    }//GEN-LAST:event_btnFazerBackupActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*-------------------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaExportartBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExportartBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExportartBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExportartBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaExportartBackup dialog = new TelaExportartBackup(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser arquivoSalvar;
    private javax.swing.JButton btnFazerBackup;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
