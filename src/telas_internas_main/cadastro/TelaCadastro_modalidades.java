
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
                    combMod9.addItem(listaMod.get(i));
                    combMod10.addItem(listaMod.get(i));
                    combMod11.addItem(listaMod.get(i));
                    combMod12.addItem(listaMod.get(i));
            }
        
            
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMod = new javax.swing.JLabel();
        combMod1 = new javax.swing.JComboBox<>();
        combMod2 = new javax.swing.JComboBox<>();
        combMod3 = new javax.swing.JComboBox<>();
        combMod4 = new javax.swing.JComboBox<>();
        combMod5 = new javax.swing.JComboBox<>();
        combMod6 = new javax.swing.JComboBox<>();
        combMod7 = new javax.swing.JComboBox<>();
        combMod8 = new javax.swing.JComboBox<>();
        combMod9 = new javax.swing.JComboBox<>();
        combMod10 = new javax.swing.JComboBox<>();
        combMod12 = new javax.swing.JComboBox<>();
        combMod11 = new javax.swing.JComboBox<>();
        cd_aluno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPlusA1 = new javax.swing.JButton();
        btnLessA1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modalidades");

        txtMod.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txtMod.setText("Escolha as modalidades do aluno:");

        jLabel1.setText("ID aluno:");

        btnPlusA1.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusA1.setText("+");
        btnPlusA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusA1ActionPerformed(evt);
            }
        });

        btnLessA1.setForeground(new java.awt.Color(251, 0, 51));
        btnLessA1.setText("-");
        btnLessA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessA1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Salvar");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(combMod2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combMod3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combMod4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combMod1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combMod5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combMod6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combMod7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combMod8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combMod9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combMod10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combMod12, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combMod11, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessA1)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cd_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlusA1)
                            .addComponent(btnLessA1)))
                    .addComponent(cd_aluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(combMod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combMod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combMod4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combMod5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combMod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(combMod6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combMod7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combMod8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combMod9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combMod10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combMod11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combMod12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlusA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusA1ActionPerformed
        if(controlePlus == 0){
            combMod2.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 1){
            
            controlePlus++;
        }else if(controlePlus == 2){
            
            controlePlus++;
        }else if(controlePlus == 3){
            
            controlePlus++;
        }
    }//GEN-LAST:event_btnPlusA1ActionPerformed

    private void btnLessA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessA1ActionPerformed
        if(controlePlus == 4){
            
            controlePlus--;
        }else if(controlePlus == 3){
            
            controlePlus--;
        }else if(controlePlus == 2){
            
            controlePlus--;
        }else if(controlePlus == 1){
            
            controlePlus--;
        }
    }//GEN-LAST:event_btnLessA1ActionPerformed

    public void ocultarCombos(){
        combMod2.setVisible(false);
        combMod3.setVisible(false);
        combMod4.setVisible(false);
        combMod5.setVisible(false);
        combMod6.setVisible(false);
        combMod7.setVisible(false);
        combMod8.setVisible(false);
        combMod9.setVisible(false);
        combMod10.setVisible(false);
        combMod11.setVisible(false);
        combMod12.setVisible(false);
    }
    
    /**
     * @param args the command line arguments
     */
    
    /* ---------------------------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /* --------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_treino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_treino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_treino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_treino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
    /* ----------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastro_treino dialog = new TelaCadastro_treino(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLessA1;
    private javax.swing.JButton btnPlusA1;
    private javax.swing.JLabel cd_aluno;
    private javax.swing.JComboBox<String> combMod1;
    private javax.swing.JComboBox<String> combMod10;
    private javax.swing.JComboBox<String> combMod11;
    private javax.swing.JComboBox<String> combMod12;
    private javax.swing.JComboBox<String> combMod2;
    private javax.swing.JComboBox<String> combMod3;
    private javax.swing.JComboBox<String> combMod4;
    private javax.swing.JComboBox<String> combMod5;
    private javax.swing.JComboBox<String> combMod6;
    private javax.swing.JComboBox<String> combMod7;
    private javax.swing.JComboBox<String> combMod8;
    private javax.swing.JComboBox<String> combMod9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel txtMod;
    // End of variables declaration//GEN-END:variables
}
