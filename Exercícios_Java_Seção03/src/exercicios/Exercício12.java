package exercicios;
import java.util.Scanner;

public class Exerc�cio12 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		//Leia a dist�ncia em milhas e converta em kilometros. K - 1.61 *M
		double M, K;
		System.out.print("Digite a dist�ncia em Milhas: ");
		M = in.nextDouble();
		K = 1.609 * M;
		System.out.print("A dist�ncia "+M+" milhas � igual a "+K+" Kilometros.");
	}
}
