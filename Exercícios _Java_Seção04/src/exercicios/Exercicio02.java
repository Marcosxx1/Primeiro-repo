package exercicios;

import java.util.Scanner;

public class Exercicio02 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Ler um número. Se o número for positivo calcular raíz quadrada. Se negativo, mostrar mensagem de inválido
	
	double Num;
	System.out.print("Digite um número: ");
	Num = in.nextDouble();
	if (Num > 0) {
		System.out.print("A raíz quadrada de "+Num+" é: "+Math.sqrt(Num));
	}else {
		System.out.print("Número inválido!");
	} 
	
	in.close();
}
}
