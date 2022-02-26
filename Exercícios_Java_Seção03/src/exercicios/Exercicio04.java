package exercicios;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		//Digite um número real e imprima o resultado do quadrado desse número
		float Num;
		System.out.print("Digite um número real:");
		Num = in.nextFloat();
		System.out.println("O quadrado do número " + Num+" é " + (Num * Num));
		
	}
}
