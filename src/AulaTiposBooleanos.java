
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
			System.out.println("� verdadeiro ");
		}else {
			System.out.println("� falso ");
		}
		
		if (1 == 3) {
			System.out.println("� Verdadeiro ");
		} else {
			System.out.println("� Falso ");
		}
		
		if (ativo) {
			System.out.println("Pode acessar o sistema. ");
		} else {
			System.out.println("Acesso negado." );
		}
		
	}

}
