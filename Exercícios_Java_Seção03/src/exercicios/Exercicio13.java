package exercicios;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		//Leia uma dist�ncia em quilometros e converta em milhas. M = K / 1.609.
		
		Scanner in = new Scanner(System.in);
		double K, M;
		System.out.print("Digite a dist�ncia em quil�metros: ");
		K = in.nextDouble();
		
		M = K /1.609;
		System.out.println("A dis�ncia " +K +" quil�metros � igual a " +M+" milhas.");
	}

}
