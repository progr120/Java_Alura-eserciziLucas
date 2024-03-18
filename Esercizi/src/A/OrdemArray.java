package A;
public class OrdemArray {
    public static void main(String[] args) {
        String[] nomes = { "Armando", "Joshe", "Carmen", "Laura", "Zico", "Maria" };

        ordenaNome(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void ordenaNome(String[] arr) {
        int a = arr.length;
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                if (arr[j].compareTo(arr[j++]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j++];
                    arr[j++] = temp;
                }
            }
        }
    }
}
