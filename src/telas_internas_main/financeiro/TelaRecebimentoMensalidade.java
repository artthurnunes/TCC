
package telas_internas_main.financeiro;

import classes.ClassePagamentoMensalidade;
import classes.ClasseCaractersFloat;
import conexoesbancodedados.InsertBd;
import conexoesbancodedados.SelectBd;
import conexoesbancodedados.UpdateBd;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telas_internas_main.cadastro.TelaCadastro;


public class TelaRecebimentoMensalidade extends javax.swing.JFrame {

    SelectBd selects = new SelectBd();
    UpdateBd updates = new UpdateBd();
    InsertBd inserts = new InsertBd();
    ClassePagamentoMensalidade mensalidade = new ClassePagamentoMensalidade();
    SimpleDateFormat formatoPT = new SimpleDateFormat("dd/MM/yyyy");
    
    public TelaRecebimentoMensalidade() {
        initComponents();
        dtVencimento.setEditable(false);
        vlMensalidade.setEditable(false);
        valorPago.setDocument(new ClasseCaractersFloat());
    }

    private void limparCampos(){
        nome.setText("");
        codigo.setText("");
        dtVencimento.setText("");
        vlMensalidade.setText("");
        valorPago.setText("");
        dtPagamento.setText("");
    }
    
    private void setaCamposParaClasse() throws ParseException{
        mensalidade.setCodigo(Integer.parseInt(codigo.getText()));
        mensalidade.setNome(nome.getText());
        
        Date dataV = formatoPT.parse(dtVencimento.getText()); //conversão de data
        java.sql.Date dataSql1 = new java.sql.Date(dataV.getTime()); //conversão de data
        mensalidade.setDtVencimento(dataSql1);
        
        Date dataP = formatoPT.parse(dtPagamento.getText()); //conversão de data
        java.sql.Date dataSql = new java.sql.Date(dataP.getTime()); //conversão de data
        mensalidade.setDtPagamento(dataSql);
        
        mensalidade.setValorPago(Float.parseFloat(valorPago.getText()));
        //System.out.println(mensalidade.getValorPago());

        
    }
    
    private void setaCamposDaClasse(){
        nome.setText(mensalidade.getNome());
        codigo.setText(Integer.toString(mensalidade.getCodigo()));
        dtVencimento.setText(formatoPT.format(mensalidade.getDtVencimento()));
        vlMensalidade.setText(Float.toString(mensalidade.getValorMensalidade()));
       // vencimento.setText(formatoPT.format(despesas.getVencimento()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        vlMensalidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        codigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dtVencimento = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        btnPesquisar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        valorPago = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dtPagamento = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            dtPagamento = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamento de mensalidades");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setText("Valor mensalidade:");

        jLabel2.setText("Nome:");

        codigo.setText("Código");

        jLabel4.setText("Vencimento:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1486485553-ago-arrow-arrow-left-back-previous-direction-left_81160.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/setadireita.png"))); // NOI18N
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        btnPesquisar2.setText("Limpar");
        btnPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(vlMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPesquisar)
                        .addComponent(btnPesquisar2))
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAvancar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(vlMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jLabel1.setText("RECEBIMENTO DE MENSALIDADE");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Valor Pago:");

        jLabel6.setText("Data Pagamento:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        mensalidade.setNome(nome.getText());
        this.limparCampos();
        
        //Try para contar quantas linhas o select vai retornar
        try{
            selects.setQt_linhas_select(selects.selectQtLinhasTelaMensalidade(mensalidade));
        }catch(SQLException ex) {
            Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            selects.retornaPagamentoMensalidade(mensalidade);
        } catch (SQLException ex) {
            Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.setaCamposDaClasse();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar2ActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btnPesquisar2ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if("".equals(valorPago.getText())){
            JOptionPane.showMessageDialog(null, "Valor pago em branco.");
        }else if("  /  /    ".equals(dtPagamento.getText())){
            JOptionPane.showMessageDialog(null, "Data pagamento não pode ser em branco.");
        }else{
            try {
                this.setaCamposParaClasse();
            } catch (ParseException ex) {
                Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(Level.SEVERE, null, ex);
            }
            updates.atualizaValoresMensalidade(mensalidade);
                try {
                    inserts.insereHistoricoPagamentos(mensalidade.getCodigo());
                } catch (SQLException ex) {
                    Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(Level.SEVERE, null, ex);
                }
        JOptionPane.showMessageDialog(null, "<html>MENSALIDADE DE: <i>"+nome.getText()+"</i> <br><br><b><center>PAGO !!!</center></html>");    
        this.limparCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        if(selects.getLinha_atual_select() < selects.getQt_linhas_select()){
            selects.setLinha_atual_select(selects.getLinha_atual_select()+1);
            this.limparCampos();
            mensalidade.setNome("");
            try {
                    selects.retornaPagamentoMensalidade(mensalidade);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(Level.SEVERE, null, ex);
                }
        }else{
            JOptionPane.showMessageDialog(null, "Ultimo registro para esta busca !");
        }       
        this.setaCamposDaClasse();
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if((selects.getLinha_atual_select()-1) >= 1){
            selects.setLinha_atual_select(selects.getLinha_atual_select()-1);
            this.limparCampos();
            mensalidade.setNome("");
            try {
                    selects.retornaPagamentoMensalidade(mensalidade);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        this.setaCamposDaClasse();
    }//GEN-LAST:event_btnVoltarActionPerformed

    /* -----------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /* --------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRecebimentoMensalidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    /* --------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRecebimentoMensalidade().setVisible(true);
            }
        });
    }  --------------------------------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisar2;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField dtPagamento;
    private javax.swing.JTextField dtVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField valorPago;
    private javax.swing.JTextField vlMensalidade;
    // End of variables declaration//GEN-END:variables
}
