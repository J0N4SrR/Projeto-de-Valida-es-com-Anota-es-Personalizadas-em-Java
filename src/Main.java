import org.classes.Usuario;
import validacoes.ValidadorIdade;
import validacoes.ValidadorNaoNulo;


public class Main {
    public static void main(String[] args) throws Exception {

        Usuario teste = new Usuario("Jay","kkk@gmail.com", 19);
        Usuario teste1 = new Usuario(null,"kkk@gmail.com", 18);
        Usuario teste2 = new Usuario("Jay",null, 18);
        Usuario teste3 = new Usuario(null,null, 17);


    }
}
