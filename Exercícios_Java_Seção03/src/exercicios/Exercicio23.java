package exercicios;
import java.util.Scanner;
public class Exercicio23 {
	public static void main(String[] args) {
		double M, J;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a dist�ncia em Metros: ");
		M = in.nextDouble();
		J =  M * 1.094 ;
		
		System.out.print(M+" Metros � o mesmo que "+J+" Jardas");
	}
}
