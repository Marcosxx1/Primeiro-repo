package se��o05;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int Num, soma = 0;
		System.out.println("Digite o n�mero: ");
		Num = in.nextInt();
		

		
		for (int i = 0; i <= Num; i++) {
			soma+=i;
		}
		System.out.println(soma);

		
		in.close();
	}
}
