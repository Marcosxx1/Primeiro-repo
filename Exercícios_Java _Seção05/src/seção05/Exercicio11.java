package se��o05;

import java.util.Scanner;

public class Exercicio11 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um inteiro positivo N, imprimir de 0 at� N em ordem crescente.
	
	int Num = 0;
	System.out.println("Digite o n�mero: ");
	Num = in.nextInt();
	
	for(int i = 0; i<=Num; i++) {
		System.out.println(i);
	}
	
	
	
	in.close();
}
}
