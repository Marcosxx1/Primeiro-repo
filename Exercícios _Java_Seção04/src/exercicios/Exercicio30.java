package exercicios;

import java.util.Scanner;

public class Exercicio30 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Fa�a um programa que receba tr�s n�meros e mostre-os em ordem crescente
	
	//A = 1   B = 5,  C = 2
	int a, b, c, aux;
	System.out.println("Digite o primeiro n�mero: ");
	a = in.nextInt();
	System.out.println("Digite o segundo n�mero: ");
	b = in.nextInt();
	System.out.println("Digite o terceiro n�mero: ");
	c = in.nextInt();

	if(a >b) {
		aux = a;
		a = b;
		b = aux;
	}
	if (a > c) {
		aux = a;
		a = c;
		c = aux; 
	}
	if(b > c) {
		aux = b;
		b = c;
		c = aux;
	}
	
	System.out.println(a+" "+b+" "+c);
	in.close();
}
}
