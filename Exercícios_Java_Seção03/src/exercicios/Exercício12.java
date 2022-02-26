package exercicios;
import java.util.Scanner;

public class Exercício12 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		//Leia a distância em milhas e converta em kilometros. K - 1.61 *M
		double M, K;
		System.out.print("Digite a distância em Milhas: ");
		M = in.nextDouble();
		K = 1.609 * M;
		System.out.print("A distância "+M+" milhas é igual a "+K+" Kilometros.");
	}
}
