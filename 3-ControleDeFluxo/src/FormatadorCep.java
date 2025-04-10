public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765067");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcecao e) {
            // TODO Auto-generated catch block
            System.out.println("O cep informado é inválido");
        }
    }
    static String formatarCep (String cep) throws CepInvalidoExcecao {
        if (cep.length() != 8) {
            throw new CepInvalidoExcecao();
        }
        return String.format("%s-%s", cep.substring(0, 5), cep.substring(5));
    }
}
