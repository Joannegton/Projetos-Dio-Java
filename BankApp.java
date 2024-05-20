import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Digite o numero da agencia: ");
        int agencia = input.nextInt();
        
        System.out.println("Digite o numero da conta: ");
        String conta = input.next();
        
        System.out.println("Olá" + nome +", obrigado por criar uma conta em nosso banco, \nAgência: " + agencia  + "\nConta: " + conta + "\nSaldo: 1325,37");
    }
}
