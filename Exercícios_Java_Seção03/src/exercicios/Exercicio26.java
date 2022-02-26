package exercicios;
import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		//ler area em  hectares e mostrar convertido em metros quadrados; M = H *10000
		Scanner in = new Scanner(System.in);
		double M, H;
		System.out.print("Digite a area em Hectares: ");
		H = in.nextDouble();
		M = H *10000;
		System.out.print(H+" Hectares é igual a "+M+" Metros,");
		
		
	}

}
