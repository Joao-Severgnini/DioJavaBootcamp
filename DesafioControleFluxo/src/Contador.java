import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            // Tentamos contar e se não for possível, lançamos uma exceção
            // que será tratada no bloco catch
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem; i++) {
                System.out.println("Contando: " + (i+1));
                try {
                    Thread.sleep(1000); // Pausa de 1 segundo entre as contagens
                } catch (InterruptedException e) {
                    System.out.println("Erro ao pausar a contagem: " + e.getMessage());
                }
            }
        }
    }
}
