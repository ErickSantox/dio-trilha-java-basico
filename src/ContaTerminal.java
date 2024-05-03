import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


         Scanner scanner = new Scanner(System.in);

         System.out.print("Por favor, digite o seu nome: ");
         String nomeCliente = scanner.nextLine();


         System.out.print("Por favor, digite o número da sua conta: ");
         int numero = scanner.nextInt();


         System.out.print("Por favor, digite o número da Agência: ");
         String agencia = scanner.next();



         System.out.print("Por favor, digite o valor do seu saldo: ");
         double saldo = scanner.nextDouble();
        
         scanner.close();


        System.out.println("Ola, " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é  " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
