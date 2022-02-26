package exercicios;

import java.util.Scanner;

public class Exercicio35 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double Valor;
	System.out.print("Digite o valor de venda: ");
	Valor = in.nextDouble();
	
	if(Valor > 100000) {
		Valor = 700 + (Valor*0.16);
		System.out.println("A comissão do vendedor é: "+Valor);
	}
	if(Valor >= 80000 & Valor <100000) {
		Valor = 650 + (Valor*0.14);
		System.out.println("A comissão do vendedor é: "+Valor);
	}
	if(Valor < 80000 & Valor >= 60000) {
		Valor = 600 + (Valor*0.14);
		System.out.println("A comissão do vendedor é: "+Valor);
	}
	if(Valor >= 40000 & Valor <60000) {
		Valor = 550 + (Valor*0.14);
		System.out.println("A comissão do vendedor é: "+Valor);
	}
	if(Valor >= 20000 & Valor <40000) {
		Valor = 500 + (Valor*0.14);
		System.out.println("A comissão do vendedor é: "+Valor);
	}
	if(Valor < 20000) {
		Valor = 400 + (Valor*0.14);
		System.out.println("A comissão do vendedor é: "+Valor);
	}
	
	in.close();
}
}
