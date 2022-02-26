package exercicios;

import java.util.Scanner;

public class Exercicio09 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Ler salário, e valor da prestação de empréstimo. 
	//SE a prestação for maior que 20% do salário mostrar "Empréstimo não concedido" SENÃO "Empréstimo concedido
	double Sal, Prest;
	System.out.println("Informe o salário: ");
	Sal = in.nextDouble();
	System.out.println("Informe o valor da prestação: ");
	Prest = in.nextDouble();
	
	if(Prest > (Sal * 0.2)) {
		System.out.println("Empréstimo não concedido.");
		
	}else {
		System.out.println("Empréstimo concedido.");
	}
	
	
	
	in.close();
}
}
