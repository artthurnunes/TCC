
package telas_internas_main.cadastro;

import classes.ClasseCadastro;
import classes.ClasseCadastro_exercicios;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    ClasseCadastro_exercicios exercicios = new ClasseCadastro_exercicios();
    ClasseCadastro cadastro = new ClasseCadastro();
    
    private boolean carregarPrimeiraVez = true; //variavel para não carregar toda hora que clicar na aba, somente 1 vez
 
    public TelaCadastro_treino(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblNomeAlunoTelaTreinos.setText(""+cadastro.getNome());
        this.ocultaBotoesTreinoA();
        this.ocultaBotoesTreinoB();
        this.ocultaBotoesTreinoC();
        this.carregarComboGrupos();        
        
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
        Tcad_dataDataInicial = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
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
        btnSalvar = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        combRepeticoesA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA1.setText("Observações");

        combRepeticoesA1_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA1_1.setText("Observações");

        combRepeticoesA1_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA1_2.setText("Observações");

        combRepeticoesA1_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA1_3.setText("Observações");

        lblObservacoesA1_4.setText("Observações");

        combRepeticoesA1_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA1_5.setText("Observações");

        combRepeticoesA1_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesA1_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesA2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA2.setText("Observações");

        combRepeticoesA2_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA2_1.setText("Observações");

        combRepeticoesA2_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA2_2.setText("Observações");

        combRepeticoesA2_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA2_3.setText("Observações");

        lblObservacoesA2_4.setText("Observações");

        combRepeticoesA2_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA2_5.setText("Observações");

        combRepeticoesA2_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesA2_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesA3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA3.setText("Observações");

        combRepeticoesA3_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA3_1.setText("Observações");

        combRepeticoesA3_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA3_2.setText("Observações");

        combRepeticoesA3_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA3_3.setText("Observações");

        lblObservacoesA3_4.setText("Observações");

        combRepeticoesA3_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA3_5.setText("Observações");

        combRepeticoesA3_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesA3_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesA4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA4.setText("Observações");

        combRepeticoesA4_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA4_1.setText("Observações");

        combRepeticoesA4_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA4_2.setText("Observações");

        combRepeticoesA4_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA4_3.setText("Observações");

        lblObservacoesA4_4.setText("Observações");

        combRepeticoesA4_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA4_5.setText("Observações");

        combRepeticoesA4_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesA4_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesA5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA5.setText("Observações");

        combRepeticoesA5_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA5_1.setText("Observações");

        combRepeticoesA5_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA5_2.setText("Observações");

        combRepeticoesA5_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA5_3.setText("Observações");

        lblObservacoesA5_4.setText("Observações");

        combRepeticoesA5_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesA5_5.setText("Observações");

        combRepeticoesA5_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesA5_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB1.setText("Observações");

        combRepeticoesB1_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB1_1.setText("Observações");

        combRepeticoesB1_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB1_2.setText("Observações");

        combRepeticoesB1_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB1_3.setText("Observações");

        lblObservacoesB1_4.setText("Observações");

        combRepeticoesB1_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB1_5.setText("Observações");

        combRepeticoesB1_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesB1_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));
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

        combRepeticoesB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB2.setText("Observações");

        combRepeticoesB2_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB2_1.setText("Observações");

        combRepeticoesB2_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB2_2.setText("Observações");

        combRepeticoesB2_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB2_3.setText("Observações");

        lblObservacoesB2_4.setText("Observações");

        combRepeticoesB2_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB2_5.setText("Observações");

        combRepeticoesB2_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesB2_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesB3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB3.setText("Observações");

        combRepeticoesB3_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB3_1.setText("Observações");

        combRepeticoesB3_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB3_2.setText("Observações");

        combRepeticoesB3_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB3_3.setText("Observações");

        lblObservacoesB3_4.setText("Observações");

        combRepeticoesB3_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB3_5.setText("Observações");

        combRepeticoesB3_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesB3_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesB4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB4.setText("Observações");

        combRepeticoesB4_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB4_1.setText("Observações");

        combRepeticoesB4_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB4_2.setText("Observações");

        combRepeticoesB4_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB4_3.setText("Observações");

        lblObservacoesB4_4.setText("Observações");

        combRepeticoesB4_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB4_5.setText("Observações");

        combRepeticoesB4_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesB4_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesB5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB5.setText("Observações");

        combRepeticoesB5_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB5_1.setText("Observações");

        combRepeticoesB5_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB5_2.setText("Observações");

        combRepeticoesB5_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB5_3.setText("Observações");

        lblObservacoesB5_4.setText("Observações");

        combRepeticoesB5_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesB5_5.setText("Observações");

        combRepeticoesB5_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesB5_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesC1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC1.setText("Observações");

        combRepeticoesC1_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC1_1.setText("Observações");

        combRepeticoesC1_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC1_2.setText("Observações");

        combRepeticoesC1_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC1_3.setText("Observações");

        lblObservacoesC1_4.setText("Observações");

        combRepeticoesC1_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC1_5.setText("Observações");

        combRepeticoesC1_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesC1_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));
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

        combRepeticoesC2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC2.setText("Observações");

        combRepeticoesC2_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC2_1.setText("Observações");

        combRepeticoesC2_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC2_2.setText("Observações");

        combRepeticoesC2_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC2_3.setText("Observações");

        lblObservacoesC2_4.setText("Observações");

        combRepeticoesC2_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC2_5.setText("Observações");

        combRepeticoesC2_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesC2_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesC3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC3.setText("Observações");

        combRepeticoesC3_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC3_1.setText("Observações");

        combRepeticoesC3_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC3_2.setText("Observações");

        combRepeticoesC3_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC3_3.setText("Observações");

        lblObservacoesC3_4.setText("Observações");

        combRepeticoesC3_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC3_5.setText("Observações");

        combRepeticoesC3_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesC3_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesC4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC4.setText("Observações");

        combRepeticoesC4_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC4_1.setText("Observações");

        combRepeticoesC4_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC4_2.setText("Observações");

        combRepeticoesC4_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC4_3.setText("Observações");

        lblObservacoesC4_4.setText("Observações");

        combRepeticoesC4_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC4_5.setText("Observações");

        combRepeticoesC4_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesC4_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        combRepeticoesC5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC5.setText("Observações");

        combRepeticoesC5_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC5_1.setText("Observações");

        combRepeticoesC5_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC5_2.setText("Observações");

        combRepeticoesC5_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC5_3.setText("Observações");

        lblObservacoesC5_4.setText("Observações");

        combRepeticoesC5_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        lblObservacoesC5_5.setText("Observações");

        combRepeticoesC5_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

        combRepeticoesC5_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 x 12" }));

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

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnSalvar);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Novo");
        jMenuBar1.add(jMenu3);

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
                        .addComponent(Tcad_dataDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(IdTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(Tcad_dataDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeAlunoTelaTreinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IdTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }//GEN-LAST:event_combMusculoA2ActionPerformed

    private void combMusculoA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoA3ActionPerformed
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
    }//GEN-LAST:event_combMusculoA3ActionPerformed

    private void combMusculoA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoA4ActionPerformed
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
    }//GEN-LAST:event_combMusculoA4ActionPerformed

    private void combMusculoA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoA5ActionPerformed
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
    }//GEN-LAST:event_combMusculoA5ActionPerformed

    private void combMusculoB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB1ActionPerformed
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
    }//GEN-LAST:event_combMusculoB1ActionPerformed

    private void combMusculoB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB2ActionPerformed
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
    }//GEN-LAST:event_combMusculoB2ActionPerformed

    private void combMusculoB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB3ActionPerformed
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
    }//GEN-LAST:event_combMusculoB3ActionPerformed

    private void combMusculoB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB4ActionPerformed
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
    }//GEN-LAST:event_combMusculoB4ActionPerformed

    private void combMusculoB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoB5ActionPerformed
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
    }//GEN-LAST:event_combMusculoB5ActionPerformed

    private void combMusculoC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoC1ActionPerformed
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
    }//GEN-LAST:event_combMusculoC1ActionPerformed

    private void combMusculoC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoC2ActionPerformed
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
    }//GEN-LAST:event_combMusculoC4ActionPerformed

    private void combMusculoC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMusculoC5ActionPerformed
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
    }//GEN-LAST:event_combMusculoC5ActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if(IdTreino.getText() == ""){
            //insert
        }else{
            //update
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    
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
    private javax.swing.JFormattedTextField Tcad_dataDataInicial;
    private javax.swing.JTabbedPane abaTreinoA;
    private javax.swing.JTabbedPane abaTreinoB;
    private javax.swing.JTabbedPane abaTreinoC;
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
    private javax.swing.JFormattedTextField jFormattedTextField2;
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
