package exercicios;

import java.util.Scanner;

public class Exercicio02 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Ler um n�mero. Se o n�mero for positivo calcular ra�z quadrada. Se negativo, mostrar mensagem de inv�lido
	
	double Num;
	System.out.print("Digite um n�mero: ");
	Num = in.nextDouble();
	if (Num > 0) {
		System.out.print("A ra�z quadrada de "+Num+" �: "+Math.sqrt(Num));
	}else {
		System.out.print("N�mero inv�lido!");
	} 
	
	in.close();
}
}
