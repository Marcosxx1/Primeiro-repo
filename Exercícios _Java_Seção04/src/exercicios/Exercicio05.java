package exercicios;

import java.util.Scanner;

public class Exercicio05 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Ler um número inteiro, verificar se é par ou impar
	int Num;
	System.out.println("Digite um número: ");
	Num = in.nextInt();
	if(Num % 2 == 0) {
		System.out.println("O número "+Num+" é par");
	} else {
		System.out.println("O número "+Num+" é impar");

	}
	in.close();
}
}
