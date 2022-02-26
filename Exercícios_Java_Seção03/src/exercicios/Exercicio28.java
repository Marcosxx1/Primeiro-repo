package exercicios;
import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Ler três valores, mostrar o resultado dos quadrados dos três valores lidos
		float A, B, C, Resul;
		System.out.print("Digite o primeiro valor: ");
		A = in.nextFloat();
		System.out.print("Digite o segundo valor: ");
		B = in.nextFloat();
		System.out.print("Digite o terceiro valor: ");
		C = in.nextFloat();
		Resul = (A*A) + (B*B) + (C*C);
		System.out.print("A soma do quadrado de "+A+" + "+B+" + "+C+" é igual a:"+Resul);
		
	}
}
