package exercicios;

import java.util.Scanner;

public class Exercicio09 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Ler sal�rio, e valor da presta��o de empr�stimo. 
	//SE a presta��o for maior que 20% do sal�rio mostrar "Empr�stimo n�o concedido" SEN�O "Empr�stimo concedido
	double Sal, Prest;
	System.out.println("Informe o sal�rio: ");
	Sal = in.nextDouble();
	System.out.println("Informe o valor da presta��o: ");
	Prest = in.nextDouble();
	
	if(Prest > (Sal * 0.2)) {
		System.out.println("Empr�stimo n�o concedido.");
		
	}else {
		System.out.println("Empr�stimo concedido.");
	}
	
	
	
	in.close();
}
}
