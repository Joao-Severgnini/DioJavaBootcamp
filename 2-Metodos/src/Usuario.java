public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.mostrarStatus();
        smartTv.ligar();
        smartTv.mostrarStatus();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(10);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mostrarStatus();
        smartTv.desligar();
    }
}