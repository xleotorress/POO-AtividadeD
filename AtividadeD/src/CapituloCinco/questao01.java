package CapituloCinco;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class questao01 {
	
	public static void main(String[] args){
		
		double[] notas = new double[5];
		double media = 0;
		
		for (int i = 0; i < 5; i++){
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i+1) + "º nota."));
		}
		
		Arrays.sort(notas);
		for (int j = 0; j < 5; j++){
			media += notas[j];
		}
		
		media = media/5.0;
		JOptionPane.showMessageDialog(null, notas[4] + "\n" + notas[3] + "\n" + notas[2] + "\n" + notas[1] + "\n" + notas[0] + "\n \nMedia:" + media);
		
	}
	
}
