
package telas;

import classes.ClasseCadastro_exercicios;
import conexoesbancodedados.DeleteBd;
import conexoesbancodedados.InsertBd;
import conexoesbancodedados.SelectBd;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCadastroExercicios extends javax.swing.JFrame {

    ClasseCadastro_exercicios exercicios = new ClasseCadastro_exercicios();
    InsertBd inserts = new InsertBd();
    DeleteBd deletes = new DeleteBd();
    SelectBd selects = new SelectBd();
    ArrayList<String> listaMembros = new ArrayList();
    ArrayList<String> listaExercicios = new ArrayList();
    ArrayList<String> listaRepeticoes = new ArrayList();
            
    public TelaCadastroExercicios() {
        initComponents();
        this.carregarComboGrupos();
        this.carregarComboRepeticoes();
    }
    
    private void carregarComboRepeticoes(){
        try {
            exercicios.populandoCombRepeticoes(); //atualizando o combobox com os dados do banco 
            listaRepeticoes = exercicios.getListaComboRepeticoes(); //recebendo a lista do banco
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
        }
            for(int i=0; i < listaRepeticoes.size();i++){ //populando o combobox com os dados
                combRepeticoes.addItem(listaRepeticoes.get(i));
            }
    }
    
    private void carregarComboGrupos(){
        try {
            exercicios.populandoCombMembros(); //atualizando o combobox com os dados do banco 
            listaMembros = exercicios.getListaComboGrupos(); //recebendo a lista do banco
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
        }
            for(int i=0; i < listaMembros.size();i++){ //populando o combobox com os dados
                //System.out.println(listaMembros.get(i)); //teste
                combMembros.addItem(listaMembros.get(i));
                combMembros1.addItem(listaMembros.get(i));
                combMembros2.addItem(listaMembros.get(i));
            }
    }
    
    private void carregarComboExercicios(){
        listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

            for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
            combExercicios.addItem(listaExercicios.get(i));
            }      
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMembro = new javax.swing.JTextField();
        btnSalvarMembro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblExercicio = new javax.swing.JTextField();
        btnSalvarExercicio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combMembros1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        combMembros = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnExcluirGrupo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        combMembros2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        combExercicios = new javax.swing.JComboBox<>();
        btnExcluirExercicio = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblRepeticoes = new javax.swing.JTextField();
        btnSalvarRepeticoes = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        combRepeticoes = new javax.swing.JComboBox<>();
        btnExcluirRepeticoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de exercícios");

        jLabel1.setText("CADASTRO DE EXERCÍCIOS PARA TELA DE TREINOS");

        jLabel2.setText("Grupo muscular/Membro:");

        btnSalvarMembro.setText("Salvar");
        btnSalvarMembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMembroActionPerformed(evt);
            }
        });

        jLabel3.setText("Exercício:");

        btnSalvarExercicio.setText("Salvar");
        btnSalvarExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarExercicioActionPerformed(evt);
            }
        });

        jLabel4.setText("Grupo muscular:");

        combMembros1.setSelectedIndex(-1);

        jLabel5.setText("Grupos musculares cadastrados:");

        combMembros.setSelectedIndex(-1);

        jLabel6.setText("____________________________________________________________________________");

        btnExcluirGrupo.setText("Excluir");
        btnExcluirGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirGrupoActionPerformed(evt);
            }
        });

        jLabel7.setText("(Escolha um GRUPO MUSCULAR para relacionar um exercício.)");

        jLabel8.setText("O grupo muscular só será excluído caso não exista nenhum exercicio relacionado com o grupo.");

        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Cadastrar GRUPO MUSCULAR:");

        jLabel10.setText("____________________________________________________________________________");

        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Excluir GRUPO MUSCULAR:");

        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Cadastrar EXERCÍCIOS:");

        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Excluir EXERCÍCIOS:");

        jLabel14.setText("____________________________________________________________________________");

        combMembros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMembros2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Grupo muscular:");

        jLabel16.setText("Exercícios:");

        combExercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combExerciciosMouseClicked(evt);
            }
        });
        combExercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combExerciciosActionPerformed(evt);
            }
        });

        btnExcluirExercicio.setText("Excluir");
        btnExcluirExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirExercicioActionPerformed(evt);
            }
        });

        jLabel17.setText("Para excluir um exercício, escolha um grupo muscular vinculado a esse exercício");

        jLabel18.setText("____________________________________________________________________________");

        jLabel19.setForeground(new java.awt.Color(0, 0, 153));
        jLabel19.setText("Cadastrar REPETIÇÕES:");

        jLabel20.setText("Repetições:");

        btnSalvarRepeticoes.setText("Salvar");
        btnSalvarRepeticoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarRepeticoesActionPerformed(evt);
            }
        });

        jLabel21.setText("____________________________________________________________________________");

        jLabel22.setForeground(new java.awt.Color(0, 0, 153));
        jLabel22.setText("Excluir REPETIÇÕES:");

        jLabel23.setText("Repetições:");

        combRepeticoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combRepeticoesActionPerformed(evt);
            }
        });

        btnExcluirRepeticoes.setText("Excluir");
        btnExcluirRepeticoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirRepeticoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExercicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(combMembros, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnExcluirGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMembro, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnSalvarMembro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combMembros1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluirExercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combMembros2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnSalvarRepeticoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(8, 8, 8)
                                .addComponent(combRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirRepeticoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblMembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarMembro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combMembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirGrupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combMembros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarExercicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(combMembros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(combExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirExercicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarRepeticoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirRepeticoes))
                    .addComponent(jLabel23))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarExercicioActionPerformed
        exercicios.setNm_membro((String)combMembros1.getSelectedItem()); //setando grupo para que possa ser utilizado o codigo do grupo no cadastro do exercicio
            if(combMembros1.getSelectedItem() == ""){
                JOptionPane.showMessageDialog(null, "<html>Grupo muscular vazio. <br>Escolha um grupo muscular para o exercício.</html>");
            }else if("".equals(lblExercicio.getText())){
                JOptionPane.showMessageDialog(null, "<html>Nome do Exercício não pode ser vazio !!</html>");
                }else{
                    //Try para pegar o código do grupo muscular para vincular no exercicio cadastrado.
                    try {
                        selects.retornaCdGrupoMuscular(exercicios);
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //setando o exercicio na classe e salvando no banco
                    exercicios.setNm_exercicio(lblExercicio.getText().toUpperCase());
                    inserts.insereExercicio(exercicios);
                    new TelaCadastroExercicios().setVisible(true); //atualizar a tela abrindo uma nova
                    this.dispose(); //fechando a velha
                }   
    }//GEN-LAST:event_btnSalvarExercicioActionPerformed

    private void btnSalvarMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMembroActionPerformed
        exercicios.setNm_membro(lblMembro.getText().toUpperCase());
            if("".equals(lblMembro.getText())){
                JOptionPane.showMessageDialog(null, "Grupo Muscular não pode ser em branco !!");
            }else{
                inserts.insereGrupoMembro(exercicios); //Envia o nome para o banco
                new TelaCadastroExercicios().setVisible(true); //atualizar a tela abrindo uma nova
                this.dispose(); //fechando a velha
            }
    }//GEN-LAST:event_btnSalvarMembroActionPerformed

    private void btnExcluirGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirGrupoActionPerformed
        exercicios.setNm_membro((String)combMembros.getSelectedItem());
            if(combMembros.getSelectedItem() == ""){
                JOptionPane.showMessageDialog(null,"Nenhum grupo muscular foi selecionado.");
            }else{
                try {
                    deletes.apagarGrupoMuscular(exercicios);
                    new TelaCadastroExercicios().setVisible(true); //atualizar a tela abrindo uma nova
                    this.dispose(); //fechando a velha
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }//GEN-LAST:event_btnExcluirGrupoActionPerformed

    private void btnExcluirExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirExercicioActionPerformed
            if(combMembros2.getSelectedItem() == ""){
                JOptionPane.showMessageDialog(null,"Nenhum grupo muscular foi selecionado.");
            }else{
                exercicios.setNm_exercicio(String.valueOf(combExercicios.getSelectedItem()));
                try {
                    deletes.apagarExercicio(exercicios);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
                }
                new TelaCadastroExercicios().setVisible(true); //atualizar a tela abrindo uma nova
                this.dispose(); //fechando a velha
            }
    }//GEN-LAST:event_btnExcluirExercicioActionPerformed

    private void combExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combExerciciosActionPerformed
        
    }//GEN-LAST:event_combExerciciosActionPerformed

    private void combExerciciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combExerciciosMouseClicked
        
    }//GEN-LAST:event_combExerciciosMouseClicked

    private void combMembros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMembros2ActionPerformed
        //CARREGAR COMBO DE EXERCÍCIOS
        exercicios.setNm_membro((String)combMembros2.getSelectedItem());
        //System.out.println("Enviei para classe Exercicios: "+exercicios.getMembro()); //testes
        try {
            combExercicios.removeAllItems(); //limpar lixo quando o combo é clicado novamente
            exercicios.populandoCombExercicios();
            this.carregarComboExercicios();
            //System.out.println("Lista do click combo:"+exercicios.getListaComboExercicios()); //testes
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(exercicios.getListaComboExercicios()); //teste
    }//GEN-LAST:event_combMembros2ActionPerformed

    private void btnSalvarRepeticoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarRepeticoesActionPerformed
            if(lblRepeticoes.getText() == ""){
                JOptionPane.showMessageDialog(null, "Repetições não pode ser vazio !!");
            }else{
                exercicios.setNm_repeticao(lblRepeticoes.getText());
                inserts.insereRepeticoes(exercicios);
                new TelaCadastroExercicios().setVisible(true); //atualizar a tela abrindo uma nova
                this.dispose(); //fechando a velh 
            }
        
    }//GEN-LAST:event_btnSalvarRepeticoesActionPerformed

    private void combRepeticoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combRepeticoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combRepeticoesActionPerformed

    private void btnExcluirRepeticoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirRepeticoesActionPerformed
        exercicios.setNm_repeticao(String.valueOf(combRepeticoes.getSelectedItem()));
        try {
            deletes.apagarRepeticoes(exercicios);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        new TelaCadastroExercicios().setVisible(true); //atualizar a tela abrindo uma nova
        this.dispose(); //fechando a velha
    }//GEN-LAST:event_btnExcluirRepeticoesActionPerformed

    /**
     * @param args the command line arguments
     */
    
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
            java.util.logging.Logger.getLogger(TelaCadastroExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     /* -----------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroExercicios().setVisible(true);
            }
        });
    } ---------------------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirExercicio;
    private javax.swing.JButton btnExcluirGrupo;
    private javax.swing.JButton btnExcluirRepeticoes;
    private javax.swing.JButton btnSalvarExercicio;
    private javax.swing.JButton btnSalvarMembro;
    private javax.swing.JButton btnSalvarRepeticoes;
    private javax.swing.JComboBox<String> combExercicios;
    private javax.swing.JComboBox<String> combMembros;
    private javax.swing.JComboBox<String> combMembros1;
    private javax.swing.JComboBox<String> combMembros2;
    private javax.swing.JComboBox<String> combRepeticoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lblExercicio;
    private javax.swing.JTextField lblMembro;
    private javax.swing.JTextField lblRepeticoes;
    // End of variables declaration//GEN-END:variables
}
