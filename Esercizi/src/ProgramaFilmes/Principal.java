package ProgramaFilmes;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("a", 0, 0);
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.setAvalia(8);
        meuFilme.setAvalia(5);
        meuFilme.setAvalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Nota media do filme: " + meuFilme.pegaMedia());

        System.out.println("\n\n");
        Serie lost = new Serie("",0,0,0,0);
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();

        System.out.println("\n\n");
        Filme outroFilme = new Filme("",0,0);
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.exibeFichaTecnica();

        System.out.println("\n\n");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        System.out.println("Tempo total de series e filmes: " + calculadora.getTempoTotal(meuFilme, outroFilme, lost));

        System.out.println("\n\n");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.println(meuFilme.getNome());
        filtro.filtra(meuFilme);
        System.out.println(outroFilme.getNome());
        filtro.filtra(outroFilme);

        System.out.println("\n\n");
        Episodio episodio = new Episodio(0, "", 0);
        Episodio episodio2 = new Episodio(1, "SerieTeste", 50);
        episodio.setNumero(1);
        episodio.setSerie("lost");
        episodio.setTotalVisualizacoes(300);
        episodio.infoEpisodios(episodio);
        filtro.filtra(episodio);
        System.out.println("\n\n");
        episodio.infoEpisodios(episodio2);
        filtro.filtra(episodio2);

        System.out.println("\n\n");
    }
}