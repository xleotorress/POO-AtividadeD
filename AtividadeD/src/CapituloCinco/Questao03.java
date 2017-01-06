package CapituloCinco;

import java.util.Random;


public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] pixels = new int[40][40];
		Random random = new Random();
		
		for (int i = 0; i < 40; i++){
			
			for (int j = 0; j < 40; j++){
				pixels[i][j] = random.nextInt(256);
				System.out.print(pixels[i][j] + " ");
			}
			
			System.out.println();
			
		}
		
	}

}
