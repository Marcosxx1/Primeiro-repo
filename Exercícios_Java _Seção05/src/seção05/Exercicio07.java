package se��o05;

import java.util.Scanner;

public class Exercicio07 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float a[] = new float[10], Soma = 0;       // define uma v�riavel com dez compartimentos, e uma de soma
	
	
	for(int i = 0; i<a.length; i++) { //Faz um loop de pegar os n�meros do usu�rio
		if(a[i] >= 0) {				 // se maior ou igual a 0 continua
			System.out.println("Digite o "+(i+1)+"� n�mero");
			a[i] = in.nextFloat();
		}
		if(a[i] < 0)   {
			System.out.println("N�mero negativo n�o permitido.\n"); //Caso menor que zero mostra a mensagem
			System.out.println("Digite o "+(i+1)+"� n�mero");		//e pede o n�mero novamente

			a[i] = in.nextFloat();
		}
		
	}
	
	for(int i = 0; i<10; i++) {
		Soma += a[i];
	}
	
		System.out.println("M�dia �: "+ Soma / a.length);
	
	in.close();
}
}
