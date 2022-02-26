package seção05;

import java.util.Scanner;

public class Exercicio11 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um inteiro positivo N, imprimir de 0 até N em ordem crescente.
	
	int Num = 0;
	System.out.println("Digite o número: ");
	Num = in.nextInt();
	
	for(int i = 0; i<=Num; i++) {
		System.out.println(i);
	}
	
	
	
	in.close();
}
}
