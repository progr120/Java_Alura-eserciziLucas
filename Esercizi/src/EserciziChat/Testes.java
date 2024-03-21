package EserciziChat;
public class Testes {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(null, 0, null);

        p.setNome("Mané");
        p.setProfissao("Cantor");
        p.setIdade(24);

        p.printInfo();

        p.fazAniversario();

        p.printInfo();
    }
}
