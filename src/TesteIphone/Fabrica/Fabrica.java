package TesteIphone.Fabrica;

import TesteIphone.Iphone.Iphone;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        //Iphone spot = new ReprodutorMusical();


       

        iphone.adicionarNovaAba();
        iphone.atualizarPAgina();
        iphone.exibirPagina("youtube.com");

        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar("40028922");

        iphone.selecionarMusica();
        iphone.pausar();
        iphone.tocar("lady gaga");
    }
    
}
