package CapituloCinco;

import java.util.Random;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] meses = new String[12];
		meses[0] = "JANEIRO";
		meses[1] = "FEVEREIRO";
		meses[2] = "MARÇO";
		meses[3] = "ABRIL";
		meses[4] = "MAIO";
		meses[5] = "JUNHO";
		meses[6] = "JULHO";
		meses[7] = "AGOSTO";
		meses[8] = "SETEMBRO";
		meses[9] = "OUTUBRO";
		meses[10] = "NOVEMBRO";
		meses[11] = "DEZEMBRO";
		
		int numero = 0;
		Random random = new Random();
		int valor = random.nextInt(12);
		numero = valor;
		
		JOptionPane.showMessageDialog(null, meses[numero]);
	}

}
