
package telas_internas_main.financeiro;

import telas.TelaPrincipal;

public class TelaFinanceiro extends javax.swing.JInternalFrame {
    
    TelaListaAlunosFrequentes alunosFrequentes = new TelaListaAlunosFrequentes();
    
    public TelaFinanceiro() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtrasos = new javax.swing.JButton();
        btnDespesasProgramadas = new javax.swing.JButton();
        btnMensalidades = new javax.swing.JButton();
        btnFrequencia = new javax.swing.JButton();
        btnDespesasNaoProgramadas = new javax.swing.JButton();
        btnFinancas = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Financeiro");

        btnAtrasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/negative-sign_icon-icons.com_70439.png"))); // NOI18N
        btnAtrasos.setText("ALUNOS EM ATRASO");
        btnAtrasos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtrasos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtrasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasosActionPerformed(evt);
            }
        });

        btnDespesasProgramadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cash_icon-icons.com_51090.png"))); // NOI18N
        btnDespesasProgramadas.setText("DESPESAS PROGRAMADAS");
        btnDespesasProgramadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDespesasProgramadas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDespesasProgramadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespesasProgramadasActionPerformed(evt);
            }
        });

        btnMensalidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/receiptofcash_cash_money_4581.png"))); // NOI18N
        btnMensalidades.setText("RECEBIMENTO DE MENSALIDADES");
        btnMensalidades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMensalidades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMensalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensalidadesActionPerformed(evt);
            }
        });

        btnFrequencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/stocks-512x512_97224.png"))); // NOI18N
        btnFrequencia.setText("FREQUÊNCIA DOS ALUNOS");
        btnFrequencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFrequencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrequenciaActionPerformed(evt);
            }
        });

        btnDespesasNaoProgramadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business-economic-finance-interprise-point-of-services_88994 (2).png"))); // NOI18N
        btnDespesasNaoProgramadas.setText("DESPESAS NÃO PROGRAMADAS");
        btnDespesasNaoProgramadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDespesasNaoProgramadas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDespesasNaoProgramadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespesasNaoProgramadasActionPerformed(evt);
            }
        });

        btnFinancas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1486564180-finance-financial-report_81493.png"))); // NOI18N
        btnFinancas.setText("SITUAÇÃO FINANCEIRA");
        btnFinancas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFinancas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFinancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDespesasProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(btnDespesasNaoProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtrasos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(btnFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMensalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMensalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtrasos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDespesasNaoProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDespesasProgramadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDespesasProgramadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespesasProgramadasActionPerformed
        new TelaDespesasProgramadas(null,true).setVisible(true);
    }//GEN-LAST:event_btnDespesasProgramadasActionPerformed

   
    private void btnFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrequenciaActionPerformed
        new TelaListaAlunosFrequentes().setVisible(true);
    }//GEN-LAST:event_btnFrequenciaActionPerformed

    private void btnDespesasNaoProgramadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespesasNaoProgramadasActionPerformed
        new TelaDespesasNaoProgramadas(null,true).setVisible(true);
    }//GEN-LAST:event_btnDespesasNaoProgramadasActionPerformed

    private void btnAtrasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasosActionPerformed
        new TelaListaAlunosEmAtraso().setVisible(true);
    }//GEN-LAST:event_btnAtrasosActionPerformed

    private void btnMensalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensalidadesActionPerformed
        new TelaRecebimentoMensalidade().setVisible(true);
    }//GEN-LAST:event_btnMensalidadesActionPerformed

    private void btnFinancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinancasActionPerformed
        new TelaSituacaoFinanceira().setVisible(true);
    }//GEN-LAST:event_btnFinancasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasos;
    private javax.swing.JButton btnDespesasNaoProgramadas;
    private javax.swing.JButton btnDespesasProgramadas;
    private javax.swing.JButton btnFinancas;
    private javax.swing.JButton btnFrequencia;
    private javax.swing.JButton btnMensalidades;
    // End of variables declaration//GEN-END:variables
}
