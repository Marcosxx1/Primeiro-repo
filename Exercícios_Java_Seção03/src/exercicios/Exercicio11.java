package exercicios;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Leia uma velocidade em m/s e apresente-a em km/h. A formula é K = M * 3.6
		double K, M;
		System.out.print("Digite a velocidade em m/s: ");
		M = in.nextDouble();
		K = M *3.6;
		System.out.print("A velocidade "+M+"m/s é igual a "+K+"km/h.");
	}

}
