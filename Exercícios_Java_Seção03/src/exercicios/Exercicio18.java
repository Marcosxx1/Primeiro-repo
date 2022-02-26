package exercicios;
import java.util.Scanner;
public class Exercicio18 {
public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler o valor em metros cúbicos m³, converter para litros. L = 1000 * M
	
	double M, L;
	System.out.print("Digite o valor em Metros Cúbicos: ");
	M = in.nextDouble();
	L = 1000 * M;
	System.out.print(M+" metros cúbicos são o mesmo que " +L+" Litros.");
}
}
