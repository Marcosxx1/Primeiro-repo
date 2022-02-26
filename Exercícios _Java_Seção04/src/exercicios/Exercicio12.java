package exercicios;

import java.util.Scanner;

public class Exercicio12 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um inteiro. Se negativo imprimir "Número inválido." Se positivo, calcular logarítmo
	
	double Num;
	System.out.println("Digite um número");
	Num = in.nextDouble();
	
	if(Num < 0) {
		System.out.println("Número inválido.");
	}else {
		System.out.println("O logarítimo de "+Num+" é "+Math.log(Num));
	}
	in.close();
}
}
