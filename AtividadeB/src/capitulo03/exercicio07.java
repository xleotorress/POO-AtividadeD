package capitulo03;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 15;
		
		while (x != 1){
			if (x%2 == 0){
				x = x/2;
				System.out.println(x);
			}
			else{
				x = x*3+1;
				System.out.println(x);
			}
		}
		
	}

}
