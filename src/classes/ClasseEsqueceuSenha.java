
package classes;

//Classe extendendo SenhaInicial para usar os atributos
public class ClasseEsqueceuSenha extends ClasseSenhaInicial {

    private static String email;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
}
