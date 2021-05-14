public class ControleSamsung implements Controlador {

    //1ºatributos
    private int volume;
    private boolean ligado;
    private boolean mudo;

    //2º métodos construtores
    public ControleSamsung(){
        this.volume = 20;
        this.ligado = false;
        this.mudo = false;
    }
    //3º métodos específicos da classe
    public void executarComando(String comando) {
        String comandoFinal = "Samsung: " + comando;
        System.out.println(comandoFinal);
    }

    @Override
    public void ligar() {
        executarComando("ligou a TV");
        this.ligado = true;
    }

    @Override
    public void desligar() {
        executarComando("desligou a TV");
        this.ligado = false;
    }

    @Override
    public void abrirMenu() {
        executarComando("abriu o menu");
    }

    @Override
    public void fecharMenu() {
        executarComando("fechou o menu");
    }

    private void exibirInformacoes(){
        System.out.println("Volume:" + this.volume + "%");
        if(mudo){
            System.out.println("MUDO ESTÁ ATIVADO");
        }        
    }

    @Override
    public void aumentarVolume() {        
        if(this.volume < 90){
            executarComando("aumento o volume");
            //this.volume = volume+10;
            this.volume +=10;
        }
        this.exibirInformacoes();
    }

    @Override
    public void diminuirVolume() {        
        if(this.volume >= 10){
            executarComando("diminuiu o volume");
            this.volume -=10;
        }
        this.exibirInformacoes();
    }

    @Override
    public void ligarMudo() {        
        if(this.mudo == false){
            executarComando("ligo o modo mudo");
            this.mudo = true;
        }        
    }

    @Override
    public void desligarMudo() {        
        if(this.mudo == true){
            executarComando("desligou o modo mudo");
            this.mudo = false;
        }        
    }

    //4º métodos getters e setters
    public int getVolume(){
        return this.volume;
    }
    
    

}
