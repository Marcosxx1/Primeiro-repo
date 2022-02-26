package exercicios;

import java.util.Scanner;

public class Exercicio19 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Verificar se um número é divisivel por 3 ou 5 mas não os dois ao mesmo tempo
	
	double Num;
	System.out.println("Digite o número: ");
	Num = in.nextDouble();
	
	if((Num % 3 == 0) || (Num % 5 == 0)){
		System.out.println("O número "+Num+" é divisível por 3 ou 5");
	}
	else if ((Num % 3 == 0) & (Num % 5 == 0)) {
		System.out.println("O número "+Num+" é divisível por 3 e 5");

	}
	
	in.close();
}
}

