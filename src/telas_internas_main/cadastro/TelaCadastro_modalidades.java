
package telas_internas_main.cadastro;

import classes.ClasseCadastro_modalidades;
import classes.ClasseCadastro_treino;
import conexoesbancodedados.InsertBd;
import conexoesbancodedados.SelectBd;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaCadastro_modalidades extends javax.swing.JDialog {

    ClasseCadastro_treino treino = new ClasseCadastro_treino();
    ClasseCadastro_modalidades mod = new ClasseCadastro_modalidades();
    InsertBd inserts = new InsertBd();
    SelectBd selects = new SelectBd();
    ArrayList<String> listaMod = new ArrayList();
    int controlePlus = 1;
    int controleLess = 0;
    
    public TelaCadastro_modalidades(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listaMod = mod.getListaMod();
        this.ocultarCombos();
            //SE JÁ EXIRTIR MODALIDADE CADASTRADA PARA O ALUNO, VIRÁ COMO FALSE COM AS MODALIDADES JÁ ESTABELECIDAS
            if(mod.getNovo() == false){
                btnPlus.setVisible(false);
                btnLess.setVisible(false);
                btnSalvar.setVisible(false);
                try {
                    this.limparCombos();
                    this.getandoClasseCadastro_modalidades();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadastro_modalidades.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
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
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPlus = new javax.swing.JButton();
        btnLess = new javax.swing.JButton();
        combMod1 = new javax.swing.JComboBox<>();
        combMod2 = new javax.swing.JComboBox<>();
        combMod3 = new javax.swing.JComboBox<>();
        combMod4 = new javax.swing.JComboBox<>();
        combMod5 = new javax.swing.JComboBox<>();
        combMod6 = new javax.swing.JComboBox<>();
        combMod7 = new javax.swing.JComboBox<>();
        combMod8 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnFechar = new javax.swing.JMenu();
        btnNovo = new javax.swing.JMenu();
        btnSalvar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        combMod1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        combMod2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        combMod3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        combMod4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        combMod5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        combMod6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        combMod7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        combMod8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btnFechar.setText("Fechar");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnFechar);

        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnNovo);

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnSalvar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(combMod8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLess, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnPlus)
                    .addComponent(btnLess))
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
        if(controlePlus == 1 && combMod1.getSelectedItem() != ""){
            combMod2.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 2 && combMod2.getSelectedItem() != ""){
            combMod3.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 3 && combMod3.getSelectedItem() != ""){
            combMod4.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 4 && combMod4.getSelectedItem() != ""){
            combMod5.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 5 && combMod5.getSelectedItem() != ""){
            combMod6.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 6 && combMod6.getSelectedItem() != ""){
            combMod7.setVisible(true);
            controlePlus++;
        }else if(controlePlus == 7 && combMod7.getSelectedItem() != ""){
            combMod8.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Combo atual vazio !");
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessActionPerformed
        if(controlePlus == 7){
            combMod8.setVisible(false);
            combMod8.setSelectedIndex(0);
            controlePlus--;
        }else if(controlePlus == 6){
            combMod7.setVisible(false);
            combMod7.setSelectedIndex(0);
            controlePlus--;
        }else if(controlePlus == 5){
            combMod6.setVisible(false);
            combMod6.setSelectedIndex(0);
            controlePlus--;
        }else if(controlePlus == 4){
            combMod5.setVisible(false);
            combMod5.setSelectedIndex(0);
            controlePlus--;
        }else if(controlePlus == 3){
            combMod4.setVisible(false);
            combMod4.setSelectedIndex(0);
            controlePlus--;
        }else if(controlePlus == 2){
            combMod3.setVisible(false);
            combMod3.setSelectedIndex(0);
            controlePlus--;
        }else if(controlePlus == 1){
            combMod2.setVisible(false);
            combMod2.setSelectedIndex(0);
            //controlePlus--;
        }
    }//GEN-LAST:event_btnLessActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if(combMod1.getSelectedItem() == ""){
            JOptionPane.showMessageDialog(null, "Nenhuma modalidade foi selecionada !");
        }else{
            int i = JOptionPane.showConfirmDialog(null, "Deseja salvar Modalidades ? ");
            switch(i){
            case 0:{
                //SETAR DADOS DA TELA PARA CLASSE E DEPOIS CHAMAR O INSERT 
                if(combMod1.getSelectedItem() == ""){
                    //FAZ NADA
                }else{mod.setNm_mod_comb1((String)combMod1.getSelectedItem());}

                if(combMod2.getSelectedItem() == ""){
                    //COMBO EM BRANCO, NÃO SETA NADA PARA A CLASSE
                }else{mod.setNm_mod_comb2((String)combMod2.getSelectedItem());}

                if(combMod3.getSelectedItem() == ""){
                    //COMBO EM BRANCO, NÃO SETA NADA PARA A CLASSE
                }else{mod.setNm_mod_comb3((String)combMod3.getSelectedItem());}
                
                if(combMod4.getSelectedItem() == ""){
                    //COMBO EM BRANCO, NÃO SETA NADA PARA A CLASSE
                }else{mod.setNm_mod_comb4((String)combMod4.getSelectedItem());}
                
                if(combMod5.getSelectedItem() == ""){
                    //COMBO EM BRANCO, NÃO SETA NADA PARA A CLASSE
                }else{mod.setNm_mod_comb5((String)combMod5.getSelectedItem());}
                
                if(combMod6.getSelectedItem() == ""){
                    //COMBO EM BRANCO, NÃO SETA NADA PARA A CLASSE
                }else{mod.setNm_mod_comb6((String)combMod6.getSelectedItem());}
                
                if(combMod7.getSelectedItem() == ""){
                    //COMBO EM BRANCO, NÃO SETA NADA PARA A CLASSE
                }else{mod.setNm_mod_comb7((String)combMod7.getSelectedItem());}
                
                if(combMod8.getSelectedItem() == ""){
                    //COMBO EM BRANCO, NÃO SETA NADA PARA A CLASSE
                }else{mod.setNm_mod_comb8((String)combMod8.getSelectedItem());}

                btnPlus.setVisible(false);
                btnLess.setVisible(false);
                btnSalvar.setVisible(false);
                inserts.insereModAluno(mod);
                break;
            }
            default:{
                
            }
            }
            
            
        }
        
        
        
        
        
        
            
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        mod.setNovo(true);
        this.dispose();
    }//GEN-LAST:event_btnFecharMouseClicked

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        int i = JOptionPane.showConfirmDialog(null, "Deseja cadastrar novas modalidades para o aluno ? ");
            if(i == 0){
                mod.setNovo(true);
                try {
                    mod.populandoCombMod();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadastro_modalidades.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
                new TelaCadastro_modalidades(null,true).setVisible(true);
            }   
    }//GEN-LAST:event_btnNovoMouseClicked

    private void ocultarCombos(){
        combMod2.setVisible(false);
        combMod3.setVisible(false);
        combMod4.setVisible(false);
        combMod5.setVisible(false);
        combMod6.setVisible(false);
        combMod7.setVisible(false);
        combMod8.setVisible(false);
    }
    
    private void getandoClasseCadastro_modalidades() throws SQLException{
        combMod1.addItem(selects.populandoTelaModalidadesAlunos(mod.getCd_mod_comb1()));
        combMod2.addItem(selects.populandoTelaModalidadesAlunos(mod.getCd_mod_comb2()));
            if(combMod2.getSelectedItem() != "")
                combMod2.setVisible(true);
        combMod3.addItem(selects.populandoTelaModalidadesAlunos(mod.getCd_mod_comb3()));
            if(combMod3.getSelectedItem() != "")
                combMod3.setVisible(true);
        combMod4.addItem(selects.populandoTelaModalidadesAlunos(mod.getCd_mod_comb4()));
            if(combMod4.getSelectedItem() != "")
                combMod4.setVisible(true);
        combMod5.addItem(selects.populandoTelaModalidadesAlunos(mod.getCd_mod_comb5()));
            if(combMod5.getSelectedItem() != "")
                combMod5.setVisible(true);
        combMod6.addItem(selects.populandoTelaModalidadesAlunos(mod.getCd_mod_comb6()));
            if(combMod6.getSelectedItem() != "")
                combMod6.setVisible(true);
        combMod7.addItem(selects.populandoTelaModalidadesAlunos(mod.getCd_mod_comb7()));
            if(combMod7.getSelectedItem() != "")
                combMod7.setVisible(true);
        combMod8.addItem(selects.populandoTelaModalidadesAlunos(mod.getCd_mod_comb8()));
            if(combMod8.getSelectedItem() != "")
                combMod8.setVisible(true);      
    }
    
    private void limparCombos(){
        combMod1.removeAllItems();
        combMod2.removeAllItems();
        combMod3.removeAllItems();
        combMod4.removeAllItems();
        combMod5.removeAllItems();
        combMod6.removeAllItems();
        combMod7.removeAllItems();
        combMod8.removeAllItems();
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
    private javax.swing.JMenu btnFechar;
    private javax.swing.JButton btnLess;
    private javax.swing.JMenu btnNovo;
    private javax.swing.JButton btnPlus;
    private javax.swing.JMenu btnSalvar;
    private javax.swing.JComboBox<String> combMod1;
    private javax.swing.JComboBox<String> combMod2;
    private javax.swing.JComboBox<String> combMod3;
    private javax.swing.JComboBox<String> combMod4;
    private javax.swing.JComboBox<String> combMod5;
    private javax.swing.JComboBox<String> combMod6;
    private javax.swing.JComboBox<String> combMod7;
    private javax.swing.JComboBox<String> combMod8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
