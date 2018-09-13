
package telas_internas_main;

import classes.ClasseEquipamentos;
import conexoesbancodedados.InsertBd;
import conexoesbancodedados.SelectBd;
import javax.swing.JOptionPane;

public class TelaEquipamentos extends javax.swing.JInternalFrame {

    ClasseEquipamentos equipamentos = new ClasseEquipamentos();
    SelectBd selects = new SelectBd();
    InsertBd inserts = new InsertBd();

    public TelaEquipamentos() {
        initComponents();
        valor_equipamento.setText("0");
    }
    
    private void limparCampos(){
        cd_equipamento.setText("");
        nm_equipamento.setText("");
        dt_compra_equipamento.setText("");
        fornecedor_equipamento.setText("");
        nota_equipamento.setText("");
        valor_equipamento.setText("");
        dt_garantia_equipamento.setText("");
        dt_ultima_manutencao.setText("");
        empresa_manutencao.setText("");
        dt_garantia_manutencao.setText("");
        dt_proxima_manutencao.setText("");
        proxima_empresa.setText("");
    }

    private void setarCamposParaClasse(){
        equipamentos.setNm_equipamento(nm_equipamento.getText());
        equipamentos.setDt_compra_equipamento(dt_compra_equipamento.getText());
        equipamentos.setFornecedor_equipamento(fornecedor_equipamento.getText());
        equipamentos.setNota_equipamento(nota_equipamento.getText());
        equipamentos.setValor_equipamento(Float.parseFloat(valor_equipamento.getText()));
        equipamentos.setDt_garantia_equipamento(dt_garantia_equipamento.getText());
        equipamentos.setDt_ultima_manutencao(dt_ultima_manutencao.getText());
        equipamentos.setEmpresa_manutencao(empresa_manutencao.getText());
        equipamentos.setDt_garantia_manutencao(dt_garantia_manutencao.getText());
        equipamentos.setDt_proxima_manutencao(dt_proxima_manutencao.getText());
        equipamentos.setProxima_empresa(proxima_empresa.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        txtNomeEqui = new javax.swing.JLabel();
        nm_equipamento = new javax.swing.JTextField();
        txtDaCompra = new javax.swing.JLabel();
        dt_compra_equipamento = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JLabel();
        fornecedor_equipamento = new javax.swing.JTextField();
        txtNf = new javax.swing.JLabel();
        nota_equipamento = new javax.swing.JTextField();
        txtValorEqui = new javax.swing.JLabel();
        valor_equipamento = new javax.swing.JTextField();
        txtGarantia = new javax.swing.JLabel();
        dt_garantia_equipamento = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtUltMan = new javax.swing.JLabel();
        dt_ultima_manutencao = new javax.swing.JTextField();
        txtProMan = new javax.swing.JLabel();
        dt_proxima_manutencao = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JLabel();
        empresa_manutencao = new javax.swing.JTextField();
        txtGarantiaM = new javax.swing.JLabel();
        dt_garantia_manutencao = new javax.swing.JTextField();
        txtEmpresaM = new javax.swing.JLabel();
        proxima_empresa = new javax.swing.JTextField();
        cd_equipamento = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnNovo = new javax.swing.JMenu();
        btnPesquisar = new javax.swing.JMenu();
        btnSalvar = new javax.swing.JMenu();
        btnExcluir = new javax.swing.JMenu();
        btnVoltar = new javax.swing.JMenu();
        btnProximo = new javax.swing.JMenu();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tela Equipamentos");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle de equipamentos"));

        txtNomeEqui.setText("Nome do equipamento:");

        txtDaCompra.setText("Data da compra:");

        txtFornecedor.setText("Fornecedor:");

        txtNf.setText("Nota Fiscal:");

        txtValorEqui.setText("Valor:");

        txtGarantia.setText("Garantia:");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Manutenções"));

        txtUltMan.setText("Data ultima manutenção : ");

        txtProMan.setText("Próxima manutenção:");

        txtEmpresa.setText("Empresa:");

        txtGarantiaM.setText("Garantia:");

