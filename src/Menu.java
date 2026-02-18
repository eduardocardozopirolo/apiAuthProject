import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Nome:           Eduardo Pirolo");
        System.out.println("Tipo conta:     Conta Corrente");
        double saldoInicial = 2500;
        System.out.println("Saldo Inicial: " + saldoInicial);
        System.out.println("******************************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println();
            System.out.println("1. Consultar Saldos");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.printf("Seu saldo é: %.2f%n", saldoInicial);
            } else if (opcao == 2) {
                System.out.print("Digite o valor que quer adicionar: ");
                double valorRecebido = scanner.nextDouble();
                saldoInicial += valorRecebido;
                System.out.printf("Agora você tem: %.2f%n", saldoInicial);
            } else if (opcao == 3) {
                System.out.print("Digite o valor que quer transferir: ");
                double valorTransferido = scanner.nextDouble();
                if (valorTransferido <= saldoInicial) {
                    saldoInicial -= valorTransferido;
                    System.out.printf("Você transferiu: %.2f%n", valorTransferido);
                    System.out.printf("Agora você tem: %.2f%n", saldoInicial);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (opcao == 4) {
                System.out.println("Você saiu!");
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}