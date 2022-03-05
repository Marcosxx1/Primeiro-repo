package exercicios;

import java.util.Scanner;

public class Beecrowd1009 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	/*	Faça um programa que leia o nome de um vendedor, 
	o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
	Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
	informar o total a receber no final do mês, com duas casas decimais.*/

	String Nome = in.next();
	double SalFix = in.nextDouble();
	double TotalVend = in.nextDouble();
	
	System.out.println(String.format("TOTAL =f R$ %.2", SalFix+= (TotalVend* 0.15)));
}
}
