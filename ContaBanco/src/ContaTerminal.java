import java.util.Scanner;
	
public class ContaTerminal {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Informe a sua agencia: ");
		String agencia = scanner.nextLine();
		
		System.out.println("Número da conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Quanto você deseja depositar? ");
		double saldo = scanner.nextDouble();
		
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agència é: "
		+ agencia + ", conta: " + numeroConta + ", seu saldo de " + saldo + " já está disponivel para saque.");
		
		scanner.close();
		
	}

}
