package exercicios;

import java.util.Scanner;

public class Beecrowd1009 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	/*	Fa�a um programa que leia o nome de um vendedor, 
	o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro).
	Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas,
	informar o total a receber no final do m�s, com duas casas decimais.*/

	String Nome = in.next();
	double SalFix = in.nextDouble();
	double TotalVend = in.nextDouble();
	
	System.out.println(String.format("TOTAL =f R$ %.2", SalFix+= (TotalVend* 0.15)));
}
}
