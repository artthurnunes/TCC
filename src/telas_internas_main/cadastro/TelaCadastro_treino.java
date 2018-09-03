
package telas_internas_main.cadastro;

import classes.ClasseCadastro;
import classes.ClasseCadastro_exercicios;
import classes.ClasseCadastro_treino;
import classes.ClasseCadastro_treinoCodigos;
import conexoesbancodedados.InsertBd;
import conexoesbancodedados.SelectBd;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telas.TelaCadastroExercicios;

public class TelaCadastro_treino extends javax.swing.JDialog {

    int controlePlusA1 = 0; //controle de botão + Treinos A
    int controlePlusA2 = 0;
    int controlePlusA3 = 0;
    int controlePlusA4 = 0;
    int controlePlusA5 = 0;
    
    int controlePlusB1 = 0; //controle de botão + Treinos B
    int controlePlusB2 = 0;
    int controlePlusB3 = 0;
    int controlePlusB4 = 0;
    int controlePlusB5 = 0;
    
    int controlePlusC1 = 0; //controle de botão + Treinos C
    int controlePlusC2 = 0;
    int controlePlusC3 = 0;
    int controlePlusC4 = 0;
    int controlePlusC5 = 0;
    
    ArrayList<String> listaMembros = new ArrayList(); //lista de membros do banco
    ArrayList<String> listaExercicios = new ArrayList(); //lista de exercicios do banco
    ArrayList<String> listaRepeticoes = new ArrayList(); //lista de exercicios do banco
    ClasseCadastro_exercicios exercicios = new ClasseCadastro_exercicios();
    ClasseCadastro_treino treinos = new ClasseCadastro_treino();
    ClasseCadastro_treinoCodigos treinosCodigos = new ClasseCadastro_treinoCodigos();
    ClasseCadastro cadastro = new ClasseCadastro();
    InsertBd inserts = new InsertBd();
    SelectBd selects = new SelectBd();
    
    //private boolean carregarPrimeiraVez = true; //variavel para não carregar toda hora que clicar na aba, somente 1 vez
 
    public TelaCadastro_treino(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblNomeAlunoTelaTreinos.setText(""+cadastro.getNome());
        this.ocultaBotoesTreinoA();
        this.ocultaBotoesTreinoB(); //PENSAR EM ALGUMA COISA PARA QUE O 4 TREINO APAREÇA CASO TENHA CADASTRO NO BD
        this.ocultaBotoesTreinoC();
            if(ClasseCadastro_treino.getTreinoNovo() == true){
                this.carregarComboGrupos(); 
                this.carregarComboRepeticoes();
                //System.out.println("Entrei treino novo"); //teste
            }else{
                try {
                    this.getandoCamposClasseCadastro_treino();
                    //System.out.println("entrei treino existente"); //teste
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadastro_treino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
            //CONDIÇÃO PARA BOTÃO SALVAR FICAR APAGADO QUANDO O TREINO NÃO É NOVO, OBRIGANDO A FAZER OUTRO TREINO COM BOTÃO NOVO
            //DEIXA OS BOTÕES DE PLUS E LESS APAGADOS TAMBÉM PARA TREINO NÃO SOFRER ALTERAÇÕES
            if(!"".equals(IdTreino.getText())){
                btnSalvar.setVisible(false);
                this.ocultaBotoesPlusLess();
            }
        
        
        
        //TODOS OS MÉTODOS DA CLASSE SÃO EXECUTADOS QUANDO A TELA INCIA NÃO SEI PQ ??.....
        //Por isso codigo abaixo esta comentado mas vou deixar aqui pois nao estava funcionando assim BKP SE PARAR
        /*Carregar os combos de exercícios. Explicação: 
            1 - Seta o primeiro nome do combo na classeCadastro_exercicios.
            2 - Chama o método populandoCombExercicios na classeCadastro_exercicios.
            3 - No métodos populandoCombExercicios ele chama outro métodos para fazer um select para saber o Cd_membro e seta o codidgo na classe
            4 - Voltando para o método populandoCombExercícios ele faz o select de todos os exercicios daquele codigo de grupo muscular
            5 - E popula a listadeExercicios na classe
            6 - O método carregarComboExercicios carrega os exercicios da lista no combo da tela
        
        //exercicios.setNm_membro(String.valueOf(combMusculoA1.getSelectedItem()));
        //try {
            //combExercicioA1.removeAllItems();
            //exercicios.populandoCombExercicios();
        //} catch (SQLException ex) {
            //Logger.getLogger(TelaCadastro_treino.class.getName()).log(Level.SEVERE, null, ex);
        //}
        //this.carregarComboExerciciosA1();
        
        */
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dtInicial = new javax.swing.JFormattedTextField();
        dtFinal = new javax.swing.JFormattedTextField();
        painelAbas = new javax.swing.JTabbedPane();
        abaTreinoA = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        combMusculoA1 = new javax.swing.JComboBox<>();
        btnPlusA1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        combExercicioA1 = new javax.swing.JComboBox<>();
        combRepeticoesA1 = new javax.swing.JComboBox<>();
        lblObservacoesA1 = new javax.swing.JLabel();
        txtObservacoesA1 = new javax.swing.JTextField();
        combExercicioA1_1 = new javax.swing.JComboBox<>();
        combRepeticoesA1_1 = new javax.swing.JComboBox<>();
        lblObservacoesA1_1 = new javax.swing.JLabel();
        txtObservacoesA1_1 = new javax.swing.JTextField();
        combRepeticoesA1_2 = new javax.swing.JComboBox<>();
        combExercicioA1_2 = new javax.swing.JComboBox<>();
        lblObservacoesA1_2 = new javax.swing.JLabel();
        txtObservacoesA1_2 = new javax.swing.JTextField();
        combExercicioA1_3 = new javax.swing.JComboBox<>();
        txtObservacoesA1_3 = new javax.swing.JTextField();
        combRepeticoesA1_3 = new javax.swing.JComboBox<>();
        lblObservacoesA1_3 = new javax.swing.JLabel();
        combExercicioA1_4 = new javax.swing.JComboBox<>();
        txtObservacoesA1_4 = new javax.swing.JTextField();
        lblObservacoesA1_4 = new javax.swing.JLabel();
        combRepeticoesA1_4 = new javax.swing.JComboBox<>();
        txtObservacoesA1_5 = new javax.swing.JTextField();
        combExercicioA1_5 = new javax.swing.JComboBox<>();
        lblObservacoesA1_5 = new javax.swing.JLabel();
        combRepeticoesA1_5 = new javax.swing.JComboBox<>();
        combRepeticoesA1_6 = new javax.swing.JComboBox<>();
        txtObservacoesA1_6 = new javax.swing.JTextField();
        combExercicioA1_6 = new javax.swing.JComboBox<>();
        lblObservacoesA1_6 = new javax.swing.JLabel();
        btnLessA1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        combMusculoA2 = new javax.swing.JComboBox<>();
        btnPlusA2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        combExercicioA2 = new javax.swing.JComboBox<>();
        combRepeticoesA2 = new javax.swing.JComboBox<>();
        lblObservacoesA2 = new javax.swing.JLabel();
        txtObservacoesA2 = new javax.swing.JTextField();
        combExercicioA2_1 = new javax.swing.JComboBox<>();
        combRepeticoesA2_1 = new javax.swing.JComboBox<>();
        lblObservacoesA2_1 = new javax.swing.JLabel();
        txtObservacoesA2_1 = new javax.swing.JTextField();
        combRepeticoesA2_2 = new javax.swing.JComboBox<>();
        combExercicioA2_2 = new javax.swing.JComboBox<>();
        lblObservacoesA2_2 = new javax.swing.JLabel();
        txtObservacoesA2_2 = new javax.swing.JTextField();
        combExercicioA2_3 = new javax.swing.JComboBox<>();
        txtObservacoesA2_3 = new javax.swing.JTextField();
        combRepeticoesA2_3 = new javax.swing.JComboBox<>();
        lblObservacoesA2_3 = new javax.swing.JLabel();
        combExercicioA2_4 = new javax.swing.JComboBox<>();
        txtObservacoesA2_4 = new javax.swing.JTextField();
        lblObservacoesA2_4 = new javax.swing.JLabel();
        combRepeticoesA2_4 = new javax.swing.JComboBox<>();
        txtObservacoesA2_5 = new javax.swing.JTextField();
        combExercicioA2_5 = new javax.swing.JComboBox<>();
        lblObservacoesA2_5 = new javax.swing.JLabel();
        combRepeticoesA2_5 = new javax.swing.JComboBox<>();
        combRepeticoesA2_6 = new javax.swing.JComboBox<>();
        txtObservacoesA2_6 = new javax.swing.JTextField();
        combExercicioA2_6 = new javax.swing.JComboBox<>();
        lblObservacoesA2_6 = new javax.swing.JLabel();
        btnLessA2 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        combMusculoA3 = new javax.swing.JComboBox<>();
        btnPlusA3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        combExercicioA3 = new javax.swing.JComboBox<>();
        combRepeticoesA3 = new javax.swing.JComboBox<>();
        lblObservacoesA3 = new javax.swing.JLabel();
        txtObservacoesA3 = new javax.swing.JTextField();
        combExercicioA3_1 = new javax.swing.JComboBox<>();
        combRepeticoesA3_1 = new javax.swing.JComboBox<>();
        lblObservacoesA3_1 = new javax.swing.JLabel();
        txtObservacoesA3_1 = new javax.swing.JTextField();
        combRepeticoesA3_2 = new javax.swing.JComboBox<>();
        combExercicioA3_2 = new javax.swing.JComboBox<>();
        lblObservacoesA3_2 = new javax.swing.JLabel();
        txtObservacoesA3_2 = new javax.swing.JTextField();
        combExercicioA3_3 = new javax.swing.JComboBox<>();
        txtObservacoesA3_3 = new javax.swing.JTextField();
        combRepeticoesA3_3 = new javax.swing.JComboBox<>();
        lblObservacoesA3_3 = new javax.swing.JLabel();
        combExercicioA3_4 = new javax.swing.JComboBox<>();
        txtObservacoesA3_4 = new javax.swing.JTextField();
        lblObservacoesA3_4 = new javax.swing.JLabel();
        combRepeticoesA3_4 = new javax.swing.JComboBox<>();
        txtObservacoesA3_5 = new javax.swing.JTextField();
        combExercicioA3_5 = new javax.swing.JComboBox<>();
        lblObservacoesA3_5 = new javax.swing.JLabel();
        combRepeticoesA3_5 = new javax.swing.JComboBox<>();
        combRepeticoesA3_6 = new javax.swing.JComboBox<>();
        txtObservacoesA3_6 = new javax.swing.JTextField();
        combExercicioA3_6 = new javax.swing.JComboBox<>();
        lblObservacoesA3_6 = new javax.swing.JLabel();
        btnLessA3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        combMusculoA4 = new javax.swing.JComboBox<>();
        btnPlusA4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        combExercicioA4 = new javax.swing.JComboBox<>();
        combRepeticoesA4 = new javax.swing.JComboBox<>();
        lblObservacoesA4 = new javax.swing.JLabel();
        txtObservacoesA4 = new javax.swing.JTextField();
        combExercicioA4_1 = new javax.swing.JComboBox<>();
        combRepeticoesA4_1 = new javax.swing.JComboBox<>();
        lblObservacoesA4_1 = new javax.swing.JLabel();
        txtObservacoesA4_1 = new javax.swing.JTextField();
        combRepeticoesA4_2 = new javax.swing.JComboBox<>();
        combExercicioA4_2 = new javax.swing.JComboBox<>();
        lblObservacoesA4_2 = new javax.swing.JLabel();
        txtObservacoesA4_2 = new javax.swing.JTextField();
        combExercicioA4_3 = new javax.swing.JComboBox<>();
        txtObservacoesA4_3 = new javax.swing.JTextField();
        combRepeticoesA4_3 = new javax.swing.JComboBox<>();
        lblObservacoesA4_3 = new javax.swing.JLabel();
        combExercicioA4_4 = new javax.swing.JComboBox<>();
        txtObservacoesA4_4 = new javax.swing.JTextField();
        lblObservacoesA4_4 = new javax.swing.JLabel();
        combRepeticoesA4_4 = new javax.swing.JComboBox<>();
        txtObservacoesA4_5 = new javax.swing.JTextField();
        combExercicioA4_5 = new javax.swing.JComboBox<>();
        lblObservacoesA4_5 = new javax.swing.JLabel();
        combRepeticoesA4_5 = new javax.swing.JComboBox<>();
        combRepeticoesA4_6 = new javax.swing.JComboBox<>();
        txtObservacoesA4_6 = new javax.swing.JTextField();
        combExercicioA4_6 = new javax.swing.JComboBox<>();
        lblObservacoesA4_6 = new javax.swing.JLabel();
        btnLessA4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        combMusculoA5 = new javax.swing.JComboBox<>();
        btnPlusA5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        combExercicioA5 = new javax.swing.JComboBox<>();
        combRepeticoesA5 = new javax.swing.JComboBox<>();
        lblObservacoesA5 = new javax.swing.JLabel();
        txtObservacoesA5 = new javax.swing.JTextField();
        combExercicioA5_1 = new javax.swing.JComboBox<>();
        combRepeticoesA5_1 = new javax.swing.JComboBox<>();
        lblObservacoesA5_1 = new javax.swing.JLabel();
        txtObservacoesA5_1 = new javax.swing.JTextField();
        combRepeticoesA5_2 = new javax.swing.JComboBox<>();
        combExercicioA5_2 = new javax.swing.JComboBox<>();
        lblObservacoesA5_2 = new javax.swing.JLabel();
        txtObservacoesA5_2 = new javax.swing.JTextField();
        combExercicioA5_3 = new javax.swing.JComboBox<>();
        txtObservacoesA5_3 = new javax.swing.JTextField();
        combRepeticoesA5_3 = new javax.swing.JComboBox<>();
        lblObservacoesA5_3 = new javax.swing.JLabel();
        combExercicioA5_4 = new javax.swing.JComboBox<>();
        txtObservacoesA5_4 = new javax.swing.JTextField();
        lblObservacoesA5_4 = new javax.swing.JLabel();
        combRepeticoesA5_4 = new javax.swing.JComboBox<>();
        txtObservacoesA5_5 = new javax.swing.JTextField();
        combExercicioA5_5 = new javax.swing.JComboBox<>();
        lblObservacoesA5_5 = new javax.swing.JLabel();
        combRepeticoesA5_5 = new javax.swing.JComboBox<>();
        combRepeticoesA5_6 = new javax.swing.JComboBox<>();
        txtObservacoesA5_6 = new javax.swing.JTextField();
        combExercicioA5_6 = new javax.swing.JComboBox<>();
        lblObservacoesA5_6 = new javax.swing.JLabel();
        btnLessA5 = new javax.swing.JButton();
        abaTreinoB = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        combMusculoB1 = new javax.swing.JComboBox<>();
        btnPlusB1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        combExercicioB1 = new javax.swing.JComboBox<>();
        combRepeticoesB1 = new javax.swing.JComboBox<>();
        lblObservacoesB1 = new javax.swing.JLabel();
        txtObservacoesB1 = new javax.swing.JTextField();
        combExercicioB1_1 = new javax.swing.JComboBox<>();
        combRepeticoesB1_1 = new javax.swing.JComboBox<>();
        lblObservacoesB1_1 = new javax.swing.JLabel();
        txtObservacoesB1_1 = new javax.swing.JTextField();
        combRepeticoesB1_2 = new javax.swing.JComboBox<>();
        combExercicioB1_2 = new javax.swing.JComboBox<>();
        lblObservacoesB1_2 = new javax.swing.JLabel();
        txtObservacoesB1_2 = new javax.swing.JTextField();
        combExercicioB1_3 = new javax.swing.JComboBox<>();
        txtObservacoesB1_3 = new javax.swing.JTextField();
        combRepeticoesB1_3 = new javax.swing.JComboBox<>();
        lblObservacoesB1_3 = new javax.swing.JLabel();
        combExercicioB1_4 = new javax.swing.JComboBox<>();
        txtObservacoesB1_4 = new javax.swing.JTextField();
        lblObservacoesB1_4 = new javax.swing.JLabel();
        combRepeticoesB1_4 = new javax.swing.JComboBox<>();
        txtObservacoesB1_5 = new javax.swing.JTextField();
        combExercicioB1_5 = new javax.swing.JComboBox<>();
        lblObservacoesB1_5 = new javax.swing.JLabel();
        combRepeticoesB1_5 = new javax.swing.JComboBox<>();
        combRepeticoesB1_6 = new javax.swing.JComboBox<>();
        txtObservacoesB1_6 = new javax.swing.JTextField();
        combExercicioB1_6 = new javax.swing.JComboBox<>();
        lblObservacoesB1_6 = new javax.swing.JLabel();
        btnLessB1 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        combMusculoB2 = new javax.swing.JComboBox<>();
        btnPlusB2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        combExercicioB2 = new javax.swing.JComboBox<>();
        combRepeticoesB2 = new javax.swing.JComboBox<>();
        lblObservacoesB2 = new javax.swing.JLabel();
        txtObservacoesB2 = new javax.swing.JTextField();
        combExercicioB2_1 = new javax.swing.JComboBox<>();
        combRepeticoesB2_1 = new javax.swing.JComboBox<>();
        lblObservacoesB2_1 = new javax.swing.JLabel();
        txtObservacoesB2_1 = new javax.swing.JTextField();
        combRepeticoesB2_2 = new javax.swing.JComboBox<>();
        combExercicioB2_2 = new javax.swing.JComboBox<>();
        lblObservacoesB2_2 = new javax.swing.JLabel();
        txtObservacoesB2_2 = new javax.swing.JTextField();
        combExercicioB2_3 = new javax.swing.JComboBox<>();
        txtObservacoesB2_3 = new javax.swing.JTextField();
        combRepeticoesB2_3 = new javax.swing.JComboBox<>();
        lblObservacoesB2_3 = new javax.swing.JLabel();
        combExercicioB2_4 = new javax.swing.JComboBox<>();
        txtObservacoesB2_4 = new javax.swing.JTextField();
        lblObservacoesB2_4 = new javax.swing.JLabel();
        combRepeticoesB2_4 = new javax.swing.JComboBox<>();
        txtObservacoesB2_5 = new javax.swing.JTextField();
        combExercicioB2_5 = new javax.swing.JComboBox<>();
        lblObservacoesB2_5 = new javax.swing.JLabel();
        combRepeticoesB2_5 = new javax.swing.JComboBox<>();
        combRepeticoesB2_6 = new javax.swing.JComboBox<>();
        txtObservacoesB2_6 = new javax.swing.JTextField();
        combExercicioB2_6 = new javax.swing.JComboBox<>();
        lblObservacoesB2_6 = new javax.swing.JLabel();
        btnLessB2 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        combMusculoB3 = new javax.swing.JComboBox<>();
        btnPlusB3 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        combExercicioB3 = new javax.swing.JComboBox<>();
        combRepeticoesB3 = new javax.swing.JComboBox<>();
        lblObservacoesB3 = new javax.swing.JLabel();
        txtObservacoesB3 = new javax.swing.JTextField();
        combExercicioB3_1 = new javax.swing.JComboBox<>();
        combRepeticoesB3_1 = new javax.swing.JComboBox<>();
        lblObservacoesB3_1 = new javax.swing.JLabel();
        txtObservacoesB3_1 = new javax.swing.JTextField();
        combRepeticoesB3_2 = new javax.swing.JComboBox<>();
        combExercicioB3_2 = new javax.swing.JComboBox<>();
        lblObservacoesB3_2 = new javax.swing.JLabel();
        txtObservacoesB3_2 = new javax.swing.JTextField();
        combExercicioB3_3 = new javax.swing.JComboBox<>();
        txtObservacoesB3_3 = new javax.swing.JTextField();
        combRepeticoesB3_3 = new javax.swing.JComboBox<>();
        lblObservacoesB3_3 = new javax.swing.JLabel();
        combExercicioB3_4 = new javax.swing.JComboBox<>();
        txtObservacoesB3_4 = new javax.swing.JTextField();
        lblObservacoesB3_4 = new javax.swing.JLabel();
        combRepeticoesB3_4 = new javax.swing.JComboBox<>();
        txtObservacoesB3_5 = new javax.swing.JTextField();
        combExercicioB3_5 = new javax.swing.JComboBox<>();
        lblObservacoesB3_5 = new javax.swing.JLabel();
        combRepeticoesB3_5 = new javax.swing.JComboBox<>();
        combRepeticoesB3_6 = new javax.swing.JComboBox<>();
        txtObservacoesB3_6 = new javax.swing.JTextField();
        combExercicioB3_6 = new javax.swing.JComboBox<>();
        lblObservacoesB3_6 = new javax.swing.JLabel();
        btnLessB3 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        combMusculoB4 = new javax.swing.JComboBox<>();
        btnPlusB4 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        combExercicioB4 = new javax.swing.JComboBox<>();
        combRepeticoesB4 = new javax.swing.JComboBox<>();
        lblObservacoesB4 = new javax.swing.JLabel();
        txtObservacoesB4 = new javax.swing.JTextField();
        combExercicioB4_1 = new javax.swing.JComboBox<>();
        combRepeticoesB4_1 = new javax.swing.JComboBox<>();
        lblObservacoesB4_1 = new javax.swing.JLabel();
        txtObservacoesB4_1 = new javax.swing.JTextField();
        combRepeticoesB4_2 = new javax.swing.JComboBox<>();
        combExercicioB4_2 = new javax.swing.JComboBox<>();
        lblObservacoesB4_2 = new javax.swing.JLabel();
        txtObservacoesB4_2 = new javax.swing.JTextField();
        combExercicioB4_3 = new javax.swing.JComboBox<>();
        txtObservacoesB4_3 = new javax.swing.JTextField();
        combRepeticoesB4_3 = new javax.swing.JComboBox<>();
        lblObservacoesB4_3 = new javax.swing.JLabel();
        combExercicioB4_4 = new javax.swing.JComboBox<>();
        txtObservacoesB4_4 = new javax.swing.JTextField();
        lblObservacoesB4_4 = new javax.swing.JLabel();
        combRepeticoesB4_4 = new javax.swing.JComboBox<>();
        txtObservacoesB4_5 = new javax.swing.JTextField();
        combExercicioB4_5 = new javax.swing.JComboBox<>();
        lblObservacoesB4_5 = new javax.swing.JLabel();
        combRepeticoesB4_5 = new javax.swing.JComboBox<>();
        combRepeticoesB4_6 = new javax.swing.JComboBox<>();
        txtObservacoesB4_6 = new javax.swing.JTextField();
        combExercicioB4_6 = new javax.swing.JComboBox<>();
        lblObservacoesB4_6 = new javax.swing.JLabel();
        btnLessB4 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        combMusculoB5 = new javax.swing.JComboBox<>();
        btnPlusB5 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        combExercicioB5 = new javax.swing.JComboBox<>();
        combRepeticoesB5 = new javax.swing.JComboBox<>();
        lblObservacoesB5 = new javax.swing.JLabel();
        txtObservacoesB5 = new javax.swing.JTextField();
        combExercicioB5_1 = new javax.swing.JComboBox<>();
        combRepeticoesB5_1 = new javax.swing.JComboBox<>();
        lblObservacoesB5_1 = new javax.swing.JLabel();
        txtObservacoesB5_1 = new javax.swing.JTextField();
        combRepeticoesB5_2 = new javax.swing.JComboBox<>();
        combExercicioB5_2 = new javax.swing.JComboBox<>();
        lblObservacoesB5_2 = new javax.swing.JLabel();
        txtObservacoesB5_2 = new javax.swing.JTextField();
        combExercicioB5_3 = new javax.swing.JComboBox<>();
        txtObservacoesB5_3 = new javax.swing.JTextField();
        combRepeticoesB5_3 = new javax.swing.JComboBox<>();
        lblObservacoesB5_3 = new javax.swing.JLabel();
        combExercicioB5_4 = new javax.swing.JComboBox<>();
        txtObservacoesB5_4 = new javax.swing.JTextField();
        lblObservacoesB5_4 = new javax.swing.JLabel();
        combRepeticoesB5_4 = new javax.swing.JComboBox<>();
        txtObservacoesB5_5 = new javax.swing.JTextField();
        combExercicioB5_5 = new javax.swing.JComboBox<>();
        lblObservacoesB5_5 = new javax.swing.JLabel();
        combRepeticoesB5_5 = new javax.swing.JComboBox<>();
        combRepeticoesB5_6 = new javax.swing.JComboBox<>();
        txtObservacoesB5_6 = new javax.swing.JTextField();
        combExercicioB5_6 = new javax.swing.JComboBox<>();
        lblObservacoesB5_6 = new javax.swing.JLabel();
        btnLessB5 = new javax.swing.JButton();
        abaTreinoC = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        combMusculoC1 = new javax.swing.JComboBox<>();
        btnPlusC1 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        combExercicioC1 = new javax.swing.JComboBox<>();
        combRepeticoesC1 = new javax.swing.JComboBox<>();
        lblObservacoesC1 = new javax.swing.JLabel();
        txtObservacoesC1 = new javax.swing.JTextField();
        combExercicioC1_1 = new javax.swing.JComboBox<>();
        combRepeticoesC1_1 = new javax.swing.JComboBox<>();
        lblObservacoesC1_1 = new javax.swing.JLabel();
        txtObservacoesC1_1 = new javax.swing.JTextField();
        combRepeticoesC1_2 = new javax.swing.JComboBox<>();
        combExercicioC1_2 = new javax.swing.JComboBox<>();
        lblObservacoesC1_2 = new javax.swing.JLabel();
        txtObservacoesC1_2 = new javax.swing.JTextField();
        combExercicioC1_3 = new javax.swing.JComboBox<>();
        txtObservacoesC1_3 = new javax.swing.JTextField();
        combRepeticoesC1_3 = new javax.swing.JComboBox<>();
        lblObservacoesC1_3 = new javax.swing.JLabel();
        combExercicioC1_4 = new javax.swing.JComboBox<>();
        txtObservacoesC1_4 = new javax.swing.JTextField();
        lblObservacoesC1_4 = new javax.swing.JLabel();
        combRepeticoesC1_4 = new javax.swing.JComboBox<>();
        txtObservacoesC1_5 = new javax.swing.JTextField();
        combExercicioC1_5 = new javax.swing.JComboBox<>();
        lblObservacoesC1_5 = new javax.swing.JLabel();
        combRepeticoesC1_5 = new javax.swing.JComboBox<>();
        combRepeticoesC1_6 = new javax.swing.JComboBox<>();
        txtObservacoesC1_6 = new javax.swing.JTextField();
        combExercicioC1_6 = new javax.swing.JComboBox<>();
        lblObservacoesC1_6 = new javax.swing.JLabel();
        btnLessC1 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        combMusculoC2 = new javax.swing.JComboBox<>();
        btnPlusC2 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        combExercicioC2 = new javax.swing.JComboBox<>();
        combRepeticoesC2 = new javax.swing.JComboBox<>();
        lblObservacoesC2 = new javax.swing.JLabel();
        txtObservacoesC2 = new javax.swing.JTextField();
        combExercicioC2_1 = new javax.swing.JComboBox<>();
        combRepeticoesC2_1 = new javax.swing.JComboBox<>();
        lblObservacoesC2_1 = new javax.swing.JLabel();
        txtObservacoesC2_1 = new javax.swing.JTextField();
        combRepeticoesC2_2 = new javax.swing.JComboBox<>();
        combExercicioC2_2 = new javax.swing.JComboBox<>();
        lblObservacoesC2_2 = new javax.swing.JLabel();
        txtObservacoesC2_2 = new javax.swing.JTextField();
        combExercicioC2_3 = new javax.swing.JComboBox<>();
        txtObservacoesC2_3 = new javax.swing.JTextField();
        combRepeticoesC2_3 = new javax.swing.JComboBox<>();
        lblObservacoesC2_3 = new javax.swing.JLabel();
        combExercicioC2_4 = new javax.swing.JComboBox<>();
        txtObservacoesC2_4 = new javax.swing.JTextField();
        lblObservacoesC2_4 = new javax.swing.JLabel();
        combRepeticoesC2_4 = new javax.swing.JComboBox<>();
        txtObservacoesC2_5 = new javax.swing.JTextField();
        combExercicioC2_5 = new javax.swing.JComboBox<>();
        lblObservacoesC2_5 = new javax.swing.JLabel();
        combRepeticoesC2_5 = new javax.swing.JComboBox<>();
        combRepeticoesC2_6 = new javax.swing.JComboBox<>();
        txtObservacoesC2_6 = new javax.swing.JTextField();
        combExercicioC2_6 = new javax.swing.JComboBox<>();
        lblObservacoesC2_6 = new javax.swing.JLabel();
        btnLessC2 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        combMusculoC3 = new javax.swing.JComboBox<>();
        btnPlusC3 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        combExercicioC3 = new javax.swing.JComboBox<>();
        combRepeticoesC3 = new javax.swing.JComboBox<>();
        lblObservacoesC3 = new javax.swing.JLabel();
        txtObservacoesC3 = new javax.swing.JTextField();
        combExercicioC3_1 = new javax.swing.JComboBox<>();
        combRepeticoesC3_1 = new javax.swing.JComboBox<>();
        lblObservacoesC3_1 = new javax.swing.JLabel();
        txtObservacoesC3_1 = new javax.swing.JTextField();
        combRepeticoesC3_2 = new javax.swing.JComboBox<>();
        combExercicioC3_2 = new javax.swing.JComboBox<>();
        lblObservacoesC3_2 = new javax.swing.JLabel();
        txtObservacoesC3_2 = new javax.swing.JTextField();
        combExercicioC3_3 = new javax.swing.JComboBox<>();
        txtObservacoesC3_3 = new javax.swing.JTextField();
        combRepeticoesC3_3 = new javax.swing.JComboBox<>();
        lblObservacoesC3_3 = new javax.swing.JLabel();
        combExercicioC3_4 = new javax.swing.JComboBox<>();
        txtObservacoesC3_4 = new javax.swing.JTextField();
        lblObservacoesC3_4 = new javax.swing.JLabel();
        combRepeticoesC3_4 = new javax.swing.JComboBox<>();
        txtObservacoesC3_5 = new javax.swing.JTextField();
        combExercicioC3_5 = new javax.swing.JComboBox<>();
        lblObservacoesC3_5 = new javax.swing.JLabel();
        combRepeticoesC3_5 = new javax.swing.JComboBox<>();
        combRepeticoesC3_6 = new javax.swing.JComboBox<>();
        txtObservacoesC3_6 = new javax.swing.JTextField();
        combExercicioC3_6 = new javax.swing.JComboBox<>();
        lblObservacoesC3_6 = new javax.swing.JLabel();
        btnLessC3 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        combMusculoC4 = new javax.swing.JComboBox<>();
        btnPlusC4 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        combExercicioC4 = new javax.swing.JComboBox<>();
        combRepeticoesC4 = new javax.swing.JComboBox<>();
        lblObservacoesC4 = new javax.swing.JLabel();
        txtObservacoesC4 = new javax.swing.JTextField();
        combExercicioC4_1 = new javax.swing.JComboBox<>();
        combRepeticoesC4_1 = new javax.swing.JComboBox<>();
        lblObservacoesC4_1 = new javax.swing.JLabel();
        txtObservacoesC4_1 = new javax.swing.JTextField();
        combRepeticoesC4_2 = new javax.swing.JComboBox<>();
        combExercicioC4_2 = new javax.swing.JComboBox<>();
        lblObservacoesC4_2 = new javax.swing.JLabel();
        txtObservacoesC4_2 = new javax.swing.JTextField();
        combExercicioC4_3 = new javax.swing.JComboBox<>();
        txtObservacoesC4_3 = new javax.swing.JTextField();
        combRepeticoesC4_3 = new javax.swing.JComboBox<>();
        lblObservacoesC4_3 = new javax.swing.JLabel();
        combExercicioC4_4 = new javax.swing.JComboBox<>();
        txtObservacoesC4_4 = new javax.swing.JTextField();
        lblObservacoesC4_4 = new javax.swing.JLabel();
        combRepeticoesC4_4 = new javax.swing.JComboBox<>();
        txtObservacoesC4_5 = new javax.swing.JTextField();
        combExercicioC4_5 = new javax.swing.JComboBox<>();
        lblObservacoesC4_5 = new javax.swing.JLabel();
        combRepeticoesC4_5 = new javax.swing.JComboBox<>();
        combRepeticoesC4_6 = new javax.swing.JComboBox<>();
        txtObservacoesC4_6 = new javax.swing.JTextField();
        combExercicioC4_6 = new javax.swing.JComboBox<>();
        lblObservacoesC4_6 = new javax.swing.JLabel();
        btnLessC4 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        combMusculoC5 = new javax.swing.JComboBox<>();
        btnPlusC5 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        combExercicioC5 = new javax.swing.JComboBox<>();
        combRepeticoesC5 = new javax.swing.JComboBox<>();
        lblObservacoesC5 = new javax.swing.JLabel();
        txtObservacoesC5 = new javax.swing.JTextField();
        combExercicioC5_1 = new javax.swing.JComboBox<>();
        combRepeticoesC5_1 = new javax.swing.JComboBox<>();
        lblObservacoesC5_1 = new javax.swing.JLabel();
        txtObservacoesC5_1 = new javax.swing.JTextField();
        combRepeticoesC5_2 = new javax.swing.JComboBox<>();
        combExercicioC5_2 = new javax.swing.JComboBox<>();
        lblObservacoesC5_2 = new javax.swing.JLabel();
        txtObservacoesC5_2 = new javax.swing.JTextField();
        combExercicioC5_3 = new javax.swing.JComboBox<>();
        txtObservacoesC5_3 = new javax.swing.JTextField();
        combRepeticoesC5_3 = new javax.swing.JComboBox<>();
        lblObservacoesC5_3 = new javax.swing.JLabel();
        combExercicioC5_4 = new javax.swing.JComboBox<>();
        txtObservacoesC5_4 = new javax.swing.JTextField();
        lblObservacoesC5_4 = new javax.swing.JLabel();
        combRepeticoesC5_4 = new javax.swing.JComboBox<>();
        txtObservacoesC5_5 = new javax.swing.JTextField();
        combExercicioC5_5 = new javax.swing.JComboBox<>();
        lblObservacoesC5_5 = new javax.swing.JLabel();
        combRepeticoesC5_5 = new javax.swing.JComboBox<>();
        combRepeticoesC5_6 = new javax.swing.JComboBox<>();
        txtObservacoesC5_6 = new javax.swing.JTextField();
        combExercicioC5_6 = new javax.swing.JComboBox<>();
        lblObservacoesC5_6 = new javax.swing.JLabel();
        btnLessC5 = new javax.swing.JButton();
        lblNomeAlunoTelaTreinos = new javax.swing.JLabel();
        IdTreino = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnFechar = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btnSalvar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Treinos");

        jLabel3.setText("Início treino:");

        jLabel4.setText("Fim treino:");

        abaTreinoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abaTreinoAMouseClicked(evt);
            }
        });

