public class ITunes implements ReprodutorMusical{

    private Musica musica;

    public ITunes(Musica musica) {
        this.musica = musica;
    }
    public ITunes() {
    }

    @Override
    public void tocar(Musica musica) {
        System.out.printf("\nTocando música %s do cantor %s",musica.getNome(),musica.getAutor());
    }

    @Override
    public void pausar(Musica musica) {
        System.out.printf("\nPausando música %s do cantor %s",musica.getNome(),musica.getAutor());
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.printf("\nSelecionando música %s do cantor %s",musica.getNome(),musica.getAutor());
    }
}
