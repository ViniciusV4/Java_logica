import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("*******************Bem vindo ao MarkBank*******************");
        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println(nome + ", digite o tipo de conta de deseja abrir. Ex (corrente ou poupança): ");
        String conta = leitura.nextLine();
        System.out.println(nome + ", digite o valor do deposito inicial da sua conta: ");
        double saldo = leitura.nextDouble();
        int opcao = 0;
        int totalDeOperacoes = 0;
        for (int contadora = 0; contadora != 4; contadora = opcao) {
            System.out.println("*******************OPERACAO*****************************");
            System.out.println("Digite o numero da operação que deseja realizar:");
            System.out.println("1-Consultar Saldo");
            System.out.println("2-Deposito");
            System.out.println("3-Transferencia");
            System.out.println("4-Sair");
            System.out.println("");
            opcao = leitura.nextInt();
            System.out.println("************************************************************");
            if (opcao == 1) {
                System.out.println("Seu saldo atual é de: R$ " + saldo + ".");
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja depositar: R$ ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("************************************************************");
                System.out.println("Seu saldo atual é de: R$ " + saldo + ".");
            } else if(opcao == 3) {
                System.out.println("Digite o valor que deseja transferir: R$ ");
                double transferencia = leitura.nextDouble();
                if (saldo >= transferencia) {
                    saldo -= transferencia;
                    System.out.println("************************************************************");
                    System.out.println("Seu saldo atual é de: R$ " + saldo + ".");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else if (opcao == 4){
                System.out.println("Fim.");
            } else {
                System.out.println("Opção invalida.");
            }
            totalDeOperacoes++;
        }
        System.out.println("*************************FIM****************************");
        System.out.println(nome + " seu saldo atual é de: " + saldo + " seu tipo de conta é " + conta + ".");
        System.out.println("Total de operações realizadas : " + totalDeOperacoes + ".");

    }
}
