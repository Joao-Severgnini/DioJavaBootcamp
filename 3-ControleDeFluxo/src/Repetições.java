public class Repetições {
    public static void main(String[] args) {
        // Estruturas de Repetição
        // for, while, do while
        // for (inicialização; condição; incremento) { bloco de código }
        // while (condição) { bloco de código }
        // do { bloco de código } while (condição);
        
        // Exemplo de for
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i: " + i);
        }

        // Exemplo de while
        int j = 0;
        while (j < 10) {
            System.out.println("Valor de j: " + j);
            j++;
        }

        // Exemplo de do while
        int k = 0;
        do {
            System.out.println("Valor de k: " + k);
            k++;
        } while (k < 10);

        // Exemplo de for each          
        String[] nomes = {"João", "Maria", "José"};
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
        // Exemplo de break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Sai do loop quando i é igual a 5
            }
            System.out.println("Valor de i: " + i);
        }
        // Exemplo de continue  
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Pula a iteração quando i é igual a 5
            }
            System.out.println("Valor de i: " + i);
        }
        // Exemplo de break em loop aninhado
        for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {
                if (i == 1 && l == 1) {
                    break; // Sai do loop interno quando i é igual a 1 e j é igual a 1
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        // Exemplo de continue em loop aninhado
        for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {
                if (i == 1 && l == 1) {
                    continue; // Pula a iteração do loop interno quando i é igual a 1 e j é igual a 1
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        // Exemplo de break em loop aninhado com rótulo
        outerLoop: for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {
                if (i == 1 && l == 1) {
                    break outerLoop; // Sai do loop externo quando i é igual a 1 e j é igual a 1
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        // Exemplo de continue em loop aninhado com rótulo
        outerLoop: for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {
                if (i == 1 && l == 1) {
                    continue outerLoop; // Pula a iteração do loop externo quando i é igual a 1 e j é igual a 1
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

    }
}
