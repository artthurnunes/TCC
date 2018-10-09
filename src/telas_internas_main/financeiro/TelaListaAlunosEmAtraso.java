
package telas_internas_main.financeiro;

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



public class TelaListaAlunosEmAtraso extends javax.swing.JFrame {

    SelectBd selects = new SelectBd();
    
    
    //int[] codAluno_linha = new int[100]; //vetor para armazenar codigos de alunos com mesmo nome para listar
    //int contador_linhas=0; //contagem de linhas da lista de contagem de nomes iguais
    //int linha_selecionada;
    //int codAluno_selecionado;
    String nmAluno_selecionado;

    public TelaListaAlunosEmAtraso() {
        initComponents();
        this.preencherTabela("SELECT A.CD_REGISTRO,A.NOME,A.TEL1, DATE_FORMAT(D.DT_ENTRADA,'%e/%m/%Y'),B.VALOR,MAX(DATE_FORMAT(C.PROXIMO_VENCIMENTO,'%e/%m/%Y')) FROM TB_ALUNOS A INNER JOIN TB_PLANOS_ALUNOS B ON B.CD_REGISTRO = A.CD_REGISTRO AND SN_ATIVO = 1 INNER JOIN TB_HISTORICO_PAGAMENTOS_ALUNOS C ON C.CD_REGISTRO = A.CD_REGISTRO LEFT JOIN TB_FREQUENCIA_ALUNOS D ON D.CD_REGISTRO = A.CD_REGISTRO WHERE C.PROXIMO_VENCIMENTO < NOW() AND C.DT_PAGAMENTO IS NULL GROUP BY A.CD_REGISTRO,A.NOME,A.TEL1,D.DT_ENTRADA,B.VALOR"); 
        
        total.setText("R$ "+Float.toString(this.somaDespesas())+" de débitos à receber");
    }
    
    public float somaDespesas(){
        int qt_linhas_retornadas=0;
        float soma = 0;
        qt_linhas_retornadas = tabela.getRowCount(); //seleciona a linha que o usuário clicou na tabela
//        System.out.println("Numero de linas da tabela "+qt_linhas_retornadas);
//        System.out.println("Linha selecionada "+tabela.getSelectedRow());
            for(int i=0;i < qt_linhas_retornadas;i++)
                soma += (Float)tabela.getValueAt(i, 4);
                
        return soma;
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
        String[] colunas = new String[]{"CD","NOME ALUNOS","TELEFONE","ULT. TREINO","VALOR","VENCIMENTO"};
        Connection con = ConectaBd.getConnection();
        ResultSet rs = this.executaSql(Sql);     
        
        //SE A LISTA DE ALUNOS ESTIVER VAZIA NÃO FAZ NADA PARA NÃO DAR ERRO, SE NÃO ELE EXECUTA E PREENCHE O JTABLE
        try {
            if(rs.next()){
                try{
                rs.first();
                    do{
                        dados.add(new Object[]{rs.getInt("A.CD_REGISTRO"),rs.getString("A.NOME"),rs.getString("A.TEL1"),
                                               rs.getString("DATE_FORMAT(D.DT_ENTRADA,'%e/%m/%Y')"),rs.getFloat("B.VALOR"),
                                               rs.getString("MAX(DATE_FORMAT(C.PROXIMO_VENCIMENTO,'%e/%m/%Y'))")});
                    }while(rs.next());
                }catch(SQLException ex){
                   JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER O ARRAYLIST"+ex);
                }   
            }else{
               //NÃO FAZ NADA
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaListaAlunosEmAtraso.class.getName()).log(Level.SEVERE, null, ex);
        }

        ClassejTableSelect modelo = new ClassejTableSelect(dados, colunas);
        
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(90);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(5).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de alunos em atraso");

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

        jLabel2.setText("TOTAL :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
