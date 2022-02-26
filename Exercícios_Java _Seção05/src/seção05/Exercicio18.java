package seção05;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos números serão informados? ");
		int Tamanho = in.nextInt();
		
		int[] Entrada = new int[Tamanho];
		
		for(int i = 0; i < Tamanho; i++ ) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			Entrada[i] = in.nextInt();
		}

		in.close();
	}
}
