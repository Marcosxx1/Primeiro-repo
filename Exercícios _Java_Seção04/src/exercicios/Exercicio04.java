package exercicios;

import java.util.Scanner;

public class Exercicio04 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	////Ler um número, se positivo calcular e mostrar (O número digitado ao quadrado) (A raiz quadrada do número digitado)
	
	Double Num;
	System.out.println("Digite um número: ");
	Num = in.nextDouble();
	if(Num > 0) {
		System.out.println(Num+" ao quadrado é: "+Math.pow(Num, 2)+"\nA raíz quadrada de "+Num+" é: "+Math.sqrt(Num));

	} else {
		System.out.println("Número negativo não é permitido!");
	}
	
	in.close();
}
}
