package exercicios;
import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		//ler area em  hectares e mostrar convertido em metros quadrados; M = H *10000
		Scanner in = new Scanner(System.in);
		double M, H;
		System.out.print("Digite a area em Metros: ");
		M= in.nextDouble();
		H = M /10000;
		System.out.print(M+" Metros é igual a "+H+" Hectares,");
		
		
	}

}
