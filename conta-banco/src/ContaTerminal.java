import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o seu Nome Completo! ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Entre com a sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Agora informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por fim, informe o saldo da conta: ");
        double saldo = scanner.nextDouble();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + " e o número de sua conta é " + numeroConta + ".");
        System.out.println("O seu saldo " + saldo +" já está disponível para saque");
    }
}
