package exercicios;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Pe�a ao usu�rio para digitar tr�s valores inteiros e imprima a soma deles
		int Num1, Num2, Num3;

			System.out.println("Digite o primeiro n�mero ");
			Num1 = in.nextInt();
			System.out.println("Digite o Segundo n�mero ");
			Num2 = in.nextInt();
			System.out.println("Digite o Terceiro n�mero ");
			Num3 = in.nextInt();
			int Resul = Num1 + Num2 + Num3;
			System.out.println("A soma dos tr�s n�meros informados �: " + Resul);

	}
}
