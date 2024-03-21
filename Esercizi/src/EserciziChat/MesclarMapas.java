package EserciziChat;

import java.util.Arrays;
import java.util.List;

public class MesclarMapas {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};

        System.out.println("Array: " + Arrays.toString(arr));

        List<String> lista = Arrays.asList(arr);

        System.out.println("Lista: " + lista);

        String[] novaArray = lista.toArray(new String[0]);

        System.out.println("Novo Array: " + Arrays.toString(novaArray));
    }
}
