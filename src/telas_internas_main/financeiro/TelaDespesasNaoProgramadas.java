/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas_internas_main.financeiro;

import classes.ClasseDespesas;
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

public class TelaDespesasNaoProgramadas extends javax.swing.JDialog {

    boolean novaDespesa = true;
    ClasseDespesas despesas = new ClasseDespesas();
    InsertBd inserts = new InsertBd();
    SelectBd selects = new SelectBd();
    UpdateBd updates = new UpdateBd();
    SimpleDateFormat formatoPT = new SimpleDateFormat("dd/MM/yyyy");
    
    public TelaDespesasNaoProgramadas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    
    private void setarCamposParaClasse() throws ParseException{
        despesas.setNome(nome.getText());
        Date dataf = formatoPT.parse(vencimento.getText()); //conversão de data
        java.sql.Date dataSql = new java.sql.Date(dataf.getTime()); //conversão de data
        despesas.setVencimento(dataSql);
        despesas.setValor(Float.valueOf(valor.getText()));
    }
    
    private void setarCamposDaClasse(){
        nome.setText(despesas.getNome());
        vencimento.setText(formatoPT.format(despesas.getVencimento()));
        valor.setText(Float.toString(despesas.getValor()));
        
    }
    
    private void limparCampos(){
        novaDespesa = true;
        nome.setText("");
        vencimento.setText("");
        valor.setText("");
    }
    
    private void limparClasse() throws ParseException{
        despesas.setCodigo(0);
        despesas.setNome("");
        despesas.setValor(0);
        Date vazio = formatoPT.parse("01/01/1990"); //conversão de data
        java.sql.Date dataSql = new java.sql.Date(vazio.getTime()); //conversão de data
        despesas.setVencimento(vazio);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vencimento = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            vencimento = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        btnLista = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnPago = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesas não programadas");

        jLabel1.setText("DESPESAS EXTRAS NÃO PAGAS");

        jLabel2.setText("Despesa:");

        jLabel3.setText("Valor:");

        jLabel4.setText("Vencimento:");

        btnLista.setText("LISTAR DESPESAS");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnPago.setText("PAGO");
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nome))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPesquisar)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(145, 145, 145)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(btnPago)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnLista)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnPago))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnPesquisar)
                    .addComponent(btnLista))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if("".equals(nome.getText())){
            JOptionPane.showMessageDialog(null, "Campo NOME não pode estar vazio.");
            }else if("".equals(vencimento.getText())){
                JOptionPane.showMessageDialog(null, "Campo VENCIMENTO não pode estar vazio.");
                }else if("".equals(valor.getText())){
                    JOptionPane.showMessageDialog(null, "Campo VALOR não pode estar vazio.");
                    }else if(novaDespesa){ //NOVA DESPESA FAZ INSERT
                        try { //TRY PARA CONVERTER DATA FORMATO EN PARA BANCO
                            this.setarCamposParaClasse();
                        } catch (ParseException ex) {
                            Logger.getLogger(TelaDespesasNaoProgramadas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        inserts.insereDespesasNaoProgramadas(despesas);
                        this.limparCampos();   
                         }else{ //SENÃO FAZ UPDATE NA QUE ESTÁ NA TELA
                            try {
                                this.setarCamposParaClasse();
                            } catch (ParseException ex) {
                                Logger.getLogger(TelaDespesasNaoProgramadas.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            updates.alteraValorDespesas(despesas); 
                         }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        novaDespesa = false;
        despesas.setNome(nome.getText());
               
        try {
            selects.verificaNaoDespesasProgramadas(despesas);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDespesasNaoProgramadas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setarCamposDaClasse();
        //PEGANDO O NOME DA DESPESA DEPOIS DO RETORNO DO SELECT PARA PEGAR O NOME CORRETO
        try { //DEIXANDO O CODIGO DA DESPESA SETADA NA CLASSE CASO HAJA NECESSIDADE DE ALTERAR A DESPESA COM UPDATE
                despesas.setCodigo(selects.codigoDespesa(nome.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(TelaDespesasNaoProgramadas.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.limparCampos();
        try {
            this.limparClasse();
        } catch (ParseException ex) {
            Logger.getLogger(TelaDespesasNaoProgramadas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Confirma o pagamento desta despesa ? ");
        if(i == 0){
            updates.pagaDespesa(despesas);
        }
    }//GEN-LAST:event_btnPagoActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        this.dispose();
        new TelaListaDespesasNaoProgramadas().setVisible(true);
    }//GEN-LAST:event_btnListaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaDespesasNaoProgramadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDespesasNaoProgramadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDespesasNaoProgramadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDespesasNaoProgramadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDespesasNaoProgramadas dialog = new TelaDespesasNaoProgramadas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField valor;
    private javax.swing.JTextField vencimento;
    // End of variables declaration//GEN-END:variables
}
