package exercicios;

import java.util.Scanner;

public class Exercicio06 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler dois n�meros inteiros. Mostrar o maior deles, e a diferen�a entre ambos.
	
	int Num1, Num2;
	System.out.println("Digite o primeiro n�mero: ");
	Num1 = in.nextInt();
	System.out.println("Digite o segundo n�mero: ");
	Num2 = in.nextInt();
	if (Num1 > Num2) {
		System.out.println(Num1+" � maior que "+Num2+" e a difer�n�a entre eles �: "+(Num1 - Num2));
	} else {
		System.out.println(Num2+" � maior que "+Num1+" e a difer�n�a entre eles �: "+(Num2 - Num1));

	}
	

	in.close();
}
}