        txtEmpresaM.setText("Empresa que fará a manutenção:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtUltMan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt_ultima_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empresa_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGarantiaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt_garantia_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtProMan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt_proxima_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpresaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proxima_empresa)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUltMan)
                    .addComponent(dt_ultima_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpresa)
                    .addComponent(empresa_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGarantiaM)
                    .addComponent(dt_garantia_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmpresaM)
                        .addComponent(proxima_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProMan)
                        .addComponent(dt_proxima_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtValorEqui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGarantia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt_garantia_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(791, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtNomeEqui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nm_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fornecedor_equipamento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtDaCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dt_compra_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtNf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nota_equipamento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cd_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNomeEqui)
                                .addComponent(nm_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDaCompra)
                                .addComponent(dt_compra_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cd_equipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornecedor)
                    .addComponent(fornecedor_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNf)
                    .addComponent(nota_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorEqui)
                    .addComponent(valor_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGarantia)
                    .addComponent(dt_garantia_equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnNovo);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnPesquisar);

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnSalvar);

        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnExcluir);

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1486485553-ago-arrow-arrow-left-back-previous-direction-left_81160.png"))); // NOI18N
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnVoltar);

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/setadireita.png"))); // NOI18N
        btnProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProximoMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnProximo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        this.limparCampos();
        selects.setLinha_atual_select(1);//reseta a contagem do retorno de select com vários registros
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
//        classecadastro.setNome(Tcad_txtNome.getText());
//        this.limparCampos();
//
//        //Try para contar quantas linhas o select vai retornar
//        try{
//            selects.setQt_linhas_select(selects.selectQtLinhasSelectOrderNome(classecadastro));
//        }catch(SQLException ex) {
//            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //System.out.println("retorno de contagem com encapsulamento: "+selects.getQt_linhas_select()); //teste
//
//        try {
//            selects.selectCadastroAlfabetico(classecadastro);
//        } catch (SQLException ex) {
//            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        this.setarCamposDaClasse();

    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        //se estiver vazio o campo de codigo quer dizer que o cadastro e novo, caso nao esteja, nao sera feito
        //um insert e sim um update do cadastro
        if("".equals(cd_equipamento.getText())){
            if("".equals(nm_equipamento.getText())){
                JOptionPane.showMessageDialog(null, "Campo NOME não pode estar vazio.");
            }else if("".equals(dt_proxima_manutencao.getText())){
                JOptionPane.showMessageDialog(null, "Campo PRÓXIMA MANUTENÇÃO não pode estar vazio.");
            }else{
                this.setarCamposParaClasse();
                inserts.insereEquipamento(equipamentos);
                this.limparCampos();
            }
        }else{
//            this.setarCamposParaClasse();
//            updates.alterarCadastroAluno(classecadastro);
//
        }

    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
//        //sim = 0 - não = 1
//        if("".equals(lblCodigoAluno.getText())){//if para não dar erro se ainda não existir nenhum registro pesquisado
//
//        }else{
//            int op = JOptionPane.showConfirmDialog(null, "O cadastro não será excluído, o aluno será inativado.\n"
//                + "<html><b>Deseja continuar ?</b></html>");
//            if(op == 0){
//                updates.inativaCadastro(Integer.parseInt(lblCodigoAluno.getText()));
//                lblSituacaoAluno.setText("INATIVO");
//            }else{}
//        }
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
//        if((selects.getLinha_atual_select()-1) >= 1){
//            selects.setLinha_atual_select(selects.getLinha_atual_select()-1);
//            this.limparCampos();
//            classecadastro.setNome("");
//            try {
//                selects.selectCadastroAlfabetico(classecadastro);
//            } catch (SQLException ex) {
//                Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        this.setarCamposDaClasse();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximoMouseClicked

//        if(selects.getLinha_atual_select() < selects.getQt_linhas_select()){
//            selects.setLinha_atual_select(selects.getLinha_atual_select()+1);
//            this.limparCampos();
//            classecadastro.setNome("");
//            try {
//                selects.selectCadastroAlfabetico(classecadastro);
//            } catch (SQLException ex) {
//                Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }else{
//            JOptionPane.showMessageDialog(null, "Ultimo registro para esta busca !");
//        }
//
//        this.setarCamposDaClasse();
    }//GEN-LAST:event_btnProximoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnExcluir;
    private javax.swing.JMenu btnNovo;
    private javax.swing.JMenu btnPesquisar;
    private javax.swing.JMenu btnProximo;
    private javax.swing.JMenu btnSalvar;
    private javax.swing.JMenu btnVoltar;
    private javax.swing.JLabel cd_equipamento;
    private javax.swing.JTextField dt_compra_equipamento;
    private javax.swing.JTextField dt_garantia_equipamento;
    private javax.swing.JTextField dt_garantia_manutencao;
    private javax.swing.JTextField dt_proxima_manutencao;
    private javax.swing.JTextField dt_ultima_manutencao;
    private javax.swing.JTextField empresa_manutencao;
    private javax.swing.JTextField fornecedor_equipamento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField nm_equipamento;
    private javax.swing.JTextField nota_equipamento;
    private javax.swing.JTextField proxima_empresa;
    private javax.swing.JLabel txtDaCompra;
    private javax.swing.JLabel txtEmpresa;
    private javax.swing.JLabel txtEmpresaM;
    private javax.swing.JLabel txtFornecedor;
    private javax.swing.JLabel txtGarantia;
    private javax.swing.JLabel txtGarantiaM;
    private javax.swing.JLabel txtNf;
    private javax.swing.JLabel txtNomeEqui;
    private javax.swing.JLabel txtProMan;
    private javax.swing.JLabel txtUltMan;
    private javax.swing.JLabel txtValorEqui;
    private javax.swing.JTextField valor_equipamento;
    // End of variables declaration//GEN-END:variables
}
