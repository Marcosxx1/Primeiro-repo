package se��o05;

import java.util.Scanner;

public class Exercicio13 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um n�mero inteiro positivo par N, imprimir todos os seus n�meros pares de 0 at� N em ordem crescente.

	int Num = 0 ;
	System.out.println("Digite um n�mero: ");
	Num = in.nextInt();
	
	while(Num % 2 != 0 || Num <0) {
		
		System.out.println("Apenas n�meros POSITIVOS e PARES");
		System.out.println("Digite um n�mero: ");
		Num = in.nextInt();
	}
		
	for(int i = 0; i <=Num; i+=2) {
		System.out.println(i);
	}
	
	
	in.close();
}
}
