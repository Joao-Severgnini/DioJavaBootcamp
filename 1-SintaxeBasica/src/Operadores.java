public class Operadores {
    public static void main(String[] args) {

        // Operadores aritméticos
        int a = 10;
        int b = 20;
        int soma = a + b; // Adição
        int subtracao = a - b; // Subtração
        int multiplicacao = a * b; // Multiplicação
        int divisao = a / b; // Divisão
        int resto = a % b; // Resto da divisão
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

        // Operadores de comparação 
        boolean igual = a == b; // Igualdade
        boolean diferente = a != b; // Diferença
        boolean maior = a > b; // Maior que  
        igual = a >= b; // Maior ou igual a
        diferente = a < b; // Menor que
        maior = a <= b; // Menor ou igual a
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);

        // Operadores unarios       
        int x = 10;
        int y = 20;
        int resultado = x++; // Pós-incremento
        System.out.println("Resultado pós-incremento: " + resultado); // Imprime 10
        System.out.println("Valor de x após pós-incremento: " + x); // Imprime 11
        resultado = ++y; // Pré-incremento
        System.out.println("Resultado pré-incremento: " + resultado); // Imprime 21
        System.out.println("Valor de y após pré-incremento: " + y); // Imprime 21
        resultado = x--; // Pós-decremento
        System.out.println("Resultado pós-decremento: " + resultado); // Imprime 11
        System.out.println("Valor de x após pós-decremento: " + x); // Imprime 10
        resultado = --y; // Pré-decremento
        System.out.println("Resultado pré-decremento: " + resultado); // Imprime 20
        System.out.println("Valor de y após pré-decremento: " + y); // Imprime 20

        // Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean resultadoLogico = condicao1 && condicao2; // E lógico
        System.out.println("Resultado E lógico: " + resultadoLogico); // Imprime false
        resultadoLogico = condicao1 || condicao2; // Ou lógico
        System.out.println("Resultado Ou lógico: " + resultadoLogico); // Imprime true
        resultadoLogico = !condicao1; // Negação lógica
        System.out.println("Resultado Negação lógica: " + resultadoLogico); // Imprime false

        // Operadores de atribuição
        int z = 10;
        z += 5; // Atribuição com adição
        System.out.println("Resultado de z após atribuição com adição: " + z); // Imprime 15
        z -= 5; // Atribuição com subtração
        System.out.println("Resultado de z após atribuição com subtração: " + z); // Imprime 10
        z *= 2; // Atribuição com multiplicação
        System.out.println("Resultado de z após atribuição com multiplicação: " + z); // Imprime 20
        z /= 2; // Atribuição com divisão
        System.out.println("Resultado de z após atribuição com divisão: " + z); // Imprime 10
        z %= 3; // Atribuição com resto da divisão
        System.out.println("Resultado de z após atribuição com resto da divisão: " + z); // Imprime 1
        
        // Operadores ternários
        int idade = 18;
        String resultadoIdade = (idade >= 18) ? "Maior de idade" : "Menor de idade"; // Operador ternário
        System.out.println("Resultado do operador ternário: " + resultadoIdade); // Imprime "Maior de idade"
        
        // Operadores de precedência
        int resultadoPrecedencia = (a + b) * (x - y); // Precedência de operadores
        System.out.println("Resultado de precedência de operadores: " + resultadoPrecedencia); // Imprime 0
        
        // Operadores de atribuição compostos
        int resultadoAtribuicaoComposto = 10;
        resultadoAtribuicaoComposto += 5; // Atribuição composta com adição
        System.out.println("Resultado de atribuição composta com adição: " + resultadoAtribuicaoComposto); // Imprime 15
        resultadoAtribuicaoComposto -= 5; // Atribuição composta com subtração
        System.out.println("Resultado de atribuição composta com subtração: " + resultadoAtribuicaoComposto); // Imprime 10
        resultadoAtribuicaoComposto *= 2; // Atribuição composta com multiplicação
        System.out.println("Resultado de atribuição composta com multiplicação: " + resultadoAtribuicaoComposto); // Imprime 20
        resultadoAtribuicaoComposto /= 2; // Atribuição composta com divisão
        System.out.println("Resultado de atribuição composta com divisão: " + resultadoAtribuicaoComposto); // Imprime 10
        resultadoAtribuicaoComposto %= 3; // Atribuição composta com resto da divisão
        System.out.println("Resultado de atribuição composta com resto da divisão: " + resultadoAtribuicaoComposto); // Imprime 1
        
        // Operadores de comparação
        boolean resultadoComparacao = (a == b); // Igualdade
        System.out.println("Resultado de comparação de igualdade: " + resultadoComparacao); // Imprime false
        resultadoComparacao = (a != b); // Diferença
        System.out.println("Resultado de comparação de diferença: " + resultadoComparacao); // Imprime true
        resultadoComparacao = (a > b); // Maior que
        System.out.println("Resultado de comparação maior que: " + resultadoComparacao); // Imprime false
        resultadoComparacao = (a < b); // Menor que
        System.out.println("Resultado de comparação menor que: " + resultadoComparacao); // Imprime true
        resultadoComparacao = (a >= b); // Maior ou igual a
        System.out.println("Resultado de comparação maior ou igual a: " + resultadoComparacao); // Imprime false
        resultadoComparacao = (a <= b); // Menor ou igual a
        System.out.println("Resultado de comparação menor ou igual a: " + resultadoComparacao); // Imprime true


    }
}
