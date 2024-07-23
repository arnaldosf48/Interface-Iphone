package TesteIphone.ReprodutorMusical;

public class Spotify implements ReprodutorMusical {
    @Override
    public void pausar() {
        System.out.println("Pausando musica Spotify");        
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica Spotify");        
    }
    @Override
    public void tocar(String musica) {
        System.out.println("Tocando " + musica +" Spotify");
        
    }
}
