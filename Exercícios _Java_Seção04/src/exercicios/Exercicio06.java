package exercicios;

import java.util.Scanner;

public class Exercicio06 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler dois números inteiros. Mostrar o maior deles, e a diferença entre ambos.
	
	int Num1, Num2;
	System.out.println("Digite o primeiro número: ");
	Num1 = in.nextInt();
	System.out.println("Digite o segundo número: ");
	Num2 = in.nextInt();
	if (Num1 > Num2) {
		System.out.println(Num1+" é maior que "+Num2+" e a diferênça entre eles é: "+(Num1 - Num2));
	} else {
		System.out.println(Num2+" é maior que "+Num1+" e a diferênça entre eles é: "+(Num2 - Num1));

	}
	

	in.close();
}
}
