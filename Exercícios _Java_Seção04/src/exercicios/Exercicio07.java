package exercicios;

import java.util.Scanner;

public class Exercicio07 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler dois n�meros, mostrar o maior. Caso iguais, imprimir "N�meros iguais"
	
	int Num1, Num2;
	System.out.println("Digite o primeiro n�mero: ");
	Num1 = in.nextInt();
	System.out.println("Digite o segundo n�mero: ");
	Num2 = in.nextInt();
	if (Num1 > Num2) {
		System.out.println(Num1+" � maior que "+Num2);
	} else {
		System.out.println(Num2+" � maior que "+Num1);
	}
	
	if (Num1 == Num2) {
		System.out.println("N�meros iguais!");
		
}
	in.close();
}
}
