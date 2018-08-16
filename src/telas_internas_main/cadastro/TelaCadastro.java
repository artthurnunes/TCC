
package telas_internas_main.cadastro;

import classes.ClasseCadastro;
import conexoesbancodedados.InsertBd;
import conexoesbancodedados.SelectBd;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class TelaCadastro extends javax.swing.JInternalFrame {

    ClasseCadastro classecadastro = new ClasseCadastro();
    InsertBd inserts = new InsertBd();
    SelectBd selects = new SelectBd();
    
    public TelaCadastro() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tcad_txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tcad_txtRg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Tcad_txtCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tcad_txtTel1 = new javax.swing.JTextField();
        Tcad_txtTel2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Tcad_txtRua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Tcad_txtBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Tcad_txtNumero = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Tcad_txtCidade = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        combEstado = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        Tcad_txtCep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Tcad_txtPai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Tcad_txtMae = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Tcad_txtEmergencia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Tcad_txtTelEmergencia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Tcad_txtProfissao = new javax.swing.JTextField();
        radioMasculino = new javax.swing.JRadioButton();
        radioFeminino = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        combEstadoCivil = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        combParente = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        lblCodigoAluno = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblSituacaoAluno = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Tcad_txtNascimento = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Tcad_btnModalidade = new javax.swing.JButton();
        Tcad_btnFinanceiro = new javax.swing.JButton();
        Tcad_btnTreino = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnNovo = new javax.swing.JMenu();
        btnPesquisar = new javax.swing.JMenu();
        btnSalvar = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tela Cadastro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Cadastrais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Nome:");

        jLabel3.setText("RG:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Telefones:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel6.setText("Rua :");

        jLabel7.setText("Bairro:");

        jLabel8.setText("Número:");

        jLabel16.setText("Cidade:");

        jLabel17.setText("Estado:");

        combEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        combEstado.setToolTipText("");

        jLabel18.setText("CEP:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tcad_txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tcad_txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tcad_txtBairro))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tcad_txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tcad_txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Tcad_txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Tcad_txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Tcad_txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Tcad_txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(combEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(Tcad_txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel9.setText("Nome Pai:");

        jLabel10.setText("Nome Mãe:");

        jLabel11.setText("Contato de Emergência:");

        jLabel12.setText("Telefone Emergência:");

        jLabel13.setText("Profissão:");

        radioMasculino.setText("Masculino");
        radioMasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioMasculinoMouseClicked(evt);
            }
        });
        radioMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMasculinoActionPerformed(evt);
            }
        });

        radioFeminino.setText("Feminino");
        radioFeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioFemininoMouseClicked(evt);
            }
        });
        radioFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemininoActionPerformed(evt);
            }
        });

        jLabel14.setText("Estado Civil:");

        combEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)" }));

        jLabel15.setText("Parentesco:");

        combParente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Pai", "Mãe", "Irmão", "Avô", "Avó", "Tio", "Tia", "Primo", "Prima", "Amigo", "Cunhado", "Cunhada" }));
        combParente.setToolTipText("");

        jLabel19.setText("Código Resgistro:");

        lblCodigoAluno.setText("?????");

        jLabel21.setText("Situação:");

        lblSituacaoAluno.setText("ATIVO/INATIVO");

        jLabel23.setText("Data de Nascimento:");

        jButton1.setText("Carregar foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tcad_txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSituacaoAluno)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tcad_txtEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tcad_txtTelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tcad_txtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tcad_txtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tcad_txtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioFeminino)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Tcad_txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Tcad_txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Tcad_txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Tcad_txtMae, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Tcad_txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(combParente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Tcad_txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(lblCodigoAluno)
                            .addComponent(jLabel21)
                            .addComponent(lblSituacaoAluno))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Tcad_txtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tcad_txtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(Tcad_txtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioMasculino)
                            .addComponent(radioFeminino)
                            .addComponent(jLabel14)
                            .addComponent(combEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Tcad_txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(Tcad_txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(Tcad_txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(Tcad_txtMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(Tcad_txtPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton1)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Tcad_txtEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(Tcad_txtTelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(combParente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tcad_btnModalidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/olympics_sport_weight_weightlifting_2257.png"))); // NOI18N
        Tcad_btnModalidade.setText("MODALIDADES");
        Tcad_btnModalidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tcad_btnModalidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Tcad_btnModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tcad_btnModalidadeActionPerformed(evt);
            }
        });

        Tcad_btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business-economic-finance-interprise-point-of-services_88994 (1).png"))); // NOI18N
        Tcad_btnFinanceiro.setText("FINANCEIRO");
        Tcad_btnFinanceiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tcad_btnFinanceiro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Tcad_btnFinanceiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Tcad_btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tcad_btnFinanceiroActionPerformed(evt);
            }
        });

        Tcad_btnTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1492550655-7_83351.png"))); // NOI18N
        Tcad_btnTreino.setText("TREINOS");
        Tcad_btnTreino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tcad_btnTreino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Tcad_btnTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tcad_btnTreinoActionPerformed(evt);
            }
        });

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
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnSalvar);

        jMenu8.setText("Excluir");
        jMenuBar1.add(jMenu8);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1486485553-ago-arrow-arrow-left-back-previous-direction-left_81160.png"))); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/setadireita.png"))); // NOI18N
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tcad_btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tcad_btnModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tcad_btnTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tcad_btnFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tcad_btnModalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tcad_btnTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tcad_btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tcad_btnFinanceiroActionPerformed
        new TelaCadastro_financeiro(null,true).setVisible(true);
    }//GEN-LAST:event_Tcad_btnFinanceiroActionPerformed

    private void Tcad_btnModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tcad_btnModalidadeActionPerformed
        new TelaCadastro_modalidades(null,true).setVisible(true);
    }//GEN-LAST:event_Tcad_btnModalidadeActionPerformed

    private void Tcad_btnTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tcad_btnTreinoActionPerformed
        new TelaCadastro_treino(null,true).setVisible(true);
    }//GEN-LAST:event_Tcad_btnTreinoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        classecadastro.setSituacao(true);
        classecadastro.setNome(Tcad_txtNome.getText());
        classecadastro.setTel1(Tcad_txtTel1.getText());
        classecadastro.setTel2(Tcad_txtTel2.getText());
        classecadastro.setProfissao(Tcad_txtProfissao.getText());
            if(radioMasculino.isSelected()){
                classecadastro.setSexo("Masculino");
                System.out.println(classecadastro.getSexo());
            }else if(radioFeminino.isSelected()){
                classecadastro.setSexo("Feminino");
                System.out.println(classecadastro.getSexo());
            }
        classecadastro.setEstado_civil(combEstadoCivil.getSelectedIndex());
        classecadastro.setRg(Tcad_txtRg.getText());
        classecadastro.setCpf(Tcad_txtCpf.getText());
        classecadastro.setDt_nascimento(Tcad_txtNascimento.getText());
        classecadastro.setNm_mae(Tcad_txtMae.getText());
        classecadastro.setNm_pai(Tcad_txtPai.getText());
        classecadastro.setNm_emer(Tcad_txtEmergencia.getText());
        classecadastro.setTel_emer(Tcad_txtTelEmergencia.getText());
        classecadastro.setParentesco(combParente.getSelectedIndex());
        classecadastro.setEnd_rua(Tcad_txtRua.getText());
        classecadastro.setEnd_numero(Tcad_txtNumero.getText());
        classecadastro.setEnd_bairro(Tcad_txtBairro.getText());
        classecadastro.setEnd_cidade(Tcad_txtCidade.getText());
        classecadastro.setEnd_estado(combEstado.getSelectedIndex());
        classecadastro.setEnd_cep(Tcad_txtCep.getText());
      
        inserts.insertCadastro(classecadastro);
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle("Selecione uma foto");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int opc = arquivo.showOpenDialog(this);
        if(opc == JFileChooser.APPROVE_OPTION){
            File file = new File("Caminho");
            file = arquivo.getSelectedFile(); //recebe o caminho 
            String filename = file.getAbsolutePath(); //mostrar o caminho, não vou mostrar .....
            
            ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
            //configura o tamanho da imagem de acordo com o tamanho do label
            lblFoto.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT)));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioMasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMasculinoMouseClicked
        
    }//GEN-LAST:event_radioMasculinoMouseClicked

    private void radioFemininoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioFemininoMouseClicked
        
    }//GEN-LAST:event_radioFemininoMouseClicked

    private void radioMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMasculinoActionPerformed
        radioFeminino.setSelected(false);
    }//GEN-LAST:event_radioMasculinoActionPerformed

    private void radioFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemininoActionPerformed
        radioMasculino.setSelected(false);
    }//GEN-LAST:event_radioFemininoActionPerformed

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        this.limparCampos();
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        try {
            selects.selectCadastroAlfabetico(classecadastro);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lblCodigoAluno.setText(Integer.toString(classecadastro.getCd_registro()));
            if(classecadastro.getSituacao() == true){
                lblSituacaoAluno.setText("ATIVO");
            }else{lblSituacaoAluno.setText("INATIVO");}
        Tcad_txtNome.setText(classecadastro.getNome());
        Tcad_txtTel1.setText(classecadastro.getTel1());
        Tcad_txtTel2.setText(classecadastro.getTel2());
        Tcad_txtProfissao.setText(classecadastro.getProfissao());
            if("Feminino".equals(classecadastro.getSexo())){
                radioFeminino.setSelected(true);
            }else{radioMasculino.setSelected(true);}
        combEstadoCivil.setSelectedIndex(classecadastro.getEstado_civil());
        Tcad_txtRg.setText(classecadastro.getRg());
        Tcad_txtCpf.setText(classecadastro.getCpf());
        Tcad_txtNascimento.setText(classecadastro.getDt_nascimento());
        Tcad_txtMae.setText(classecadastro.getNm_mae());
        Tcad_txtPai.setText(classecadastro.getNm_pai());
        Tcad_txtEmergencia.setText(classecadastro.getNm_emer());
        Tcad_txtTelEmergencia.setText(classecadastro.getTel_emer());
        combParente.setSelectedIndex(classecadastro.getParentesco());
        Tcad_txtRua.setText(classecadastro.getEnd_rua());
        Tcad_txtNumero.setText(classecadastro.getEnd_numero());
        Tcad_txtBairro.setText(classecadastro.getEnd_bairro());
        Tcad_txtCidade.setText(classecadastro.getEnd_cidade());
        combEstado.setSelectedIndex(classecadastro.getEnd_estado());
        Tcad_txtCep.setText(classecadastro.getEnd_cep());
        
    }//GEN-LAST:event_btnPesquisarMouseClicked

    public void limparCampos(){
        Tcad_txtNome.setText("");
        lblCodigoAluno.setText("");
        lblSituacaoAluno.setText("");
        Tcad_txtTel1.setText("");
        Tcad_txtTel2.setText("");
        Tcad_txtProfissao.setText("");
        radioMasculino.setSelected(false);
        radioFeminino.setSelected(false);
        combEstadoCivil.setSelectedIndex(0);
        Tcad_txtRg.setText("");
        Tcad_txtCpf.setText("");
        Tcad_txtNascimento.setText("");
        Tcad_txtMae.setText("");
        Tcad_txtPai.setText("");
        Tcad_txtEmergencia.setText("");
        Tcad_txtTelEmergencia.setText("");
        combParente.setSelectedIndex(0);
        Tcad_txtRua.setText("");
        Tcad_txtNumero.setText("");
        Tcad_txtBairro.setText("");
        Tcad_txtCidade.setText("");
        combEstado.setSelectedIndex(0);
        Tcad_txtCep.setText("");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tcad_btnFinanceiro;
    private javax.swing.JButton Tcad_btnModalidade;
    private javax.swing.JButton Tcad_btnTreino;
    private javax.swing.JTextField Tcad_txtBairro;
    private javax.swing.JTextField Tcad_txtCep;
    private javax.swing.JTextField Tcad_txtCidade;
    private javax.swing.JTextField Tcad_txtCpf;
    private javax.swing.JTextField Tcad_txtEmergencia;
    private javax.swing.JTextField Tcad_txtMae;
    private javax.swing.JTextField Tcad_txtNascimento;
    private javax.swing.JTextField Tcad_txtNome;
    private javax.swing.JTextField Tcad_txtNumero;
    private javax.swing.JTextField Tcad_txtPai;
    private javax.swing.JTextField Tcad_txtProfissao;
    private javax.swing.JTextField Tcad_txtRg;
    private javax.swing.JTextField Tcad_txtRua;
    private javax.swing.JTextField Tcad_txtTel1;
    private javax.swing.JTextField Tcad_txtTel2;
    private javax.swing.JTextField Tcad_txtTelEmergencia;
    private javax.swing.JMenu btnNovo;
    private javax.swing.JMenu btnPesquisar;
    private javax.swing.JMenu btnSalvar;
    private javax.swing.JComboBox<String> combEstado;
    private javax.swing.JComboBox<String> combEstadoCivil;
    private javax.swing.JComboBox<String> combParente;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCodigoAluno;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblSituacaoAluno;
    private javax.swing.JRadioButton radioFeminino;
    private javax.swing.JRadioButton radioMasculino;
    // End of variables declaration//GEN-END:variables
}
