package TesteIphone.Iphone;

import TesteIphone.AparelhoTelefonico.AparelhoTelefonico;
import TesteIphone.NavegadorInternet.NavegadorInternet;
import TesteIphone.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    
    @Override
    public void adicionarNovaAba() {
        System.out.println(" Aba Iphone ");
        
    }
    @Override
    public void atualizarPAgina() {
        System.out.println(" Atualizando pagina Iphone ");        
    }
    @Override
    public void exibirPagina(String url) {
        System.out.println(" Exibindo " + url + " Iphone ");
        
    }

    @Override
    public void atender() {
        System.out.println(" Atendendo no Iphone ");
        
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println(" Correio de voz no Iphone ");
        
    }
    @Override
    public void ligar(String numero) {
        System.out.println(" ligacao de: " + numero + " no Iphone ");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println(" Selecionando musica Iphone ");
        
    }
    @Override
    public void pausar() {
        System.out.println(" Pausando musica no Iphone ");
        
    }

    @Override
    public void tocar(String musica) {
        System.out.println(" Tocando: " + musica + " Iphone ");
    }


}
