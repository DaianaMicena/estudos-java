
public class AulaVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declaracao e definição de tamanho do vetor
		int numeros [] = new int [10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			
			numeros[i] = i + 3;
		}
		
		System.out.println(numeros[0]);     //primeiro elemento
		System.out.println(numeros[9]);  	//ultimo elemento
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		
		System.out.println(numeros[0]);
		System.out.println(numeros[9]);
		
		
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		System.out.println(Math.round(Math.random() * 10));
		
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
