package ProgramaFilmes;

public class FiltroRecomendacao {
    
    public void filtra(Filme meuFilme) {
       if(meuFilme.pegaMedia() >= 7){
        System.out.println("Filme recomendado");
       } else {
        System.out.println("Filme nao recomendado, esta com nota media: " + meuFilme.pegaMedia());
       }
    }

    public void filtra(Episodio episodio) {
        if(episodio.getTotalVisualizacoes() >= 100){
            System.out.println("Episodio recomendado.");
        } else {
            System.out.println("Episodio com baixo volume de visualizaçoes.");
        }
    }   
}