        combMusculoA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoA1ActionPerformed(evt);
            }
        });

        btnPlusA1.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusA1.setText("+");
        btnPlusA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusA1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesA1.setText("Observações");

        lblObservacoesA1_1.setText("Observações");

        lblObservacoesA1_2.setText("Observações");

        lblObservacoesA1_3.setText("Observações");

        lblObservacoesA1_4.setText("Observações");

        lblObservacoesA1_5.setText("Observações");

        lblObservacoesA1_6.setText("Observações");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combExercicioA1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combExercicioA1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA1_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combExercicioA1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA1_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combExercicioA1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA1_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combExercicioA1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA1_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combExercicioA1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA1_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combExercicioA1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA1_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA1)
                    .addComponent(txtObservacoesA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA1_1)
                    .addComponent(txtObservacoesA1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA1_2)
                    .addComponent(txtObservacoesA1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA1_3)
                    .addComponent(txtObservacoesA1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA1_4)
                    .addComponent(txtObservacoesA1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA1_5)
                    .addComponent(txtObservacoesA1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA1_6)
                    .addComponent(txtObservacoesA1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessA1.setForeground(new java.awt.Color(251, 0, 51));
        btnLessA1.setText("-");
        btnLessA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessA1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(combMusculoA1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessA1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusA1)
                    .addComponent(btnLessA1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaTreinoA.addTab("     Treino A - 1          ", jPanel10);

        combMusculoA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoA2ActionPerformed(evt);
            }
        });

        btnPlusA2.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusA2.setText("+");
        btnPlusA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusA2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesA2.setText("Observações");

        lblObservacoesA2_1.setText("Observações");

        lblObservacoesA2_2.setText("Observações");

        lblObservacoesA2_3.setText("Observações");

        lblObservacoesA2_4.setText("Observações");

        lblObservacoesA2_5.setText("Observações");

        lblObservacoesA2_6.setText("Observações");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combExercicioA2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combExercicioA2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA2_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combExercicioA2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA2_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combExercicioA2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA2_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combExercicioA2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA2_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combExercicioA2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA2_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(combExercicioA2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA2_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA2)
                    .addComponent(txtObservacoesA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA2_1)
                    .addComponent(txtObservacoesA2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA2_2)
                    .addComponent(txtObservacoesA2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA2_3)
                    .addComponent(txtObservacoesA2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA2_4)
                    .addComponent(txtObservacoesA2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA2_5)
                    .addComponent(txtObservacoesA2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA2_6)
                    .addComponent(txtObservacoesA2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessA2.setForeground(new java.awt.Color(251, 0, 51));
        btnLessA2.setText("-");
        btnLessA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessA2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(combMusculoA2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusA2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessA2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusA2)
                    .addComponent(btnLessA2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoA.addTab("     Treino A - 2          ", jPanel11);

        combMusculoA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoA3ActionPerformed(evt);
            }
        });

        btnPlusA3.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusA3.setText("+");
        btnPlusA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusA3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesA3.setText("Observações");

        lblObservacoesA3_1.setText("Observações");

        lblObservacoesA3_2.setText("Observações");

        lblObservacoesA3_3.setText("Observações");

        lblObservacoesA3_4.setText("Observações");

        lblObservacoesA3_5.setText("Observações");

        lblObservacoesA3_6.setText("Observações");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(combExercicioA3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(combExercicioA3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA3_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(combExercicioA3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA3_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(combExercicioA3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA3_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(combExercicioA3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA3_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(combExercicioA3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA3_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(combExercicioA3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA3_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA3)
                    .addComponent(txtObservacoesA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA3_1)
                    .addComponent(txtObservacoesA3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA3_2)
                    .addComponent(txtObservacoesA3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA3_3)
                    .addComponent(txtObservacoesA3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA3_4)
                    .addComponent(txtObservacoesA3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA3_5)
                    .addComponent(txtObservacoesA3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA3_6)
                    .addComponent(txtObservacoesA3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessA3.setForeground(new java.awt.Color(251, 0, 51));
        btnLessA3.setText("-");
        btnLessA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessA3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(combMusculoA3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusA3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessA3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusA3)
                    .addComponent(btnLessA3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoA.addTab("     Treino A - 3          ", jPanel12);

        combMusculoA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoA4ActionPerformed(evt);
            }
        });

        btnPlusA4.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusA4.setText("+");
        btnPlusA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusA4ActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesA4.setText("Observações");

        lblObservacoesA4_1.setText("Observações");

        lblObservacoesA4_2.setText("Observações");

        lblObservacoesA4_3.setText("Observações");

        lblObservacoesA4_4.setText("Observações");

        lblObservacoesA4_5.setText("Observações");

        lblObservacoesA4_6.setText("Observações");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(combExercicioA4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(combExercicioA4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA4_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(combExercicioA4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA4_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(combExercicioA4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA4_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(combExercicioA4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA4_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(combExercicioA4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA4_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(combExercicioA4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA4_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA4)
                    .addComponent(txtObservacoesA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA4_1)
                    .addComponent(txtObservacoesA4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA4_2)
                    .addComponent(txtObservacoesA4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA4_3)
                    .addComponent(txtObservacoesA4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA4_4)
                    .addComponent(txtObservacoesA4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA4_5)
                    .addComponent(txtObservacoesA4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA4_6)
                    .addComponent(txtObservacoesA4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessA4.setForeground(new java.awt.Color(251, 0, 51));
        btnLessA4.setText("-");
        btnLessA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessA4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(combMusculoA4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusA4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessA4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusA4)
                    .addComponent(btnLessA4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoA.addTab("     Treino A - 4          ", jPanel4);

        combMusculoA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoA5ActionPerformed(evt);
            }
        });

        btnPlusA5.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusA5.setText("+");
        btnPlusA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusA5ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesA5.setText("Observações");

        lblObservacoesA5_1.setText("Observações");

        lblObservacoesA5_2.setText("Observações");

        lblObservacoesA5_3.setText("Observações");

        lblObservacoesA5_4.setText("Observações");

        lblObservacoesA5_5.setText("Observações");

        lblObservacoesA5_6.setText("Observações");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(combExercicioA5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(combExercicioA5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA5_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(combExercicioA5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA5_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(combExercicioA5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA5_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(combExercicioA5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA5_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(combExercicioA5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA5_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(combExercicioA5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesA5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesA5_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesA5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA5)
                    .addComponent(txtObservacoesA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA5_1)
                    .addComponent(txtObservacoesA5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA5_2)
                    .addComponent(txtObservacoesA5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA5_3)
                    .addComponent(txtObservacoesA5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA5_4)
                    .addComponent(txtObservacoesA5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA5_5)
                    .addComponent(txtObservacoesA5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioA5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesA5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesA5_6)
                    .addComponent(txtObservacoesA5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessA5.setForeground(new java.awt.Color(251, 0, 51));
        btnLessA5.setText("-");
        btnLessA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessA5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(combMusculoA5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessA5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusA5)
                    .addComponent(btnLessA5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoA.addTab("     Treino A - 5          ", jPanel5);

        painelAbas.addTab("Treino A                                   ", abaTreinoA);

        combMusculoB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoB1ActionPerformed(evt);
            }
        });

        btnPlusB1.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusB1.setText("+");
        btnPlusB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusB1ActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesB1.setText("Observações");

        lblObservacoesB1_1.setText("Observações");

        lblObservacoesB1_2.setText("Observações");

        lblObservacoesB1_3.setText("Observações");

        lblObservacoesB1_4.setText("Observações");

        lblObservacoesB1_5.setText("Observações");

        combRepeticoesB1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combRepeticoesB1_6ActionPerformed(evt);
            }
        });

        lblObservacoesB1_6.setText("Observações");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(combExercicioB1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(combExercicioB1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB1_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(combExercicioB1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB1_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(combExercicioB1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB1_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(combExercicioB1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB1_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(combExercicioB1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB1_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(combExercicioB1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB1_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB1)
                    .addComponent(txtObservacoesB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB1_1)
                    .addComponent(txtObservacoesB1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB1_2)
                    .addComponent(txtObservacoesB1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB1_3)
                    .addComponent(txtObservacoesB1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB1_4)
                    .addComponent(txtObservacoesB1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB1_5)
                    .addComponent(txtObservacoesB1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB1_6)
                    .addComponent(txtObservacoesB1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessB1.setForeground(new java.awt.Color(251, 0, 51));
        btnLessB1.setText("-");
        btnLessB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(combMusculoB1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessB1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusB1)
                    .addComponent(btnLessB1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaTreinoB.addTab("     Treino B - 1          ", jPanel17);

        combMusculoB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoB2ActionPerformed(evt);
            }
        });

        btnPlusB2.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusB2.setText("+");
        btnPlusB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusB2ActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesB2.setText("Observações");

        lblObservacoesB2_1.setText("Observações");

        lblObservacoesB2_2.setText("Observações");

        lblObservacoesB2_3.setText("Observações");

        lblObservacoesB2_4.setText("Observações");

        lblObservacoesB2_5.setText("Observações");

        lblObservacoesB2_6.setText("Observações");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(combExercicioB2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(combExercicioB2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB2_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(combExercicioB2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB2_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(combExercicioB2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB2_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(combExercicioB2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB2_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(combExercicioB2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB2_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(combExercicioB2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB2_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB2)
                    .addComponent(txtObservacoesB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB2_1)
                    .addComponent(txtObservacoesB2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB2_2)
                    .addComponent(txtObservacoesB2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB2_3)
                    .addComponent(txtObservacoesB2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB2_4)
                    .addComponent(txtObservacoesB2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB2_5)
                    .addComponent(txtObservacoesB2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB2_6)
                    .addComponent(txtObservacoesB2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessB2.setForeground(new java.awt.Color(251, 0, 51));
        btnLessB2.setText("-");
        btnLessB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessB2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(combMusculoB2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessB2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusB2)
                    .addComponent(btnLessB2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoB.addTab("     Treino B - 2          ", jPanel18);

        combMusculoB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoB3ActionPerformed(evt);
            }
        });

        btnPlusB3.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusB3.setText("+");
        btnPlusB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusB3ActionPerformed(evt);
            }
        });

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesB3.setText("Observações");

        lblObservacoesB3_1.setText("Observações");

        lblObservacoesB3_2.setText("Observações");

        lblObservacoesB3_3.setText("Observações");

        lblObservacoesB3_4.setText("Observações");

        lblObservacoesB3_5.setText("Observações");

        lblObservacoesB3_6.setText("Observações");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(combExercicioB3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(combExercicioB3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB3_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(combExercicioB3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB3_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(combExercicioB3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB3_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(combExercicioB3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB3_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(combExercicioB3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB3_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(combExercicioB3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB3_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB3)
                    .addComponent(txtObservacoesB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB3_1)
                    .addComponent(txtObservacoesB3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB3_2)
                    .addComponent(txtObservacoesB3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB3_3)
                    .addComponent(txtObservacoesB3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB3_4)
                    .addComponent(txtObservacoesB3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB3_5)
                    .addComponent(txtObservacoesB3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB3_6)
                    .addComponent(txtObservacoesB3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessB3.setForeground(new java.awt.Color(251, 0, 51));
        btnLessB3.setText("-");
        btnLessB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessB3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(combMusculoB3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessB3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusB3)
                    .addComponent(btnLessB3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoB.addTab("     Treino B - 3          ", jPanel20);

        combMusculoB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoB4ActionPerformed(evt);
            }
        });

        btnPlusB4.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusB4.setText("+");
        btnPlusB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusB4ActionPerformed(evt);
            }
        });

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesB4.setText("Observações");

        lblObservacoesB4_1.setText("Observações");

        lblObservacoesB4_2.setText("Observações");

        lblObservacoesB4_3.setText("Observações");

        lblObservacoesB4_4.setText("Observações");

        lblObservacoesB4_5.setText("Observações");

        lblObservacoesB4_6.setText("Observações");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(combExercicioB4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(combExercicioB4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB4_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(combExercicioB4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB4_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(combExercicioB4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB4_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(combExercicioB4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB4_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(combExercicioB4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB4_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(combExercicioB4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB4_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB4)
                    .addComponent(txtObservacoesB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB4_1)
                    .addComponent(txtObservacoesB4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB4_2)
                    .addComponent(txtObservacoesB4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB4_3)
                    .addComponent(txtObservacoesB4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB4_4)
                    .addComponent(txtObservacoesB4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB4_5)
                    .addComponent(txtObservacoesB4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB4_6)
                    .addComponent(txtObservacoesB4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessB4.setForeground(new java.awt.Color(251, 0, 51));
        btnLessB4.setText("-");
        btnLessB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessB4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(combMusculoB4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessB4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusB4)
                    .addComponent(btnLessB4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoB.addTab("     Treino B - 4          ", jPanel23);

        combMusculoB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoB5ActionPerformed(evt);
            }
        });

        btnPlusB5.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusB5.setText("+");
        btnPlusB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusB5ActionPerformed(evt);
            }
        });

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesB5.setText("Observações");

        lblObservacoesB5_1.setText("Observações");

        lblObservacoesB5_2.setText("Observações");

        lblObservacoesB5_3.setText("Observações");

        lblObservacoesB5_4.setText("Observações");

        lblObservacoesB5_5.setText("Observações");

        lblObservacoesB5_6.setText("Observações");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(combExercicioB5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(combExercicioB5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB5_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(combExercicioB5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB5_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(combExercicioB5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB5_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(combExercicioB5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB5_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(combExercicioB5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB5_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(combExercicioB5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesB5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesB5_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesB5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB5)
                    .addComponent(txtObservacoesB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB5_1)
                    .addComponent(txtObservacoesB5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB5_2)
                    .addComponent(txtObservacoesB5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB5_3)
                    .addComponent(txtObservacoesB5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB5_4)
                    .addComponent(txtObservacoesB5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB5_5)
                    .addComponent(txtObservacoesB5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioB5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesB5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesB5_6)
                    .addComponent(txtObservacoesB5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessB5.setForeground(new java.awt.Color(251, 0, 51));
        btnLessB5.setText("-");
        btnLessB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessB5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(combMusculoB5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusB5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessB5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusB5)
                    .addComponent(btnLessB5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoB.addTab("     Treino B - 5          ", jPanel26);

        painelAbas.addTab("Treino B                                   ", abaTreinoB);

        combMusculoC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoC1ActionPerformed(evt);
            }
        });

        btnPlusC1.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusC1.setText("+");
        btnPlusC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusC1ActionPerformed(evt);
            }
        });

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesC1.setText("Observações");

        lblObservacoesC1_1.setText("Observações");

        lblObservacoesC1_2.setText("Observações");

        lblObservacoesC1_3.setText("Observações");

        lblObservacoesC1_4.setText("Observações");

        lblObservacoesC1_5.setText("Observações");

        combRepeticoesC1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combRepeticoesC1_6ActionPerformed(evt);
            }
        });

        lblObservacoesC1_6.setText("Observações");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(combExercicioC1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(combExercicioC1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC1_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(combExercicioC1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC1_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(combExercicioC1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC1_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(combExercicioC1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC1_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(combExercicioC1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC1_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(combExercicioC1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC1_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC1)
                    .addComponent(txtObservacoesC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC1_1)
                    .addComponent(txtObservacoesC1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC1_2)
                    .addComponent(txtObservacoesC1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC1_3)
                    .addComponent(txtObservacoesC1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC1_4)
                    .addComponent(txtObservacoesC1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC1_5)
                    .addComponent(txtObservacoesC1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC1_6)
                    .addComponent(txtObservacoesC1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessC1.setForeground(new java.awt.Color(251, 0, 51));
        btnLessC1.setText("-");
        btnLessC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessC1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(combMusculoC1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessC1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusC1)
                    .addComponent(btnLessC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaTreinoC.addTab("     Treino C - 1          ", jPanel29);

        combMusculoC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoC2ActionPerformed(evt);
            }
        });

        btnPlusC2.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusC2.setText("+");
        btnPlusC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusC2ActionPerformed(evt);
            }
        });

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesC2.setText("Observações");

        lblObservacoesC2_1.setText("Observações");

        lblObservacoesC2_2.setText("Observações");

        lblObservacoesC2_3.setText("Observações");

        lblObservacoesC2_4.setText("Observações");

        lblObservacoesC2_5.setText("Observações");

        lblObservacoesC2_6.setText("Observações");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(combExercicioC2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(combExercicioC2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC2_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(combExercicioC2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC2_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(combExercicioC2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC2_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(combExercicioC2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC2_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(combExercicioC2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC2_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(combExercicioC2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC2_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC2)
                    .addComponent(txtObservacoesC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC2_1)
                    .addComponent(txtObservacoesC2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC2_2)
                    .addComponent(txtObservacoesC2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC2_3)
                    .addComponent(txtObservacoesC2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC2_4)
                    .addComponent(txtObservacoesC2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC2_5)
                    .addComponent(txtObservacoesC2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC2_6)
                    .addComponent(txtObservacoesC2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessC2.setForeground(new java.awt.Color(251, 0, 51));
        btnLessC2.setText("-");
        btnLessC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessC2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(combMusculoC2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessC2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusC2)
                    .addComponent(btnLessC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoC.addTab("     Treino C - 2          ", jPanel31);

        combMusculoC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoC3ActionPerformed(evt);
            }
        });

        btnPlusC3.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusC3.setText("+");
        btnPlusC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusC3ActionPerformed(evt);
            }
        });

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesC3.setText("Observações");

        lblObservacoesC3_1.setText("Observações");

        lblObservacoesC3_2.setText("Observações");

        lblObservacoesC3_3.setText("Observações");

        lblObservacoesC3_4.setText("Observações");

        lblObservacoesC3_5.setText("Observações");

        lblObservacoesC3_6.setText("Observações");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(combExercicioC3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(combExercicioC3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC3_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(combExercicioC3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC3_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(combExercicioC3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC3_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(combExercicioC3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC3_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(combExercicioC3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC3_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(combExercicioC3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC3_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC3)
                    .addComponent(txtObservacoesC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC3_1)
                    .addComponent(txtObservacoesC3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC3_2)
                    .addComponent(txtObservacoesC3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC3_3)
                    .addComponent(txtObservacoesC3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC3_4)
                    .addComponent(txtObservacoesC3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC3_5)
                    .addComponent(txtObservacoesC3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC3_6)
                    .addComponent(txtObservacoesC3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessC3.setForeground(new java.awt.Color(251, 0, 51));
        btnLessC3.setText("-");
        btnLessC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessC3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(combMusculoC3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessC3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusC3)
                    .addComponent(btnLessC3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoC.addTab("     Treino C - 3          ", jPanel34);

        combMusculoC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoC4ActionPerformed(evt);
            }
        });

        btnPlusC4.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusC4.setText("+");
        btnPlusC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusC4ActionPerformed(evt);
            }
        });

        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesC4.setText("Observações");

        lblObservacoesC4_1.setText("Observações");

        lblObservacoesC4_2.setText("Observações");

        lblObservacoesC4_3.setText("Observações");

        lblObservacoesC4_4.setText("Observações");

        lblObservacoesC4_5.setText("Observações");

        lblObservacoesC4_6.setText("Observações");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(combExercicioC4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(combExercicioC4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC4_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(combExercicioC4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC4_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(combExercicioC4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC4_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(combExercicioC4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC4_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(combExercicioC4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC4_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(combExercicioC4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC4_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC4)
                    .addComponent(txtObservacoesC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC4_1)
                    .addComponent(txtObservacoesC4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC4_2)
                    .addComponent(txtObservacoesC4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC4_3)
                    .addComponent(txtObservacoesC4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC4_4)
                    .addComponent(txtObservacoesC4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC4_5)
                    .addComponent(txtObservacoesC4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC4_6)
                    .addComponent(txtObservacoesC4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessC4.setForeground(new java.awt.Color(251, 0, 51));
        btnLessC4.setText("-");
        btnLessC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessC4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(combMusculoC4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessC4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusC4)
                    .addComponent(btnLessC4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoC.addTab("     Treino C - 4          ", jPanel37);

        combMusculoC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMusculoC5ActionPerformed(evt);
            }
        });

        btnPlusC5.setForeground(new java.awt.Color(251, 0, 51));
        btnPlusC5.setText("+");
        btnPlusC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusC5ActionPerformed(evt);
            }
        });

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Exercícios"));

        lblObservacoesC5.setText("Observações");

        lblObservacoesC5_1.setText("Observações");

        lblObservacoesC5_2.setText("Observações");

        lblObservacoesC5_3.setText("Observações");

        lblObservacoesC5_4.setText("Observações");

        lblObservacoesC5_5.setText("Observações");

        lblObservacoesC5_6.setText("Observações");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(combExercicioC5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(combExercicioC5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC5_1)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(combExercicioC5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC5_2)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(combExercicioC5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC5_3)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(combExercicioC5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC5_4)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(combExercicioC5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC5_5)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(combExercicioC5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combRepeticoesC5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblObservacoesC5_6)
                        .addGap(18, 18, 18)
                        .addComponent(txtObservacoesC5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC5)
                    .addComponent(txtObservacoesC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC5_1)
                    .addComponent(txtObservacoesC5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC5_2)
                    .addComponent(txtObservacoesC5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC5_3)
                    .addComponent(txtObservacoesC5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC5_4)
                    .addComponent(txtObservacoesC5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC5_5)
                    .addComponent(txtObservacoesC5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combExercicioC5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combRepeticoesC5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObservacoesC5_6)
                    .addComponent(txtObservacoesC5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btnLessC5.setForeground(new java.awt.Color(251, 0, 51));
        btnLessC5.setText("-");
        btnLessC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessC5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(combMusculoC5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlusC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLessC5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combMusculoC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusC5)
                    .addComponent(btnLessC5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        abaTreinoC.addTab("     Treino C - 5          ", jPanel40);

        painelAbas.addTab("Treino C                                   ", abaTreinoC);

        lblNomeAlunoTelaTreinos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNomeAlunoTelaTreinos.setForeground(new java.awt.Color(51, 0, 255));

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        btnFechar.setText("Fechar");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnFechar);

        jMenu3.setText("Novo");
        jMenuBar1.add(jMenu3);

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnSalvar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblNomeAlunoTelaTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(IdTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeAlunoTelaTreinos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IdTreino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(dtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLessB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessB5ActionPerformed
        if(controlePlusB5 == 4){
            combExercicioB5_6.setVisible(false);
            combRepeticoesB5_6.setVisible(false);
            txtObservacoesB5_6.setVisible(false);
            lblObservacoesB5_6.setVisible(false);
            controlePlusB5--;
        }else if(controlePlusB5 == 3){
            combExercicioB5_5.setVisible(false);
            combRepeticoesB5_5.setVisible(false);
            txtObservacoesB5_5.setVisible(false);
            lblObservacoesB5_5.setVisible(false);
            controlePlusB5--;
        }else if(controlePlusB5 == 2){
            combExercicioB5_4.setVisible(false);
            combRepeticoesB5_4.setVisible(false);
            txtObservacoesB5_4.setVisible(false);
            lblObservacoesB5_4.setVisible(false);
            controlePlusB5--;
        }else if(controlePlusB5 == 1){
            combExercicioB5_3.setVisible(false);
            combRepeticoesB5_3.setVisible(false);
            txtObservacoesB5_3.setVisible(false);
            lblObservacoesB5_3.setVisible(false);
            controlePlusB5--;
        }
    }//GEN-LAST:event_btnLessB5ActionPerformed

    private void btnPlusB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusB5ActionPerformed
        if(controlePlusB5 == 0){
            combExercicioB5_3.setVisible(true);
            combRepeticoesB5_3.setVisible(true);
            txtObservacoesB5_3.setVisible(true);
            lblObservacoesB5_3.setVisible(true);
            controlePlusB5++;
        }else if(controlePlusB5 == 1){
            combExercicioB5_4.setVisible(true);
            combRepeticoesB5_4.setVisible(true);
            txtObservacoesB5_4.setVisible(true);
            lblObservacoesB5_4.setVisible(true);
            controlePlusB5++;
        }else if(controlePlusB5 == 2){
            combExercicioB5_5.setVisible(true);
            combRepeticoesB5_5.setVisible(true);
            txtObservacoesB5_5.setVisible(true);
            lblObservacoesB5_5.setVisible(true);
            controlePlusB5++;
        }else if(controlePlusB5 == 3){
            combExercicioB5_6.setVisible(true);
            combRepeticoesB5_6.setVisible(true);
            txtObservacoesB5_6.setVisible(true);
            lblObservacoesB5_6.setVisible(true);
            controlePlusB5++;
        }
    }//GEN-LAST:event_btnPlusB5ActionPerformed

    private void btnLessB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessB4ActionPerformed
        if(controlePlusB4 == 4){
            combExercicioB4_6.setVisible(false);
            combRepeticoesB4_6.setVisible(false);
            txtObservacoesB4_6.setVisible(false);
            lblObservacoesB4_6.setVisible(false);
            controlePlusB4--;
        }else if(controlePlusB4 == 3){
            combExercicioB4_5.setVisible(false);
            combRepeticoesB4_5.setVisible(false);
            txtObservacoesB4_5.setVisible(false);
            lblObservacoesB4_5.setVisible(false);
            controlePlusB4--;
        }else if(controlePlusB4 == 2){
            combExercicioB4_4.setVisible(false);
            combRepeticoesB4_4.setVisible(false);
            txtObservacoesB4_4.setVisible(false);
            lblObservacoesB4_4.setVisible(false);
            controlePlusB4--;
        }else if(controlePlusB4 == 1){
            combExercicioB4_3.setVisible(false);
            combRepeticoesB4_3.setVisible(false);
            txtObservacoesB4_3.setVisible(false);
            lblObservacoesB4_3.setVisible(false);
            controlePlusB4--;
        }
    }//GEN-LAST:event_btnLessB4ActionPerformed

    private void btnPlusB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusB4ActionPerformed
        if(controlePlusB4 == 0){
            combExercicioB4_3.setVisible(true);
            combRepeticoesB4_3.setVisible(true);
            txtObservacoesB4_3.setVisible(true);
            lblObservacoesB4_3.setVisible(true);
            controlePlusB4++;
        }else if(controlePlusB4 == 1){
            combExercicioB4_4.setVisible(true);
            combRepeticoesB4_4.setVisible(true);
            txtObservacoesB4_4.setVisible(true);
            lblObservacoesB4_4.setVisible(true);
            controlePlusB4++;
        }else if(controlePlusB4 == 2){
            combExercicioB4_5.setVisible(true);
            combRepeticoesB4_5.setVisible(true);
            txtObservacoesB4_5.setVisible(true);
            lblObservacoesB4_5.setVisible(true);
            controlePlusB4++;
        }else if(controlePlusB4 == 3){
            combExercicioB4_6.setVisible(true);
            combRepeticoesB4_6.setVisible(true);
            txtObservacoesB4_6.setVisible(true);
            lblObservacoesB4_6.setVisible(true);
            controlePlusB4++;
        }
    }//GEN-LAST:event_btnPlusB4ActionPerformed

    private void btnLessB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessB3ActionPerformed
        if(controlePlusB3 == 4){
            combExercicioB3_6.setVisible(false);
            combRepeticoesB3_6.setVisible(false);
            txtObservacoesB3_6.setVisible(false);
            lblObservacoesB3_6.setVisible(false);
            controlePlusB3--;
        }else if(controlePlusB3 == 3){
            combExercicioB3_5.setVisible(false);
            combRepeticoesB3_5.setVisible(false);
            txtObservacoesB3_5.setVisible(false);
            lblObservacoesB3_5.setVisible(false);
            controlePlusB3--;
        }else if(controlePlusB3 == 2){
            combExercicioB3_4.setVisible(false);
            combRepeticoesB3_4.setVisible(false);
            txtObservacoesB3_4.setVisible(false);
            lblObservacoesB3_4.setVisible(false);
            controlePlusB3--;
        }else if(controlePlusB3 == 1){
            combExercicioB3_3.setVisible(false);
            combRepeticoesB3_3.setVisible(false);
            txtObservacoesB3_3.setVisible(false);
            lblObservacoesB3_3.setVisible(false);
            controlePlusB3--;
        }
    }//GEN-LAST:event_btnLessB3ActionPerformed

    private void btnPlusB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusB3ActionPerformed
        if(controlePlusB3 == 0){
            combExercicioB3_3.setVisible(true);
            combRepeticoesB3_3.setVisible(true);
            txtObservacoesB3_3.setVisible(true);
            lblObservacoesB3_3.setVisible(true);
            controlePlusB3++;
        }else if(controlePlusB3 == 1){
            combExercicioB3_4.setVisible(true);
            combRepeticoesB3_4.setVisible(true);
            txtObservacoesB3_4.setVisible(true);
            lblObservacoesB3_4.setVisible(true);
            controlePlusB3++;
        }else if(controlePlusB3 == 2){
            combExercicioB3_5.setVisible(true);
            combRepeticoesB3_5.setVisible(true);
            txtObservacoesB3_5.setVisible(true);
            lblObservacoesB3_5.setVisible(true);
            controlePlusB3++;
        }else if(controlePlusB3 == 3){
            combExercicioB3_6.setVisible(true);
            combRepeticoesB3_6.setVisible(true);
            txtObservacoesB3_6.setVisible(true);
            lblObservacoesB3_6.setVisible(true);
            controlePlusB3++;
        }
    }//GEN-LAST:event_btnPlusB3ActionPerformed

    private void btnLessB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessB2ActionPerformed
        if(controlePlusB2 == 4){
            combExercicioB2_6.setVisible(false);
            combRepeticoesB2_6.setVisible(false);
            txtObservacoesB2_6.setVisible(false);
            lblObservacoesB2_6.setVisible(false);
            controlePlusB2--;
        }else if(controlePlusB2 == 3){
            combExercicioB2_5.setVisible(false);
            combRepeticoesB2_5.setVisible(false);
            txtObservacoesB2_5.setVisible(false);
            lblObservacoesB2_5.setVisible(false);
            controlePlusB2--;
        }else if(controlePlusB2 == 2){
            combExercicioB2_4.setVisible(false);
            combRepeticoesB2_4.setVisible(false);
            txtObservacoesB2_4.setVisible(false);
            lblObservacoesB2_4.setVisible(false);
            controlePlusB2--;
        }else if(controlePlusB2 == 1){
            combExercicioB2_3.setVisible(false);
            combRepeticoesB2_3.setVisible(false);
            txtObservacoesB2_3.setVisible(false);
            lblObservacoesB2_3.setVisible(false);
            controlePlusB2--;
        }
    }//GEN-LAST:event_btnLessB2ActionPerformed

    private void btnPlusB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusB2ActionPerformed
        if(controlePlusB2 == 0){
            combExercicioB2_3.setVisible(true);
            combRepeticoesB2_3.setVisible(true);
            txtObservacoesB2_3.setVisible(true);
            lblObservacoesB2_3.setVisible(true);
            controlePlusB2++;
        }else if(controlePlusB2 == 1){
            combExercicioB2_4.setVisible(true);
            combRepeticoesB2_4.setVisible(true);
            txtObservacoesB2_4.setVisible(true);
            lblObservacoesB2_4.setVisible(true);
            controlePlusB2++;
        }else if(controlePlusB2 == 2){
            combExercicioB2_5.setVisible(true);
            combRepeticoesB2_5.setVisible(true);
            txtObservacoesB2_5.setVisible(true);
            lblObservacoesB2_5.setVisible(true);
            controlePlusB2++;
        }else if(controlePlusB2 == 3){
            combExercicioB2_6.setVisible(true);
            combRepeticoesB2_6.setVisible(true);
            txtObservacoesB2_6.setVisible(true);
            lblObservacoesB2_6.setVisible(true);
            controlePlusB2++;
        }
    }//GEN-LAST:event_btnPlusB2ActionPerformed

    private void btnLessB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessB1ActionPerformed
        if(controlePlusB1 == 4){
            combExercicioB1_6.setVisible(false);
            combRepeticoesB1_6.setVisible(false);
            txtObservacoesB1_6.setVisible(false);
            lblObservacoesB1_6.setVisible(false);
            controlePlusB1--;
        }else if(controlePlusB1 == 3){
            combExercicioB1_5.setVisible(false);
            combRepeticoesB1_5.setVisible(false);
            txtObservacoesB1_5.setVisible(false);
            lblObservacoesB1_5.setVisible(false);
            controlePlusB1--;
        }else if(controlePlusB1 == 2){
            combExercicioB1_4.setVisible(false);
            combRepeticoesB1_4.setVisible(false);
            txtObservacoesB1_4.setVisible(false);
            lblObservacoesB1_4.setVisible(false);
            controlePlusB1--;
        }else if(controlePlusB1 == 1){
            combExercicioB1_3.setVisible(false);
            combRepeticoesB1_3.setVisible(false);
            txtObservacoesB1_3.setVisible(false);
            lblObservacoesB1_3.setVisible(false);
            controlePlusB1--;
        }
    }//GEN-LAST:event_btnLessB1ActionPerformed

    private void btnPlusB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusB1ActionPerformed
        if(controlePlusB1 == 0){
            combExercicioB1_3.setVisible(true);
            combRepeticoesB1_3.setVisible(true);
            txtObservacoesB1_3.setVisible(true);
            lblObservacoesB1_3.setVisible(true);
            controlePlusB1++;
        }else if(controlePlusB1 == 1){
            combExercicioB1_4.setVisible(true);
            combRepeticoesB1_4.setVisible(true);
            txtObservacoesB1_4.setVisible(true);
            lblObservacoesB1_4.setVisible(true);
            controlePlusB1++;
        }else if(controlePlusB1 == 2){
            combExercicioB1_5.setVisible(true);
            combRepeticoesB1_5.setVisible(true);
            txtObservacoesB1_5.setVisible(true);
            lblObservacoesB1_5.setVisible(true);
            controlePlusB1++;
        }else if(controlePlusB1 == 3){
            combExercicioB1_6.setVisible(true);
            combRepeticoesB1_6.setVisible(true);
            txtObservacoesB1_6.setVisible(true);
            lblObservacoesB1_6.setVisible(true);
            controlePlusB1++;
        }
    }//GEN-LAST:event_btnPlusB1ActionPerformed

    private void btnLessA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessA5ActionPerformed
        if(controlePlusA5 == 4){
            combExercicioA5_6.setVisible(false);
            combRepeticoesA5_6.setVisible(false);
            txtObservacoesA5_6.setVisible(false);
            lblObservacoesA5_6.setVisible(false);
            controlePlusA5--;
        }else if(controlePlusA5 == 3){
            combExercicioA5_5.setVisible(false);
            combRepeticoesA5_5.setVisible(false);
            txtObservacoesA5_5.setVisible(false);
            lblObservacoesA5_5.setVisible(false);
            controlePlusA5--;
        }else if(controlePlusA5 == 2){
            combExercicioA5_4.setVisible(false);
            combRepeticoesA5_4.setVisible(false);
            txtObservacoesA5_4.setVisible(false);
            lblObservacoesA5_4.setVisible(false);
            controlePlusA5--;
        }else if(controlePlusA5 == 1){
            combExercicioA5_3.setVisible(false);
            combRepeticoesA5_3.setVisible(false);
            txtObservacoesA5_3.setVisible(false);
            lblObservacoesA5_3.setVisible(false);
            controlePlusA5--;
        }
    }//GEN-LAST:event_btnLessA5ActionPerformed

    private void btnPlusA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusA5ActionPerformed
        if(controlePlusA5 == 0){
            combExercicioA5_3.setVisible(true);
            combRepeticoesA5_3.setVisible(true);
            txtObservacoesA5_3.setVisible(true);
            lblObservacoesA5_3.setVisible(true);
            controlePlusA5++;
        }else if(controlePlusA5 == 1){
            combExercicioA5_4.setVisible(true);
            combRepeticoesA5_4.setVisible(true);
            txtObservacoesA5_4.setVisible(true);
            lblObservacoesA5_4.setVisible(true);
            controlePlusA5++;
        }else if(controlePlusA5 == 2){
            combExercicioA5_5.setVisible(true);
            combRepeticoesA5_5.setVisible(true);
            txtObservacoesA5_5.setVisible(true);
            lblObservacoesA5_5.setVisible(true);
            controlePlusA5++;
        }else if(controlePlusA5 == 3){
            combExercicioA5_6.setVisible(true);
            combRepeticoesA5_6.setVisible(true);
            txtObservacoesA5_6.setVisible(true);
            lblObservacoesA5_6.setVisible(true);
            controlePlusA5++;
        }
    }//GEN-LAST:event_btnPlusA5ActionPerformed

    private void btnLessA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessA4ActionPerformed
        if(controlePlusA4 == 4){
            combExercicioA4_6.setVisible(false);
            combRepeticoesA4_6.setVisible(false);
            txtObservacoesA4_6.setVisible(false);
            lblObservacoesA4_6.setVisible(false);
            controlePlusA4--;
        }else if(controlePlusA4 == 3){
            combExercicioA4_5.setVisible(false);
            combRepeticoesA4_5.setVisible(false);
            txtObservacoesA4_5.setVisible(false);
            lblObservacoesA4_5.setVisible(false);
            controlePlusA4--;
        }else if(controlePlusA4 == 2){
            combExercicioA4_4.setVisible(false);
            combRepeticoesA4_4.setVisible(false);
            txtObservacoesA4_4.setVisible(false);
            lblObservacoesA4_4.setVisible(false);
            controlePlusA4--;
        }else if(controlePlusA4 == 1){
            combExercicioA4_3.setVisible(false);
            combRepeticoesA4_3.setVisible(false);
            txtObservacoesA4_3.setVisible(false);
            lblObservacoesA4_3.setVisible(false);
            controlePlusA4--;
        }
    }//GEN-LAST:event_btnLessA4ActionPerformed

    private void btnPlusA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusA4ActionPerformed
        if(controlePlusA4 == 0){
            combExercicioA4_3.setVisible(true);
            combRepeticoesA4_3.setVisible(true);
            txtObservacoesA4_3.setVisible(true);
            lblObservacoesA4_3.setVisible(true);
            controlePlusA4++;
        }else if(controlePlusA4 == 1){
            combExercicioA4_4.setVisible(true);
            combRepeticoesA4_4.setVisible(true);
            txtObservacoesA4_4.setVisible(true);
            lblObservacoesA4_4.setVisible(true);
            controlePlusA4++;
        }else if(controlePlusA4 == 2){
            combExercicioA4_5.setVisible(true);
            combRepeticoesA4_5.setVisible(true);
            txtObservacoesA4_5.setVisible(true);
            lblObservacoesA4_5.setVisible(true);
            controlePlusA4++;
        }else if(controlePlusA4 == 3){
            combExercicioA4_6.setVisible(true);
            combRepeticoesA4_6.setVisible(true);
            txtObservacoesA4_6.setVisible(true);
            lblObservacoesA4_6.setVisible(true);
            controlePlusA4++;
        }
    }//GEN-LAST:event_btnPlusA4ActionPerformed

    private void btnLessA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessA3ActionPerformed
        if(controlePlusA3 == 4){
            combExercicioA3_6.setVisible(false);
            combRepeticoesA3_6.setVisible(false);
            txtObservacoesA3_6.setVisible(false);
            lblObservacoesA3_6.setVisible(false);
            controlePlusA3--;
        }else if(controlePlusA3 == 3){
            combExercicioA3_5.setVisible(false);
            combRepeticoesA3_5.setVisible(false);
            txtObservacoesA3_5.setVisible(false);
            lblObservacoesA3_5.setVisible(false);
            controlePlusA3--;
        }else if(controlePlusA3 == 2){
            combExercicioA3_4.setVisible(false);
            combRepeticoesA3_4.setVisible(false);
            txtObservacoesA3_4.setVisible(false);
            lblObservacoesA3_4.setVisible(false);
            controlePlusA3--;
        }else if(controlePlusA3 == 1){
            combExercicioA3_3.setVisible(false);
            combRepeticoesA3_3.setVisible(false);
            txtObservacoesA3_3.setVisible(false);
            lblObservacoesA3_3.setVisible(false);
            controlePlusA3--;
        }
    }//GEN-LAST:event_btnLessA3ActionPerformed

    private void btnPlusA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusA3ActionPerformed
        if(controlePlusA3 == 0){
            combExercicioA3_3.setVisible(true);
            combRepeticoesA3_3.setVisible(true);
            txtObservacoesA3_3.setVisible(true);
            lblObservacoesA3_3.setVisible(true);
            controlePlusA3++;
        }else if(controlePlusA3 == 1){
            combExercicioA3_4.setVisible(true);
            combRepeticoesA3_4.setVisible(true);
            txtObservacoesA3_4.setVisible(true);
            lblObservacoesA3_4.setVisible(true);
            controlePlusA3++;
        }else if(controlePlusA3 == 2){
            combExercicioA3_5.setVisible(true);
            combRepeticoesA3_5.setVisible(true);
            txtObservacoesA3_5.setVisible(true);
            lblObservacoesA3_5.setVisible(true);
            controlePlusA3++;
        }else if(controlePlusA3 == 3){
            combExercicioA3_6.setVisible(true);
            combRepeticoesA3_6.setVisible(true);
            txtObservacoesA3_6.setVisible(true);
            lblObservacoesA3_6.setVisible(true);
            controlePlusA3++;
        }
    }//GEN-LAST:event_btnPlusA3ActionPerformed

    private void btnLessA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessA2ActionPerformed
        if(controlePlusA2 == 4){
            combExercicioA2_6.setVisible(false);
            combRepeticoesA2_6.setVisible(false);
            txtObservacoesA2_6.setVisible(false);
            lblObservacoesA2_6.setVisible(false);
            controlePlusA2--;
        }else if(controlePlusA2 == 3){
            combExercicioA2_5.setVisible(false);
            combRepeticoesA2_5.setVisible(false);
            txtObservacoesA2_5.setVisible(false);
            lblObservacoesA2_5.setVisible(false);
            controlePlusA2--;
        }else if(controlePlusA2 == 2){
            combExercicioA2_4.setVisible(false);
            combRepeticoesA2_4.setVisible(false);
            txtObservacoesA2_4.setVisible(false);
            lblObservacoesA2_4.setVisible(false);
            controlePlusA2--;
        }else if(controlePlusA2 == 1){
            combExercicioA2_3.setVisible(false);
            combRepeticoesA2_3.setVisible(false);
            txtObservacoesA2_3.setVisible(false);
            lblObservacoesA2_3.setVisible(false);
            controlePlusA2--;
        }
    }//GEN-LAST:event_btnLessA2ActionPerformed

    private void btnPlusA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusA2ActionPerformed
        if(controlePlusA2 == 0){
            combExercicioA2_3.setVisible(true);
            combRepeticoesA2_3.setVisible(true);
            txtObservacoesA2_3.setVisible(true);
            lblObservacoesA2_3.setVisible(true);
            controlePlusA2++;
        }else if(controlePlusA2 == 1){
            combExercicioA2_4.setVisible(true);
            combRepeticoesA2_4.setVisible(true);
            txtObservacoesA2_4.setVisible(true);
            lblObservacoesA2_4.setVisible(true);
            controlePlusA2++;
        }else if(controlePlusA2 == 2){
            combExercicioA2_5.setVisible(true);
            combRepeticoesA2_5.setVisible(true);
            txtObservacoesA2_5.setVisible(true);
            lblObservacoesA2_5.setVisible(true);
            controlePlusA2++;
        }else if(controlePlusA2 == 3){
            combExercicioA2_6.setVisible(true);
            combRepeticoesA2_6.setVisible(true);
            txtObservacoesA2_6.setVisible(true);
            lblObservacoesA2_6.setVisible(true);
            controlePlusA2++;
        }
    }//GEN-LAST:event_btnPlusA2ActionPerformed

    private void btnLessA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessA1ActionPerformed
        if(controlePlusA1 == 4){
            combExercicioA1_6.setVisible(false);
            combRepeticoesA1_6.setVisible(false);
            txtObservacoesA1_6.setVisible(false);
            lblObservacoesA1_6.setVisible(false);
            controlePlusA1--;
        }else if(controlePlusA1 == 3){
            combExercicioA1_5.setVisible(false);
            combRepeticoesA1_5.setVisible(false);
            txtObservacoesA1_5.setVisible(false);
            lblObservacoesA1_5.setVisible(false);
            controlePlusA1--;
        }else if(controlePlusA1 == 2){
            combExercicioA1_4.setVisible(false);
            combRepeticoesA1_4.setVisible(false);
            txtObservacoesA1_4.setVisible(false);
            lblObservacoesA1_4.setVisible(false);
            controlePlusA1--;
        }else if(controlePlusA1 == 1){
            combExercicioA1_3.setVisible(false);
            combRepeticoesA1_3.setVisible(false);
            txtObservacoesA1_3.setVisible(false);
            lblObservacoesA1_3.setVisible(false);
            controlePlusA1--;
        }
    }//GEN-LAST:event_btnLessA1ActionPerformed

    private void btnPlusA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusA1ActionPerformed
        if(controlePlusA1 == 0){
            combExercicioA1_3.setVisible(true);
            combRepeticoesA1_3.setVisible(true);
            txtObservacoesA1_3.setVisible(true);
            lblObservacoesA1_3.setVisible(true);
            controlePlusA1++;
        }else if(controlePlusA1 == 1){
            combExercicioA1_4.setVisible(true);
            combRepeticoesA1_4.setVisible(true);
            txtObservacoesA1_4.setVisible(true);
            lblObservacoesA1_4.setVisible(true);
            controlePlusA1++;
        }else if(controlePlusA1 == 2){
            combExercicioA1_5.setVisible(true);
            combRepeticoesA1_5.setVisible(true);
            txtObservacoesA1_5.setVisible(true);
            lblObservacoesA1_5.setVisible(true);
            controlePlusA1++;
        }else if(controlePlusA1 == 3){
            combExercicioA1_6.setVisible(true);
            combRepeticoesA1_6.setVisible(true);
            txtObservacoesA1_6.setVisible(true);
            lblObservacoesA1_6.setVisible(true);
            controlePlusA1++;
        }
    }//GEN-LAST:event_btnPlusA1ActionPerformed

    private void combRepeticoesB1_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combRepeticoesB1_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combRepeticoesB1_6ActionPerformed

    private void btnPlusC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusC1ActionPerformed
        if(controlePlusC1 == 0){
            combExercicioC1_3.setVisible(true);
            combRepeticoesC1_3.setVisible(true);
            txtObservacoesC1_3.setVisible(true);
            lblObservacoesC1_3.setVisible(true);
            controlePlusC1++;
        }else if(controlePlusC1 == 1){
            combExercicioC1_4.setVisible(true);
            combRepeticoesC1_4.setVisible(true);
            txtObservacoesC1_4.setVisible(true);
            lblObservacoesC1_4.setVisible(true);
            controlePlusC1++;
        }else if(controlePlusC1 == 2){
            combExercicioC1_5.setVisible(true);
            combRepeticoesC1_5.setVisible(true);
            txtObservacoesC1_5.setVisible(true);
            lblObservacoesC1_5.setVisible(true);
            controlePlusC1++;
        }else if(controlePlusC1 == 3){
            combExercicioC1_6.setVisible(true);
            combRepeticoesC1_6.setVisible(true);
            txtObservacoesC1_6.setVisible(true);
            lblObservacoesC1_6.setVisible(true);
            controlePlusC1++;
        }
    }//GEN-LAST:event_btnPlusC1ActionPerformed

    private void combRepeticoesC1_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combRepeticoesC1_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combRepeticoesC1_6ActionPerformed

    private void btnLessC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessC1ActionPerformed
        if(controlePlusC1 == 4){
            combExercicioC1_6.setVisible(false);
            combRepeticoesC1_6.setVisible(false);
            txtObservacoesC1_6.setVisible(false);
            lblObservacoesC1_6.setVisible(false);
            controlePlusC1--;
        }else if(controlePlusC1 == 3){
            combExercicioC1_5.setVisible(false);
            combRepeticoesC1_5.setVisible(false);
            txtObservacoesC1_5.setVisible(false);
            lblObservacoesC1_5.setVisible(false);
            controlePlusC1--;
        }else if(controlePlusC1 == 2){
            combExercicioC1_4.setVisible(false);
            combRepeticoesC1_4.setVisible(false);
            txtObservacoesC1_4.setVisible(false);
            lblObservacoesC1_4.setVisible(false);
            controlePlusC1--;
        }else if(controlePlusC1 == 1){
            combExercicioC1_3.setVisible(false);
            combRepeticoesC1_3.setVisible(false);
            txtObservacoesC1_3.setVisible(false);
            lblObservacoesC1_3.setVisible(false);
            controlePlusC1--;
        }
    }//GEN-LAST:event_btnLessC1ActionPerformed

    private void btnPlusC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusC2ActionPerformed
        if(controlePlusC2 == 0){
            combExercicioC2_3.setVisible(true);
            combRepeticoesC2_3.setVisible(true);
            txtObservacoesC2_3.setVisible(true);
            lblObservacoesC2_3.setVisible(true);
            controlePlusC2++;
        }else if(controlePlusC2 == 1){
            combExercicioC2_4.setVisible(true);
            combRepeticoesC2_4.setVisible(true);
            txtObservacoesC2_4.setVisible(true);
            lblObservacoesC2_4.setVisible(true);
            controlePlusC2++;
        }else if(controlePlusC2 == 2){
            combExercicioC2_5.setVisible(true);
            combRepeticoesC2_5.setVisible(true);
            txtObservacoesC2_5.setVisible(true);
            lblObservacoesC2_5.setVisible(true);
            controlePlusC2++;
        }else if(controlePlusC2 == 3){
            combExercicioC2_6.setVisible(true);
            combRepeticoesC2_6.setVisible(true);
            txtObservacoesC2_6.setVisible(true);
            lblObservacoesC2_6.setVisible(true);
            controlePlusC2++;
        }
    }//GEN-LAST:event_btnPlusC2ActionPerformed

    private void btnLessC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessC2ActionPerformed
        if(controlePlusC2 == 4){
            combExercicioC2_6.setVisible(false);
            combRepeticoesC2_6.setVisible(false);
            txtObservacoesC2_6.setVisible(false);
            lblObservacoesC2_6.setVisible(false);
            controlePlusC2--;
        }else if(controlePlusC2 == 3){
            combExercicioC2_5.setVisible(false);
            combRepeticoesC2_5.setVisible(false);
            txtObservacoesC2_5.setVisible(false);
            lblObservacoesC2_5.setVisible(false);
            controlePlusC2--;
        }else if(controlePlusC2 == 2){
            combExercicioC2_4.setVisible(false);
            combRepeticoesC2_4.setVisible(false);
            txtObservacoesC2_4.setVisible(false);
            lblObservacoesC2_4.setVisible(false);
            controlePlusC2--;
        }else if(controlePlusC2 == 1){
            combExercicioC2_3.setVisible(false);
            combRepeticoesC2_3.setVisible(false);
            txtObservacoesC2_3.setVisible(false);
            lblObservacoesC2_3.setVisible(false);
            controlePlusC2--;
        }
    }//GEN-LAST:event_btnLessC2ActionPerformed

    private void btnPlusC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusC3ActionPerformed
        if(controlePlusC3 == 0){
            combExercicioC3_3.setVisible(true);
            combRepeticoesC3_3.setVisible(true);
            txtObservacoesC3_3.setVisible(true);
            lblObservacoesC3_3.setVisible(true);
            controlePlusC3++;
        }else if(controlePlusC3 == 1){
            combExercicioC3_4.setVisible(true);
            combRepeticoesC3_4.setVisible(true);
            txtObservacoesC3_4.setVisible(true);
            lblObservacoesC3_4.setVisible(true);
            controlePlusC3++;
        }else if(controlePlusC3 == 2){
            combExercicioC3_5.setVisible(true);
            combRepeticoesC3_5.setVisible(true);
            txtObservacoesC3_5.setVisible(true);
            lblObservacoesC3_5.setVisible(true);
            controlePlusC3++;
        }else if(controlePlusC3 == 3){
            combExercicioC3_6.setVisible(true);
            combRepeticoesC3_6.setVisible(true);
            txtObservacoesC3_6.setVisible(true);
            lblObservacoesC3_6.setVisible(true);
            controlePlusC3++;
        }
    }//GEN-LAST:event_btnPlusC3ActionPerformed

    private void btnLessC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessC3ActionPerformed
        if(controlePlusC3 == 4){
            combExercicioC3_6.setVisible(false);
            combRepeticoesC3_6.setVisible(false);
            txtObservacoesC3_6.setVisible(false);
            lblObservacoesC3_6.setVisible(false);
            controlePlusC3--;
        }else if(controlePlusC3 == 3){
            combExercicioC3_5.setVisible(false);
            combRepeticoesC3_5.setVisible(false);
            txtObservacoesC3_5.setVisible(false);
            lblObservacoesC3_5.setVisible(false);
            controlePlusC3--;
        }else if(controlePlusC3 == 2){
            combExercicioC3_4.setVisible(false);
            combRepeticoesC3_4.setVisible(false);
            txtObservacoesC3_4.setVisible(false);
            lblObservacoesC3_4.setVisible(false);
            controlePlusC3--;
        }else if(controlePlusC3 == 1){
            combExercicioC3_3.setVisible(false);
            combRepeticoesC3_3.setVisible(false);
            txtObservacoesC3_3.setVisible(false);
            lblObservacoesC3_3.setVisible(false);
            controlePlusC3--;
        }
    }//GEN-LAST:event_btnLessC3ActionPerformed

    private void btnPlusC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusC4ActionPerformed
        if(controlePlusC4 == 0){
            combExercicioC4_3.setVisible(true);
            combRepeticoesC4_3.setVisible(true);
            txtObservacoesC4_3.setVisible(true);
            lblObservacoesC4_3.setVisible(true);
            controlePlusC4++;
        }else if(controlePlusC4 == 1){
            combExercicioC4_4.setVisible(true);
            combRepeticoesC4_4.setVisible(true);
            txtObservacoesC4_4.setVisible(true);
            lblObservacoesC4_4.setVisible(true);
            controlePlusC4++;
        }else if(controlePlusC4 == 2){
            combExercicioC4_5.setVisible(true);
            combRepeticoesC4_5.setVisible(true);
            txtObservacoesC4_5.setVisible(true);
            lblObservacoesC4_5.setVisible(true);
            controlePlusC4++;
        }else if(controlePlusC4 == 3){
            combExercicioC4_6.setVisible(true);
            combRepeticoesC4_6.setVisible(true);
            txtObservacoesC4_6.setVisible(true);
            lblObservacoesC4_6.setVisible(true);
            controlePlusC4++;
        }
    }//GEN-LAST:event_btnPlusC4ActionPerformed

    private void btnLessC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessC4ActionPerformed
        if(controlePlusC4 == 4){
            combExercicioC4_6.setVisible(false);
            combRepeticoesC4_6.setVisible(false);
            txtObservacoesC4_6.setVisible(false);
            lblObservacoesC4_6.setVisible(false);
            controlePlusC4--;
        }else if(controlePlusC4 == 3){
            combExercicioC4_5.setVisible(false);
            combRepeticoesC4_5.setVisible(false);
            txtObservacoesC4_5.setVisible(false);
            lblObservacoesC4_5.setVisible(false);
            controlePlusC4--;
        }else if(controlePlusC4 == 2){
            combExercicioC4_4.setVisible(false);
            combRepeticoesC4_4.setVisible(false);
            txtObservacoesC4_4.setVisible(false);
            lblObservacoesC4_4.setVisible(false);
            controlePlusC4--;
        }else if(controlePlusC4 == 1){
            combExercicioC4_3.setVisible(false);
            combRepeticoesC4_3.setVisible(false);
            txtObservacoesC4_3.setVisible(false);
            lblObservacoesC4_3.setVisible(false);
            controlePlusC4--;
        }
    }//GEN-LAST:event_btnLessC4ActionPerformed

    private void btnPlusC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusC5ActionPerformed
        if(controlePlusC5 == 0){
            combExercicioC5_3.setVisible(true);
            combRepeticoesC5_3.setVisible(true);
            txtObservacoesC5_3.setVisible(true);
            lblObservacoesC5_3.setVisible(true);
            controlePlusC5++;
        }else if(controlePlusC5 == 1){
            combExercicioC5_4.setVisible(true);
            combRepeticoesC5_4.setVisible(true);
            txtObservacoesC5_4.setVisible(true);
            lblObservacoesC5_4.setVisible(true);
            controlePlusC5++;
        }else if(controlePlusC5 == 2){
            combExercicioC5_5.setVisible(true);
            combRepeticoesC5_5.setVisible(true);
            txtObservacoesC5_5.setVisible(true);
            lblObservacoesC5_5.setVisible(true);
            controlePlusC5++;
        }else if(controlePlusC5 == 3){
            combExercicioC5_6.setVisible(true);
            combRepeticoesC5_6.setVisible(true);
            txtObservacoesC5_6.setVisible(true);
            lblObservacoesC5_6.setVisible(true);
            controlePlusC5++;
        }
    }//GEN-LAST:event_btnPlusC5ActionPerformed

    private void btnLessC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessC5ActionPerformed
        if(controlePlusC5 == 4){
            combExercicioC5_6.setVisible(false);
            combRepeticoesC5_6.setVisible(false);
            txtObservacoesC5_6.setVisible(false);
            lblObservacoesC5_6.setVisible(false);
            controlePlusC5--;
        }else if(controlePlusC5 == 3){
            combExercicioC5_5.setVisible(false);
            combRepeticoesC5_5.setVisible(false);
            txtObservacoesC5_5.setVisible(false);
            lblObservacoesC5_5.setVisible(false);
            controlePlusC5--;
        }else if(controlePlusC5 == 2){
            combExercicioC5_4.setVisible(false);
            combRepeticoesC5_4.setVisible(false);
            txtObservacoesC5_4.setVisible(false);
            lblObservacoesC5_4.setVisible(false);
            controlePlusC5--;
        }else if(controlePlusC5 == 1){
            combExercicioC5_3.setVisible(false);
            combRepeticoesC5_3.setVisible(false);
            txtObservacoesC5_3.setVisible(false);
            lblObservacoesC5_3.setVisible(false);
            controlePlusC5--;
        }
    }//GEN-LAST:event_btnLessC5ActionPerformed

    private void combMusculoA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoA1ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoA1.getSelectedItem()); //seta o nome do Grupo para a classe
            try {
                combExercicioA1.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioA1_1.removeAllItems();
                combExercicioA1_2.removeAllItems();
                combExercicioA1_3.removeAllItems();
                combExercicioA1_4.removeAllItems();
                combExercicioA1_5.removeAllItems();
                combExercicioA1_6.removeAllItems();
                exercicios.populandoCombExercicios(); //seta a listaExercicios para logo abaixo carregar os combos de exercicios
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioA1.addItem(listaExercicios.get(i));
                combExercicioA1_1.addItem(listaExercicios.get(i));
                combExercicioA1_2.addItem(listaExercicios.get(i));
                combExercicioA1_3.addItem(listaExercicios.get(i));
                combExercicioA1_4.addItem(listaExercicios.get(i));
                combExercicioA1_5.addItem(listaExercicios.get(i));
                combExercicioA1_6.addItem(listaExercicios.get(i));
                } 
        }
    }//GEN-LAST:event_combMusculoA1ActionPerformed

    private void abaTreinoAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abaTreinoAMouseClicked
        /* Funcionando sem o codigo de ação quando clicar na aba, BKP se parar
        if(carregarPrimeiraVez){
            exercicios.setNm_membro(String.valueOf(combMusculoA2.getSelectedItem()));
            try {
                combExercicioA2.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioA2_1.removeAllItems();
                combExercicioA2_2.removeAllItems();
                combExercicioA2_3.removeAllItems();
                combExercicioA2_4.removeAllItems();
                combExercicioA2_5.removeAllItems();
                combExercicioA2_6.removeAllItems();       
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastro_treino.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.carregarComboExerciciosA2();//-------------------------------
            carregarPrimeiraVez = false;
        }*/
        
    }//GEN-LAST:event_abaTreinoAMouseClicked

    private void combMusculoA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoA2ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoA2.getSelectedItem());
            try {
                combExercicioA2.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioA2_1.removeAllItems();
                combExercicioA2_2.removeAllItems();
                combExercicioA2_3.removeAllItems();
                combExercicioA2_4.removeAllItems();
                combExercicioA2_5.removeAllItems();
                combExercicioA2_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioA2.addItem(listaExercicios.get(i));
                combExercicioA2_1.addItem(listaExercicios.get(i));
                combExercicioA2_2.addItem(listaExercicios.get(i));
                combExercicioA2_3.addItem(listaExercicios.get(i));
                combExercicioA2_4.addItem(listaExercicios.get(i));
                combExercicioA2_5.addItem(listaExercicios.get(i));
                combExercicioA2_6.addItem(listaExercicios.get(i));
                } 
        }
    }//GEN-LAST:event_combMusculoA2ActionPerformed

    private void combMusculoA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoA3ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoA3.getSelectedItem());
            try {
                combExercicioA3.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioA3_1.removeAllItems();
                combExercicioA3_2.removeAllItems();
                combExercicioA3_3.removeAllItems();
                combExercicioA3_4.removeAllItems();
                combExercicioA3_5.removeAllItems();
                combExercicioA3_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioA3.addItem(listaExercicios.get(i));
                combExercicioA3_1.addItem(listaExercicios.get(i));
                combExercicioA3_2.addItem(listaExercicios.get(i));
                combExercicioA3_3.addItem(listaExercicios.get(i));
                combExercicioA3_4.addItem(listaExercicios.get(i));
                combExercicioA3_5.addItem(listaExercicios.get(i));
                combExercicioA3_6.addItem(listaExercicios.get(i));
                } 
        }
    }//GEN-LAST:event_combMusculoA3ActionPerformed

    private void combMusculoA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoA4ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoA4.getSelectedItem());
            try {
                combExercicioA4.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioA4_1.removeAllItems();
                combExercicioA4_2.removeAllItems();
                combExercicioA4_3.removeAllItems();
                combExercicioA4_4.removeAllItems();
                combExercicioA4_5.removeAllItems();
                combExercicioA4_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioA4.addItem(listaExercicios.get(i));
                combExercicioA4_1.addItem(listaExercicios.get(i));
                combExercicioA4_2.addItem(listaExercicios.get(i));
                combExercicioA4_3.addItem(listaExercicios.get(i));
                combExercicioA4_4.addItem(listaExercicios.get(i));
                combExercicioA4_5.addItem(listaExercicios.get(i));
                combExercicioA4_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoA4ActionPerformed

    private void combMusculoA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoA5ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoA5.getSelectedItem());
            try {
                combExercicioA5.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioA5_1.removeAllItems();
                combExercicioA5_2.removeAllItems();
                combExercicioA5_3.removeAllItems();
                combExercicioA5_4.removeAllItems();
                combExercicioA5_5.removeAllItems();
                combExercicioA5_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioA5.addItem(listaExercicios.get(i));
                combExercicioA5_1.addItem(listaExercicios.get(i));
                combExercicioA5_2.addItem(listaExercicios.get(i));
                combExercicioA5_3.addItem(listaExercicios.get(i));
                combExercicioA5_4.addItem(listaExercicios.get(i));
                combExercicioA5_5.addItem(listaExercicios.get(i));
                combExercicioA5_6.addItem(listaExercicios.get(i));
                } 
        }
    }//GEN-LAST:event_combMusculoA5ActionPerformed

    private void combMusculoB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB1ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoB1.getSelectedItem());
            try {
                combExercicioB1.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioB1_1.removeAllItems();
                combExercicioB1_2.removeAllItems();
                combExercicioB1_3.removeAllItems();
                combExercicioB1_4.removeAllItems();
                combExercicioB1_5.removeAllItems();
                combExercicioB1_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioB1.addItem(listaExercicios.get(i));
                combExercicioB1_1.addItem(listaExercicios.get(i));
                combExercicioB1_2.addItem(listaExercicios.get(i));
                combExercicioB1_3.addItem(listaExercicios.get(i));
                combExercicioB1_4.addItem(listaExercicios.get(i));
                combExercicioB1_5.addItem(listaExercicios.get(i));
                combExercicioB1_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoB1ActionPerformed

    private void combMusculoB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB2ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoB2.getSelectedItem());
            try {
                combExercicioB2.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioB2_1.removeAllItems();
                combExercicioB2_2.removeAllItems();
                combExercicioB2_3.removeAllItems();
                combExercicioB2_4.removeAllItems();
                combExercicioB2_5.removeAllItems();
                combExercicioB2_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioB2.addItem(listaExercicios.get(i));
                combExercicioB2_1.addItem(listaExercicios.get(i));
                combExercicioB2_2.addItem(listaExercicios.get(i));
                combExercicioB2_3.addItem(listaExercicios.get(i));
                combExercicioB2_4.addItem(listaExercicios.get(i));
                combExercicioB2_5.addItem(listaExercicios.get(i));
                combExercicioB2_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoB2ActionPerformed

    private void combMusculoB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB3ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoB3.getSelectedItem());
            try {
                combExercicioB3.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioB3_1.removeAllItems();
                combExercicioB3_2.removeAllItems();
                combExercicioB3_3.removeAllItems();
                combExercicioB3_4.removeAllItems();
                combExercicioB3_5.removeAllItems();
                combExercicioB3_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioB3.addItem(listaExercicios.get(i));
                combExercicioB3_1.addItem(listaExercicios.get(i));
                combExercicioB3_2.addItem(listaExercicios.get(i));
                combExercicioB3_3.addItem(listaExercicios.get(i));
                combExercicioB3_4.addItem(listaExercicios.get(i));
                combExercicioB3_5.addItem(listaExercicios.get(i));
                combExercicioB3_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoB3ActionPerformed

    private void combMusculoB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB4ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoB4.getSelectedItem());
            try {
                combExercicioB4.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioB4_1.removeAllItems();
                combExercicioB4_2.removeAllItems();
                combExercicioB4_3.removeAllItems();
                combExercicioB4_4.removeAllItems();
                combExercicioB4_5.removeAllItems();
                combExercicioB4_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioB4.addItem(listaExercicios.get(i));
                combExercicioB4_1.addItem(listaExercicios.get(i));
                combExercicioB4_2.addItem(listaExercicios.get(i));
                combExercicioB4_3.addItem(listaExercicios.get(i));
                combExercicioB4_4.addItem(listaExercicios.get(i));
                combExercicioB4_5.addItem(listaExercicios.get(i));
                combExercicioB4_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoB4ActionPerformed

    private void combMusculoB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB5ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoB5.getSelectedItem());
            try {
                combExercicioB5.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioB5_1.removeAllItems();
                combExercicioB5_2.removeAllItems();
                combExercicioB5_3.removeAllItems();
                combExercicioB5_4.removeAllItems();
                combExercicioB5_5.removeAllItems();
                combExercicioB5_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioB5.addItem(listaExercicios.get(i));
                combExercicioB5_1.addItem(listaExercicios.get(i));
                combExercicioB5_2.addItem(listaExercicios.get(i));
                combExercicioB5_3.addItem(listaExercicios.get(i));
                combExercicioB5_4.addItem(listaExercicios.get(i));
                combExercicioB5_5.addItem(listaExercicios.get(i));
                combExercicioB5_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoB5ActionPerformed

    private void combMusculoC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoC1ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoC1.getSelectedItem());
            try {
                combExercicioC1.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioC1_1.removeAllItems();
                combExercicioC1_2.removeAllItems();
                combExercicioC1_3.removeAllItems();
                combExercicioC1_4.removeAllItems();
                combExercicioC1_5.removeAllItems();
                combExercicioC1_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioC1.addItem(listaExercicios.get(i));
                combExercicioC1_1.addItem(listaExercicios.get(i));
                combExercicioC1_2.addItem(listaExercicios.get(i));
                combExercicioC1_3.addItem(listaExercicios.get(i));
                combExercicioC1_4.addItem(listaExercicios.get(i));
                combExercicioC1_5.addItem(listaExercicios.get(i));
                combExercicioC1_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoC1ActionPerformed

    private void combMusculoC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoC2ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoC2.getSelectedItem());
            try {
                combExercicioC2.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioC2_1.removeAllItems();
                combExercicioC2_2.removeAllItems();
                combExercicioC2_3.removeAllItems();
                combExercicioC2_4.removeAllItems();
                combExercicioC2_5.removeAllItems();
                combExercicioC2_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioC2.addItem(listaExercicios.get(i));
                combExercicioC2_1.addItem(listaExercicios.get(i));
                combExercicioC2_2.addItem(listaExercicios.get(i));
                combExercicioC2_3.addItem(listaExercicios.get(i));
                combExercicioC2_4.addItem(listaExercicios.get(i));
                combExercicioC2_5.addItem(listaExercicios.get(i));
                combExercicioC2_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoC2ActionPerformed

    private void combMusculoC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoC3ActionPerformed
        exercicios.setNm_membro((String)combMusculoC3.getSelectedItem());
        try {
            combExercicioC3.removeAllItems(); //limpar lixo quando o combo é clicado novamente
            combExercicioC3_1.removeAllItems();
            combExercicioC3_2.removeAllItems();
            combExercicioC3_3.removeAllItems();
            combExercicioC3_4.removeAllItems();
            combExercicioC3_5.removeAllItems();
            combExercicioC3_6.removeAllItems();
            exercicios.populandoCombExercicios();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

            for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
            combExercicioC3.addItem(listaExercicios.get(i));
            combExercicioC3_1.addItem(listaExercicios.get(i));
            combExercicioC3_2.addItem(listaExercicios.get(i));
            combExercicioC3_3.addItem(listaExercicios.get(i));
            combExercicioC3_4.addItem(listaExercicios.get(i));
            combExercicioC3_5.addItem(listaExercicios.get(i));
            combExercicioC3_6.addItem(listaExercicios.get(i));
            }
    }//GEN-LAST:event_combMusculoC3ActionPerformed

    private void combMusculoC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoC4ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoC4.getSelectedItem());
            try {
                combExercicioC4.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioC4_1.removeAllItems();
                combExercicioC4_2.removeAllItems();
                combExercicioC4_3.removeAllItems();
                combExercicioC4_4.removeAllItems();
                combExercicioC4_5.removeAllItems();
                combExercicioC4_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioC4.addItem(listaExercicios.get(i));
                combExercicioC4_1.addItem(listaExercicios.get(i));
                combExercicioC4_2.addItem(listaExercicios.get(i));
                combExercicioC4_3.addItem(listaExercicios.get(i));
                combExercicioC4_4.addItem(listaExercicios.get(i));
                combExercicioC4_5.addItem(listaExercicios.get(i));
                combExercicioC4_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoC4ActionPerformed

    private void combMusculoC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoC5ActionPerformed
        if(ClasseCadastro_treino.getTreinoNovo() == true){
            exercicios.setNm_membro((String)combMusculoC5.getSelectedItem());
            try {
                combExercicioC5.removeAllItems(); //limpar lixo quando o combo é clicado novamente
                combExercicioC5_1.removeAllItems();
                combExercicioC5_2.removeAllItems();
                combExercicioC5_3.removeAllItems();
                combExercicioC5_4.removeAllItems();
                combExercicioC5_5.removeAllItems();
                combExercicioC5_6.removeAllItems();
                exercicios.populandoCombExercicios();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaExercicios = exercicios.getListaComboExercicios(); //recebendo a lista do banco

                for(int i=0; i < listaExercicios.size();i++){ //populando o combobox com os dados
                combExercicioC5.addItem(listaExercicios.get(i));
                combExercicioC5_1.addItem(listaExercicios.get(i));
                combExercicioC5_2.addItem(listaExercicios.get(i));
                combExercicioC5_3.addItem(listaExercicios.get(i));
                combExercicioC5_4.addItem(listaExercicios.get(i));
                combExercicioC5_5.addItem(listaExercicios.get(i));
                combExercicioC5_6.addItem(listaExercicios.get(i));
                }
        }
    }//GEN-LAST:event_combMusculoC5ActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        int op = 0;
        if(combMusculoA1.getSelectedItem() == ""){
            JOptionPane.showMessageDialog(null,"Escolha um grupo muscular !");
        }else{
            op = JOptionPane.showConfirmDialog(null,"<html>Tem certeza que deseja salvar ?<br>Após ter salvo o treino não será possível realizar alterações,<br>será necessário criar outro treino. </html>");
                if(op == 0){
                    this.setandoCamposClasseCadastro_treino();
                    inserts.insereTreinoA(treinos);
                    inserts.insereTreinoB(treinos);
                    inserts.insereTreinoC(treinos);
                    btnSalvar.setVisible(false);
                    //OCULTAR BOTOES PARA ADICIONAR OU REMOVER TREINOS APÓS SALVAR
                    this.ocultaBotoesPlusLess();
                }else{
                    
                }
                
        }

    }//GEN-LAST:event_btnSalvarMouseClicked

    //BOTÃO FECHAR NA TELA PARA MODIFICAR VARIAVEL QUANDO TELA É FECHADA. VARIAVEL DE CONTROLE DE NOVO CADASTRO
    //OU CADASTRO EXISTENTE
    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        ClasseCadastro_treino.setTreinoNovo(true);
        this.dispose();
    }//GEN-LAST:event_btnFecharMouseClicked

    
    //------------------FUNÇÕES/METODOS/PRODEDURES
    
    private void ocultaBotoesTreinoA(){
        //Treino A1
        combExercicioA1_3.setVisible(false);
        combRepeticoesA1_3.setVisible(false);
        txtObservacoesA1_3.setVisible(false);
        lblObservacoesA1_3.setVisible(false); 
        combExercicioA1_4.setVisible(false);
        combRepeticoesA1_4.setVisible(false);
        txtObservacoesA1_4.setVisible(false);
        lblObservacoesA1_4.setVisible(false);
        combExercicioA1_5.setVisible(false);
        combRepeticoesA1_5.setVisible(false);
        txtObservacoesA1_5.setVisible(false);
        lblObservacoesA1_5.setVisible(false);
        combExercicioA1_6.setVisible(false);
        combRepeticoesA1_6.setVisible(false);
        txtObservacoesA1_6.setVisible(false);
        lblObservacoesA1_6.setVisible(false);
        
        //Treino A2
        combExercicioA2_3.setVisible(false);
        combRepeticoesA2_3.setVisible(false);
        txtObservacoesA2_3.setVisible(false);
        lblObservacoesA2_3.setVisible(false); 
        combExercicioA2_4.setVisible(false);
        combRepeticoesA2_4.setVisible(false);
        txtObservacoesA2_4.setVisible(false);
        lblObservacoesA2_4.setVisible(false);
        combExercicioA2_5.setVisible(false);
        combRepeticoesA2_5.setVisible(false);
        txtObservacoesA2_5.setVisible(false);
        lblObservacoesA2_5.setVisible(false);
        combExercicioA2_6.setVisible(false);
        combRepeticoesA2_6.setVisible(false);
        txtObservacoesA2_6.setVisible(false);
        lblObservacoesA2_6.setVisible(false);
        
        //Treino A3
        combExercicioA3_3.setVisible(false);
        combRepeticoesA3_3.setVisible(false);
        txtObservacoesA3_3.setVisible(false);
        lblObservacoesA3_3.setVisible(false); 
        combExercicioA3_4.setVisible(false);
        combRepeticoesA3_4.setVisible(false);
        txtObservacoesA3_4.setVisible(false);
        lblObservacoesA3_4.setVisible(false);
        combExercicioA3_5.setVisible(false);
        combRepeticoesA3_5.setVisible(false);
        txtObservacoesA3_5.setVisible(false);
        lblObservacoesA3_5.setVisible(false);
        combExercicioA3_6.setVisible(false);
        combRepeticoesA3_6.setVisible(false);
        txtObservacoesA3_6.setVisible(false);
        lblObservacoesA3_6.setVisible(false);
        
        //Treino A4
        combExercicioA4_3.setVisible(false);
        combRepeticoesA4_3.setVisible(false);
        txtObservacoesA4_3.setVisible(false);
        lblObservacoesA4_3.setVisible(false); 
        combExercicioA4_4.setVisible(false);
        combRepeticoesA4_4.setVisible(false);
        txtObservacoesA4_4.setVisible(false);
        lblObservacoesA4_4.setVisible(false);
        combExercicioA4_5.setVisible(false);
        combRepeticoesA4_5.setVisible(false);
        txtObservacoesA4_5.setVisible(false);
        lblObservacoesA4_5.setVisible(false);
        combExercicioA4_6.setVisible(false);
        combRepeticoesA4_6.setVisible(false);
        txtObservacoesA4_6.setVisible(false);
        lblObservacoesA4_6.setVisible(false);
        
        //Treino A5
        combExercicioA5_3.setVisible(false);
        combRepeticoesA5_3.setVisible(false);
        txtObservacoesA5_3.setVisible(false);
        lblObservacoesA5_3.setVisible(false); 
        combExercicioA5_4.setVisible(false);
        combRepeticoesA5_4.setVisible(false);
        txtObservacoesA5_4.setVisible(false);
        lblObservacoesA5_4.setVisible(false);
        combExercicioA5_5.setVisible(false);
        combRepeticoesA5_5.setVisible(false);
        txtObservacoesA5_5.setVisible(false);
        lblObservacoesA5_5.setVisible(false);
        combExercicioA5_6.setVisible(false);
        combRepeticoesA5_6.setVisible(false);
        txtObservacoesA5_6.setVisible(false);
        lblObservacoesA5_6.setVisible(false);
    }
    
    private void ocultaBotoesTreinoB(){
        //Treino B1
        combExercicioB1_3.setVisible(false);
        combRepeticoesB1_3.setVisible(false);
        txtObservacoesB1_3.setVisible(false);
        lblObservacoesB1_3.setVisible(false); 
        combExercicioB1_4.setVisible(false);
        combRepeticoesB1_4.setVisible(false);
        txtObservacoesB1_4.setVisible(false);
        lblObservacoesB1_4.setVisible(false);
        combExercicioB1_5.setVisible(false);
        combRepeticoesB1_5.setVisible(false);
        txtObservacoesB1_5.setVisible(false);
        lblObservacoesB1_5.setVisible(false);
        combExercicioB1_6.setVisible(false);
        combRepeticoesB1_6.setVisible(false);
        txtObservacoesB1_6.setVisible(false);
        lblObservacoesB1_6.setVisible(false);
        
        //Treino B2
        combExercicioB2_3.setVisible(false);
        combRepeticoesB2_3.setVisible(false);
        txtObservacoesB2_3.setVisible(false);
        lblObservacoesB2_3.setVisible(false); 
        combExercicioB2_4.setVisible(false);
        combRepeticoesB2_4.setVisible(false);
        txtObservacoesB2_4.setVisible(false);
        lblObservacoesB2_4.setVisible(false);
        combExercicioB2_5.setVisible(false);
        combRepeticoesB2_5.setVisible(false);
        txtObservacoesB2_5.setVisible(false);
        lblObservacoesB2_5.setVisible(false);
        combExercicioB2_6.setVisible(false);
        combRepeticoesB2_6.setVisible(false);
        txtObservacoesB2_6.setVisible(false);
        lblObservacoesB2_6.setVisible(false);
        
        //Treino B3
        combExercicioB3_3.setVisible(false);
        combRepeticoesB3_3.setVisible(false);
        txtObservacoesB3_3.setVisible(false);
        lblObservacoesB3_3.setVisible(false); 
        combExercicioB3_4.setVisible(false);
        combRepeticoesB3_4.setVisible(false);
        txtObservacoesB3_4.setVisible(false);
        lblObservacoesB3_4.setVisible(false);
        combExercicioB3_5.setVisible(false);
        combRepeticoesB3_5.setVisible(false);
        txtObservacoesB3_5.setVisible(false);
        lblObservacoesB3_5.setVisible(false);
        combExercicioB3_6.setVisible(false);
        combRepeticoesB3_6.setVisible(false);
        txtObservacoesB3_6.setVisible(false);
        lblObservacoesB3_6.setVisible(false);
        
        //Treino B4
        combExercicioB4_3.setVisible(false);
        combRepeticoesB4_3.setVisible(false);
        txtObservacoesB4_3.setVisible(false);
        lblObservacoesB4_3.setVisible(false); 
        combExercicioB4_4.setVisible(false);
        combRepeticoesB4_4.setVisible(false);
        txtObservacoesB4_4.setVisible(false);
        lblObservacoesB4_4.setVisible(false);
        combExercicioB4_5.setVisible(false);
        combRepeticoesB4_5.setVisible(false);
        txtObservacoesB4_5.setVisible(false);
        lblObservacoesB4_5.setVisible(false);
        combExercicioB4_6.setVisible(false);
        combRepeticoesB4_6.setVisible(false);
        txtObservacoesB4_6.setVisible(false);
        lblObservacoesB4_6.setVisible(false);
        
        //Treino B5
        combExercicioB5_3.setVisible(false);
        combRepeticoesB5_3.setVisible(false);
        txtObservacoesB5_3.setVisible(false);
        lblObservacoesB5_3.setVisible(false); 
        combExercicioB5_4.setVisible(false);
        combRepeticoesB5_4.setVisible(false);
        txtObservacoesB5_4.setVisible(false);
        lblObservacoesB5_4.setVisible(false);
        combExercicioB5_5.setVisible(false);
        combRepeticoesB5_5.setVisible(false);
        txtObservacoesB5_5.setVisible(false);
        lblObservacoesB5_5.setVisible(false);
        combExercicioB5_6.setVisible(false);
        combRepeticoesB5_6.setVisible(false);
        txtObservacoesB5_6.setVisible(false);
        lblObservacoesB5_6.setVisible(false);
    }
    
    private void ocultaBotoesTreinoC(){
        //Treino C1
        combExercicioC1_3.setVisible(false);
        combRepeticoesC1_3.setVisible(false);
        txtObservacoesC1_3.setVisible(false);
        lblObservacoesC1_3.setVisible(false); 
        combExercicioC1_4.setVisible(false);
        combRepeticoesC1_4.setVisible(false);
        txtObservacoesC1_4.setVisible(false);
        lblObservacoesC1_4.setVisible(false);
        combExercicioC1_5.setVisible(false);
        combRepeticoesC1_5.setVisible(false);
        txtObservacoesC1_5.setVisible(false);
        lblObservacoesC1_5.setVisible(false);
        combExercicioC1_6.setVisible(false);
        combRepeticoesC1_6.setVisible(false);
        txtObservacoesC1_6.setVisible(false);
        lblObservacoesC1_6.setVisible(false);
        
        //Treino C2
        combExercicioC2_3.setVisible(false);
        combRepeticoesC2_3.setVisible(false);
        txtObservacoesC2_3.setVisible(false);
        lblObservacoesC2_3.setVisible(false); 
        combExercicioC2_4.setVisible(false);
        combRepeticoesC2_4.setVisible(false);
        txtObservacoesC2_4.setVisible(false);
        lblObservacoesC2_4.setVisible(false);
        combExercicioC2_5.setVisible(false);
        combRepeticoesC2_5.setVisible(false);
        txtObservacoesC2_5.setVisible(false);
        lblObservacoesC2_5.setVisible(false);
        combExercicioC2_6.setVisible(false);
        combRepeticoesC2_6.setVisible(false);
        txtObservacoesC2_6.setVisible(false);
        lblObservacoesC2_6.setVisible(false);
        
        //Treino C3
        combExercicioC3_3.setVisible(false);
        combRepeticoesC3_3.setVisible(false);
        txtObservacoesC3_3.setVisible(false);
        lblObservacoesC3_3.setVisible(false); 
        combExercicioC3_4.setVisible(false);
        combRepeticoesC3_4.setVisible(false);
        txtObservacoesC3_4.setVisible(false);
        lblObservacoesC3_4.setVisible(false);
        combExercicioC3_5.setVisible(false);
        combRepeticoesC3_5.setVisible(false);
        txtObservacoesC3_5.setVisible(false);
        lblObservacoesC3_5.setVisible(false);
        combExercicioC3_6.setVisible(false);
        combRepeticoesC3_6.setVisible(false);
        txtObservacoesC3_6.setVisible(false);
        lblObservacoesC3_6.setVisible(false);
        
        //Treino C4
        combExercicioC4_3.setVisible(false);
        combRepeticoesC4_3.setVisible(false);
        txtObservacoesC4_3.setVisible(false);
        lblObservacoesC4_3.setVisible(false); 
        combExercicioC4_4.setVisible(false);
        combRepeticoesC4_4.setVisible(false);
        txtObservacoesC4_4.setVisible(false);
        lblObservacoesC4_4.setVisible(false);
        combExercicioC4_5.setVisible(false);
        combRepeticoesC4_5.setVisible(false);
        txtObservacoesC4_5.setVisible(false);
        lblObservacoesC4_5.setVisible(false);
        combExercicioC4_6.setVisible(false);
        combRepeticoesC4_6.setVisible(false);
        txtObservacoesC4_6.setVisible(false);
        lblObservacoesC4_6.setVisible(false);
        
        //Treino C5
        combExercicioC5_3.setVisible(false);
        combRepeticoesC5_3.setVisible(false);
        txtObservacoesC5_3.setVisible(false);
        lblObservacoesC5_3.setVisible(false); 
        combExercicioC5_4.setVisible(false);
        combRepeticoesC5_4.setVisible(false);
        txtObservacoesC5_4.setVisible(false);
        lblObservacoesC5_4.setVisible(false);
        combExercicioC5_5.setVisible(false);
        combRepeticoesC5_5.setVisible(false);
        txtObservacoesC5_5.setVisible(false);
        lblObservacoesC5_5.setVisible(false);
        combExercicioC5_6.setVisible(false);
        combRepeticoesC5_6.setVisible(false);
        txtObservacoesC5_6.setVisible(false);
        lblObservacoesC5_6.setVisible(false);
        
    }
    
    private void ocultaBotoesPlusLess(){
        btnPlusA1.setVisible(false);
        btnLessA1.setVisible(false);
        btnPlusA2.setVisible(false);
        btnLessA2.setVisible(false);
        btnPlusA3.setVisible(false);
        btnLessA3.setVisible(false);
        btnPlusA4.setVisible(false);
        btnLessA4.setVisible(false);
        btnPlusA5.setVisible(false);
        btnLessA5.setVisible(false);
        
        btnPlusB1.setVisible(false);
        btnLessB1.setVisible(false);
        btnPlusB2.setVisible(false);
        btnLessB2.setVisible(false);
        btnPlusB3.setVisible(false);
        btnLessB3.setVisible(false);
        btnPlusB4.setVisible(false);
        btnLessB4.setVisible(false);
        btnPlusB5.setVisible(false);
        btnLessB5.setVisible(false);
        
        btnPlusC1.setVisible(false);
        btnLessC1.setVisible(false);
        btnPlusC2.setVisible(false);
        btnLessC2.setVisible(false);
        btnPlusC3.setVisible(false);
        btnLessC3.setVisible(false);
        btnPlusC4.setVisible(false);
        btnLessC4.setVisible(false);
        btnPlusC5.setVisible(false);
        btnLessC5.setVisible(false);
    }
    
    private void carregarComboGrupos(){
        listaMembros = exercicios.getListaComboGrupos(); //recebendo a lista do banco

        try {
            exercicios.populandoCombMembros(); //atualizando o combobox com os dados do banco 
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
        }
            for(int i=0; i < listaMembros.size();i++){ //populando o combobox com os dados
                //System.out.println(listaMembros.get(i)); //teste
                combMusculoA1.addItem(listaMembros.get(i));
                combMusculoA2.addItem(listaMembros.get(i));
                combMusculoA3.addItem(listaMembros.get(i));
                combMusculoA4.addItem(listaMembros.get(i));
                combMusculoA5.addItem(listaMembros.get(i));
                combMusculoB1.addItem(listaMembros.get(i));
                combMusculoB2.addItem(listaMembros.get(i));
                combMusculoB3.addItem(listaMembros.get(i));
                combMusculoB4.addItem(listaMembros.get(i));
                combMusculoB5.addItem(listaMembros.get(i));
                combMusculoC1.addItem(listaMembros.get(i));
                combMusculoC2.addItem(listaMembros.get(i));
                combMusculoC3.addItem(listaMembros.get(i));
                combMusculoC4.addItem(listaMembros.get(i));
                combMusculoC5.addItem(listaMembros.get(i));
                
            }
    }
    
    private void carregarComboRepeticoes(){
        System.out.println("Chamei metodo repeticoes");
        listaRepeticoes = exercicios.getListaComboRepeticoes(); //recebendo a lista do banco

        try {
            exercicios.populandoCombRepeticoes(); //atualizando o combobox com os dados do banco 
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroExercicios.class.getName()).log(Level.SEVERE, null, ex);
        }
            for(int i=0; i < listaRepeticoes.size();i++){ //populando o combobox com os dados
                combRepeticoesA1.addItem(listaRepeticoes.get(i));
                combRepeticoesA1_1.addItem(listaRepeticoes.get(i));
                combRepeticoesA1_2.addItem(listaRepeticoes.get(i));
                combRepeticoesA1_3.addItem(listaRepeticoes.get(i));
                combRepeticoesA1_4.addItem(listaRepeticoes.get(i));
                combRepeticoesA1_5.addItem(listaRepeticoes.get(i));
                combRepeticoesA1_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesA2.addItem(listaRepeticoes.get(i));
                combRepeticoesA2_1.addItem(listaRepeticoes.get(i));
                combRepeticoesA2_2.addItem(listaRepeticoes.get(i));
                combRepeticoesA2_3.addItem(listaRepeticoes.get(i));
                combRepeticoesA2_4.addItem(listaRepeticoes.get(i));
                combRepeticoesA2_5.addItem(listaRepeticoes.get(i));
                combRepeticoesA2_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesA3.addItem(listaRepeticoes.get(i));
                combRepeticoesA3_1.addItem(listaRepeticoes.get(i));
                combRepeticoesA3_2.addItem(listaRepeticoes.get(i));
                combRepeticoesA3_3.addItem(listaRepeticoes.get(i));
                combRepeticoesA3_4.addItem(listaRepeticoes.get(i));
                combRepeticoesA3_5.addItem(listaRepeticoes.get(i));
                combRepeticoesA3_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesA4.addItem(listaRepeticoes.get(i));
                combRepeticoesA4_1.addItem(listaRepeticoes.get(i));
                combRepeticoesA4_2.addItem(listaRepeticoes.get(i));
                combRepeticoesA4_3.addItem(listaRepeticoes.get(i));
                combRepeticoesA4_4.addItem(listaRepeticoes.get(i));
                combRepeticoesA4_5.addItem(listaRepeticoes.get(i));
                combRepeticoesA4_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesA5.addItem(listaRepeticoes.get(i));
                combRepeticoesA5_1.addItem(listaRepeticoes.get(i));
                combRepeticoesA5_2.addItem(listaRepeticoes.get(i));
                combRepeticoesA5_3.addItem(listaRepeticoes.get(i));
                combRepeticoesA5_4.addItem(listaRepeticoes.get(i));
                combRepeticoesA5_5.addItem(listaRepeticoes.get(i));
                combRepeticoesA5_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesB1.addItem(listaRepeticoes.get(i));
                combRepeticoesB1_1.addItem(listaRepeticoes.get(i));
                combRepeticoesB1_2.addItem(listaRepeticoes.get(i));
                combRepeticoesB1_3.addItem(listaRepeticoes.get(i));
                combRepeticoesB1_4.addItem(listaRepeticoes.get(i));
                combRepeticoesB1_5.addItem(listaRepeticoes.get(i));
                combRepeticoesB1_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesB2.addItem(listaRepeticoes.get(i));
                combRepeticoesB2_1.addItem(listaRepeticoes.get(i));
                combRepeticoesB2_2.addItem(listaRepeticoes.get(i));
                combRepeticoesB2_3.addItem(listaRepeticoes.get(i));
                combRepeticoesB2_4.addItem(listaRepeticoes.get(i));
                combRepeticoesB2_5.addItem(listaRepeticoes.get(i));
                combRepeticoesB2_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesB3.addItem(listaRepeticoes.get(i));
                combRepeticoesB3_1.addItem(listaRepeticoes.get(i));
                combRepeticoesB3_2.addItem(listaRepeticoes.get(i));
                combRepeticoesB3_3.addItem(listaRepeticoes.get(i));
                combRepeticoesB3_4.addItem(listaRepeticoes.get(i));
                combRepeticoesB3_5.addItem(listaRepeticoes.get(i));
                combRepeticoesB3_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesB4.addItem(listaRepeticoes.get(i));
                combRepeticoesB4_1.addItem(listaRepeticoes.get(i));
                combRepeticoesB4_2.addItem(listaRepeticoes.get(i));
                combRepeticoesB4_3.addItem(listaRepeticoes.get(i));
                combRepeticoesB4_4.addItem(listaRepeticoes.get(i));
                combRepeticoesB4_5.addItem(listaRepeticoes.get(i));
                combRepeticoesB4_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesB5.addItem(listaRepeticoes.get(i));
                combRepeticoesB5_1.addItem(listaRepeticoes.get(i));
                combRepeticoesB5_2.addItem(listaRepeticoes.get(i));
                combRepeticoesB5_3.addItem(listaRepeticoes.get(i));
                combRepeticoesB5_4.addItem(listaRepeticoes.get(i));
                combRepeticoesB5_5.addItem(listaRepeticoes.get(i));
                combRepeticoesB5_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesC1.addItem(listaRepeticoes.get(i));
                combRepeticoesC1_1.addItem(listaRepeticoes.get(i));
                combRepeticoesC1_2.addItem(listaRepeticoes.get(i));
                combRepeticoesC1_3.addItem(listaRepeticoes.get(i));
                combRepeticoesC1_4.addItem(listaRepeticoes.get(i));
                combRepeticoesC1_5.addItem(listaRepeticoes.get(i));
                combRepeticoesC1_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesC2.addItem(listaRepeticoes.get(i));
                combRepeticoesC2_1.addItem(listaRepeticoes.get(i));
                combRepeticoesC2_2.addItem(listaRepeticoes.get(i));
                combRepeticoesC2_3.addItem(listaRepeticoes.get(i));
                combRepeticoesC2_4.addItem(listaRepeticoes.get(i));
                combRepeticoesC2_5.addItem(listaRepeticoes.get(i));
                combRepeticoesC2_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesC3.addItem(listaRepeticoes.get(i));
                combRepeticoesC3_1.addItem(listaRepeticoes.get(i));
                combRepeticoesC3_2.addItem(listaRepeticoes.get(i));
                combRepeticoesC3_3.addItem(listaRepeticoes.get(i));
                combRepeticoesC3_4.addItem(listaRepeticoes.get(i));
                combRepeticoesC3_5.addItem(listaRepeticoes.get(i));
                combRepeticoesC3_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesC4.addItem(listaRepeticoes.get(i));
                combRepeticoesC4_1.addItem(listaRepeticoes.get(i));
                combRepeticoesC4_2.addItem(listaRepeticoes.get(i));
                combRepeticoesC4_3.addItem(listaRepeticoes.get(i));
                combRepeticoesC4_4.addItem(listaRepeticoes.get(i));
                combRepeticoesC4_5.addItem(listaRepeticoes.get(i));
                combRepeticoesC4_6.addItem(listaRepeticoes.get(i));
                
                combRepeticoesC5.addItem(listaRepeticoes.get(i));
                combRepeticoesC5_1.addItem(listaRepeticoes.get(i));
                combRepeticoesC5_2.addItem(listaRepeticoes.get(i));
                combRepeticoesC5_3.addItem(listaRepeticoes.get(i));
                combRepeticoesC5_4.addItem(listaRepeticoes.get(i));
                combRepeticoesC5_5.addItem(listaRepeticoes.get(i));
                combRepeticoesC5_6.addItem(listaRepeticoes.get(i));
                
            }
    }
    
    private void setandoCamposClasseCadastro_treino(){
        treinos.setDt_inicio(dtInicial.getText());
        treinos.setDt_fim(dtFinal.getText());
        //codigo aluno ja setado antes de vir pra ca
        treinos.setGrupo_muscularA1((String)combMusculoA1.getSelectedItem());        
        treinos.setExercicioA1((String)combExercicioA1.getSelectedItem());
        treinos.setRepeticaoA1((String)combRepeticoesA1.getSelectedItem());
        treinos.setObservacaoA1(txtObservacoesA1.getText());   
        
        treinos.setExercicioA1_1((String)combExercicioA1_1.getSelectedItem());
        treinos.setRepeticaoA1_1((String)combRepeticoesA1_1.getSelectedItem());
        treinos.setObservacaoA1_1(txtObservacoesA1_1.getText());
        
        treinos.setExercicioA1_2((String)combExercicioA1_2.getSelectedItem());
        treinos.setRepeticaoA1_2((String)combRepeticoesA1_2.getSelectedItem());
        treinos.setObservacaoA1_2(txtObservacoesA1_2.getText());
        
        treinos.setExercicioA1_3((String)combExercicioA1_3.getSelectedItem());
        treinos.setRepeticaoA1_3((String)combRepeticoesA1_3.getSelectedItem());
        treinos.setObservacaoA1_3(txtObservacoesA1_3.getText());
        
        treinos.setExercicioA1_4((String)combExercicioA1_4.getSelectedItem());
        treinos.setRepeticaoA1_4((String)combRepeticoesA1_4.getSelectedItem());
        treinos.setObservacaoA1_4(txtObservacoesA1_4.getText());
        
        treinos.setExercicioA1_5((String)combExercicioA1_5.getSelectedItem());
        treinos.setRepeticaoA1_5((String)combRepeticoesA1_5.getSelectedItem());
        treinos.setObservacaoA1_5(txtObservacoesA1_5.getText());
        
        treinos.setExercicioA1_6((String)combExercicioA1_6.getSelectedItem());
        treinos.setRepeticaoA1_6((String)combRepeticoesA1_6.getSelectedItem());
        treinos.setObservacaoA1_6(txtObservacoesA1_6.getText());
        
        treinos.setGrupo_muscularA2((String)combMusculoA2.getSelectedItem());        
        treinos.setExercicioA2((String)combExercicioA2.getSelectedItem());
        treinos.setRepeticaoA2((String)combRepeticoesA2.getSelectedItem());
        treinos.setObservacaoA2(txtObservacoesA2.getText());   
        
        treinos.setExercicioA2_1((String)combExercicioA2_1.getSelectedItem());
        treinos.setRepeticaoA2_1((String)combRepeticoesA2_1.getSelectedItem());
        treinos.setObservacaoA2_1(txtObservacoesA2_1.getText());
        
        treinos.setExercicioA2_2((String)combExercicioA2_2.getSelectedItem());
        treinos.setRepeticaoA2_2((String)combRepeticoesA2_2.getSelectedItem());
        treinos.setObservacaoA2_2(txtObservacoesA2_2.getText());
        
        treinos.setExercicioA2_3((String)combExercicioA2_3.getSelectedItem());
        treinos.setRepeticaoA2_3((String)combRepeticoesA2_3.getSelectedItem());
        treinos.setObservacaoA2_3(txtObservacoesA2_3.getText());
        
        treinos.setExercicioA2_4((String)combExercicioA2_4.getSelectedItem());
        treinos.setRepeticaoA2_4((String)combRepeticoesA2_4.getSelectedItem());
        treinos.setObservacaoA2_4(txtObservacoesA2_4.getText());
        
        treinos.setExercicioA2_5((String)combExercicioA2_5.getSelectedItem());
        treinos.setRepeticaoA2_5((String)combRepeticoesA2_5.getSelectedItem());
        treinos.setObservacaoA2_5(txtObservacoesA2_5.getText());
        
        treinos.setExercicioA2_6((String)combExercicioA2_6.getSelectedItem());
        treinos.setRepeticaoA2_6((String)combRepeticoesA2_6.getSelectedItem());
        treinos.setObservacaoA2_6(txtObservacoesA2_6.getText());
        
        treinos.setGrupo_muscularA3((String)combMusculoA3.getSelectedItem());        
        treinos.setExercicioA3((String)combExercicioA3.getSelectedItem());
        treinos.setRepeticaoA3((String)combRepeticoesA3.getSelectedItem());
        treinos.setObservacaoA3(txtObservacoesA3.getText());   
        
        treinos.setExercicioA3_1((String)combExercicioA3_1.getSelectedItem());
        treinos.setRepeticaoA3_1((String)combRepeticoesA3_1.getSelectedItem());
        treinos.setObservacaoA3_1(txtObservacoesA3_1.getText());
        
        treinos.setExercicioA3_2((String)combExercicioA3_2.getSelectedItem());
        treinos.setRepeticaoA3_2((String)combRepeticoesA3_2.getSelectedItem());
        treinos.setObservacaoA3_2(txtObservacoesA3_2.getText());
        
        treinos.setExercicioA3_3((String)combExercicioA3_3.getSelectedItem());
        treinos.setRepeticaoA3_3((String)combRepeticoesA3_3.getSelectedItem());
        treinos.setObservacaoA3_3(txtObservacoesA3_3.getText());
        
        treinos.setExercicioA3_4((String)combExercicioA3_4.getSelectedItem());
        treinos.setRepeticaoA3_4((String)combRepeticoesA3_4.getSelectedItem());
        treinos.setObservacaoA3_4(txtObservacoesA3_4.getText());
        
        treinos.setExercicioA3_5((String)combExercicioA3_5.getSelectedItem());
        treinos.setRepeticaoA3_5((String)combRepeticoesA3_5.getSelectedItem());
        treinos.setObservacaoA3_5(txtObservacoesA3_5.getText());
        
        treinos.setExercicioA3_6((String)combExercicioA3_6.getSelectedItem());
        treinos.setRepeticaoA3_6((String)combRepeticoesA3_6.getSelectedItem());
        treinos.setObservacaoA3_6(txtObservacoesA3_6.getText());
        
        treinos.setGrupo_muscularA4((String)combMusculoA4.getSelectedItem());        
        treinos.setExercicioA4((String)combExercicioA4.getSelectedItem());
        treinos.setRepeticaoA4((String)combRepeticoesA4.getSelectedItem());
        treinos.setObservacaoA4(txtObservacoesA4.getText());      
        
        treinos.setExercicioA4_1((String)combExercicioA4_1.getSelectedItem());
        treinos.setRepeticaoA4_1((String)combRepeticoesA4_1.getSelectedItem());
        treinos.setObservacaoA4_1(txtObservacoesA4_1.getText());
        
        treinos.setExercicioA4_2((String)combExercicioA4_2.getSelectedItem());
        treinos.setRepeticaoA4_2((String)combRepeticoesA4_2.getSelectedItem());
        treinos.setObservacaoA4_2(txtObservacoesA4_2.getText());
        
        treinos.setExercicioA4_3((String)combExercicioA4_3.getSelectedItem());
        treinos.setRepeticaoA4_3((String)combRepeticoesA4_3.getSelectedItem());
        treinos.setObservacaoA4_3(txtObservacoesA4_3.getText());
        
        treinos.setExercicioA4_4((String)combExercicioA4_4.getSelectedItem());
        treinos.setRepeticaoA4_4((String)combRepeticoesA4_4.getSelectedItem());
        treinos.setObservacaoA4_4(txtObservacoesA4_4.getText());
        
        treinos.setExercicioA4_5((String)combExercicioA4_5.getSelectedItem());
        treinos.setRepeticaoA4_5((String)combRepeticoesA4_5.getSelectedItem());
        treinos.setObservacaoA4_5(txtObservacoesA4_5.getText());
        
        treinos.setExercicioA4_6((String)combExercicioA4_6.getSelectedItem());
        treinos.setRepeticaoA4_6((String)combRepeticoesA4_6.getSelectedItem());
        treinos.setObservacaoA4_6(txtObservacoesA4_6.getText());

        treinos.setGrupo_muscularA5((String)combMusculoA5.getSelectedItem());        
        treinos.setExercicioA5((String)combExercicioA5.getSelectedItem());
        treinos.setRepeticaoA5((String)combRepeticoesA5.getSelectedItem());
        treinos.setObservacaoA5(txtObservacoesA5.getText());   
        
        treinos.setExercicioA5_1((String)combExercicioA5_1.getSelectedItem());
        treinos.setRepeticaoA5_1((String)combRepeticoesA5_1.getSelectedItem());
        treinos.setObservacaoA5_1(txtObservacoesA5_1.getText());
        
        treinos.setExercicioA5_2((String)combExercicioA5_2.getSelectedItem());
        treinos.setRepeticaoA5_2((String)combRepeticoesA5_2.getSelectedItem());
        treinos.setObservacaoA5_2(txtObservacoesA5_2.getText());
        
        treinos.setExercicioA5_3((String)combExercicioA5_3.getSelectedItem());
        treinos.setRepeticaoA5_3((String)combRepeticoesA5_3.getSelectedItem());
        treinos.setObservacaoA5_3(txtObservacoesA5_3.getText());
        
        treinos.setExercicioA5_4((String)combExercicioA5_4.getSelectedItem());
        treinos.setRepeticaoA5_4((String)combRepeticoesA5_4.getSelectedItem());
        treinos.setObservacaoA5_4(txtObservacoesA5_4.getText());
        
        treinos.setExercicioA5_5((String)combExercicioA5_5.getSelectedItem());
        treinos.setRepeticaoA5_5((String)combRepeticoesA5_5.getSelectedItem());
        treinos.setObservacaoA5_5(txtObservacoesA5_5.getText());
        
        treinos.setExercicioA5_6((String)combExercicioA5_6.getSelectedItem());
        treinos.setRepeticaoA5_6((String)combRepeticoesA5_6.getSelectedItem());
        treinos.setObservacaoA5_6(txtObservacoesA5_6.getText());
        
        
        treinos.setGrupo_muscularB1((String)combMusculoB1.getSelectedItem());        
        treinos.setExercicioB1((String)combExercicioB1.getSelectedItem());
        treinos.setRepeticaoB1((String)combRepeticoesB1.getSelectedItem());
        treinos.setObservacaoB1(txtObservacoesB1.getText());   
        
        treinos.setExercicioB1_1((String)combExercicioB1_1.getSelectedItem());
        treinos.setRepeticaoB1_1((String)combRepeticoesB1_1.getSelectedItem());
        treinos.setObservacaoB1_1(txtObservacoesB1_1.getText());
        
        treinos.setExercicioB1_2((String)combExercicioB1_2.getSelectedItem());
        treinos.setRepeticaoB1_2((String)combRepeticoesB1_2.getSelectedItem());
        treinos.setObservacaoB1_2(txtObservacoesB1_2.getText());
        
        treinos.setExercicioB1_3((String)combExercicioB1_3.getSelectedItem());
        treinos.setRepeticaoB1_3((String)combRepeticoesB1_3.getSelectedItem());
        treinos.setObservacaoB1_3(txtObservacoesB1_3.getText());
        
        treinos.setExercicioB1_4((String)combExercicioB1_4.getSelectedItem());
        treinos.setRepeticaoB1_4((String)combRepeticoesB1_4.getSelectedItem());
        treinos.setObservacaoB1_4(txtObservacoesB1_4.getText());
        
        treinos.setExercicioB1_5((String)combExercicioB1_5.getSelectedItem());
        treinos.setRepeticaoB1_5((String)combRepeticoesB1_5.getSelectedItem());
        treinos.setObservacaoB1_5(txtObservacoesB1_5.getText());
        
        treinos.setExercicioB1_6((String)combExercicioB1_6.getSelectedItem());
        treinos.setRepeticaoB1_6((String)combRepeticoesB1_6.getSelectedItem());
        treinos.setObservacaoB1_6(txtObservacoesB1_6.getText());
        
        treinos.setGrupo_muscularB2((String)combMusculoB2.getSelectedItem());        
        treinos.setExercicioB2((String)combExercicioB2.getSelectedItem());
        treinos.setRepeticaoB2((String)combRepeticoesB2.getSelectedItem());
        treinos.setObservacaoB2(txtObservacoesB2.getText());   
        
        treinos.setExercicioB2_1((String)combExercicioB2_1.getSelectedItem());
        treinos.setRepeticaoB2_1((String)combRepeticoesB2_1.getSelectedItem());
        treinos.setObservacaoB2_1(txtObservacoesB2_1.getText());
        
        treinos.setExercicioB2_2((String)combExercicioB2_2.getSelectedItem());
        treinos.setRepeticaoB2_2((String)combRepeticoesB2_2.getSelectedItem());
        treinos.setObservacaoB2_2(txtObservacoesB2_2.getText());
        
        treinos.setExercicioB2_3((String)combExercicioB2_3.getSelectedItem());
        treinos.setRepeticaoB2_3((String)combRepeticoesB2_3.getSelectedItem());
        treinos.setObservacaoB2_3(txtObservacoesB2_3.getText());
        
        treinos.setExercicioB2_4((String)combExercicioB2_4.getSelectedItem());
        treinos.setRepeticaoB2_4((String)combRepeticoesB2_4.getSelectedItem());
        treinos.setObservacaoB2_4(txtObservacoesB2_4.getText());
        
        treinos.setExercicioB2_5((String)combExercicioB2_5.getSelectedItem());
        treinos.setRepeticaoB2_5((String)combRepeticoesB2_5.getSelectedItem());
        treinos.setObservacaoB2_5(txtObservacoesB2_5.getText());
        
        treinos.setExercicioB2_6((String)combExercicioB2_6.getSelectedItem());
        treinos.setRepeticaoB2_6((String)combRepeticoesB2_6.getSelectedItem());
        treinos.setObservacaoB2_6(txtObservacoesB2_6.getText());
        
        treinos.setGrupo_muscularB3((String)combMusculoB3.getSelectedItem());        
        treinos.setExercicioB3((String)combExercicioB3.getSelectedItem());
        treinos.setRepeticaoB3((String)combRepeticoesB3.getSelectedItem());
        treinos.setObservacaoB3(txtObservacoesB3.getText());   
        
        treinos.setExercicioB3_1((String)combExercicioB3_1.getSelectedItem());
        treinos.setRepeticaoB3_1((String)combRepeticoesB3_1.getSelectedItem());
        treinos.setObservacaoB3_1(txtObservacoesB3_1.getText());
        
        treinos.setExercicioB3_2((String)combExercicioB3_2.getSelectedItem());
        treinos.setRepeticaoB3_2((String)combRepeticoesB3_2.getSelectedItem());
        treinos.setObservacaoB3_2(txtObservacoesB3_2.getText());
        
        treinos.setExercicioB3_3((String)combExercicioB3_3.getSelectedItem());
        treinos.setRepeticaoB3_3((String)combRepeticoesB3_3.getSelectedItem());
        treinos.setObservacaoB3_3(txtObservacoesB3_3.getText());
        
        treinos.setExercicioB3_4((String)combExercicioB3_4.getSelectedItem());
        treinos.setRepeticaoB3_4((String)combRepeticoesB3_4.getSelectedItem());
        treinos.setObservacaoB3_4(txtObservacoesB3_4.getText());
        
        treinos.setExercicioB3_5((String)combExercicioB3_5.getSelectedItem());
        treinos.setRepeticaoB3_5((String)combRepeticoesB3_5.getSelectedItem());
        treinos.setObservacaoB3_5(txtObservacoesB3_5.getText());
        
        treinos.setExercicioB3_6((String)combExercicioB3_6.getSelectedItem());
        treinos.setRepeticaoB3_6((String)combRepeticoesB3_6.getSelectedItem());
        treinos.setObservacaoB3_6(txtObservacoesB3_6.getText());
        
        treinos.setGrupo_muscularB4((String)combMusculoB4.getSelectedItem());        
        treinos.setExercicioB4((String)combExercicioB4.getSelectedItem());
        treinos.setRepeticaoB4((String)combRepeticoesB4.getSelectedItem());
        treinos.setObservacaoB4(txtObservacoesB4.getText());      
        
        treinos.setExercicioB4_1((String)combExercicioB4_1.getSelectedItem());
        treinos.setRepeticaoB4_1((String)combRepeticoesB4_1.getSelectedItem());
        treinos.setObservacaoB4_1(txtObservacoesB4_1.getText());
        
        treinos.setExercicioB4_2((String)combExercicioB4_2.getSelectedItem());
        treinos.setRepeticaoB4_2((String)combRepeticoesB4_2.getSelectedItem());
        treinos.setObservacaoB4_2(txtObservacoesB4_2.getText());
        
        treinos.setExercicioB4_3((String)combExercicioB4_3.getSelectedItem());
        treinos.setRepeticaoB4_3((String)combRepeticoesB4_3.getSelectedItem());
        treinos.setObservacaoB4_3(txtObservacoesB4_3.getText());
        
        treinos.setExercicioB4_4((String)combExercicioB4_4.getSelectedItem());
        treinos.setRepeticaoB4_4((String)combRepeticoesB4_4.getSelectedItem());
        treinos.setObservacaoB4_4(txtObservacoesB4_4.getText());
        
        treinos.setExercicioB4_5((String)combExercicioB4_5.getSelectedItem());
        treinos.setRepeticaoB4_5((String)combRepeticoesB4_5.getSelectedItem());
        treinos.setObservacaoB4_5(txtObservacoesB4_5.getText());
        
        treinos.setExercicioB4_6((String)combExercicioB4_6.getSelectedItem());
        treinos.setRepeticaoB4_6((String)combRepeticoesB4_6.getSelectedItem());
        treinos.setObservacaoB4_6(txtObservacoesB4_6.getText());

        treinos.setGrupo_muscularB5((String)combMusculoB5.getSelectedItem());        
        treinos.setExercicioB5((String)combExercicioB5.getSelectedItem());
        treinos.setRepeticaoB5((String)combRepeticoesB5.getSelectedItem());
        treinos.setObservacaoB5(txtObservacoesB5.getText());   
        
        treinos.setExercicioB5_1((String)combExercicioB5_1.getSelectedItem());
        treinos.setRepeticaoB5_1((String)combRepeticoesB5_1.getSelectedItem());
        treinos.setObservacaoB5_1(txtObservacoesB5_1.getText());
        
        treinos.setExercicioB5_2((String)combExercicioB5_2.getSelectedItem());
        treinos.setRepeticaoB5_2((String)combRepeticoesB5_2.getSelectedItem());
        treinos.setObservacaoB5_2(txtObservacoesB5_2.getText());
        
        treinos.setExercicioB5_3((String)combExercicioB5_3.getSelectedItem());
        treinos.setRepeticaoB5_3((String)combRepeticoesB5_3.getSelectedItem());
        treinos.setObservacaoB5_3(txtObservacoesB5_3.getText());
        
        treinos.setExercicioB5_4((String)combExercicioB5_4.getSelectedItem());
        treinos.setRepeticaoB5_4((String)combRepeticoesB5_4.getSelectedItem());
        treinos.setObservacaoB5_4(txtObservacoesB5_4.getText());
        
        treinos.setExercicioB5_5((String)combExercicioB5_5.getSelectedItem());
        treinos.setRepeticaoB5_5((String)combRepeticoesB5_5.getSelectedItem());
        treinos.setObservacaoB5_5(txtObservacoesB5_5.getText());
        
        treinos.setExercicioB5_6((String)combExercicioB5_6.getSelectedItem());
        treinos.setRepeticaoB5_6((String)combRepeticoesB5_6.getSelectedItem());
        treinos.setObservacaoB5_6(txtObservacoesB5_6.getText());
        
        
        treinos.setGrupo_muscularC1((String)combMusculoC1.getSelectedItem());        
        treinos.setExercicioC1((String)combExercicioC1.getSelectedItem());
        treinos.setRepeticaoC1((String)combRepeticoesC1.getSelectedItem());
        treinos.setObservacaoC1(txtObservacoesC1.getText());   
        
        treinos.setExercicioC1_1((String)combExercicioC1_1.getSelectedItem());
        treinos.setRepeticaoC1_1((String)combRepeticoesC1_1.getSelectedItem());
        treinos.setObservacaoC1_1(txtObservacoesC1_1.getText());
        
        treinos.setExercicioC1_2((String)combExercicioC1_2.getSelectedItem());
        treinos.setRepeticaoC1_2((String)combRepeticoesC1_2.getSelectedItem());
        treinos.setObservacaoC1_2(txtObservacoesC1_2.getText());
        
        treinos.setExercicioC1_3((String)combExercicioC1_3.getSelectedItem());
        treinos.setRepeticaoC1_3((String)combRepeticoesC1_3.getSelectedItem());
        treinos.setObservacaoC1_3(txtObservacoesC1_3.getText());
        
        treinos.setExercicioC1_4((String)combExercicioC1_4.getSelectedItem());
        treinos.setRepeticaoC1_4((String)combRepeticoesC1_4.getSelectedItem());
        treinos.setObservacaoC1_4(txtObservacoesC1_4.getText());
       
        treinos.setExercicioC1_5((String)combExercicioC1_5.getSelectedItem());
        treinos.setRepeticaoC1_5((String)combRepeticoesC1_5.getSelectedItem());
        treinos.setObservacaoC1_5(txtObservacoesC1_5.getText());
        
        treinos.setExercicioC1_6((String)combExercicioC1_6.getSelectedItem());
        treinos.setRepeticaoC1_6((String)combRepeticoesC1_6.getSelectedItem());
        treinos.setObservacaoC1_6(txtObservacoesC1_6.getText());
        
        treinos.setGrupo_muscularC2((String)combMusculoC2.getSelectedItem());        
        treinos.setExercicioC2((String)combExercicioC2.getSelectedItem());
        treinos.setRepeticaoC2((String)combRepeticoesC2.getSelectedItem());
        treinos.setObservacaoC2(txtObservacoesC2.getText());   
        
        treinos.setExercicioC2_1((String)combExercicioC2_1.getSelectedItem());
        treinos.setRepeticaoC2_1((String)combRepeticoesC2_1.getSelectedItem());
        treinos.setObservacaoC2_1(txtObservacoesC2_1.getText());
        
        treinos.setExercicioC2_2((String)combExercicioC2_2.getSelectedItem());
        treinos.setRepeticaoC2_2((String)combRepeticoesC2_2.getSelectedItem());
        treinos.setObservacaoC2_2(txtObservacoesC2_2.getText());
        
        treinos.setExercicioC2_3((String)combExercicioC2_3.getSelectedItem());
        treinos.setRepeticaoC2_3((String)combRepeticoesC2_3.getSelectedItem());
        treinos.setObservacaoC2_3(txtObservacoesC2_3.getText());
        
        treinos.setExercicioC2_4((String)combExercicioC2_4.getSelectedItem());
        treinos.setRepeticaoC2_4((String)combRepeticoesC2_4.getSelectedItem());
        treinos.setObservacaoC2_4(txtObservacoesC2_4.getText());
        
        treinos.setExercicioC2_5((String)combExercicioC2_5.getSelectedItem());
        treinos.setRepeticaoC2_5((String)combRepeticoesC2_5.getSelectedItem());
        treinos.setObservacaoC2_5(txtObservacoesC2_5.getText());
        
        treinos.setExercicioC2_6((String)combExercicioC2_6.getSelectedItem());
        treinos.setRepeticaoC2_6((String)combRepeticoesC2_6.getSelectedItem());
        treinos.setObservacaoC2_6(txtObservacoesC2_6.getText());
        
        treinos.setGrupo_muscularC3((String)combMusculoC3.getSelectedItem());        
        treinos.setExercicioC3((String)combExercicioC3.getSelectedItem());
        treinos.setRepeticaoC3((String)combRepeticoesC3.getSelectedItem());
        treinos.setObservacaoC3(txtObservacoesC3.getText());   
        
        treinos.setExercicioC3_1((String)combExercicioC3_1.getSelectedItem());
        treinos.setRepeticaoC3_1((String)combRepeticoesC3_1.getSelectedItem());
        treinos.setObservacaoC3_1(txtObservacoesC3_1.getText());
        
        treinos.setExercicioC3_2((String)combExercicioC3_2.getSelectedItem());
        treinos.setRepeticaoC3_2((String)combRepeticoesC3_2.getSelectedItem());
        treinos.setObservacaoC3_2(txtObservacoesC3_2.getText());
        
        treinos.setExercicioC3_3((String)combExercicioC3_3.getSelectedItem());
        treinos.setRepeticaoC3_3((String)combRepeticoesC3_3.getSelectedItem());
        treinos.setObservacaoC3_3(txtObservacoesC3_3.getText());
        
        treinos.setExercicioC3_4((String)combExercicioC3_4.getSelectedItem());
        treinos.setRepeticaoC3_4((String)combRepeticoesC3_4.getSelectedItem());
        treinos.setObservacaoC3_4(txtObservacoesC3_4.getText());
        
        treinos.setExercicioC3_5((String)combExercicioC3_5.getSelectedItem());
        treinos.setRepeticaoC3_5((String)combRepeticoesC3_5.getSelectedItem());
        treinos.setObservacaoC3_5(txtObservacoesC3_5.getText());
        
        treinos.setExercicioC3_6((String)combExercicioC3_6.getSelectedItem());
        treinos.setRepeticaoC3_6((String)combRepeticoesC3_6.getSelectedItem());
        treinos.setObservacaoC3_6(txtObservacoesC3_6.getText());
        
        treinos.setGrupo_muscularC4((String)combMusculoC4.getSelectedItem());        
        treinos.setExercicioC4((String)combExercicioC4.getSelectedItem());
        treinos.setRepeticaoC4((String)combRepeticoesC4.getSelectedItem());
        treinos.setObservacaoC4(txtObservacoesC4.getText());      
        
        treinos.setExercicioC4_1((String)combExercicioC4_1.getSelectedItem());
        treinos.setRepeticaoC4_1((String)combRepeticoesC4_1.getSelectedItem());
        treinos.setObservacaoC4_1(txtObservacoesC4_1.getText());
        
        treinos.setExercicioC4_2((String)combExercicioC4_2.getSelectedItem());
        treinos.setRepeticaoC4_2((String)combRepeticoesC4_2.getSelectedItem());
        treinos.setObservacaoC4_2(txtObservacoesC4_2.getText());
        
        treinos.setExercicioC4_3((String)combExercicioC4_3.getSelectedItem());
        treinos.setRepeticaoC4_3((String)combRepeticoesC4_3.getSelectedItem());
        treinos.setObservacaoC4_3(txtObservacoesC4_3.getText());
        
        treinos.setExercicioC4_4((String)combExercicioC4_4.getSelectedItem());
        treinos.setRepeticaoC4_4((String)combRepeticoesC4_4.getSelectedItem());
        treinos.setObservacaoC4_4(txtObservacoesC4_4.getText());
        
        treinos.setExercicioC4_5((String)combExercicioC4_5.getSelectedItem());
        treinos.setRepeticaoC4_5((String)combRepeticoesC4_5.getSelectedItem());
        treinos.setObservacaoC4_5(txtObservacoesC4_5.getText());
        
        treinos.setExercicioC4_6((String)combExercicioC4_6.getSelectedItem());
        treinos.setRepeticaoC4_6((String)combRepeticoesC4_6.getSelectedItem());
        treinos.setObservacaoC4_6(txtObservacoesC4_6.getText());

        treinos.setGrupo_muscularC5((String)combMusculoC5.getSelectedItem());        
        treinos.setExercicioC5((String)combExercicioC5.getSelectedItem());
        treinos.setRepeticaoC5((String)combRepeticoesC5.getSelectedItem());
        treinos.setObservacaoC5(txtObservacoesC5.getText());   
        
        treinos.setExercicioC5_1((String)combExercicioC5_1.getSelectedItem());
        treinos.setRepeticaoC5_1((String)combRepeticoesC5_1.getSelectedItem());
        treinos.setObservacaoC5_1(txtObservacoesC5_1.getText());
        
        treinos.setExercicioC5_2((String)combExercicioC5_2.getSelectedItem());
        treinos.setRepeticaoC5_2((String)combRepeticoesC5_2.getSelectedItem());
        treinos.setObservacaoC5_2(txtObservacoesC5_2.getText());
        
        treinos.setExercicioC5_3((String)combExercicioC5_3.getSelectedItem());
        treinos.setRepeticaoC5_3((String)combRepeticoesC5_3.getSelectedItem());
        treinos.setObservacaoC5_3(txtObservacoesC5_3.getText());
        
        treinos.setExercicioC5_4((String)combExercicioC5_4.getSelectedItem());
        treinos.setRepeticaoC5_4((String)combRepeticoesC5_4.getSelectedItem());
        treinos.setObservacaoC5_4(txtObservacoesC5_4.getText());
        
        treinos.setExercicioC5_5((String)combExercicioC5_5.getSelectedItem());
        treinos.setRepeticaoC5_5((String)combRepeticoesC5_5.getSelectedItem());
        treinos.setObservacaoC5_5(txtObservacoesC5_5.getText());
        
        treinos.setExercicioC5_6((String)combExercicioC5_6.getSelectedItem());
        treinos.setRepeticaoC5_6((String)combRepeticoesC5_6.getSelectedItem());
        treinos.setObservacaoC5_6(txtObservacoesC5_6.getText());
    }
   
    private void getandoCamposClasseCadastro_treino() throws SQLException{
        IdTreino.setText(Integer.toString(treinos.getCd_treino()));
        dtInicial.setText(treinos.getDt_inicio());
        dtFinal.setText(treinos.getDt_fim());
        combMusculoA1.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularA1()));        
        combExercicioA1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA1()));     
        combRepeticoesA1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA1()));
        txtObservacoesA1.setText(treinos.getObservacaoA1());
        combExercicioA1_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA1_1()));     
        combRepeticoesA1_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA1_1()));
        txtObservacoesA1_1.setText(treinos.getObservacaoA1_1());
        combExercicioA1_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA1_2()));     
        combRepeticoesA1_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA1_2()));
        txtObservacoesA1_2.setText(treinos.getObservacaoA1_2());
        combExercicioA1_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA1_3()));     
        combRepeticoesA1_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA1_3()));
        txtObservacoesA1_3.setText(treinos.getObservacaoA1_3());
            if(!"".equals(txtObservacoesA1_3.getText())){
                combExercicioA1_3.setVisible(true);
                combRepeticoesA1_3.setVisible(true);
                lblObservacoesA1_3.setVisible(true);
                txtObservacoesA1_3.setVisible(true);
            }
        combExercicioA1_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA1_4()));     
        combRepeticoesA1_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA1_4()));
        txtObservacoesA1_4.setText(treinos.getObservacaoA1_4());
            if(!"".equals(txtObservacoesA1_4.getText())){
                combExercicioA1_4.setVisible(true);
                combRepeticoesA1_4.setVisible(true);
                lblObservacoesA1_4.setVisible(true);
                txtObservacoesA1_4.setVisible(true);
            }
        combExercicioA1_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA1_5()));     
        combRepeticoesA1_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA1_5()));
        txtObservacoesA1_5.setText(treinos.getObservacaoA1_5());
            if(!"".equals(txtObservacoesA1_5.getText())){
                combExercicioA1_5.setVisible(true);
                combRepeticoesA1_5.setVisible(true);
                lblObservacoesA1_5.setVisible(true);
                txtObservacoesA1_5.setVisible(true);
            }
        combExercicioA1_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA1_6()));     
        combRepeticoesA1_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA1_6()));
        txtObservacoesA1_6.setText(treinos.getObservacaoA1_6());
            if(!"".equals(txtObservacoesA1_6.getText())){
                combExercicioA1_6.setVisible(true);
                combRepeticoesA1_6.setVisible(true);
                lblObservacoesA1_6.setVisible(true);
                txtObservacoesA1_6.setVisible(true);
            }
        combMusculoA2.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularA2()));        
        combExercicioA2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA2()));     
        combRepeticoesA2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA2()));
        txtObservacoesA2.setText(treinos.getObservacaoA2());
        combExercicioA2_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA2_1()));     
        combRepeticoesA2_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA2_1()));
        txtObservacoesA2_1.setText(treinos.getObservacaoA2_1());
        combExercicioA2_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA2_2()));     
        combRepeticoesA2_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA2_2()));
        txtObservacoesA2_2.setText(treinos.getObservacaoA2_2());
        combExercicioA2_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA2_3()));     
        combRepeticoesA2_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA2_3()));
        txtObservacoesA2_3.setText(treinos.getObservacaoA2_3());
            if(!"".equals(txtObservacoesA2_3.getText())){
                combExercicioA2_3.setVisible(true);
                combRepeticoesA2_3.setVisible(true);
                lblObservacoesA2_3.setVisible(true);
                txtObservacoesA2_3.setVisible(true);
            }
        combExercicioA2_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA2_4()));     
        combRepeticoesA2_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA2_4()));
        txtObservacoesA2_4.setText(treinos.getObservacaoA2_4());
            if(!"".equals(txtObservacoesA2_4.getText())){
                combExercicioA2_4.setVisible(true);
                combRepeticoesA2_4.setVisible(true);
                lblObservacoesA2_4.setVisible(true);
                txtObservacoesA2_4.setVisible(true);
            }
        combExercicioA2_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA2_5()));     
        combRepeticoesA2_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA2_5()));
        txtObservacoesA2_5.setText(treinos.getObservacaoA2_5());
            if(!"".equals(txtObservacoesA2_5.getText())){
                combExercicioA2_5.setVisible(true);
                combRepeticoesA2_5.setVisible(true);
                lblObservacoesA2_5.setVisible(true);
                txtObservacoesA2_5.setVisible(true);
            }
        combExercicioA2_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA2_6()));     
        combRepeticoesA2_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA2_6()));
        txtObservacoesA2_6.setText(treinos.getObservacaoA2_6());
            if(!"".equals(txtObservacoesA2_6.getText())){
                combExercicioA2_6.setVisible(true);
                combRepeticoesA2_6.setVisible(true);
                lblObservacoesA2_6.setVisible(true);
                txtObservacoesA2_6.setVisible(true);
            }
        combMusculoA3.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularA3()));        
        combExercicioA3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA3()));     
        combRepeticoesA3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA3()));
        txtObservacoesA3.setText(treinos.getObservacaoA3());
        combExercicioA3_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA3_1()));     
        combRepeticoesA3_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA3_1()));
        txtObservacoesA3_1.setText(treinos.getObservacaoA3_1());
        combExercicioA3_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA3_2()));     
        combRepeticoesA3_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA3_2()));
        txtObservacoesA3_2.setText(treinos.getObservacaoA3_2());
        combExercicioA3_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA3_3()));     
        combRepeticoesA3_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA3_3()));
        txtObservacoesA3_3.setText(treinos.getObservacaoA3_3());
            if(!"".equals(txtObservacoesA3_3.getText())){
                combExercicioA3_3.setVisible(true);
                combRepeticoesA3_3.setVisible(true);
                lblObservacoesA3_3.setVisible(true);
                txtObservacoesA3_3.setVisible(true);
            }
        combExercicioA3_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA3_4()));     
        combRepeticoesA3_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA3_4()));
        txtObservacoesA3_4.setText(treinos.getObservacaoA3_4());
            if(!"".equals(txtObservacoesA3_4.getText())){
                combExercicioA3_4.setVisible(true);
                combRepeticoesA3_4.setVisible(true);
                lblObservacoesA3_4.setVisible(true);
                txtObservacoesA3_4.setVisible(true);
            }
        combExercicioA3_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA3_5()));     
        combRepeticoesA3_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA3_5()));
        txtObservacoesA3_5.setText(treinos.getObservacaoA3_5());
            if(!"".equals(txtObservacoesA3_5.getText())){
                    combExercicioA3_5.setVisible(true);
                    combRepeticoesA3_5.setVisible(true);
                    lblObservacoesA3_5.setVisible(true);
                    txtObservacoesA3_5.setVisible(true);
            }
        combExercicioA3_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA3_6()));     
        combRepeticoesA3_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA3_6()));
        txtObservacoesA3_6.setText(treinos.getObservacaoA3_6());
            if(!"".equals(txtObservacoesA3_6.getText())){
                combExercicioA3_6.setVisible(true);
                combRepeticoesA3_6.setVisible(true);
                lblObservacoesA3_6.setVisible(true);
                txtObservacoesA3_6.setVisible(true);
            }
        combMusculoA4.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularA4()));        
        combExercicioA4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA4()));     
        combRepeticoesA4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA4()));
        txtObservacoesA4.setText(treinos.getObservacaoA4());
        combExercicioA4_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA4_1()));     
        combRepeticoesA4_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA4_1()));
        txtObservacoesA4_1.setText(treinos.getObservacaoA4_1());
        combExercicioA4_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA4_2()));     
        combRepeticoesA4_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA4_2()));
        txtObservacoesA4_2.setText(treinos.getObservacaoA4_2());
        combExercicioA4_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA4_3()));     
        combRepeticoesA4_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA4_3()));
        txtObservacoesA4_3.setText(treinos.getObservacaoA4_3());
            if(!"".equals(txtObservacoesA4_3.getText())){
                combExercicioA4_3.setVisible(true);
                combRepeticoesA4_3.setVisible(true);
                lblObservacoesA4_3.setVisible(true);
                txtObservacoesA4_3.setVisible(true);
            }
        combExercicioA4_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA4_4()));     
        combRepeticoesA4_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA4_4()));
        txtObservacoesA4_4.setText(treinos.getObservacaoA4_4());
            if(!"".equals(txtObservacoesA4_4.getText())){
                combExercicioA4_4.setVisible(true);
                combRepeticoesA4_4.setVisible(true);
                lblObservacoesA4_4.setVisible(true);
                txtObservacoesA4_4.setVisible(true);
            }
        combExercicioA4_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA4_5()));     
        combRepeticoesA4_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA4_5()));
        txtObservacoesA4_5.setText(treinos.getObservacaoA4_5());
            if(!"".equals(txtObservacoesA4_5.getText())){
                combExercicioA4_5.setVisible(true);
                combRepeticoesA4_5.setVisible(true);
                lblObservacoesA4_5.setVisible(true);
                txtObservacoesA4_5.setVisible(true);
            }
        combExercicioA4_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA4_6()));     
        combRepeticoesA4_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA4_6()));
        txtObservacoesA4_6.setText(treinos.getObservacaoA4_6());
            if(!"".equals(txtObservacoesA4_3.getText())){
                combExercicioA4_6.setVisible(true);
                combRepeticoesA4_6.setVisible(true);
                lblObservacoesA4_6.setVisible(true);
                txtObservacoesA4_6.setVisible(true);
            }
        combMusculoA5.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularA5()));        
        combExercicioA5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA5()));     
        combRepeticoesA5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA5()));
        txtObservacoesA5.setText(treinos.getObservacaoA5());
        combExercicioA5_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA5_1()));     
        combRepeticoesA5_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA5_1()));
        txtObservacoesA5_1.setText(treinos.getObservacaoA5_1());
        combExercicioA5_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA5_2()));     
        combRepeticoesA5_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA5_2()));
        txtObservacoesA5_2.setText(treinos.getObservacaoA5_2());
        combExercicioA5_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA5_3()));     
        combRepeticoesA5_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA5_3()));
        txtObservacoesA5_3.setText(treinos.getObservacaoA5_3());
            if(!"".equals(txtObservacoesA5_3.getText())){
                combExercicioA5_3.setVisible(true);
                combRepeticoesA5_3.setVisible(true);
                lblObservacoesA5_3.setVisible(true);
                txtObservacoesA5_3.setVisible(true);
            }
        combExercicioA5_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA5_4()));     
        combRepeticoesA5_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA5_4()));
        txtObservacoesA5_4.setText(treinos.getObservacaoA5_4());
            if(!"".equals(txtObservacoesA5_4.getText())){
                combExercicioA5_4.setVisible(true);
                combRepeticoesA5_4.setVisible(true);
                lblObservacoesA5_4.setVisible(true);
                txtObservacoesA5_4.setVisible(true);
            }
        combExercicioA5_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA5_5()));     
        combRepeticoesA5_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA5_5()));
        txtObservacoesA5_5.setText(treinos.getObservacaoA5_5());
            if(!"".equals(txtObservacoesA5_5.getText())){
                combExercicioA5_5.setVisible(true);
                combRepeticoesA5_5.setVisible(true);
                lblObservacoesA5_5.setVisible(true);
                txtObservacoesA5_5.setVisible(true);
            }
        combExercicioA5_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioA5_6()));     
        combRepeticoesA5_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoA5_6()));
        txtObservacoesA5_6.setText(treinos.getObservacaoA5_6());
            if(!"".equals(txtObservacoesA5_6.getText())){
                combExercicioA5_6.setVisible(true);
                combRepeticoesA5_6.setVisible(true);
                lblObservacoesA5_6.setVisible(true);
                txtObservacoesA5_6.setVisible(true);
            }
      
        //TREINOS B
        combMusculoB1.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularB1()));        
        combExercicioB1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB1()));     
        combRepeticoesB1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB1()));
        txtObservacoesB1.setText(treinos.getObservacaoB1());
        combExercicioB1_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB1_1()));     
        combRepeticoesB1_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB1_1()));
        txtObservacoesB1_1.setText(treinos.getObservacaoB1_1());
        combExercicioB1_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB1_2()));     
        combRepeticoesB1_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB1_2()));
        txtObservacoesB1_2.setText(treinos.getObservacaoB1_2());
        combExercicioB1_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB1_3()));     
        combRepeticoesB1_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB1_3()));
        txtObservacoesB1_3.setText(treinos.getObservacaoB1_3());
            if(!"".equals(txtObservacoesB1_3.getText())){
                combExercicioB1_3.setVisible(true);
                combRepeticoesB1_3.setVisible(true);
                lblObservacoesB1_3.setVisible(true);
                txtObservacoesB1_3.setVisible(true);
            }
        combExercicioB1_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB1_4()));    
        combRepeticoesB1_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB1_4()));
        txtObservacoesB1_4.setText(treinos.getObservacaoB1_4());
            if(!"".equals(txtObservacoesB1_4.getText())){
                combExercicioB1_4.setVisible(true);
                combRepeticoesB1_4.setVisible(true);
                lblObservacoesB1_4.setVisible(true);
                txtObservacoesB1_4.setVisible(true);
            }
        combExercicioB1_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB1_5()));     
        combRepeticoesB1_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB1_5()));
        txtObservacoesB1_5.setText(treinos.getObservacaoB1_5());
            if(!"".equals(txtObservacoesB1_5.getText())){
                combExercicioB1_5.setVisible(true);
                combRepeticoesB1_5.setVisible(true);
                lblObservacoesB1_5.setVisible(true);
                txtObservacoesB1_5.setVisible(true);
            }
        combExercicioB1_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB1_6()));     
        combRepeticoesB1_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB1_6()));
        txtObservacoesB1_6.setText(treinos.getObservacaoB1_6());
            if(!"".equals(txtObservacoesB1_6.getText())){
                combExercicioB1_6.setVisible(true);
                combRepeticoesB1_6.setVisible(true);
                lblObservacoesB1_6.setVisible(true);
                txtObservacoesB1_6.setVisible(true);
            }
        combMusculoB2.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularB2()));        
        combExercicioB2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB2()));     
        combRepeticoesB2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB2()));
        txtObservacoesB2.setText(treinos.getObservacaoB2());
        combExercicioB2_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB2_1()));     
        combRepeticoesB2_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB2_1()));
        txtObservacoesB2_1.setText(treinos.getObservacaoB2_1());
        combExercicioB2_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB2_2()));     
        combRepeticoesB2_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB2_2()));
        txtObservacoesB2_2.setText(treinos.getObservacaoB2_2());
        combExercicioB2_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB2_3()));     
        combRepeticoesB2_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB2_3()));
        txtObservacoesB2_3.setText(treinos.getObservacaoB2_3());
            if(!"".equals(txtObservacoesB2_3.getText())){
                combExercicioB2_3.setVisible(true);
                combRepeticoesB2_3.setVisible(true);
                lblObservacoesB2_3.setVisible(true);
                txtObservacoesB2_3.setVisible(true);
            }
        combExercicioB2_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB2_4()));    
        combRepeticoesB2_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB2_4()));
        txtObservacoesB2_4.setText(treinos.getObservacaoB2_4());
            if(!"".equals(txtObservacoesB2_4.getText())){
                combExercicioB2_4.setVisible(true);
                combRepeticoesB2_4.setVisible(true);
                lblObservacoesB2_4.setVisible(true);
                txtObservacoesB2_4.setVisible(true);
            }
        combExercicioB2_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB2_5()));     
        combRepeticoesB2_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB2_5()));
        txtObservacoesB2_5.setText(treinos.getObservacaoB2_5());
            if(!"".equals(txtObservacoesB2_5.getText())){
                combExercicioB2_5.setVisible(true);
                combRepeticoesB2_5.setVisible(true);
                lblObservacoesB2_5.setVisible(true);
                txtObservacoesB2_5.setVisible(true);
            }
        combExercicioB2_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB2_6()));     
        combRepeticoesB2_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB2_6()));
        txtObservacoesB2_6.setText(treinos.getObservacaoB2_6());
            if(!"".equals(txtObservacoesB2_6.getText())){
                combExercicioB2_6.setVisible(true);
                combRepeticoesB2_6.setVisible(true);
                lblObservacoesB2_6.setVisible(true);
                txtObservacoesB2_6.setVisible(true);
            }
        combMusculoB3.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularB3()));        
        combExercicioB3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB3()));     
        combRepeticoesB3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB3()));
        txtObservacoesB3.setText(treinos.getObservacaoB3());
        combExercicioB3_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB3_1()));     
        combRepeticoesB3_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB3_1()));
        txtObservacoesB3_1.setText(treinos.getObservacaoB3_1());
        combExercicioB3_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB3_2()));     
        combRepeticoesB3_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB3_2()));
        txtObservacoesB3_2.setText(treinos.getObservacaoB3_2());
        combExercicioB3_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB3_3()));     
        combRepeticoesB3_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB3_3()));
        txtObservacoesB3_3.setText(treinos.getObservacaoB3_3());
            if(!"".equals(txtObservacoesB3_3.getText())){
                combExercicioB3_3.setVisible(true);
                combRepeticoesB3_3.setVisible(true);
                lblObservacoesB3_3.setVisible(true);
                txtObservacoesB3_3.setVisible(true);
            }
        combExercicioB3_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB3_4()));    
        combRepeticoesB3_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB3_4()));
        txtObservacoesB3_4.setText(treinos.getObservacaoB3_4());
            if(!"".equals(txtObservacoesB3_4.getText())){
                combExercicioB3_4.setVisible(true);
                combRepeticoesB3_4.setVisible(true);
                lblObservacoesB3_4.setVisible(true);
                txtObservacoesB3_4.setVisible(true);
            }
        combExercicioB3_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB3_5()));     
        combRepeticoesB3_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB3_5()));
        txtObservacoesB3_5.setText(treinos.getObservacaoB3_5());
            if(!"".equals(txtObservacoesB3_5.getText())){
                    combExercicioB3_5.setVisible(true);
                    combRepeticoesB3_5.setVisible(true);
                    lblObservacoesB3_5.setVisible(true);
                    txtObservacoesB3_5.setVisible(true);
            }
        combExercicioB3_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB3_6()));     
        combRepeticoesB3_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB3_6()));
        txtObservacoesB3_6.setText(treinos.getObservacaoB3_6());
            if(!"".equals(txtObservacoesB3_6.getText())){
                combExercicioB3_6.setVisible(true);
                combRepeticoesB3_6.setVisible(true);
                lblObservacoesB3_6.setVisible(true);
                txtObservacoesB3_6.setVisible(true);
            }
        combMusculoB4.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularB4()));        
        combExercicioB4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB4()));     
        combRepeticoesB4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB4()));
        txtObservacoesB4.setText(treinos.getObservacaoB4());
        combExercicioB4_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB4_1()));     
        combRepeticoesB4_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB4_1()));
        txtObservacoesB4_1.setText(treinos.getObservacaoB4_1());
        combExercicioB4_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB4_2()));     
        combRepeticoesB4_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB4_2()));
        txtObservacoesB4_2.setText(treinos.getObservacaoB4_2());
        combExercicioB4_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB4_3()));     
        combRepeticoesB4_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB4_3()));
        txtObservacoesB4_3.setText(treinos.getObservacaoB4_3());
            if(!"".equals(txtObservacoesB4_3.getText())){
                combExercicioB4_3.setVisible(true);
                combRepeticoesB4_3.setVisible(true);
                lblObservacoesB4_3.setVisible(true);
                txtObservacoesB4_3.setVisible(true);
            }
        combExercicioB4_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB4_4()));    
        combRepeticoesB4_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB4_4()));
        txtObservacoesB4_4.setText(treinos.getObservacaoB4_4());
            if(!"".equals(txtObservacoesB4_4.getText())){
                combExercicioB4_4.setVisible(true);
                combRepeticoesB4_4.setVisible(true);
                lblObservacoesB4_4.setVisible(true);
                txtObservacoesB4_4.setVisible(true);
            }
        combExercicioB4_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB4_5()));     
        combRepeticoesB4_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB4_5()));
        txtObservacoesB4_5.setText(treinos.getObservacaoB4_5());
            if(!"".equals(txtObservacoesB4_5.getText())){
                combExercicioB4_5.setVisible(true);
                combRepeticoesB4_5.setVisible(true);
                lblObservacoesB4_5.setVisible(true);
                txtObservacoesB4_5.setVisible(true);
            }
        combExercicioB4_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB4_6()));     
        combRepeticoesB4_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB4_6()));
        txtObservacoesB4_6.setText(treinos.getObservacaoB4_6());
            if(!"".equals(txtObservacoesB4_6.getText())){
                combExercicioB4_6.setVisible(true);
                combRepeticoesB4_6.setVisible(true);
                lblObservacoesB4_6.setVisible(true);
                txtObservacoesB4_6.setVisible(true);
            }
        combMusculoB5.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularB5()));        
        combExercicioB5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB5()));     
        combRepeticoesB5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB5()));
        txtObservacoesB5.setText(treinos.getObservacaoB5());
        combExercicioB5_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB5_1()));     
        combRepeticoesB5_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB5_1()));
        txtObservacoesB5_1.setText(treinos.getObservacaoB5_1());
        combExercicioB5_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB5_2()));     
        combRepeticoesB5_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB5_2()));
        txtObservacoesB5_2.setText(treinos.getObservacaoB5_2());
        combExercicioB5_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB5_3()));     
        combRepeticoesB5_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB5_3()));
        txtObservacoesB5_3.setText(treinos.getObservacaoB5_3());
            if(!"".equals(txtObservacoesB5_3.getText())){
                combExercicioB5_3.setVisible(true);
                combRepeticoesB5_3.setVisible(true);
                lblObservacoesB5_3.setVisible(true);
                txtObservacoesB5_3.setVisible(true);
            }
        combExercicioB5_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB5_4()));    
        combRepeticoesB5_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB5_4()));
        txtObservacoesB5_4.setText(treinos.getObservacaoB5_4());
            if(!"".equals(txtObservacoesB5_4.getText())){
                    combExercicioB5_4.setVisible(true);
                    combRepeticoesB5_4.setVisible(true);
                    lblObservacoesB5_4.setVisible(true);
                    txtObservacoesB5_4.setVisible(true);
            }
        combExercicioB5_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB5_5()));     
        combRepeticoesB5_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB5_5()));
        txtObservacoesB5_5.setText(treinos.getObservacaoB5_5());
            if(!"".equals(txtObservacoesB5_5.getText())){
                combExercicioB5_5.setVisible(true);
                combRepeticoesB5_5.setVisible(true);
                lblObservacoesB5_5.setVisible(true);
                txtObservacoesB5_5.setVisible(true);
            }
        combExercicioB5_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioB5_6()));     
        combRepeticoesB5_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoB5_6()));
        txtObservacoesB5_6.setText(treinos.getObservacaoB5_6());
            if(!"".equals(txtObservacoesB5_6.getText())){
                combExercicioB5_6.setVisible(true);
                combRepeticoesB5_6.setVisible(true);
                lblObservacoesB5_6.setVisible(true);
                txtObservacoesB5_6.setVisible(true);
            }
        
        
        //TREINOS C
        combMusculoC1.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularC1()));        
        combExercicioC1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC1()));     
        combRepeticoesC1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC1()));
        txtObservacoesC1.setText(treinos.getObservacaoC1());
        combExercicioC1_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC1_1()));     
        combRepeticoesC1_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC1_1()));
        txtObservacoesC1_1.setText(treinos.getObservacaoC1_1());
        combExercicioC1_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC1_2()));     
        combRepeticoesC1_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC1_2()));
        txtObservacoesC1_2.setText(treinos.getObservacaoC1_2());
        combExercicioC1_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC1_3()));     
        combRepeticoesC1_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC1_3()));
        txtObservacoesC1_3.setText(treinos.getObservacaoC1_3());
            if(!"".equals(txtObservacoesC1_3.getText())){
                combExercicioC1_3.setVisible(true);
                combRepeticoesC1_3.setVisible(true);
                lblObservacoesC1_3.setVisible(true);
                txtObservacoesC1_3.setVisible(true);
            }
        combExercicioC1_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC1_4()));    
        combRepeticoesC1_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC1_4()));
        txtObservacoesC1_4.setText(treinos.getObservacaoC1_4());
            if(!"".equals(txtObservacoesC1_4.getText())){
                combExercicioC1_4.setVisible(true);
                combRepeticoesC1_4.setVisible(true);
                lblObservacoesC1_4.setVisible(true);
                txtObservacoesC1_4.setVisible(true);
            }
        combExercicioC1_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC1_5()));     
        combRepeticoesC1_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC1_5()));
        txtObservacoesC1_5.setText(treinos.getObservacaoC1_5());
            if(!"".equals(txtObservacoesC1_5.getText())){
                combExercicioC1_5.setVisible(true);
                combRepeticoesC1_5.setVisible(true);
                lblObservacoesC1_5.setVisible(true);
                txtObservacoesC1_5.setVisible(true);
            }
        combExercicioC1_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC1_6()));     
        combRepeticoesC1_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC1_6()));
        txtObservacoesC1_6.setText(treinos.getObservacaoC1_6());
            if(!"".equals(txtObservacoesC1_6.getText())){
                combExercicioC1_6.setVisible(true);
                combRepeticoesC1_6.setVisible(true);
                lblObservacoesC1_6.setVisible(true);
                txtObservacoesC1_6.setVisible(true);
            }
        combMusculoC2.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularC2()));        
        combExercicioC2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC2()));     
        combRepeticoesC2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC2()));
        txtObservacoesC2.setText(treinos.getObservacaoC2());
        combExercicioC2_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC2_1()));     
        combRepeticoesC2_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC2_1()));
        txtObservacoesC2_1.setText(treinos.getObservacaoC2_1());
        combExercicioC2_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC2_2()));     
        combRepeticoesC2_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC2_2()));
        txtObservacoesC2_2.setText(treinos.getObservacaoC2_2());
        combExercicioC2_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC2_3()));     
        combRepeticoesC2_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC2_3()));
        txtObservacoesC2_3.setText(treinos.getObservacaoC2_3());
            if(!"".equals(txtObservacoesC2_3.getText())){
                combExercicioC2_3.setVisible(true);
                combRepeticoesC2_3.setVisible(true);
                lblObservacoesC2_3.setVisible(true);
                txtObservacoesC2_3.setVisible(true);
            }
        combExercicioC2_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC2_4()));    
        combRepeticoesC2_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC2_4()));
        txtObservacoesC2_4.setText(treinos.getObservacaoC2_4());
            if(!"".equals(txtObservacoesC2_4.getText())){
                combExercicioC2_4.setVisible(true);
                combRepeticoesC2_4.setVisible(true);
                lblObservacoesC2_4.setVisible(true);
                txtObservacoesC2_4.setVisible(true);
            }
        combExercicioC2_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC2_5()));     
        combRepeticoesC2_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC2_5()));
        txtObservacoesC2_5.setText(treinos.getObservacaoC2_5());
            if(!"".equals(txtObservacoesC2_5.getText())){
                combExercicioC2_5.setVisible(true);
                combRepeticoesC2_5.setVisible(true);
                lblObservacoesC2_5.setVisible(true);
                txtObservacoesC2_5.setVisible(true);
            }
        combExercicioC2_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC2_6()));     
        combRepeticoesC2_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC2_6()));
        txtObservacoesC2_6.setText(treinos.getObservacaoC2_6());
            if(!"".equals(txtObservacoesC2_6.getText())){
                combExercicioC2_6.setVisible(true);
                combRepeticoesC2_6.setVisible(true);
                lblObservacoesC2_6.setVisible(true);
                txtObservacoesC2_6.setVisible(true);
            }
        combMusculoC3.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularC3()));        
        combExercicioC3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC3()));     
        combRepeticoesC3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC3()));
        txtObservacoesC3.setText(treinos.getObservacaoC3());
        combExercicioC3_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC3_1()));     
        combRepeticoesC3_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC3_1()));
        txtObservacoesC3_1.setText(treinos.getObservacaoC3_1());
        combExercicioC3_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC3_2()));     
        combRepeticoesC3_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC3_2()));
        txtObservacoesC3_2.setText(treinos.getObservacaoC3_2());
        combExercicioC3_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC3_3()));     
        combRepeticoesC3_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC3_3()));
        txtObservacoesC3_3.setText(treinos.getObservacaoC3_3());
            if(!"".equals(txtObservacoesC3_3.getText())){
                combExercicioC3_3.setVisible(true);
                combRepeticoesC3_3.setVisible(true);
                lblObservacoesC3_3.setVisible(true);
                txtObservacoesC3_3.setVisible(true);
            }
        combExercicioC3_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC3_4()));    
        combRepeticoesC3_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC3_4()));
        txtObservacoesC3_4.setText(treinos.getObservacaoC3_4());
            if(!"".equals(txtObservacoesC3_4.getText())){
                combExercicioC3_4.setVisible(true);
                combRepeticoesC3_4.setVisible(true);
                lblObservacoesC3_4.setVisible(true);
                txtObservacoesC3_4.setVisible(true);
            }
        combExercicioC3_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC3_5()));     
        combRepeticoesC3_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC3_5()));
        txtObservacoesC3_5.setText(treinos.getObservacaoC3_5());
            if(!"".equals(txtObservacoesC3_5.getText())){
                combExercicioC3_5.setVisible(true);
                combRepeticoesC3_5.setVisible(true);
                lblObservacoesC3_5.setVisible(true);
                txtObservacoesC3_5.setVisible(true);
            }
        combExercicioC3_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC3_6()));     
        combRepeticoesC3_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC3_6()));
        txtObservacoesC3_6.setText(treinos.getObservacaoC3_6());
            if(!"".equals(txtObservacoesC3_6.getText())){
                combExercicioC3_6.setVisible(true);
                combRepeticoesC3_6.setVisible(true);
                lblObservacoesC3_6.setVisible(true);
                txtObservacoesC3_6.setVisible(true);
            }
        combMusculoC4.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularC4()));        
        combExercicioC4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC4()));     
        combRepeticoesC4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC4()));
        txtObservacoesC4.setText(treinos.getObservacaoC4());
        combExercicioC4_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC4_1()));     
        combRepeticoesC4_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC4_1()));
        txtObservacoesC4_1.setText(treinos.getObservacaoC4_1());
        combExercicioC4_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC4_2()));     
        combRepeticoesC4_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC4_2()));
        txtObservacoesC4_2.setText(treinos.getObservacaoC4_2());
        combExercicioC4_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC4_3()));     
        combRepeticoesC4_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC4_3()));
        txtObservacoesC4_3.setText(treinos.getObservacaoC4_3());
            if(!"".equals(txtObservacoesC4_3.getText())){
                combExercicioC4_3.setVisible(true);
                combRepeticoesC4_3.setVisible(true);
                lblObservacoesC4_3.setVisible(true);
                txtObservacoesC4_3.setVisible(true);
            }
        combExercicioC4_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC4_4()));    
        combRepeticoesC4_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC4_4()));
        txtObservacoesC4_4.setText(treinos.getObservacaoC4_4());
            if(!"".equals(txtObservacoesC4_4.getText())){
                combExercicioC4_4.setVisible(true);
                combRepeticoesC4_4.setVisible(true);
                lblObservacoesC4_4.setVisible(true);
                txtObservacoesC4_4.setVisible(true);
            }
        combExercicioC4_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC4_5()));     
        combRepeticoesC4_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC4_5()));
        txtObservacoesC4_5.setText(treinos.getObservacaoC4_5());
            if(!"".equals(txtObservacoesC4_5.getText())){
                combExercicioC4_5.setVisible(true);
                combRepeticoesC4_5.setVisible(true);
                lblObservacoesC4_5.setVisible(true);
                txtObservacoesC4_5.setVisible(true);
            }
        combExercicioC4_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC4_6()));     
        combRepeticoesC4_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC4_6()));
        txtObservacoesC4_6.setText(treinos.getObservacaoC4_6());
            if(!"".equals(txtObservacoesC4_6.getText())){
                combExercicioC4_6.setVisible(true);
                combRepeticoesC4_6.setVisible(true);
                lblObservacoesC4_6.setVisible(true);
                txtObservacoesC4_6.setVisible(true);
            }
        combMusculoC5.addItem(selects.populandoTelaTreinosGruposMusculares(treinosCodigos.getGrupo_muscularC5()));        
        combExercicioC5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC5()));     
        combRepeticoesC5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC5()));
        txtObservacoesC5.setText(treinos.getObservacaoC5());
        combExercicioC5_1.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC5_1()));     
        combRepeticoesC5_1.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC5_1()));
        txtObservacoesC5_1.setText(treinos.getObservacaoC5_1());
        combExercicioC5_2.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC5_2()));     
        combRepeticoesC5_2.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC5_2()));
        txtObservacoesC5_2.setText(treinos.getObservacaoC5_2());
        combExercicioC5_3.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC5_3()));     
        combRepeticoesC5_3.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC5_3()));
        txtObservacoesC5_3.setText(treinos.getObservacaoC5_3());
            if(!"".equals(txtObservacoesC5_3.getText())){
                combExercicioC5_3.setVisible(true);
                combRepeticoesC5_3.setVisible(true);
                lblObservacoesC5_3.setVisible(true);
                txtObservacoesC5_3.setVisible(true);
            }
        combExercicioC5_4.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC5_4()));    
        combRepeticoesC5_4.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC5_4()));
        txtObservacoesC5_4.setText(treinos.getObservacaoC5_4());
            if(!"".equals(txtObservacoesC5_4.getText())){
                combExercicioC5_4.setVisible(true);
                combRepeticoesC5_4.setVisible(true);
                lblObservacoesC5_4.setVisible(true);
                txtObservacoesC5_4.setVisible(true);
            }
        combExercicioC5_5.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC5_5()));     
        combRepeticoesC5_5.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC5_5()));
        txtObservacoesC5_5.setText(treinos.getObservacaoC5_5());
            if(!"".equals(txtObservacoesC5_5.getText())){
                combExercicioC5_5.setVisible(true);
                combRepeticoesC5_5.setVisible(true);
                lblObservacoesC5_5.setVisible(true);
                txtObservacoesC5_5.setVisible(true);
            }
        combExercicioC5_6.addItem(selects.populandoTelaTreinosExercicios(treinosCodigos.getExercicioC5_6()));     
        combRepeticoesC5_6.addItem(selects.populandoTelaTreinosRepeticoes(treinosCodigos.getRepeticaoC5_6()));
        txtObservacoesC5_6.setText(treinos.getObservacaoC5_6()); 
            if(!"".equals(txtObservacoesC5_6.getText())){
                combExercicioC5_6.setVisible(true);
                combRepeticoesC5_6.setVisible(true);
                lblObservacoesC5_6.setVisible(true);
                txtObservacoesC5_6.setVisible(true);
            }
    }
    
    
    /* --------------------------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /* --------------------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_treino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_treino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_treino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro_treino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /* --------------------------------------------------------------
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastro_treino dialog = new TelaCadastro_treino(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                
            }
        });
    } ------------------------------------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdTreino;
    private javax.swing.JTabbedPane abaTreinoA;
    private javax.swing.JTabbedPane abaTreinoB;
    private javax.swing.JTabbedPane abaTreinoC;
    private javax.swing.JMenu btnFechar;
    private javax.swing.JButton btnLessA1;
    private javax.swing.JButton btnLessA2;
    private javax.swing.JButton btnLessA3;
    private javax.swing.JButton btnLessA4;
    private javax.swing.JButton btnLessA5;
    private javax.swing.JButton btnLessB1;
    private javax.swing.JButton btnLessB2;
    private javax.swing.JButton btnLessB3;
    private javax.swing.JButton btnLessB4;
    private javax.swing.JButton btnLessB5;
    private javax.swing.JButton btnLessC1;
    private javax.swing.JButton btnLessC2;
    private javax.swing.JButton btnLessC3;
    private javax.swing.JButton btnLessC4;
    private javax.swing.JButton btnLessC5;
    private javax.swing.JButton btnPlusA1;
    private javax.swing.JButton btnPlusA2;
    private javax.swing.JButton btnPlusA3;
    private javax.swing.JButton btnPlusA4;
    private javax.swing.JButton btnPlusA5;
    private javax.swing.JButton btnPlusB1;
    private javax.swing.JButton btnPlusB2;
    private javax.swing.JButton btnPlusB3;
    private javax.swing.JButton btnPlusB4;
    private javax.swing.JButton btnPlusB5;
    private javax.swing.JButton btnPlusC1;
    private javax.swing.JButton btnPlusC2;
    private javax.swing.JButton btnPlusC3;
    private javax.swing.JButton btnPlusC4;
    private javax.swing.JButton btnPlusC5;
    private javax.swing.JMenu btnSalvar;
    private javax.swing.JComboBox<String> combExercicioA1;
    private javax.swing.JComboBox<String> combExercicioA1_1;
    private javax.swing.JComboBox<String> combExercicioA1_2;
    private javax.swing.JComboBox<String> combExercicioA1_3;
    private javax.swing.JComboBox<String> combExercicioA1_4;
    private javax.swing.JComboBox<String> combExercicioA1_5;
    private javax.swing.JComboBox<String> combExercicioA1_6;
    private javax.swing.JComboBox<String> combExercicioA2;
    private javax.swing.JComboBox<String> combExercicioA2_1;
    private javax.swing.JComboBox<String> combExercicioA2_2;
    private javax.swing.JComboBox<String> combExercicioA2_3;
    private javax.swing.JComboBox<String> combExercicioA2_4;
    private javax.swing.JComboBox<String> combExercicioA2_5;
    private javax.swing.JComboBox<String> combExercicioA2_6;
    private javax.swing.JComboBox<String> combExercicioA3;
    private javax.swing.JComboBox<String> combExercicioA3_1;
    private javax.swing.JComboBox<String> combExercicioA3_2;
    private javax.swing.JComboBox<String> combExercicioA3_3;
    private javax.swing.JComboBox<String> combExercicioA3_4;
    private javax.swing.JComboBox<String> combExercicioA3_5;
    private javax.swing.JComboBox<String> combExercicioA3_6;
    private javax.swing.JComboBox<String> combExercicioA4;
    private javax.swing.JComboBox<String> combExercicioA4_1;
    private javax.swing.JComboBox<String> combExercicioA4_2;
    private javax.swing.JComboBox<String> combExercicioA4_3;
    private javax.swing.JComboBox<String> combExercicioA4_4;
    private javax.swing.JComboBox<String> combExercicioA4_5;
    private javax.swing.JComboBox<String> combExercicioA4_6;
    private javax.swing.JComboBox<String> combExercicioA5;
    private javax.swing.JComboBox<String> combExercicioA5_1;
    private javax.swing.JComboBox<String> combExercicioA5_2;
    private javax.swing.JComboBox<String> combExercicioA5_3;
    private javax.swing.JComboBox<String> combExercicioA5_4;
    private javax.swing.JComboBox<String> combExercicioA5_5;
    private javax.swing.JComboBox<String> combExercicioA5_6;
    private javax.swing.JComboBox<String> combExercicioB1;
    private javax.swing.JComboBox<String> combExercicioB1_1;
    private javax.swing.JComboBox<String> combExercicioB1_2;
    private javax.swing.JComboBox<String> combExercicioB1_3;
    private javax.swing.JComboBox<String> combExercicioB1_4;
    private javax.swing.JComboBox<String> combExercicioB1_5;
    private javax.swing.JComboBox<String> combExercicioB1_6;
    private javax.swing.JComboBox<String> combExercicioB2;
    private javax.swing.JComboBox<String> combExercicioB2_1;
    private javax.swing.JComboBox<String> combExercicioB2_2;
    private javax.swing.JComboBox<String> combExercicioB2_3;
    private javax.swing.JComboBox<String> combExercicioB2_4;
    private javax.swing.JComboBox<String> combExercicioB2_5;
    private javax.swing.JComboBox<String> combExercicioB2_6;
    private javax.swing.JComboBox<String> combExercicioB3;
    private javax.swing.JComboBox<String> combExercicioB3_1;
    private javax.swing.JComboBox<String> combExercicioB3_2;
    private javax.swing.JComboBox<String> combExercicioB3_3;
    private javax.swing.JComboBox<String> combExercicioB3_4;
    private javax.swing.JComboBox<String> combExercicioB3_5;
    private javax.swing.JComboBox<String> combExercicioB3_6;
    private javax.swing.JComboBox<String> combExercicioB4;
    private javax.swing.JComboBox<String> combExercicioB4_1;
    private javax.swing.JComboBox<String> combExercicioB4_2;
    private javax.swing.JComboBox<String> combExercicioB4_3;
    private javax.swing.JComboBox<String> combExercicioB4_4;
    private javax.swing.JComboBox<String> combExercicioB4_5;
    private javax.swing.JComboBox<String> combExercicioB4_6;
    private javax.swing.JComboBox<String> combExercicioB5;
    private javax.swing.JComboBox<String> combExercicioB5_1;
    private javax.swing.JComboBox<String> combExercicioB5_2;
    private javax.swing.JComboBox<String> combExercicioB5_3;
    private javax.swing.JComboBox<String> combExercicioB5_4;
    private javax.swing.JComboBox<String> combExercicioB5_5;
    private javax.swing.JComboBox<String> combExercicioB5_6;
    private javax.swing.JComboBox<String> combExercicioC1;
    private javax.swing.JComboBox<String> combExercicioC1_1;
    private javax.swing.JComboBox<String> combExercicioC1_2;
    private javax.swing.JComboBox<String> combExercicioC1_3;
    private javax.swing.JComboBox<String> combExercicioC1_4;
    private javax.swing.JComboBox<String> combExercicioC1_5;
    private javax.swing.JComboBox<String> combExercicioC1_6;
    private javax.swing.JComboBox<String> combExercicioC2;
    private javax.swing.JComboBox<String> combExercicioC2_1;
    private javax.swing.JComboBox<String> combExercicioC2_2;
    private javax.swing.JComboBox<String> combExercicioC2_3;
    private javax.swing.JComboBox<String> combExercicioC2_4;
    private javax.swing.JComboBox<String> combExercicioC2_5;
    private javax.swing.JComboBox<String> combExercicioC2_6;
    private javax.swing.JComboBox<String> combExercicioC3;
    private javax.swing.JComboBox<String> combExercicioC3_1;
    private javax.swing.JComboBox<String> combExercicioC3_2;
    private javax.swing.JComboBox<String> combExercicioC3_3;
    private javax.swing.JComboBox<String> combExercicioC3_4;
    private javax.swing.JComboBox<String> combExercicioC3_5;
    private javax.swing.JComboBox<String> combExercicioC3_6;
    private javax.swing.JComboBox<String> combExercicioC4;
    private javax.swing.JComboBox<String> combExercicioC4_1;
    private javax.swing.JComboBox<String> combExercicioC4_2;
    private javax.swing.JComboBox<String> combExercicioC4_3;
    private javax.swing.JComboBox<String> combExercicioC4_4;
    private javax.swing.JComboBox<String> combExercicioC4_5;
    private javax.swing.JComboBox<String> combExercicioC4_6;
    private javax.swing.JComboBox<String> combExercicioC5;
    private javax.swing.JComboBox<String> combExercicioC5_1;
    private javax.swing.JComboBox<String> combExercicioC5_2;
    private javax.swing.JComboBox<String> combExercicioC5_3;
    private javax.swing.JComboBox<String> combExercicioC5_4;
    private javax.swing.JComboBox<String> combExercicioC5_5;
    private javax.swing.JComboBox<String> combExercicioC5_6;
    private javax.swing.JComboBox<String> combMusculoA1;
    private javax.swing.JComboBox<String> combMusculoA2;
    private javax.swing.JComboBox<String> combMusculoA3;
    private javax.swing.JComboBox<String> combMusculoA4;
    private javax.swing.JComboBox<String> combMusculoA5;
    private javax.swing.JComboBox<String> combMusculoB1;
    private javax.swing.JComboBox<String> combMusculoB2;
    private javax.swing.JComboBox<String> combMusculoB3;
    private javax.swing.JComboBox<String> combMusculoB4;
    private javax.swing.JComboBox<String> combMusculoB5;
    private javax.swing.JComboBox<String> combMusculoC1;
    private javax.swing.JComboBox<String> combMusculoC2;
    private javax.swing.JComboBox<String> combMusculoC3;
    private javax.swing.JComboBox<String> combMusculoC4;
    private javax.swing.JComboBox<String> combMusculoC5;
    private javax.swing.JComboBox<String> combRepeticoesA1;
    private javax.swing.JComboBox<String> combRepeticoesA1_1;
    private javax.swing.JComboBox<String> combRepeticoesA1_2;
    private javax.swing.JComboBox<String> combRepeticoesA1_3;
    private javax.swing.JComboBox<String> combRepeticoesA1_4;
    private javax.swing.JComboBox<String> combRepeticoesA1_5;
    private javax.swing.JComboBox<String> combRepeticoesA1_6;
    private javax.swing.JComboBox<String> combRepeticoesA2;
    private javax.swing.JComboBox<String> combRepeticoesA2_1;
    private javax.swing.JComboBox<String> combRepeticoesA2_2;
    private javax.swing.JComboBox<String> combRepeticoesA2_3;
    private javax.swing.JComboBox<String> combRepeticoesA2_4;
    private javax.swing.JComboBox<String> combRepeticoesA2_5;
    private javax.swing.JComboBox<String> combRepeticoesA2_6;
    private javax.swing.JComboBox<String> combRepeticoesA3;
    private javax.swing.JComboBox<String> combRepeticoesA3_1;
    private javax.swing.JComboBox<String> combRepeticoesA3_2;
    private javax.swing.JComboBox<String> combRepeticoesA3_3;
    private javax.swing.JComboBox<String> combRepeticoesA3_4;
    private javax.swing.JComboBox<String> combRepeticoesA3_5;
    private javax.swing.JComboBox<String> combRepeticoesA3_6;
    private javax.swing.JComboBox<String> combRepeticoesA4;
    private javax.swing.JComboBox<String> combRepeticoesA4_1;
    private javax.swing.JComboBox<String> combRepeticoesA4_2;
    private javax.swing.JComboBox<String> combRepeticoesA4_3;
    private javax.swing.JComboBox<String> combRepeticoesA4_4;
    private javax.swing.JComboBox<String> combRepeticoesA4_5;
    private javax.swing.JComboBox<String> combRepeticoesA4_6;
    private javax.swing.JComboBox<String> combRepeticoesA5;
    private javax.swing.JComboBox<String> combRepeticoesA5_1;
    private javax.swing.JComboBox<String> combRepeticoesA5_2;
    private javax.swing.JComboBox<String> combRepeticoesA5_3;
    private javax.swing.JComboBox<String> combRepeticoesA5_4;
    private javax.swing.JComboBox<String> combRepeticoesA5_5;
    private javax.swing.JComboBox<String> combRepeticoesA5_6;
    private javax.swing.JComboBox<String> combRepeticoesB1;
    private javax.swing.JComboBox<String> combRepeticoesB1_1;
    private javax.swing.JComboBox<String> combRepeticoesB1_2;
    private javax.swing.JComboBox<String> combRepeticoesB1_3;
    private javax.swing.JComboBox<String> combRepeticoesB1_4;
    private javax.swing.JComboBox<String> combRepeticoesB1_5;
    private javax.swing.JComboBox<String> combRepeticoesB1_6;
    private javax.swing.JComboBox<String> combRepeticoesB2;
    private javax.swing.JComboBox<String> combRepeticoesB2_1;
    private javax.swing.JComboBox<String> combRepeticoesB2_2;
    private javax.swing.JComboBox<String> combRepeticoesB2_3;
    private javax.swing.JComboBox<String> combRepeticoesB2_4;
    private javax.swing.JComboBox<String> combRepeticoesB2_5;
    private javax.swing.JComboBox<String> combRepeticoesB2_6;
    private javax.swing.JComboBox<String> combRepeticoesB3;
    private javax.swing.JComboBox<String> combRepeticoesB3_1;
    private javax.swing.JComboBox<String> combRepeticoesB3_2;
    private javax.swing.JComboBox<String> combRepeticoesB3_3;
    private javax.swing.JComboBox<String> combRepeticoesB3_4;
    private javax.swing.JComboBox<String> combRepeticoesB3_5;
    private javax.swing.JComboBox<String> combRepeticoesB3_6;
    private javax.swing.JComboBox<String> combRepeticoesB4;
    private javax.swing.JComboBox<String> combRepeticoesB4_1;
    private javax.swing.JComboBox<String> combRepeticoesB4_2;
    private javax.swing.JComboBox<String> combRepeticoesB4_3;
    private javax.swing.JComboBox<String> combRepeticoesB4_4;
    private javax.swing.JComboBox<String> combRepeticoesB4_5;
    private javax.swing.JComboBox<String> combRepeticoesB4_6;
    private javax.swing.JComboBox<String> combRepeticoesB5;
    private javax.swing.JComboBox<String> combRepeticoesB5_1;
    private javax.swing.JComboBox<String> combRepeticoesB5_2;
    private javax.swing.JComboBox<String> combRepeticoesB5_3;
    private javax.swing.JComboBox<String> combRepeticoesB5_4;
    private javax.swing.JComboBox<String> combRepeticoesB5_5;
    private javax.swing.JComboBox<String> combRepeticoesB5_6;
    private javax.swing.JComboBox<String> combRepeticoesC1;
    private javax.swing.JComboBox<String> combRepeticoesC1_1;
    private javax.swing.JComboBox<String> combRepeticoesC1_2;
    private javax.swing.JComboBox<String> combRepeticoesC1_3;
    private javax.swing.JComboBox<String> combRepeticoesC1_4;
    private javax.swing.JComboBox<String> combRepeticoesC1_5;
    private javax.swing.JComboBox<String> combRepeticoesC1_6;
    private javax.swing.JComboBox<String> combRepeticoesC2;
    private javax.swing.JComboBox<String> combRepeticoesC2_1;
    private javax.swing.JComboBox<String> combRepeticoesC2_2;
    private javax.swing.JComboBox<String> combRepeticoesC2_3;
    private javax.swing.JComboBox<String> combRepeticoesC2_4;
    private javax.swing.JComboBox<String> combRepeticoesC2_5;
    private javax.swing.JComboBox<String> combRepeticoesC2_6;
    private javax.swing.JComboBox<String> combRepeticoesC3;
    private javax.swing.JComboBox<String> combRepeticoesC3_1;
    private javax.swing.JComboBox<String> combRepeticoesC3_2;
    private javax.swing.JComboBox<String> combRepeticoesC3_3;
    private javax.swing.JComboBox<String> combRepeticoesC3_4;
    private javax.swing.JComboBox<String> combRepeticoesC3_5;
    private javax.swing.JComboBox<String> combRepeticoesC3_6;
    private javax.swing.JComboBox<String> combRepeticoesC4;
    private javax.swing.JComboBox<String> combRepeticoesC4_1;
    private javax.swing.JComboBox<String> combRepeticoesC4_2;
    private javax.swing.JComboBox<String> combRepeticoesC4_3;
    private javax.swing.JComboBox<String> combRepeticoesC4_4;
    private javax.swing.JComboBox<String> combRepeticoesC4_5;
    private javax.swing.JComboBox<String> combRepeticoesC4_6;
    private javax.swing.JComboBox<String> combRepeticoesC5;
    private javax.swing.JComboBox<String> combRepeticoesC5_1;
    private javax.swing.JComboBox<String> combRepeticoesC5_2;
    private javax.swing.JComboBox<String> combRepeticoesC5_3;
    private javax.swing.JComboBox<String> combRepeticoesC5_4;
    private javax.swing.JComboBox<String> combRepeticoesC5_5;
    private javax.swing.JComboBox<String> combRepeticoesC5_6;
    private javax.swing.JFormattedTextField dtFinal;
    private javax.swing.JFormattedTextField dtInicial;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblNomeAlunoTelaTreinos;
    private javax.swing.JLabel lblObservacoesA1;
    private javax.swing.JLabel lblObservacoesA1_1;
    private javax.swing.JLabel lblObservacoesA1_2;
    private javax.swing.JLabel lblObservacoesA1_3;
    private javax.swing.JLabel lblObservacoesA1_4;
    private javax.swing.JLabel lblObservacoesA1_5;
    private javax.swing.JLabel lblObservacoesA1_6;
    private javax.swing.JLabel lblObservacoesA2;
    private javax.swing.JLabel lblObservacoesA2_1;
    private javax.swing.JLabel lblObservacoesA2_2;
    private javax.swing.JLabel lblObservacoesA2_3;
    private javax.swing.JLabel lblObservacoesA2_4;
    private javax.swing.JLabel lblObservacoesA2_5;
    private javax.swing.JLabel lblObservacoesA2_6;
    private javax.swing.JLabel lblObservacoesA3;
    private javax.swing.JLabel lblObservacoesA3_1;
    private javax.swing.JLabel lblObservacoesA3_2;
    private javax.swing.JLabel lblObservacoesA3_3;
    private javax.swing.JLabel lblObservacoesA3_4;
    private javax.swing.JLabel lblObservacoesA3_5;
    private javax.swing.JLabel lblObservacoesA3_6;
    private javax.swing.JLabel lblObservacoesA4;
    private javax.swing.JLabel lblObservacoesA4_1;
    private javax.swing.JLabel lblObservacoesA4_2;
    private javax.swing.JLabel lblObservacoesA4_3;
    private javax.swing.JLabel lblObservacoesA4_4;
    private javax.swing.JLabel lblObservacoesA4_5;
    private javax.swing.JLabel lblObservacoesA4_6;
    private javax.swing.JLabel lblObservacoesA5;
    private javax.swing.JLabel lblObservacoesA5_1;
    private javax.swing.JLabel lblObservacoesA5_2;
    private javax.swing.JLabel lblObservacoesA5_3;
    private javax.swing.JLabel lblObservacoesA5_4;
    private javax.swing.JLabel lblObservacoesA5_5;
    private javax.swing.JLabel lblObservacoesA5_6;
    private javax.swing.JLabel lblObservacoesB1;
    private javax.swing.JLabel lblObservacoesB1_1;
    private javax.swing.JLabel lblObservacoesB1_2;
    private javax.swing.JLabel lblObservacoesB1_3;
    private javax.swing.JLabel lblObservacoesB1_4;
    private javax.swing.JLabel lblObservacoesB1_5;
    private javax.swing.JLabel lblObservacoesB1_6;
    private javax.swing.JLabel lblObservacoesB2;
    private javax.swing.JLabel lblObservacoesB2_1;
    private javax.swing.JLabel lblObservacoesB2_2;
    private javax.swing.JLabel lblObservacoesB2_3;
    private javax.swing.JLabel lblObservacoesB2_4;
    private javax.swing.JLabel lblObservacoesB2_5;
    private javax.swing.JLabel lblObservacoesB2_6;
    private javax.swing.JLabel lblObservacoesB3;
    private javax.swing.JLabel lblObservacoesB3_1;
    private javax.swing.JLabel lblObservacoesB3_2;
    private javax.swing.JLabel lblObservacoesB3_3;
    private javax.swing.JLabel lblObservacoesB3_4;
    private javax.swing.JLabel lblObservacoesB3_5;
    private javax.swing.JLabel lblObservacoesB3_6;
    private javax.swing.JLabel lblObservacoesB4;
    private javax.swing.JLabel lblObservacoesB4_1;
    private javax.swing.JLabel lblObservacoesB4_2;
    private javax.swing.JLabel lblObservacoesB4_3;
    private javax.swing.JLabel lblObservacoesB4_4;
    private javax.swing.JLabel lblObservacoesB4_5;
    private javax.swing.JLabel lblObservacoesB4_6;
    private javax.swing.JLabel lblObservacoesB5;
    private javax.swing.JLabel lblObservacoesB5_1;
    private javax.swing.JLabel lblObservacoesB5_2;
    private javax.swing.JLabel lblObservacoesB5_3;
    private javax.swing.JLabel lblObservacoesB5_4;
    private javax.swing.JLabel lblObservacoesB5_5;
    private javax.swing.JLabel lblObservacoesB5_6;
    private javax.swing.JLabel lblObservacoesC1;
    private javax.swing.JLabel lblObservacoesC1_1;
    private javax.swing.JLabel lblObservacoesC1_2;
    private javax.swing.JLabel lblObservacoesC1_3;
    private javax.swing.JLabel lblObservacoesC1_4;
    private javax.swing.JLabel lblObservacoesC1_5;
    private javax.swing.JLabel lblObservacoesC1_6;
    private javax.swing.JLabel lblObservacoesC2;
    private javax.swing.JLabel lblObservacoesC2_1;
    private javax.swing.JLabel lblObservacoesC2_2;
    private javax.swing.JLabel lblObservacoesC2_3;
    private javax.swing.JLabel lblObservacoesC2_4;
    private javax.swing.JLabel lblObservacoesC2_5;
    private javax.swing.JLabel lblObservacoesC2_6;
    private javax.swing.JLabel lblObservacoesC3;
    private javax.swing.JLabel lblObservacoesC3_1;
    private javax.swing.JLabel lblObservacoesC3_2;
    private javax.swing.JLabel lblObservacoesC3_3;
    private javax.swing.JLabel lblObservacoesC3_4;
    private javax.swing.JLabel lblObservacoesC3_5;
    private javax.swing.JLabel lblObservacoesC3_6;
    private javax.swing.JLabel lblObservacoesC4;
    private javax.swing.JLabel lblObservacoesC4_1;
    private javax.swing.JLabel lblObservacoesC4_2;
    private javax.swing.JLabel lblObservacoesC4_3;
    private javax.swing.JLabel lblObservacoesC4_4;
    private javax.swing.JLabel lblObservacoesC4_5;
    private javax.swing.JLabel lblObservacoesC4_6;
    private javax.swing.JLabel lblObservacoesC5;
    private javax.swing.JLabel lblObservacoesC5_1;
    private javax.swing.JLabel lblObservacoesC5_2;
    private javax.swing.JLabel lblObservacoesC5_3;
    private javax.swing.JLabel lblObservacoesC5_4;
    private javax.swing.JLabel lblObservacoesC5_5;
    private javax.swing.JLabel lblObservacoesC5_6;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JTextField txtObservacoesA1;
    private javax.swing.JTextField txtObservacoesA1_1;
    private javax.swing.JTextField txtObservacoesA1_2;
    private javax.swing.JTextField txtObservacoesA1_3;
    private javax.swing.JTextField txtObservacoesA1_4;
    private javax.swing.JTextField txtObservacoesA1_5;
    private javax.swing.JTextField txtObservacoesA1_6;
    private javax.swing.JTextField txtObservacoesA2;
    private javax.swing.JTextField txtObservacoesA2_1;
    private javax.swing.JTextField txtObservacoesA2_2;
    private javax.swing.JTextField txtObservacoesA2_3;
    private javax.swing.JTextField txtObservacoesA2_4;
    private javax.swing.JTextField txtObservacoesA2_5;
    private javax.swing.JTextField txtObservacoesA2_6;
    private javax.swing.JTextField txtObservacoesA3;
    private javax.swing.JTextField txtObservacoesA3_1;
    private javax.swing.JTextField txtObservacoesA3_2;
    private javax.swing.JTextField txtObservacoesA3_3;
    private javax.swing.JTextField txtObservacoesA3_4;
    private javax.swing.JTextField txtObservacoesA3_5;
    private javax.swing.JTextField txtObservacoesA3_6;
    private javax.swing.JTextField txtObservacoesA4;
    private javax.swing.JTextField txtObservacoesA4_1;
    private javax.swing.JTextField txtObservacoesA4_2;
    private javax.swing.JTextField txtObservacoesA4_3;
    private javax.swing.JTextField txtObservacoesA4_4;
    private javax.swing.JTextField txtObservacoesA4_5;
    private javax.swing.JTextField txtObservacoesA4_6;
    private javax.swing.JTextField txtObservacoesA5;
    private javax.swing.JTextField txtObservacoesA5_1;
    private javax.swing.JTextField txtObservacoesA5_2;
    private javax.swing.JTextField txtObservacoesA5_3;
    private javax.swing.JTextField txtObservacoesA5_4;
    private javax.swing.JTextField txtObservacoesA5_5;
    private javax.swing.JTextField txtObservacoesA5_6;
    private javax.swing.JTextField txtObservacoesB1;
    private javax.swing.JTextField txtObservacoesB1_1;
    private javax.swing.JTextField txtObservacoesB1_2;
    private javax.swing.JTextField txtObservacoesB1_3;
    private javax.swing.JTextField txtObservacoesB1_4;
    private javax.swing.JTextField txtObservacoesB1_5;
    private javax.swing.JTextField txtObservacoesB1_6;
    private javax.swing.JTextField txtObservacoesB2;
    private javax.swing.JTextField txtObservacoesB2_1;
    private javax.swing.JTextField txtObservacoesB2_2;
    private javax.swing.JTextField txtObservacoesB2_3;
    private javax.swing.JTextField txtObservacoesB2_4;
    private javax.swing.JTextField txtObservacoesB2_5;
    private javax.swing.JTextField txtObservacoesB2_6;
    private javax.swing.JTextField txtObservacoesB3;
    private javax.swing.JTextField txtObservacoesB3_1;
    private javax.swing.JTextField txtObservacoesB3_2;
    private javax.swing.JTextField txtObservacoesB3_3;
    private javax.swing.JTextField txtObservacoesB3_4;
    private javax.swing.JTextField txtObservacoesB3_5;
    private javax.swing.JTextField txtObservacoesB3_6;
    private javax.swing.JTextField txtObservacoesB4;
    private javax.swing.JTextField txtObservacoesB4_1;
    private javax.swing.JTextField txtObservacoesB4_2;
    private javax.swing.JTextField txtObservacoesB4_3;
    private javax.swing.JTextField txtObservacoesB4_4;
    private javax.swing.JTextField txtObservacoesB4_5;
    private javax.swing.JTextField txtObservacoesB4_6;
    private javax.swing.JTextField txtObservacoesB5;
    private javax.swing.JTextField txtObservacoesB5_1;
    private javax.swing.JTextField txtObservacoesB5_2;
    private javax.swing.JTextField txtObservacoesB5_3;
    private javax.swing.JTextField txtObservacoesB5_4;
    private javax.swing.JTextField txtObservacoesB5_5;
    private javax.swing.JTextField txtObservacoesB5_6;
    private javax.swing.JTextField txtObservacoesC1;
    private javax.swing.JTextField txtObservacoesC1_1;
    private javax.swing.JTextField txtObservacoesC1_2;
    private javax.swing.JTextField txtObservacoesC1_3;
    private javax.swing.JTextField txtObservacoesC1_4;
    private javax.swing.JTextField txtObservacoesC1_5;
    private javax.swing.JTextField txtObservacoesC1_6;
    private javax.swing.JTextField txtObservacoesC2;
    private javax.swing.JTextField txtObservacoesC2_1;
    private javax.swing.JTextField txtObservacoesC2_2;
    private javax.swing.JTextField txtObservacoesC2_3;
    private javax.swing.JTextField txtObservacoesC2_4;
    private javax.swing.JTextField txtObservacoesC2_5;
    private javax.swing.JTextField txtObservacoesC2_6;
    private javax.swing.JTextField txtObservacoesC3;
    private javax.swing.JTextField txtObservacoesC3_1;
    private javax.swing.JTextField txtObservacoesC3_2;
    private javax.swing.JTextField txtObservacoesC3_3;
    private javax.swing.JTextField txtObservacoesC3_4;
    private javax.swing.JTextField txtObservacoesC3_5;
    private javax.swing.JTextField txtObservacoesC3_6;
    private javax.swing.JTextField txtObservacoesC4;
    private javax.swing.JTextField txtObservacoesC4_1;
    private javax.swing.JTextField txtObservacoesC4_2;
    private javax.swing.JTextField txtObservacoesC4_3;
    private javax.swing.JTextField txtObservacoesC4_4;
    private javax.swing.JTextField txtObservacoesC4_5;
    private javax.swing.JTextField txtObservacoesC4_6;
    private javax.swing.JTextField txtObservacoesC5;
    private javax.swing.JTextField txtObservacoesC5_1;
    private javax.swing.JTextField txtObservacoesC5_2;
    private javax.swing.JTextField txtObservacoesC5_3;
    private javax.swing.JTextField txtObservacoesC5_4;
    private javax.swing.JTextField txtObservacoesC5_5;
    private javax.swing.JTextField txtObservacoesC5_6;
    // End of variables declaration//GEN-END:variables
}
