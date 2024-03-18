package ProgramaFilmes;

public class Serie {
    private String nome;
    private int anoDeLancamento;
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    
    public Serie(String nome, int anoDeLancamento, int temporadas, int episodiosPorTemporada, int minutosPorEpisodio) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
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

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome da série: " + getNome());
        System.err.println("Ano de lançamento: " + getAnoDeLancamento());
        System.err.println("Temporadas: " + getTemporadas());
        System.err.println("Episodios por temporada: " + getEpisodiosPorTemporada());
        System.err.println("Minutos por episodio: " + getMinutosPorEpisodio());
        System.err.println("Duraçao para maratonar a série: " + getDuracaoEmMinutos() + " minutos.");
    }

    public int getDuracaoEmMinutos() {
        int duraçao;
        duraçao = getTemporadas() * getEpisodiosPorTemporada() * getMinutosPorEpisodio();
        return duraçao;
    }
}