package exercicios;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		//Digite um n�mero real e imprima o resultado do quadrado desse n�mero
		float Num;
		System.out.print("Digite um n�mero real:");
		Num = in.nextFloat();
		System.out.println("O quadrado do n�mero " + Num+" � " + (Num * Num));
		
	}
}
