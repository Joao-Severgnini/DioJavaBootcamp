public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos

        // Tipos numéricos inteiros - byte, short, int, long
        byte idade = 20; // 8 bits, -128 a 127  (2^8)
        short ano = 2023; // 16 bits, -32.768 a 32.767 (2^16)
        int cep = 12345678; // 32 bits, -2.147.483.648 a 2.147.483.647 (2^32)
        long cpf = 12345678901L; // 64 bits, -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 (2^64)

        // Tipos numéricos reais - float, double
        float altura = 1.75f; // 32 bits, 7 dígitos decimais (2^32)
        double salario = 2500.00; // 64 bits, 15 dígitos decimais (2^64)

        // Tipos lógicos - boolean
        boolean verdadeiro = true; // 1 bit, true ou false
        boolean falso = false; // 1 bit, true ou false

        // Tipos caractere - char
        char letra = 'A'; // 16 bits, 0 a 65.535 (2^16)
        char simbolo = '@'; // 16 bits, 0 a 65.535 (2^16)
        char numero = '1'; // 16 bits, 0 a 65.535 (2^16)

        // Tipos texto - String
        String nome = "João"; // 16 bits, 0 a 65.535 (2^16)
        String sobrenome = "Silva"; // 16 bits, 0 a 65.535 (2^16)
        String endereco = "Rua das Flores, 123"; // 16 bits, 0 a 65.535 (2^16)                                                                   

        float salario1 = 2500.00f;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; Não compila, pois o número normal pode ser maior que o curto
        short numeroCurto2 = (short) numeroNormal; // Compila, mas pode perder informação, isando cast

        final double PI = 3.14; // Constante, não pode ser alterada
            // PI = 3.1415; // Não compila, pois é uma constante

        // Date dataAtual = new Date(); // Importar java.util.Date
        // System.out.println(dataAtual); // Imprime a data atual

        // Concatenação de strings  
        String nomeCompleto = nome + " " + sobrenome; // Concatena o nome e sobrenome
        System.out.println("Nome completo: " + nomeCompleto); // Imprime o nome completo
        System.out.println("Idade: " + idade); // Imprime a idade
        System.out.println("Ano: " + ano); // Imprime o ano
        System.out.println("Altura: " + altura); // Imprime a altura
        System.out.println("Salário: " + salario); // Imprime o salário
        System.out.println("CPF: " + cpf); // Imprime o CPF
        System.out.println("CEP: " + cep); // Imprime o CEP
        System.out.println("Endereço: " + endereco); // Imprime o endereço
        System.out.println("Letra: " + letra); // Imprime a letra
        System.out.println("Simbolo: " + simbolo); // Imprime o simbolo
        System.out.println("Número: " + numero); // Imprime o número
        System.out.println("Verdadeiro: " + verdadeiro); // Imprime o verdadeiro
        System.out.println("Falso: " + falso); // Imprime o falso
        System.out.println("Salário 1: " + salario1); // Imprime o salário 1
        System.out.println("Número curto: " + numeroCurto); // Imprime o número curto
        System.out.println("Número normal: " + numeroNormal); // Imprime o número normal
        System.out.println("Número curto 2: " + numeroCurto2); // Imprime o número curto 2
        System.out.println("PI: " + PI); // Imprime o PI
        // System.out.println("Data atual: " + dataAtual); // Imprime a data atual
        // System.out.println("Data atual: " + dataAtual.getTime()); // Imprime a data atual em milissegundos desde 1/1/1970    
        // ...
    }
}
