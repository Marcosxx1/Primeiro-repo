package exercicios;

import java.util.Scanner;

public class Exercicio05 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Ler um n�mero inteiro, verificar se � par ou impar
	int Num;
	System.out.println("Digite um n�mero: ");
	Num = in.nextInt();
	if(Num % 2 == 0) {
		System.out.println("O n�mero "+Num+" � par");
	} else {
		System.out.println("O n�mero "+Num+" � impar");

	}
	in.close();
}
}
