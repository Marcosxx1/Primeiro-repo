package seção05;

import java.util.Scanner;

public class Exercicio07 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float a[] = new float[10], Soma = 0;       // define uma váriavel com dez compartimentos, e uma de soma
	
	
	for(int i = 0; i<a.length; i++) { //Faz um loop de pegar os números do usuário
		if(a[i] >= 0) {				 // se maior ou igual a 0 continua
			System.out.println("Digite o "+(i+1)+"º número");
			a[i] = in.nextFloat();
		}
		if(a[i] < 0)   {
			System.out.println("Número negativo não permitido.\n"); //Caso menor que zero mostra a mensagem
			System.out.println("Digite o "+(i+1)+"º número");		//e pede o número novamente

			a[i] = in.nextFloat();
		}
		
	}
	
	for(int i = 0; i<10; i++) {
		Soma += a[i];
	}
	
		System.out.println("Média é: "+ Soma / a.length);
	
	in.close();
}
}
