package exercicios;
import java.util.Scanner;
public class Exercicio42 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Receber o sal�rio base. Calcular e imprimir o sal�rio com acr�scimo de 5% - 7% de imposto de renda
		double Sal;
		System.out.print("Digite o sal�rio base: ");
		Sal = in.nextDouble();
		Sal += (Sal * 0.05) ;
		Sal -= (Sal * 0.07);
		System.out.print("O sal�rio com acr�scimo de 5% e desconto de 7% �: "+Sal);
	}
}
