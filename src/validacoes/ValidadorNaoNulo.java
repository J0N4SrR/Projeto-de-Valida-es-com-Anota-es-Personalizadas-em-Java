package validacoes;

import anotacoes.NaoNulo;
import org.classes.Usuario;
import java.lang.reflect.Field;

public class ValidadorNaoNulo {
    public static void validarNaoNulo(Object obj) throws Exception {
        Class<?> classe = obj.getClass();
        for(Field campo : classe.getDeclaredFields()){
            campo.setAccessible(true);

            if(campo.isAnnotationPresent(NaoNulo.class)){
                Object valor = campo.get(obj);
                if(valor == null){
                    throw new Exception("Campo "+ campo.getName()+" não pode ser nulo");
                }

            }
        }
    }
}
