
package telas_internas_main.cadastro;

import classes.ClasseCadastro_planos;
import conexoesbancodedados.InsertBd;
import conexoesbancodedados.SelectBd;
import conexoesbancodedados.UpdateBd;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCadastro_financeiro extends javax.swing.JDialog {

    ClasseCadastro_planos planos = new ClasseCadastro_planos();
    static ArrayList<String> listaPlanos = new ArrayList();
    InsertBd inserts = new InsertBd();
    SelectBd selects = new SelectBd();
    UpdateBd updates = new UpdateBd();

    public TelaCadastro_financeiro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //System.out.println("Entrei no construtor"); //teste
        lblDesconto.setText("0");
            try {
                planos.populandoCombPlanoAluno();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        listaPlanos = planos.getListaPlanos();
            if(planos.getPlano_novo() == false){
                combVencimento.removeAllItems();
                combDesconto.removeAllItems();
                lblDesconto.setEditable(false);
                btnSalvar.setEnabled(false);
                this.getarCombosClasse();
            }else{
//                System.out.println("entrei no else do construtor"); //teste
//                System.out.println(listaPlanos.size()); //teste
                for(int i=0; i < listaPlanos.size();i++) //populando o combobox com os dados
                    combNm_plano.addItem(listaPlanos.get(i));

                planos.setNm_plano((String)combNm_plano.getSelectedItem());
                try {
                    lblValorVista.setText(Float.toString(planos.populandoValorPlano()));
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    public void setarCamposClasse(){
        //JÁ SETA O CODIGO DO PLANO NA CLASSE
        try {
            planos.setNm_plano((String)combNm_plano.getSelectedItem()); //PEGA O NOME DO PLANO E SETA NA CLASSE
            planos.codigoPlano(); //PEGA O NOME E FAZ UM SELECT PARA PEGAR O CÓDIGO E JA SETA NA CLASSE O CODIGO
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(Level.SEVERE, null, ex);
        }
        planos.setValor_plano(Float.parseFloat(lblValorVista.getText()));
        planos.setVencimento_plano(Integer.parseInt((String)combVencimento.getSelectedItem()));
        planos.setTp_desconto_plano((String)combDesconto.getSelectedItem());
        planos.setDesconto_plano(Float.parseFloat(lblDesconto.getText()));
        planos.setTotal_plano(Float.parseFloat(lblTotal.getText()));
    }
    
    public void getarCombosClasse(){
        combNm_plano.addItem(planos.getNm_plano());
        combVencimento.addItem(Integer.toString(planos.getVencimento_plano()));
        combDesconto.addItem(planos.getTp_desconto_plano());
        lblDesconto.setText(Float.toString(planos.getDesconto_plano()));
        lblTotal.setText(Float.toString(planos.getTotal_plano()));
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        combNm_plano = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblValorVista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDesconto = new javax.swing.JTextField();
        combDesconto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        combVencimento = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnNovo = new javax.swing.JMenu();
        btnFechar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Financeiro do Aluno");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Plano"));

        combNm_plano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combNm_planoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combNm_plano, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combNm_plano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setText("Valor à vista:");

        lblValorVista.setEditable(false);

        jLabel2.setText("Vencimento:");

        jLabel3.setText("Desconto:");

        combDesconto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%", "R$" }));

        jLabel4.setText("TOTAL:");

        lblTotal.setEditable(false);

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        combVencimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnNovo);

        btnFechar.setText("Fechar");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnFechar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblValorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(combVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        float valor = Float.parseFloat(lblValorVista.getText());
        float desconto = Float.parseFloat(lblDesconto.getText());
        if(combDesconto.getSelectedItem() == "%")
            lblTotal.setText(Float.toString(valor-(valor*desconto)/100));
        if(combDesconto.getSelectedItem() == "R$")
            lblTotal.setText(Float.toString(valor-desconto));
        
        this.setarCamposClasse();
        inserts.inserePlanosAlunos(planos);
        
        //INSERINDO OS DADOS NA TABELA DE TB_HISTORICO_PAGAMENTOS_ALUNOS
        //SE JÁ EXISTIR REGISTRO NA TABELA, É FEITO SOMENTE UM UDATE DO DIA DO VENCIMENTO 
        //SE O ALUNO FOR NOVO, INSERIR O REGISTRO
        boolean temRegistro = false;
        try {
            temRegistro = selects.existeRegistroTbHistoricoPagamentos(planos.getCd_registro());
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //SE O ALUNO JA POSSUI UM PLANO, QUANDO E CRIADO UM NOVO PLANO, A DATA DE PAGAMENTO E ATUALIZADA NA TABELA DE PAGAMENTOS
        if(temRegistro == true)
            updates.alteraVencimento(planos.getCd_registro(),Integer.parseInt((String)combVencimento.getSelectedItem()));
        else
            inserts.insereHistoricoPagamentos(planos.getCd_registro(),Integer.parseInt((String)combVencimento.getSelectedItem()));
          
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void combNm_planoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combNm_planoActionPerformed
        planos.setNm_plano((String)combNm_plano.getSelectedItem());
        try {
                lblValorVista.setText(Float.toString(planos.populandoValorPlano()));
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_combNm_planoActionPerformed

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        int i = JOptionPane.showConfirmDialog(null, "<html>Deseja cadastrar um <b>novo</b> plano para o aluno ? </html>");
            if(i == 0){
                planos.setPlano_novo(true);
                this.dispose();
                    try {
                        planos.populandoCombPlanos();
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                new TelaCadastro_financeiro(null,true).setVisible(true);
            }
        
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        if("".equals(lblTotal.getText())){
            JOptionPane.showMessageDialog(null, "É obrigatório cadastrar um plano para o aluno.");
        }else{
            planos.setPlano_novo(true);
            this.dispose();
        } 
    }//GEN-LAST:event_btnFecharMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_financeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastro_financeiro dialog = new TelaCadastro_financeiro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    } */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnFechar;
    private javax.swing.JMenu btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> combDesconto;
    private javax.swing.JComboBox<String> combNm_plano;
    private javax.swing.JComboBox<String> combVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblDesconto;
    private javax.swing.JTextField lblTotal;
    private javax.swing.JTextField lblValorVista;
    // End of variables declaration//GEN-END:variables
}
