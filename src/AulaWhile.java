import java.util.Scanner;

public class AulaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 1;
		String nome;
		
		//Para receber dados do usúario via teclado
		Scanner teclado = new Scanner(System.in);
		
		
		while(idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos ");
		
		}
		
		
		teclado.close();
		

	}

}
