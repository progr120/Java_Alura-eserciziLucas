package ProgramaFilmes;

public class CalculadoraDeTempo {

    public double getTempoTotal(Filme meuFilme, Filme outroFilme, Serie lost) {
        meuFilme.getDuracaoEmMinutos();
        outroFilme.getDuracaoEmMinutos();
        lost.getDuracaoEmMinutos();
        double total = meuFilme.getDuracaoEmMinutos() + outroFilme.getDuracaoEmMinutos() + lost.getDuracaoEmMinutos();
        return total;
    }

}
