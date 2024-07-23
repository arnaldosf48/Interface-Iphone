package TesteIphone.AparelhoTelefonico;

public class TecladoNumerico implements AparelhoTelefonico {
    @Override
    public void atender() {
        System.out.println("Atendendo cahamda");
        
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        
    }
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para : " + numero);
        
    }
}
