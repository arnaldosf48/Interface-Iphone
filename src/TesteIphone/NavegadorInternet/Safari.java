package TesteIphone.NavegadorInternet;

public class Safari implements NavegadorInternet {
    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando aba");
        
    }
    @Override
    public void atualizarPAgina() {
       System.out.println("Atualizando pagina");
        
    }
    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina do site: " + url);
        
    }
}
