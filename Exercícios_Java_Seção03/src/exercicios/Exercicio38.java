package exercicios;
import java.util.Scanner;
public class Exercicio38 {
	public static void main(String[] args) {
		//Ler sal�rio, calcular e imprimir aumento de 25%
		Scanner in = new Scanner(System.in);
		double Sal;
		System.out.print("Digite o sal�rio: ");
		Sal = in.nextDouble();
		Sal += Sal* 0.25;
		System.out.print("O sal�rio com acress�mo de 25% �: "+Sal);
	}
}
