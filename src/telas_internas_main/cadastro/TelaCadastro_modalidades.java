
package telas_internas_main.cadastro;

import classes.ClasseCadastro_modalidades;
import classes.ClasseCadastro_treino;
import java.util.ArrayList;


public class TelaCadastro_modalidades extends javax.swing.JDialog {

    ClasseCadastro_treino treino = new ClasseCadastro_treino();
    ClasseCadastro_modalidades mod = new ClasseCadastro_modalidades();
    ArrayList<String> listaMod = new ArrayList();
    int controlePlus = 0;
    int controleLess = 0;
    
    public TelaCadastro_modalidades(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cd_aluno.setText(Integer.toString(treino.getCd_registro()));
        listaMod = mod.getListaMod();
        this.ocultarCombos();
            for(int i=0; i < listaMod.size();i++){ //populando o combobox com os dados
                combMod1.addItem(listaMod.get(i));
                combMod2.addItem(listaMod.get(i));
                combMod3.addItem(listaMod.get(i));
                combMod4.addItem(listaMod.get(i));
                combMod5.addItem(listaMod.get(i));
                combMod6.addItem(listaMod.get(i));
                combMod7.addItem(listaMod.get(i));
                combMod8.addItem(listaMod.get(i));
            }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPlus = new javax.swing.JButton();
        btnLess = new javax.swing.JButton();
        combMod1 = new javax.swing.JComboBox<>();
        cd_aluno = new javax.swing.JLabel();
        combMod2 = new javax.swing.JComboBox<>();
        combMod3 = new javax.swing.JComboBox<>();
        combMod4 = new javax.swing.JComboBox<>();
        combMod5 = new javax.swing.JComboBox<>();
        combMod6 = new javax.swing.JComboBox<>();
        combMod7 = new javax.swing.JComboBox<>();
        combMod8 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de modalidades");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Escola as modalidades desejadas :");

        btnPlus.setBackground(new java.awt.Color(255, 0, 0));
        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnLess.setBackground(new java.awt.Color(255, 0, 0));
        btnLess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLess.setForeground(new java.awt.Color(255, 255, 255));
        btnLess.setText("-");
        btnLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessActionPerformed(evt);
            }
        });

        jMenu1.setText("Editar");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salvar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combMod1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combMod5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combMod2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combMod6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combMod3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combMod7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combMod4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combMod8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLess, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cd_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnPlus)
                    .addComponent(btnLess)
                    .addComponent(cd_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combMod5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combMod6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combMod7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMod4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combMod8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        if(controlePlus == 0){
            combMod2.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 1){
            combMod3.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 2){
            combMod4.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 3){
            combMod5.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 4){
            combMod6.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 5){
            combMod7.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 6){
            combMod8.setVisible(true);
            controlePlus++;
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessActionPerformed
        if(controlePlus == 7){
            combMod8.setVisible(false);
            controlePlus--;
        }else if(controlePlus == 6){
            combMod7.setVisible(false);
            controlePlus--;
        }else if(controlePlus == 5){
            combMod6.setVisible(false);
            controlePlus--;
        }else if(controlePlus == 4){
            combMod5.setVisible(false);
            controlePlus--;
        }else if(controlePlus == 3){
            combMod4.setVisible(false);
            controlePlus--;
        }else if(controlePlus == 2){
            combMod3.setVisible(false);
            controlePlus--;
        }else if(controlePlus == 1){
            combMod2.setVisible(false);
            controlePlus--;
        }
    }//GEN-LAST:event_btnLessActionPerformed

    private void ocultarCombos(){
        combMod2.setVisible(false);
        combMod3.setVisible(false);
        combMod4.setVisible(false);
        combMod5.setVisible(false);
        combMod6.setVisible(false);
        combMod7.setVisible(false);
        combMod8.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(TelaCadastro_modalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_modalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_modalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_modalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastro_modalidades dialog = new TelaCadastro_modalidades(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLess;
    private javax.swing.JButton btnPlus;
    private javax.swing.JLabel cd_aluno;
    private javax.swing.JComboBox<String> combMod1;
    private javax.swing.JComboBox<String> combMod2;
    private javax.swing.JComboBox<String> combMod3;
    private javax.swing.JComboBox<String> combMod4;
    private javax.swing.JComboBox<String> combMod5;
    private javax.swing.JComboBox<String> combMod6;
    private javax.swing.JComboBox<String> combMod7;
    private javax.swing.JComboBox<String> combMod8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
