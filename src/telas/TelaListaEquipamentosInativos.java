
package telas;

import classes.ClassejTableSelect;
import conexoesbancodedados.ConectaBd;
import conexoesbancodedados.UpdateBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class TelaListaEquipamentosInativos extends javax.swing.JFrame {

    UpdateBd updates = new UpdateBd();    
    int linha_selecionada;
    int codEquipamento_selecionado;
    String nmEquipamento_selecionado;

    public TelaListaEquipamentosInativos() {
        initComponents();
        this.preencherTabela("SELECT * FROM TB_EQUIPAMENTOS WHERE ATIVO = FALSE");  
    }
    
    //metodo para retornar rs para exibir ArrayList
     public ResultSet executaSql(String sql){
         Statement stm = null;
         ResultSet rs = null;
         Connection con = ConectaBd.getConnection();
         
       try {
           stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERRO AO EXECUTAR O SQL"+ex.getMessage());
       }
       
       return rs;
    }   

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"CODIGO","NOME EQUIPAMENTO","DATA COMPRA","DATA ÚLT. MANUT."};
        Connection con = ConectaBd.getConnection();
        ResultSet rs = this.executaSql(Sql);     
        
        //SE A LISTA DE INATIVOS ESTIVER VAZIA NÃO FAZ NADA PARA NÃO DAR ERRO, SE NÃO ELE EXECUTA E PREENCHE O JTABLE
        try {
            if(rs.next()){
                try{
                rs.first();
                    do{
                        dados.add(new Object[]{rs.getInt("CD_EQUIPAMENTO"),rs.getString("NM_EQUIPAMENTO"),rs.getString("DT_COMPRA_EQUIPAMENTO"),rs.getString("DT_ULTIMA_MANUTENCAO")});
                    }while(rs.next());
                }catch(SQLException ex){
                   JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER O ARRAYLIST"+ex);
                }   
            }else{
               //NÃO FAZ NADA
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaListaEquipamentosInativos.class.getName()).log(Level.SEVERE, null, ex);
        }

        ClassejTableSelect modelo = new ClassejTableSelect(dados, colunas);
        
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(60);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(290);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(130);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnAtivarAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Equipamentos inativos");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        btnAtivarAluno.setText("ATIVAR");
        btnAtivarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarAlunoActionPerformed(evt);
            }
        });

        jLabel1.setText("Caso deseje ativar algum cadastro da lista, selecione a linha do cadastro desejada e clique em ATIVAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtivarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtivarAluno)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtivarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarAlunoActionPerformed
        linha_selecionada = tabela.getSelectedRow(); //seleciona a linha que o usuário clicou na tabela
        codEquipamento_selecionado = (Integer)tabela.getValueAt(linha_selecionada, 0); //armazena o número do cd aluno selecionado
        nmEquipamento_selecionado = (String) tabela.getValueAt(linha_selecionada, 1); //armazena o nome do aluno selecionado
        //System.out.println("codigo aluno selecionado : "+codAluno_selecionado);
        int op = JOptionPane.showConfirmDialog(null, "<html>O equipamento <b>"+nmEquipamento_selecionado+"</b> será ativado. Desejá continuar ?</html>");
            if(op == 0){
                updates.ativarCadastroEquipamento(codEquipamento_selecionado);
                JOptionPane.showMessageDialog(null, "EQUIPAMENTO ATIVO !!!");
                this.dispose();
            }  
    }//GEN-LAST:event_btnAtivarAlunoActionPerformed

    
    
    
    /* -----------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     /* -----------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaListaAlunosInativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaAlunosInativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaAlunosInativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaAlunosInativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         /* -----------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaAlunosInativos().setVisible(true);
            }
        });
    } -----------------------------------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtivarAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
