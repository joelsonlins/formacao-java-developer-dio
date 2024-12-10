import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]args) throws Exception{
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        double saldo = 237.48;

        //Obter pela scanner os valores digitados no terminal
        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();
        System.out.println("Agora digite o número da sua agência: ");
        scanner.nextLine();
        String agencia = scanner.nextLine();
        System.out.println("Informe o nome do proprietário da conta: ");
        String nome = scanner.nextLine();

        //Exibir a mensagem criada
        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo R$"+saldo+" já está disponível para saque");

    }
}
