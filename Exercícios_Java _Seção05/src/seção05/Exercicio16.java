package se��o05;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int Num;
		System.out.print("Digite o n�mero: ");
		Num = in.nextInt();
		
		while(Num % 2 == 0 || Num <0) {
			System.out.println("Apenas n�meros IMPARES MAIORES QUE 0\n\n");
			System.out.println("Digite o n�mero: ");
			Num = in.nextInt();
		}
		
		for(int i = Num; i >=1 ; i--) {
			System.out.println(i--);
		}
		
		
		in.close();
	}
}
