
package classes;

public class PendenciasIdeiasAlteracoes {
    
    /*   ONDE PAREI ----------------------------
    FAZER    
    
    2) COMEÇAR A TELA DE RECEBIMENTO DE MENSALIDADES
        * A tela de mensalidades usar esta mesma tabela, só salvando a data de pagamento e o valor pago e já gerando 
        uma nova linha na tabela para o mes seguinte para mnater o historico de pagamentos.
        UPDATE TB_HISTORICO_PAGAMENTOS_ALUNOS SET VALOR_PAGO = ??,DT_PAGAMENTO = ?? WHERE CD_REGISTRO = 3 AND DT_PAGAMENTO IS NULL;
    
        
    * A tela de Situação financeira pode usar o total de alunos em atraso também para calcular uma probabilidade.
 

    
    
    */
    
    /* TESTES DE CONSISTENCIA DO BANCO
        - Treino Vencido. Ok
        - Mais de um treino cadastrado. Ok
        - Mais de um plano cadastrado para o aluno. Ok
        - Aluno Inativo. Ok
        - Aluno Ausente. Ok
        - Mensalidade Vencida. Ok
    
    
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
        * Colocar mascara nos telefones do cadastro do aluno
        * Colcar mascara no campo de CEP do cadastro do aluno
        * Pintar a data de vermelho quando o treino do aluno estiver vencido
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
     - Quando o aluno muda de plano, o proximo vencimento não é alterado, so altera valor e dia de vencimento caso haja diferença
     - Aluno sem treino aparece data em braco. Dança por exemplo não tem treino.
     - O aluno com até 7 dias está na lista de alunos frequentes. passado disso vai para lista de ausencia
    
    
    
    
    
    
    */
    
    /* PROBLEMAS PORÉM ESTÁ FUNCIONANDO
    - Problemas para trazer a data do vencimento do treino quando o aluno tem mais de 1 treino cadastrado. Ele 
    esta trazendo todos as datas dos treinos.
    */
    
    //FILME O PROTETOR
    
}
