package ProgramaFilmes;

public class Episodio {
    private int Numero;
    private String serie;
    private int totalVisualizacoes;
    
    public Episodio(int numero, String serie, int totalVisualizacoes) {
        Numero = numero;
        this.serie = serie;
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public void infoEpisodios(Episodio episodio) {
        System.out.println("Numero do episodio: " + episodio.getNumero());
        System.out.println("Qual a serie pertence esse episodio: " + episodio.getSerie());
        System.out.println("Total de visualizaçoes do episodio: " + episodio.getTotalVisualizacoes());
    }
}