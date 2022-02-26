package exercicios;
import java.util.Scanner;
public class Exercicio38 {
	public static void main(String[] args) {
		//Ler salário, calcular e imprimir aumento de 25%
		Scanner in = new Scanner(System.in);
		double Sal;
		System.out.print("Digite o salário: ");
		Sal = in.nextDouble();
		Sal += Sal* 0.25;
		System.out.print("O salário com acressímo de 25% é: "+Sal);
	}
}
