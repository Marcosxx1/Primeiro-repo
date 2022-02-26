package exercicios;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		//Leia uma distância em quilometros e converta em milhas. M = K / 1.609.
		
		Scanner in = new Scanner(System.in);
		double K, M;
		System.out.print("Digite a distância em quilômetros: ");
		K = in.nextDouble();
		
		M = K /1.609;
		System.out.println("A disância " +K +" quilômetros é igual a " +M+" milhas.");
	}

}
