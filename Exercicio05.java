package senaiprojetos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*Crie um array de inteiros com 8 elementos e encontre o valor máximo no array. Imprima o valor
		máximo.
		 */
		
		
		int [] elementos = new int [8];
		
		Scanner numeros = new Scanner(System.in);
		System.out.println("Digite os números do array : ");

		
		
		for(int i = 0 ; i < elementos.length ; i++) {
			
			int maiorNumero = elementos[0];
			elementos[i] = numeros.nextInt();
			
			if(elementos[i] > maiorNumero) {
				
				maiorNumero = elementos[i];
				System.out.println("O maior número do array é : " + maiorNumero);
			}
		}
			numeros.close();
	}

}
