package CapituloCinco;

import javax.swing.JOptionPane;
import java.util.Random;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] pares = new int[10];
		int[] impares = new int[10];
		int valor = 0;
		String msgPar = "";
		String msgImpar = "";
		
		for (int i = 0; i < 10; i++){
			
			Random random = new Random();
			int numero = random.nextInt(21);
			valor = numero;
			
			if (valor % 2 == 0){
				pares[i]= valor;
				msgPar = msgPar + pares[i] + ",";
				
			}else{
				impares[i] = valor;
				msgImpar = msgImpar + impares[i] + ",";
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Par:\n" + msgPar + "\nImpar:\n" + msgImpar);
		
		
	}

}
