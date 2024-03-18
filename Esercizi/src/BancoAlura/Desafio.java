package BancoAlura;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Maria";
        String tipoConta = "Corrente";
        double saldo = 1999.99;
        int opcao = 0;

        System.out.println("----------------------------");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("----------------------------");

        String menu = """

                ** Digite sua opçao **

                1 - Consultar saldo
                2 - Tranferir valor
                3 - Receber Valor
                4 - Sair

                """;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("O valor da tranferencia é maior que o saldo.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = sc.nextDouble();

                saldo += valor;

                System.out.println("Novo saldo: " + saldo);
            } else if(opcao != 4){
                System.out.println("Opcao invalida.");
            }
        }
    }
}
