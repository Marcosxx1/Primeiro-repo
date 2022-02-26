package exercicios;
import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	//Ler um valor de area em metros quadrados e apresente-o convertido em acres. A = M * 0,000247 M METROS, A ACRES
	double A, M;
	System.out.print("Digite o valor em metros quadrados: ");
	M = in.nextDouble();
	A = M * 0.000247;
	System.out.print(M+" metros quadrados é igual a "+A+" acres.");
}
}