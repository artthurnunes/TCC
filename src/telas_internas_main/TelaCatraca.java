/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas_internas_main;

import classes.ClasseCaractersNumeros;
import classes.ClasseCatraca;
import conexoesbancodedados.InsertBd;
import conexoesbancodedados.SelectBd;
import conexoesbancodedados.UpdateBd;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Arthur
 */
public class TelaCatraca extends javax.swing.JInternalFrame {

    ClasseCatraca catraca = new ClasseCatraca();
    SelectBd selects = new SelectBd();
    InsertBd inserts = new InsertBd();
    UpdateBd updates = new UpdateBd();
    Date dataSistema = new Date();
    SimpleDateFormat formatoPT = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatoBD = new SimpleDateFormat("yyyy/MM/dd");
    
    public TelaCatraca() {
        initComponents();
        cd_aluno.setDocument(new ClasseCaractersNumeros());
        lblData.setText(formatoPT.format(dataSistema));
         
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }
    
    //classe para mostar hora na tela
    class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM:%1$tS",now));
        }
    }
    
    private void setaCamposClasse(){       
        catraca.setCd_registro(Integer.parseInt(cd_aluno.getText()));
        catraca.setData_entrada(formatoBD.format(dataSistema));
        catraca.setHorario_entrada(lblHora.getText());
        catraca.setHorario_saida(lblHora.getText());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cd_aluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nome_aluno = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Liberação de catraca");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gym_101126.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setText("CÓDIGO ALUNO:");

        cd_aluno.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel3.setText("NOME DO ALUNO:");

        nome_aluno.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Enter_41039.png"))); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblHora.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 0, 204));

        lblData.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        jLabel4.setText("DIGITE SEU CÓDIGO PARA ENTRAR OU SAIR DA ACADEMIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cd_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(nome_aluno))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cd_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nome_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //FAZER UM SELECT COM O CODIGO DO ALUNO PARA A DATA ATUAL SE JA EXISTIR HORARIO DE ENTRADA(MAX POIS O 
        //ALUNO PODE ENTRAR E SAIR MAIS DE 1 X) MOSTRAR MENSAGEM DE ATE LOGO CASO CONTRARIO, BEM VINDO.
        boolean entrando = true;
        boolean primeiraVez = true;
        boolean debito = false;
        if("".equals(cd_aluno.getText())){
            JOptionPane.showMessageDialog(null, "Codigo vazio !");
        }else{
             this.setaCamposClasse();
                try { //SETA O NOME DO ALUNO NA TELA
                    nome_aluno.setText(selects.retornaNomeAluno(catraca.getCd_registro()));
                    debito = selects.retornaAlunoEmDebito(catraca.getCd_registro());
                        if("".equals(nome_aluno.getText())){
                            JOptionPane.showMessageDialog(null, "Codigo invalido !");
                        }else if(debito == true ){ //SE O ALUNO ESTIVER COM MENSALIDADE EM ATRASO NÃO ENTRA NA ACADEMIA
                            JOptionPane.showMessageDialog(null, "Entrada não autorizada. Procure o financeiro.");
                            cd_aluno.setText("");
                            nome_aluno.setText("");
                            }else{
                                //SE FOR A PRIMEIRA VEZ VAI FAZER UM INSERT NA TABELA DE FREQUENCIA SE NAO FAZ 
                                //UPDATE. TABELA PARA CONTROLE DE AUSENCIA/FREQUENCIA
                                primeiraVez = selects.retornaAlunoPrimeiroTreino(catraca.getCd_registro());
                                    if(primeiraVez){
                                        inserts.salvaDataUltimoTreino(catraca);
                                        }else{
                                            updates.atualizaDataUltimoTreino(catraca);
                                    }
                                //SE ALUNO NAO ESTIVER NA ACADEMIA ELE ENTRA COM O INSERT
                                //SE ESTIVER SAINDO FAZ UM UPDATE COM O HORARIO DE SAIDA NA TABELA HISTORICO FREQUENCIA
                                entrando = selects.retornaAlunoEntrandoOuSaindo(catraca.getCd_registro()); //select para verificar se esta entrando ou saindo atraves do horario e da data
                                if(entrando){//true ele esta entrando (hr_saida vazio)
                                    JOptionPane.showMessageDialog(null, "Seja bem vindo !");
                                    inserts.insereFrequenciaAlunoHistorico(catraca);//faz insert na tabela
                                    cd_aluno.setText("");
                                    nome_aluno.setText("");
                                    }else{ //false ele esta saindo (ja existe hr_saida)
                                        JOptionPane.showMessageDialog(null, "Até logo");
                                        updates.salvaDataSaidaHistorico(catraca);
                                        cd_aluno.setText("");
                                        nome_aluno.setText("");
                                }
                            }
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCatraca.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cd_aluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTextField nome_aluno;
    // End of variables declaration//GEN-END:variables

}
