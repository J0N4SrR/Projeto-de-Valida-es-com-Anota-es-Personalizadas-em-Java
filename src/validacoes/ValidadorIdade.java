package validacoes;

import anotacoes.IdadeMinima;
import java.lang.reflect.Field;

public class ValidadorIdade {
    public static void validarIdade(Object obj) throws Exception {
        Class<?> classe = obj.getClass();
        for(Field campo : classe.getDeclaredFields()){
            campo.setAccessible(true);

            if(campo.isAnnotationPresent(IdadeMinima.class)){
                Object valor = campo.get(obj);
                try {
                    int idade = Integer.parseInt(String.valueOf(valor));
                    if (idade < 18) {
                        throw new Exception("Campo " + campo.getName() + " não pode ser menor que 18");
                    }
                }catch (NumberFormatException e) {
                        throw new Exception("Campo " + campo.getName() + " não contém um número válido");
                    }
                }
            }
        }
}

