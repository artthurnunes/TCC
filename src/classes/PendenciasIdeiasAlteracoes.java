
package classes;

public class PendenciasIdeiasAlteracoes {
    
    /*   ONDE PAREI ---------------------------- 
    
    * ATUALIZAR TABELA DE DESPEZAS NO SERVICO   
    * Telas PRONTAS. Começar a fazer as PENDÊNCIAS RELEVANTES
    
    /* PENDÊNCIAS IMPORTANTES FAZER ----------------------
        * Obrigar . nos valores float (tela de planos e cadastro equipamentos, despesas programadas)
        * Digitar somente numeros no codigo do aluno na catraca
        * Travar entrada de aluno com mensalidade vencida
        * Tentar fazer a tela de alunos cadastrados ir para a tela de cadastro quando clicar no aluno(IMPORTANTE TODAS AS LISTAS VÃO USAR)
        * Criar botão de carregar foto e salvar no BD dentro campo foto (PRONTO, SO FALTA SALVAR A FOTO)
        * Tela de contato
        * Pintar a data de vermelho quando o treino do aluno estiver vencido
    */
    
    
    
    /* TESTES DE CONSISTENCIA DO BANCO
        - Treino Vencido. Ok
        - Mais de um treino cadastrado. Ok
        - Mais de um plano cadastrado para o aluno. Ok
        - Aluno Inativo. Ok
        - Aluno Ausente. Ok
        - Mensalidade Vencida. Ok
        - Conferir tela de alunos em atraso, se o valor da mensalidade 
           esta trazendo certo para mais de um registro. CORRIGIR
        - Conferir tela de mensalidade de alunos se não esta trazendo registro
           repedito no botão frente e traz. CORRIGIR
    
    
    */
    
    
    
    /* PENDÊNCIAS SEM RELEVÂNCIAS SE FUNCIONAR LEGAL....
        * Melhorar a pesquisa da tela de pagamento de mensalidade, esta trazendo valores repetidos. se resolver, 
            fazer o botão frente e traz funcionar também igual o da tela de cadastro de alunos. 
            - Este erro também esta acontecendo na tela de alunos em atrazo. 
            - Esta funcionando porém com o valor da mensalidade repedita(mensalidade) ou igual em todos (atrasos)
        * Email para recuperação de senha já está aparecendo na telinha, falta agora fazer o envio do email realmente.
        * Se der certo enviar o email, vazer verificação para prómixo login com senha nova, seja pedido para criar uma nova senha pessoal.
        * - RELATAR PROBLEMAS (Criar está tela se o envio de email funcionar.    
        * Importação e exportação de bkp do banco
        * Tentar fazer import/export/bkp do banco pela aplicação
        * Colocar mascara nos telefones do cadastro do aluno
        * Colcar mascara no campo de CEP do cadastro do aluno
        * Campos datas com mascara tentar colocar obrigatorio. como a mascara ja vem / não da como vazio. (tela de despesas, planos, cadastro equipamentos)
          (resolvi problema acima na tela de treinosA, copiar o elseif de la nas outras telas)
        

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
    
    */
    
    //FILME O PROTETOR
    
}
