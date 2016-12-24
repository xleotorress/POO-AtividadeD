package capitulo03;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroA = 0;
		int numeroB = 1;
		System.out.println(numeroA);
		System.out.println(numeroB);
		int atual = numeroA + numeroB;
		
		while(atual <= 100){
			System.out.println(atual);
			numeroA = numeroB;
			numeroB = atual;
			atual = numeroA + numeroB;
		}
	}

}
