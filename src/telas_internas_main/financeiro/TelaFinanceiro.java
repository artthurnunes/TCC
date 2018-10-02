/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas_internas_main.financeiro;

import telas_internas_main.financeiro.TelaDespesasProgramadas;

/**
 *
 * @author Arthur
 */
public class TelaFinanceiro extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaFinanceiro
     */
    public TelaFinanceiro() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnDespesasProgramadas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnFrequencia = new javax.swing.JButton();
        btnDespesasNaoProgramadas = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Financeiro");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/negative-sign_icon-icons.com_70439.png"))); // NOI18N
        jButton1.setText("ALUNOS EM ATRASO");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/receiptofcash_cash_money_4581.png"))); // NOI18N
        jButton3.setText("RECEBIMENTO DE MENSALIDADES");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
        btnDespesasNaoProgramadas.setText("DISPEZAS NÃO PROGRAMADAS");
        btnDespesasNaoProgramadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDespesasNaoProgramadas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDespesasNaoProgramadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespesasNaoProgramadasActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1486564180-finance-financial-report_81493.png"))); // NOI18N
        jButton6.setText("SITUAÇÃO FINANCEIRA MENSAL");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(btnFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDespesasNaoProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TelaListaAlunosEmAtraso().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new TelaRecebimentoMensalidade().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDespesasNaoProgramadas;
    private javax.swing.JButton btnDespesasProgramadas;
    private javax.swing.JButton btnFrequencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
