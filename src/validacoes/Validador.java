package validacoes;

public class Validador {
    public static void validar(Object obj) throws Exception {
        ValidadorNaoNulo.validarNaoNulo(obj);
        ValidadorIdade.validarIdade(obj);
        ValidadorEmail.validarEmail(obj);

    }
}
