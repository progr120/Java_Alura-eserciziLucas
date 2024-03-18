package BancoAluraPessoal;

import java.util.Scanner;

public class MenuBanco {
    public static void main(String[] args) {
        MetodosBanco conta = new MetodosBanco("Maria", "Corrente", 2500);
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("*********************************************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("\nNome: " + conta.getNome());
        System.out.println("Tipo conta: " + conta.getTipoConta());
        System.out.println("Saldo inicial: " + conta.getSaldo() + "\n");
        System.out.println("*********************************************");

        while (continuar) {
            int opcaoMenu = menuBanco(sc);

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor a receber: ");
                    double receber = sc.nextDouble();
                    conta.setSaldo(conta.getSaldo() + receber);
                    System.out.println("Recebimento aprovado.");
                    break;
                case 3:
                    System.out.println("Digite o valor a enviar: ");
                    double enviar = sc.nextDouble();
                    if (conta.getSaldo() >= enviar) {
                        conta.setSaldo(conta.getSaldo() - enviar);
                        System.out.println("Transferência concluída.");
                    } else {
                        System.out.println("Você não possui esse valor na conta.");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado pela visita, volte sempre.");
                    continuar = false; // Saída do loop
                    break;
                default:
                    System.out.println("Essa não é uma opção do menu.");
            }
        }
        sc.close(); // Fechar o scanner
    }

    public static int menuBanco(Scanner sc) {
        System.out.println("\n\nOperações\n");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair \n");
        System.out.println("Digite a opção desejada: ");
        return sc.nextInt();
    }
}