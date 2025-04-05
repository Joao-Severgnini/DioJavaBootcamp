import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha pendente

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia+ 
        ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
