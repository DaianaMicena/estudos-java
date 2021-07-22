import java.util.Scanner;

public class Exercicio0103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		String nome;
		
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe se nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = teclado.nextInt();
		
		System.out.println(nome + " tem " + idade + " anos");
		
			
		
		teclado.close();
		
		
		
		
	}

}
