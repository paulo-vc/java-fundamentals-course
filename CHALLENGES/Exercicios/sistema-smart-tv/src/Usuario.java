public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.passarCanal();
        smartTv.passarCanal();

        System.out.println("Canal atual: " + smartTv.canal); 

        smartTv.escolherCanal(10);
        
        System.out.println("Canal atual: " + smartTv.canal); 

    }
}
