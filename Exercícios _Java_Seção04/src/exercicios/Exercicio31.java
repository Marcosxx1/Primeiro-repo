package exercicios;

import java.util.Scanner;

public class Exercicio31 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double Peso, Altura;
	System.out.println("Digite o peso: ");
	Peso = in.nextDouble();
	System.out.println("Digite a altura: ");
	Altura = in.nextDouble();

		if(Altura < 1.20 & Peso <= 60) {
			System.out.println("Classifica��o A");
		}
		if(Altura < 1.20 & (Peso > 60 & Peso <= 90)) {
			System.out.println("Classifica��o D");

		}
		if(Altura < 1.20 & Peso > 90) {
			System.out.println("Classifica��o G");
		}
		if(Altura >=1.20 & Altura <=1.70 & Peso <=60) {
			System.out.println("Classifica��o B");

		}
		if(Altura >=1.20 & Altura <=1.70 & (Peso > 60 & Peso <= 90)) {
			System.out.println("Classifica��o E");

		}
		if(Altura >=1.20 & Altura <=1.70 & Peso > 90) {
			System.out.println("Classifica��o H");

		}
		
		if(Altura >1.70 & Peso <=60) {
			System.out.println("Classifica��o C");
		}
		if(Altura >1.70 &(Peso > 60 & Peso <= 90)) {
			System.out.println("Classifica��o F");

		}
	in.close();
}
}
