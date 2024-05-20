public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("João", "48294982857", "Professor");
        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(cliente);

        cc.transferir(100, poupanca);
        poupanca.imprimirExtrato();
    }
}
