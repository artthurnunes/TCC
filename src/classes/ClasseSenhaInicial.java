
package classes;

public class ClasseSenhaInicial {
    
    private static String usuario;
    private String senha;
    private static String nome;
    private boolean verificacao_botao;
    
    public void ClasseSenhaInicial(){
        this.verificacao_botao = false;        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public boolean getVerificacao_botao(){
        return verificacao_botao;
    }
    
    public void setVerificacao_botao(boolean verificacao_botao){
        this.verificacao_botao = verificacao_botao;
    }
    
    
    
}
