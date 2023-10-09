public class Safari implements NavegadorNaInternet{

    private String url;

    public Safari(String url) {
        this.url = url;
    }

    public Safari() {
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizando Pagina: " + url);
    }
}
