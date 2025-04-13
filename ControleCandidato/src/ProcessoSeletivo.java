import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) throws Exception {
    System.out.println("Processo Seletivo - Controle de Candidatos");
      String[] candidatos = {"Felipe", "Marcia", "João", "Maria", "Giovanna", "Lucas", "Ana", "Pedro", "Fernanda", "Carlos"};
      for (String candidato : candidatos){
        entrandoEmContato(candidato);
      }
    }

    static void entrandoEmContato(String candidato){
      int tentativas = 1;
      boolean continuarTentando = true;
      boolean atendido = false;
      do{
        atendido = atender();
        continuarTentando = !atendido;
        if (continuarTentando){
          tentativas++;
        }else {
          System.out.println("Contato realizado com sucesso!");
        }

      }while (continuarTentando && tentativas <= 3);
      if (atendido){
        System.out.println("Candidato " + candidato + " atendido com sucesso, na " + tentativas + " tentativa.");
      }else{
        System.out.println("Candidato " + candidato + " não atendeu após 3 tentativas.");
      }

    }

    static boolean atender(){
      return new Random().nextInt(3)==1;
    }

    static void imprimirCandidatos(String[] candidatos){
        for (int i = 0; i < candidatos.length; i++){
            System.out.println("Candidato " + (i + 1) + ": " + candidatos[i]);
        }
        for (String candidato : candidatos){
            System.out.println("Candidato: " + candidato);
        } 
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe", "Marcia", "João", "Maria", "Giovanna", "Lucas", "Ana", "Pedro", "Fernanda", "Carlos"};

        imprimirCandidatos(candidatos);
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salarioPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
            System.out.println("Parabens " + candidato + " voce foi selecionado para a proxima fase do processo seletivo!");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }

    static double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.00;
      if (salarioBase >  salarioPretendido){
        System.out.println("LIGAR PARA O CANDIDATO");
      }else if(salarioBase == salarioPretendido){
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");  
      }else{
        System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
      }
    }
}
