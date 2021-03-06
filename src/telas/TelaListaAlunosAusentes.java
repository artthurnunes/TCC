
package telas;

import classes.ClasseCadastro;
import classes.ClassejTableSelect;
import conexoesbancodedados.ConectaBd;
import conexoesbancodedados.SelectBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class TelaListaAlunosAusentes extends javax.swing.JFrame {

    SelectBd selects = new SelectBd();
    int linha_selecionada;
    int codAluno_selecionado;
    String nmAluno_selecionado;
    ClasseCadastro classecadastro = new ClasseCadastro();

    public TelaListaAlunosAusentes() {
        initComponents();
        this.preencherTabela("SELECT B.NOME,B.TEL1, DATE_FORMAT(A.DT_ENTRADA,'%e/%m/%Y'), DATEDIFF(NOW(),A.DT_ENTRADA) FROM TB_FREQUENCIA_ALUNOS A INNER JOIN TB_ALUNOS B ON B.CD_REGISTRO = A.CD_REGISTRO WHERE DATEDIFF(NOW(),DT_ENTRADA) > 7"); 
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
        String[] colunas = new String[]{"NOME","TELEFONE","DT ULT. TREINO","DIAS AUSENTES"};
        Connection con = ConectaBd.getConnection();
        ResultSet rs = this.executaSql(Sql);     
        
        //SE A LISTA DE INATIVOS ESTIVER VAZIA NÃO FAZ NADA PARA NÃO DAR ERRO, SE NÃO ELE EXECUTA E PREENCHE O JTABLE
        try {
            if(rs.next()){
                try{
                rs.first();
                    do{
                        dados.add(new Object[]{rs.getString("B.NOME"),rs.getString("B.TEL1"),rs.getString("DATE_FORMAT(A.DT_ENTRADA,'%e/%m/%Y')"),rs.getString("DATEDIFF(NOW(),A.DT_ENTRADA)")});
                    }while(rs.next());
                }catch(SQLException ex){
                   JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER O ARRAYLIST"+ex);
                }   
            }else{
               //NÃO FAZ NADA
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaListaAlunosAusentes.class.getName()).log(Level.SEVERE, null, ex);
        }

        ClassejTableSelect modelo = new ClassejTableSelect(dados, colunas);
        
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(290);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(120);
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alunos Inativos");

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

        btnAtivarAluno.setText("AVANÇAR");
        btnAtivarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarAlunoActionPerformed(evt);
            }
        });

        jLabel1.setText("Ir para a tela de Cadastro do aluno ?");

        jLabel2.setText("ALUNOS COM AUSENCIA DE 7 OU MAIS DIAS DE FREQUÊNCIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtivarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtivarAluno)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   private TelaPrincipal principal;
   public void MostrarTela(TelaPrincipal telaprincipal){
       this.principal = telaprincipal;
       setVisible(true);
   }
   
   public void ExecutaMetodo(){
       principal.abrirTelaCadastro();
       this.dispose();
   }
    
    private void btnAtivarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarAlunoActionPerformed
        linha_selecionada = tabela.getSelectedRow(); //seleciona a linha que o usuário clicou na tabela
        //codAluno_selecionado = (Integer)tabela.getValueAt(linha_selecionada, 0); //armazena o número do cd aluno selecionado
        nmAluno_selecionado = (String) tabela.getValueAt(linha_selecionada, 0); //armazena o nome do aluno selecionado
        classecadastro.setNome(nmAluno_selecionado);
        
        int op = JOptionPane.showConfirmDialog(null, "<html>Ir para o cadastro do aluno <b>"+nmAluno_selecionado+"</b> ?</html>");
            if(op == 0){
                try {
                    selects.selectCadastroAlfabetico(classecadastro);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListaAlunosAtivos.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.ExecutaMetodo();   
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
