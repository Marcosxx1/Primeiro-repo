package se��o05;

import java.util.Scanner;

public class Exercicio15 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int Num;
	System.out.println("Digite o n�mero: ");
	Num = in.nextInt();
	
	while(Num % 2 == 0 || Num < 0) {
		System.out.println("Apenas n�meros impares\n\n");
		System.out.println("Digite um n�mero: ");
		Num = in.nextInt();
	}
	
		for(int i = 0; i<Num; i++) {
			System.out.println(i+=1);
		}
	
	
	in.close();
}
}
