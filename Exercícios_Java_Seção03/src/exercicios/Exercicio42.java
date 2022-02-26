package exercicios;
import java.util.Scanner;
public class Exercicio42 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Receber o salário base. Calcular e imprimir o salário com acréscimo de 5% - 7% de imposto de renda
		double Sal;
		System.out.print("Digite o salário base: ");
		Sal = in.nextDouble();
		Sal += (Sal * 0.05) ;
		Sal -= (Sal * 0.07);
		System.out.print("O salário com acréscimo de 5% e desconto de 7% é: "+Sal);
	}
}
