import java.util.Scanner;

public class AulaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 1;
		String nome;
		
		//Para receber dados do usúario via teclado
		Scanner teclado = new Scanner(System.in);
		
		
		
		//Primeiro executa o bloco, depois faz a checagem
		 do {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos ");
			}
		
		}while(idade > 0);
		
		
		teclado.close();
		

	}

}
