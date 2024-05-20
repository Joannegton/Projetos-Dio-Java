public class Main {
    public static void main(String[] args) {
        // Testando ReprodutorMusical
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Bohemian Rhapsody");

        // Testando AparelhoTelefonico
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123-456-7890");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
