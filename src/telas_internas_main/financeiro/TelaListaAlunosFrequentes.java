
package telas_internas_main.financeiro;

import classes.ClassejTableSelect;
import conexoesbancodedados.ConectaBd;
import conexoesbancodedados.SelectBd;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.AttributedCharacterIterator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaListaAlunosFrequentes extends javax.swing.JFrame {

    SelectBd selects = new SelectBd();
    int linha_selecionada;
    int codAluno_selecionado;
    int contLinhas=0;
    String nmAluno_selecionado;
    ArrayList<String> nomesAlunosVendidos = new ArrayList();
   
    public TelaListaAlunosFrequentes() {
        initComponents();
        this.preencherTabela("SELECT B.NOME,B.TEL1, DATE_FORMAT(A.DT_ENTRADA,'%e/%m/%Y'), DATEDIFF(NOW(),A.DT_ENTRADA), MAX(C.DT_FIM) FROM TB_FREQUENCIA_ALUNOS A INNER JOIN TB_ALUNOS B ON B.CD_REGISTRO = A.CD_REGISTRO LEFT JOIN TB_TREINOSA C ON C.CD_REGISTRO = A.CD_REGISTRO WHERE B.SITUACAO = 1 AND DATEDIFF(NOW(),A.DT_ENTRADA) < 8 GROUP BY A.CD_REGISTRO ORDER BY 4"); 
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
        String[] colunas = new String[]{"NOME","TELEFONE","DT ULT.TREINO","DIAS AUS.","DT VENC.TREINO"};
        Connection con = ConectaBd.getConnection();
        ResultSet rs = this.executaSql(Sql);     
        
        //SE A LISTA DE INATIVOS ESTIVER VAZIA NÃO FAZ NADA PARA NÃO DAR ERRO, SE NÃO ELE EXECUTA E PREENCHE O JTABLE
        try {
            if(rs.next()){
                try{
                rs.first();
                    do{
                        dados.add(new Object[]{rs.getString("B.NOME"),rs.getString("B.TEL1")
                                                ,rs.getString("DATE_FORMAT(A.DT_ENTRADA,'%e/%m/%Y')")
                                                ,rs.getString("DATEDIFF(NOW(),A.DT_ENTRADA)")
                                                ,rs.getString("MAX(C.DT_FIM)")});
                        contLinhas++;
                    }while(rs.next());
                }catch(SQLException ex){
                   JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER O ARRAYLIST"+ex);
                }   
            }else{
               //NÃO FAZ NADA
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaListaAlunosFrequentes.class.getName()).log(Level.SEVERE, null, ex);
        }

        total.setText(contLinhas+" alunos");
        ClassejTableSelect modelo = new ClassejTableSelect(dados, colunas);
        
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(290);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(80);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);    
        
        try {
            this.pintarTreinosVencidos();
        } catch (ParseException ex) {
            Logger.getLogger(TelaListaAlunosFrequentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaListaAlunosFrequentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alunos frequentes");

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

        jLabel2.setText("LISTA DE ALUNOS FREQUENTES NA ACADEMIA");

        jLabel3.setText("TOTAL :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void pintarTreinosVencidos() throws ParseException, SQLException{
  
        nomesAlunosVendidos = selects.retornaAlunosTreinoVencido();
            
        
        
        String texte = "a";
        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column){
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                        
                Color c = Color.WHITE;
                    for(int i = 0; i < nomesAlunosVendidos.size(); i++){
                        Object texto = table.getValueAt(row, 0);
                        if(nomesAlunosVendidos.get(i).equals(texto))
                            c = Color.RED;
                        label.setBackground(c);
                        tabela.setSelectionForeground(Color.GREEN);
                
                    
                    }
                return label;
                
                /*
                Object texto = table.getValueAt(row, 4);
                if(texto != null && texte == "a")
                    c = Color.RED;
                label.setBackground(c);
                tabela.setSelectionForeground(Color.GREEN);
                
                return label;
                */
                
            }
            
        });
        
        
        
        
//        System.out.println(nomesAlunosVendidos);
//        System.out.println(nomesAlunosVendidos.get(0));
        
        /*
        //https://www.youtube.com/watch?v=-5z16LHWEtE
        
        ArrayList<Date> treinosVencidos = new ArrayList();
        ArrayList<String> treinosV = new ArrayList();
        Date dataSistema = new Date();
        SimpleDateFormat formatoPT = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date dataAtual = new java.sql.Date(dataSistema.getTime());
        
       
        for(int i=0; i < contLinhas;i++){
            treinosV.add((String)tabela.getValueAt(i,4));
        }
        
//        System.out.println(treinosV);
        
        for(int l = 0; l < contLinhas; l++){
            Date data = formatoPT.parse((String) tabela.getValueAt(l,4));
            java.sql.Date dataSql = new java.sql.Date(data.getTime());
            treinosVencidos.add(dataSql);
        }  

        
        String texte = "a";
        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column){
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus, row, column);
                
                Color c = Color.WHITE;
                Object texto = table.getValueAt(row, 4);
//                Object texto = dataAtual; //2018-10-08
                if(texto != null && texte == "a")
//                if(treinosVencidos.get(0).before((Date) texto)) 
                    c = Color.RED;
                label.setBackground(c);
                tabela.setSelectionForeground(Color.GREEN);
                
                return label;
            }
            
        });
        */

    }
    
    
    
    /* ----------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   
   /* ----------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaListaAlunosFrequentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaAlunosFrequentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaAlunosFrequentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaAlunosFrequentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
    /* ----------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaAlunosFrequentes().setVisible(true);
            }
        });
    } -----------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
