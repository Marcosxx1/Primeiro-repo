package exercicios;

import java.util.Scanner;

public class Exercicio30 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Faça um programa que receba três números e mostre-os em ordem crescente
	
	//A = 1   B = 5,  C = 2
	int a, b, c, aux;
	System.out.println("Digite o primeiro número: ");
	a = in.nextInt();
	System.out.println("Digite o segundo número: ");
	b = in.nextInt();
	System.out.println("Digite o terceiro número: ");
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
