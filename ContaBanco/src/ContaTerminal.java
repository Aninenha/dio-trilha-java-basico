import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale((Locale.US));
        ///Exibir mensagens
        System.out.println("Por favor, digite seu nome abaixo:");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + "! Por favor, digite o número da agência a seguir:");
        String agencia = scanner.next();
        System.out.println("Agencia: " + agencia + ". Por favor, digite o número de sua conta nesta agência");
        int conta = scanner.nextInt();
        System.out.println("Digite a quantia que você quer guardar na conta:");
        double saldo = scanner.nextDouble();
        System.out.println("Parabéns por abrir sua conta em nosso Banco " + nome + "! Sua agência é " + agencia + ", conta número: " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque!");


        ///coletar dados
        ///exibir mensagem final
    }
}
