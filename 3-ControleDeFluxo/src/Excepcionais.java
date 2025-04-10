import java.util.Scanner;

public class Excepcionais {
public static void main(String[] args) {
    // Estruturas Excepcionais
    // try, catch, finally, throw, throws
    // try { bloco de código } catch (exceção) { bloco de código } finally { bloco de código }
    // throw new exceção("mensagem de erro")
    // throws exceção

    // Exemplo de try, catch, finally
    try {
        int[] numeros = {1, 2, 3};
        System.out.println(numeros[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Erro: " + e.getMessage());
    } finally {
        System.out.println("Bloco finally executado");
    }

    // Exemplo de throw
    try {
        throw new Exception("Exceção lançada");
    } catch (Exception e) {
        System.out.println("Erro: " + e.getMessage());
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String nome = scanner.nextLine();
    System.out.println("Digite seu sobrenome:");
    String sobrenome = scanner.nextLine();
    System.out.println("Digite sua idade:");
    int idade = scanner.nextInt();
    System.out.println("Digite sua altura:");
    double altura = scanner.nextDouble();

    System.out.println("Nome: " + nome);
    System.out.println("Sobrenome: " + sobrenome);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);

    scanner.close();
}
}
