
public class AulaTiposBooleanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Tipo nao primitivos
		Boolean v = true;
		Boolean f = false;
		
		boolean ativo = false;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);
		System.out.println("V " + v );
		System.out.println("F " + f);
		
		if (verdadeiro) {
			System.out.println("É verdadeiro ");
		}else {
			System.out.println("É falso ");
		}
		
		if (1 == 3) {
			System.out.println("É Verdadeiro ");
		} else {
			System.out.println("É Falso ");
		}
		
		if (ativo) {
			System.out.println("Pode acessar o sistema. ");
		} else {
			System.out.println("Acesso negado." );
		}
		
	}

}
