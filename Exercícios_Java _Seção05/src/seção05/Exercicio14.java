package seção05;

import java.util.Scanner;

public class Exercicio14 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int Num;
	System.out.print("Digite o número: ");
	Num = in.nextInt();
	
	while(Num % 2 != 0 || Num <0) {
		System.out.print("Apenas números POSITIVOS e PARES!\n\n");
		System.out.print("Digite o número: ");
		Num = in.nextInt();
		
	}
	
	
	for(int i = Num; i >= 0; i--) {
		System.out.println(i);
	}
	
	in.close();
}
}
