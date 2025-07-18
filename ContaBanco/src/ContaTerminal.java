import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, insira o número da sua conta: ");
        int numero = input.nextInt();

        System.out.print("À seguir, informe o número da sua agência: ");
        String agencia = input.next();

        System.out.print("Agora, escreva seu nome: ");
        String nome = input.next();

        System.out.print("Por fim, informe seu saldo atual: ");
        double saldo = input.nextDouble();

        input.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%.2f já está disponível para saque.", nome, agencia, numero, saldo);
    }
}
