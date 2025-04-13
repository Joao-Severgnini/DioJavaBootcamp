import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Salário: ");
    float valorSalario = scanner.nextFloat();

    System.out.print("Benefício: ");
    float valorBeneficio = scanner.nextFloat();

    float valorImposto = 0;
    if (valorSalario >= 0 && valorSalario <= 1100) {
      valorImposto = 0.05F * valorSalario;
    } else if (valorSalario > 1100 && valorSalario <= 2500) {
      valorImposto = 0.10F * valorSalario;
    } else {
      valorImposto = 0.15F * valorSalario;
    }

    float valortotal = valorSalario - valorImposto + valorBeneficio;
    System.out.printf("O valor total será: %.2f", valortotal);
    System.out.println();
    scanner.close();
  }
}
