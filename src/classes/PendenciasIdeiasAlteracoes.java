
package classes;

public class PendenciasIdeiasAlteracoes {
    
    /*   ONDE PAREI ---------------------------- 

    *** Fazer BKP do banco em casa e exportar esse com a nova estrutura. TREINAMENTO
    *** Terminas de fazer a tela de salvar foto no banco. TelaCadastro / Insert / ClasseCadastro
        - Fazer Update da imagem se o aluno quiser fazer um update
    
    /* PENDÊNCIAS ----------------------  
        * Criar botão de carregar foto e salvar no BD dentro campo foto (PRONTO, SO FALTA SALVAR A FOTO)
            https://www.youtube.com/watch?v=fd9zvTW5iLc
        * Pintar a data de vermelho quando o treino do aluno estiver vencido
          --------
        * Email para recuperação de senha já está aparecendo na telinha, falta agora fazer o envio do email realmente.
        * Se der certo enviar o email, vazer verificação para prómixo login com senha 
          nova, seja pedido para criar uma nova senha pessoal.
        * - RELATAR PROBLEMAS (Criar está tela se o envio de email funcionar.    
        * Tentar fazer import/export/bkp do banco pela aplicação
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
