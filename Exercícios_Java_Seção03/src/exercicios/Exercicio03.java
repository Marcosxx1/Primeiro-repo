package exercicios;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Peça ao usuário para digitar três valores inteiros e imprima a soma deles
		int Num1, Num2, Num3;

			System.out.println("Digite o primeiro número ");
			Num1 = in.nextInt();
			System.out.println("Digite o Segundo número ");
			Num2 = in.nextInt();
			System.out.println("Digite o Terceiro número ");
			Num3 = in.nextInt();
			int Resul = Num1 + Num2 + Num3;
			System.out.println("A soma dos três números informados é: " + Resul);

	}
}
