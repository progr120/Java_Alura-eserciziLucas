package A;
import java.util.ArrayList;
import java.util.Collections;

public class OrdemArrayList {
        public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Armando");
        nomes.add("Joshe");
        nomes.add("Carmen");
        nomes.add("Laura");
        nomes.add("Zico");
        nomes.add("Maria");

        System.out.println(nomes);

        Collections.sort(nomes);
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
