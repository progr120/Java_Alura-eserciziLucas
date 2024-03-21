package EserciziChat;

import java.util.HashMap;
import java.util.Map;

public class ContagemdePalavras {
    public static void main(String[] args) {
        String frase = "o rato roeu a roupa do rei de roma a rainha buscando vingança pegou o rato e o matou";

        String[] palavras = frase.split(" ");
        Map<String, Integer> contagem = new HashMap<>();

        for (String palavra : palavras) {
            if (contagem.containsKey(palavra)) {
                contagem.put(palavra, contagem.get(palavra) + 1);
            } else {
                contagem.put(palavra, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
