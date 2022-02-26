package exercicios;

import java.util.Scanner;

public class Exercicio07 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler dois números, mostrar o maior. Caso iguais, imprimir "Números iguais"
	
	int Num1, Num2;
	System.out.println("Digite o primeiro número: ");
	Num1 = in.nextInt();
	System.out.println("Digite o segundo número: ");
	Num2 = in.nextInt();
	if (Num1 > Num2) {
		System.out.println(Num1+" é maior que "+Num2);
	} else {
		System.out.println(Num2+" é maior que "+Num1);
	}
	
	if (Num1 == Num2) {
		System.out.println("Números iguais!");
		
}
	in.close();
}
}
