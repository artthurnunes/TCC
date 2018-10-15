
package classes;

public class PendenciasIdeiasAlteracoes {
    
    /*   ONDE PAREI ---------------------------- 

    *** MATER O BANCO PRODUÇÃO COM DADOS REAIS. TESTES USAR O BANCO TREINAMENTO
    * Adicionar as referencias do videos do youtube na parte escrita
    
    
    
    
    /* PENDÊNCIAS ----------------------  
          --------
        * - RELATAR PROBLEMAS (Criar está tela se o envio de email funcionar.
        * Import Banco de Dados
    */
    
    /* PROBLEMAS
        - PROBLEMA PARA TRAZER O TREINO MAIS RECENTE. QUANDO ALUNO TEM UM TREINO VENCIDO E E FEITO UM TREINO
       NOVO, AINDA ESTA TRAZENDO O ANTIGO.(TELALISTAALUNOSFREQUENTES)
    
    */

    /* TESTES DE CONSISTENCIA DO BANCO
        - Treino Vencido. Ok
        - Mais de um treino cadastrado. Ok
        - Mais de um plano cadastrado para o aluno. Ok
        - Aluno Inativo. Ok
        - Aluno Ausente. Ok
        - Mensalidade Vencida. Ok
        - Bloqueio de entrada de aluno em débito - Ok
        - Conferir tela de alunos em atraso, se o valor da mensalidade 
           esta trazendo certo para mais de um registro. Ok
        - Conferir tela de mensalidade de alunos se não esta trazendo registro
           repedito no botão frente e traz. Ok
        - Testar alteração de senha 
        - Criação de novo usuário
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
    
}
