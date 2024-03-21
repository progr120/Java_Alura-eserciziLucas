package EserciziChat;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void printInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Profissao: " + getProfissao());
        System.out.println("Idade: " + getIdade());
    }

    public void fazAniversario(){
        idade++;
    }
}
