package exercicios;
import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Ler quatro notas, calcular a media aritimética e imprimir o resultado
		float A, B, C, D, Resul;
		System.out.print("Digite a primeira nota: ");
		A = in.nextFloat();
		System.out.print("Digite a segunda nota: ");
		B = in.nextFloat();
		System.out.print("Digite a terceira nota: ");
		C = in.nextFloat();
		System.out.print("Digite a quarta nota: ");
		D = in.nextFloat();
		Resul = (A + B + C + D )/ 4;
		System.out.print("A media aritimética das notas fornecidas é: "+ Resul);
		
	}
}
