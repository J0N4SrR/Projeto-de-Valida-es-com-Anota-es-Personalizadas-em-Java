import org.classes.Usuario;
import validacoes.Validador;
import validacoes.ValidadorIdade;
import validacoes.ValidadorNaoNulo;


public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String CYAN = "\u001B[36m";
    public static void main(String[] args) throws Exception {
            Usuario[] usuarios = {
                    new Usuario("Fay", "fay@gmail.com", 19),
                    new Usuario("Hay", 11, 93489189,"hay@gmail.com", 19),
                    new Usuario(null, "kkk@gmail.com", 18),
                    new Usuario("Tay", 0, 0,"tay@gmail.com", 59),
                    new Usuario("May", 22, 999999999,"May@@gmail.com", 19),
                    new Usuario("Jay", null, 18),
                    new Usuario("Cay", ".com@ggg@.", 20),
                    new Usuario("Pay", "pay@yahoo.com", 16)
            };

            for (Usuario u : usuarios) {

                System.out.println(CYAN + "Validando usuário: " + (u.getNome()) + "..." + RESET);
                Thread.sleep(800);
                try {
                    System.out.println("   ➤ Verificando campos obrigatórios...");
                    Thread.sleep(400);
                    System.out.println("   ➤ Verificando e-mail...");
                    Thread.sleep(400);
                    System.out.println("   ➤ Verificando idade mínima...");
                    Thread.sleep(400);
                    Validador.validar(u);
                    System.out.println(GREEN + "Usuário válido!\n" + RESET);
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(RED + "Erro de validação: " + e.getMessage() + "\n" + RESET);
                    Thread.sleep(400);
                }


            }
    }
}
