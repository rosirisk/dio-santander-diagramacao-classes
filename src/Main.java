public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica("Paradise", "Cold Play");
        System.out.println("");
        ITunes iTunes = new ITunes();
        iTunes.selecionarMusica(musica);
        iTunes.tocar(musica);
        iTunes.pausar(musica);

        System.out.println("\n");
        Telefone telefone = new Telefone();
        telefone.ligar("+55119111111111");
        telefone.atender("+55119111111111");
        telefone.iniciarCorreioVoz("Gravando correio de voz");

        System.out.println("");
        Safari safari = new Safari();
        safari.exibirPagina("www.dio.com.br");
        safari.adicionarNovaAba("www.dio.com.br");
        safari.atualizarPagina("www.dio.com.br");
    }

}