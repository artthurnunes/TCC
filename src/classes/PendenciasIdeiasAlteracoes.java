
package classes;

public class PendenciasIdeiasAlteracoes {
    
    /*   ONDE PAREI ----------------------------
    FAZER    
        
    1) COMEÇAR UM BANCO NOVO COM DADOS REAIS PARA TESTES SE ESTÁ TUDO FUNCIONANDO. SALVAR PELO MENOS 5 REGISTROS
       DE CADA TELA. ANOTAR OS CAMPOS OBRIGATORIOS E AS OBSERVAÇÕES DE CADA TELA PARA ESCREVER NA PARTE ESCRITA. 
        - NA PARTE FINANCEIRA, CADASTRAR ALUNOS QUE A MENSALIDADE JÁ VENCEU. 
        - NOS PLANOS, CADASTRAR PLANOS PARA OS ALUNOS E ATUALIZAR PLANOS PARA FICAR COM MAIS DE UM PLANO E VER SE ESTA 
          PUXANDO SOMENTE O ULTIMO.
        - NA CATRACA, CADASTRAR ALUNOS COM MAIS DE 7 DIAS DE AUSENCIA. 
        - TELA DE TREINOS, FAZER MAIS DE UM TREINO PRA VER SE ESTA PUXANDO O VENCIMENTO SOMENTE DO ULTIMO TREINO
          NA TELA DE FREQUENCIA DO ALUNO E FAZER TAMBÉM ALUNOS COM TREINOS ATRASADOS.
        - NA TELA DE ALUNOS FREQUENTES, TESTAR SE O GROUP BY ESTÁ FUNCIONANDO CORRETAMENTE
        - FAZER UPDATE PARA QUE EXISTA ALUNOS ATRASADOS NA MENSALIDADE E ALUNOS COM MAIS DE 7 DIAS DE FALTA
        - CADASTRAR DESPESAS PROGRAMADAS E NÃO PROGRAMADAS, PAGAS E NÃO PAGAS
    
    2) COMEÇAR A TELA DE RECEBIMENTO DE MENSALIDADES
        * A tela de mensalidades usar esta mesma tabela, só salvando a data de pagamento e o valor pago e já gerando 
        uma nova linha na tabela para o mes seguinte para mnater o historico de pagamentos.
        UPDATE TB_HISTORICO_PAGAMENTOS_ALUNOS SET VALOR_PAGO = ??,DT_PAGAMENTO = ?? WHERE CD_REGISTRO = 3 AND DT_PAGAMENTO IS NULL;
    
        
    * A tela de Situação financeira pode usar o total de alunos em atraso também para calcular uma probabilidade.
 

    
    
    */
    
    
    
    
    /* PENDÊNCIAS SEM RELEVÂNCIAS SE FUNCIONAR LEGAL....
        * Fazer histórico (de treinos)
        * Verificar a possibilidade de criar barra de rolagem nas telas para resoluções de telas menores. 800x600 corta
        * Email para recuperação de senha já está aparecendo na telinha, falta agora fazer o envio do email realmente.
        * Se der certo enviar o email, vazer verificação para prómixo login com senha nova, seja pedido para criar uma nova senha pessoal.
        * Criar botão de carregar foto e salvar no BD dentro campo foto
        * Importação e exportação de bkp do banco
        * Tentar fazer import/export/bkp do banco pela aplicação
        * - RELATAR PROBLEMAS (Criar está tela se o envio de email funcionar.
        * Fazer uma telinha no canto inferior direito sempre aparecendo com o nome dos alunos que estão para vencer 
           o treino e os alunos que faz tempo que não vão para academia de acordo com a catraca 
        * Travar entrada de aluno com mensalidade vencida
        * Fazer botão frente e traz nas telas de despezas 
    */
    
    
    /* PENDÊNCIAS IMPORTANTES FAZER ----------------------
        * Obrigar . nos valores float (tela de planos e cadastro equipamentos, despesas programadas)
        * Campos datas com mascara tentar colocar obrigatorio. como a mascara ja vem / não da como vazio. (tela de despesas, planos, cadastro equipamentos)
          (resolvi problema acima na tela de treinosA, copiar o elseif de la nas outras telas)
        * Digitar somente numeros no codigo do aluno na catraca
        * Tentar fazer a tela de alunos cadastrados ir para a tela de cadastro quando clicar no aluno(IMPORTANTE TODAS AS LISTAS VÃO USAR)
    */
    
    
    /*
        PADRÃO DE VARIAVEIS - Tcad_txtNome (nometela_tipocampNOMECAMPO)
    */
       
    
    /*
    LEMBRAR
        * Email deve ser obrigatorio na criação de usuário para recuperação de senha.
        * Usuario deve ser unico
    */
    
    /*
    PONTOS LEGAIS PARA DIZER NA PARTE ESCRITA E NA APRESENTAÇÃO
    * 
     - A area de cadastro de Membros e exercicios ja corrige para salvar tudo em MAIUSCULO
     - Falar sobrea as diversas formas de manipular dados entre as classes, com array(tela novouserpass), com retorno, com getter e setter
    */
    
    /* PROBLEMAS PORÉM ESTÁ FUNCIONANDO
    - Problemas para trazer a data do vencimento do treino quando o aluno tem mais de 1 treino cadastrado. Ele 
    esta trazendo todos as datas dos treinos.
    */
    
    //FILME O PROTETOR
    
}
