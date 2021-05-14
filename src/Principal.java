public class Principal {

    public static void main(String[] args) {
        ControleSamsung controleSamsung = new ControleSamsung();
        controleSamsung.ligar();
        controleSamsung.aumentarVolume();
        controleSamsung.aumentarVolume();
        controleSamsung.ligarMudo();
        controleSamsung.aumentarVolume();        

        controleSamsung.desligar();

        ControleLg controleLg = new ControleLg();
        controleLg.ligar();
    }
    
}
