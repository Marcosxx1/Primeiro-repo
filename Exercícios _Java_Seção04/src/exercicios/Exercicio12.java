package exercicios;

import java.util.Scanner;

public class Exercicio12 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um inteiro. Se negativo imprimir "N�mero inv�lido." Se positivo, calcular logar�tmo
	
	double Num;
	System.out.println("Digite um n�mero");
	Num = in.nextDouble();
	
	if(Num < 0) {
		System.out.println("N�mero inv�lido.");
	}else {
		System.out.println("O logar�timo de "+Num+" � "+Math.log(Num));
	}
	in.close();
}
}
