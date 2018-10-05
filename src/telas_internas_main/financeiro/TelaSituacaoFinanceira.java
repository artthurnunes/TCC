
package telas_internas_main.financeiro;

import classes.ClasseSituacaoFinanceira;
import conexoesbancodedados.SelectBd;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelaSituacaoFinanceira extends javax.swing.JFrame {

    ClasseSituacaoFinanceira finan = new ClasseSituacaoFinanceira();
    SelectBd selects = new SelectBd();
    SimpleDateFormat formatoPT = new SimpleDateFormat("dd/MM/yyyy");
    

    public TelaSituacaoFinanceira() {
        initComponents();
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        gastos.setVisible(false);
        mensalidades.setVisible(false);
        total.setVisible(false);
    }
    
    private void limpaCampos(){
        gastos.setText("0");
        mensalidades.setText("0");
        total.setText("0");
    }
    
    private void setarCampoParaClasse() throws ParseException{
        //CARREGAR DATA INICIAL NO FORMADO DO BANCO
        String stringData = formatoPT.format(calendarioInicio.getDate()); //Data PT
        Date dataPT = formatoPT.parse(stringData);
        java.sql.Date dataBD = new java.sql.Date(dataPT.getTime());
        finan.setDataInicial(dataBD);
        //CARREGAR DATA FINAL NO FORMADO DO BANCO
        String stringData1 = formatoPT.format(calendarioFim.getDate()); //Data PT
        Date data1PT = formatoPT.parse(stringData1);
        java.sql.Date data1BD = new java.sql.Date(data1PT.getTime());
        finan.setDataFinal(data1BD);
        
    }
    
    private void setarCamposDaClasse(){
        gastos.setText(Float.toString(finan.getGastos()));
        mensalidades.setText(Float.toString(finan.getMensalidade()));
        total.setText(Float.toString(finan.getTotal()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        calendarioInicio = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        calendarioFim = new com.toedter.calendar.JCalendar();
        btnGerar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        gastos = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        mensalidades = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Simulação de saldo/débito");

        jLabel1.setText("SIMULAÇÃO DE GASTOS ");

        jLabel2.setText("Data Inicial:");

        jLabel3.setText("Data Final:");

        btnGerar.setText("GERAR");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        txt1.setText("Gastos: ");

        gastos.setText("Gastos");

        txt2.setText("Mensalidade:");

        mensalidades.setText("Mensalidades");

        txt3.setText("SALDO/DÉBITO:");

        total.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gastos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(gastos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(mensalidades))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3)
                    .addComponent(total))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(calendarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarioFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calendarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendarioFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGerar)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        try {
            this.setarCampoParaClasse();
            selects.retornaDespesasPagas(finan);
        } catch (ParseException ex) {
            Logger.getLogger(TelaSituacaoFinanceira.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaSituacaoFinanceira.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setarCamposDaClasse();
            if(finan.getTotal() < 0){
                total.setForeground(Color.red);
                total.setText(Float.toString(finan.getTotal()));
            }else{
                total.setForeground(Color.blue);
                total.setText(Float.toString(finan.getTotal()));
            }
            
        txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
        gastos.setVisible(true);
        mensalidades.setVisible(true);
        total.setVisible(true);
//        System.out.println(finan.getDataInicial());
//        System.out.println(finan.getDataFinal());
    }//GEN-LAST:event_btnGerarActionPerformed

 
    /* -------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   /* -------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSituacaoFinanceira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSituacaoFinanceira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSituacaoFinanceira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSituacaoFinanceira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
   
    /* -------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSituacaoFinanceira().setVisible(true);
            }
        });
    }  -------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private com.toedter.calendar.JCalendar calendarioFim;
    private com.toedter.calendar.JCalendar calendarioInicio;
    private javax.swing.JLabel gastos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensalidades;
    private javax.swing.JLabel total;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables
}
