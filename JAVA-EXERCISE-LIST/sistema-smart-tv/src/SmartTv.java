public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 50;
    
    public void ligarTv(){
        ligada = true;
    }

      public void desligarTv(){
        ligada = false;
    }

    public void passarCanal(){
        canal++;
    }

    public void voltarCanal(){
        canal--;
    }

    public void escolherCanal(int numCanal){
        canal = numCanal;
    }

    public void abaixarVolume(){
        volume--;
    }

    public void aumentarVolume(){
        volume++;
    }
}



