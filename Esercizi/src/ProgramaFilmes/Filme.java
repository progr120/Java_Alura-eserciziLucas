package ProgramaFilmes;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private int avalia;
    private int total;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getAvalia() {
        return avalia;
    }

    public void setAvalia(int avalia) {
        total++;
        this.avalia += avalia;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
        System.out.println("Duraçao do filme: " + getDuracaoEmMinutos() + " minutos.");
    }

    public int getTotalDeAvaliacoes() {
        return total;
    }
    public int pegaMedia() {
        return getAvalia() / 3;
    }
}
