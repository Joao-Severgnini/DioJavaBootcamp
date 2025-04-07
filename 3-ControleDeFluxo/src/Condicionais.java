public class Condicionais {
    public static void main(String[] args) throws Exception {
    // Estruturas Condicionais
    // if, else if, else, switch, case, default
    // if (condição) { bloco de código } else { bloco de código }
    // if (condição) { bloco de código } else if (condição) { bloco de código } else { bloco de código }
    // switch (variável) { case valor: bloco de código; break; default: bloco de código; }7
    
    // Exemplo de if, else if, else
        int idade = 18;
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        // Exemplo de switch, case, default
        String dia = "segunda-feira";
        switch (dia) {
            case "segunda-feira":
                System.out.println("Hoje é segunda-feira");
                break;
            case "terça-feira":
                System.out.println("Hoje é terça-feira");
                break;
            case "quarta-feira":
                System.out.println("Hoje é quarta-feira");
                break;
            case "quinta-feira":
                System.out.println("Hoje é quinta-feira");
                break;
            case "sexta-feira":
                System.out.println("Hoje é sexta-feira");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
