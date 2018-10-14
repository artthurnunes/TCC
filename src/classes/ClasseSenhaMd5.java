
package classes;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class ClasseSenhaMd5 {
    
//    private static String converter = "";
//
//    private String getConverter() {
//        return converter;
//    }
//
//    private void setConverter(String converter) {
//        this.converter = converter;
//    }
    
    public String converterSenha(String senha) throws NoSuchAlgorithmException{
       MessageDigest m=MessageDigest.getInstance("MD5");
       m.update(senha.getBytes(),0,senha.length());
       
       return new BigInteger(1,m.digest()).toString(16);
    }    
}
