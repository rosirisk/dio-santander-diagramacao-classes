public class Telefone implements AparelhoTelefonico{

    private String numero;

    public Telefone() {
    }

    public Telefone(String numero) {
        this.numero = numero;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o telefone: " + numero);

    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo o telefone: " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem) {
        System.out.println("Iniciando correio de voz: " + numero);
    }
}
