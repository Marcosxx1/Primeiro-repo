package seção05;

import java.util.Scanner;

public class Exercicio13 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um número inteiro positivo par N, imprimir todos os seus números pares de 0 até N em ordem crescente.

	int Num = 0 ;
	System.out.println("Digite um número: ");
	Num = in.nextInt();
	
	while(Num % 2 != 0 || Num <0) {
		
		System.out.println("Apenas números POSITIVOS e PARES");
		System.out.println("Digite um número: ");
		Num = in.nextInt();
	}
		
	for(int i = 0; i <=Num; i+=2) {
		System.out.println(i);
	}
	
	
	in.close();
}
}
