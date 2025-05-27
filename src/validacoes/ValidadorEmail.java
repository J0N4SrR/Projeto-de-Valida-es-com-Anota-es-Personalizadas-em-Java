package validacoes;

import anotacoes.EmailValido;
import anotacoes.NaoNulo;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorEmail {
    public static void validarEmail(Object obj) throws Exception {
        Class<?> classe = obj.getClass();
        for(Field campo : classe.getDeclaredFields()){
            campo.setAccessible(true); // quebra o encapsulamento

            if(campo.isAnnotationPresent(EmailValido.class)){
                Object valor = campo.get(obj);
                if (valor instanceof String email){
                    String emailRegex =  "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}(\\.[a-z]{2,})?$";
                Pattern pattern = Pattern.compile(emailRegex );
                Matcher matcher = pattern.matcher(email);
                    if (!matcher.matches()) {
                        throw new Exception("Campo " + campo.getName() + " possui um e-mail inválido");
                }
            } else {
                    throw new Exception("Campo " + campo.getName() + " possui um e-mail inválido");
                }
            }
        }
    }
}
