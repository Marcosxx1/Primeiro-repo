package exercicios;

import java.util.Scanner;

public class Exercicio04 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	////Ler um n�mero, se positivo calcular e mostrar (O n�mero digitado ao quadrado) (A raiz quadrada do n�mero digitado)
	
	Double Num;
	System.out.println("Digite um n�mero: ");
	Num = in.nextDouble();
	if(Num > 0) {
		System.out.println(Num+" ao quadrado �: "+Math.pow(Num, 2)+"\nA ra�z quadrada de "+Num+" �: "+Math.sqrt(Num));

	} else {
		System.out.println("N�mero negativo n�o � permitido!");
	}
	
	in.close();
}
}
