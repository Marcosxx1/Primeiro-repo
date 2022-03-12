package seção05;

import java.util.Scanner;

public class Exercicio08 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a[] = new int[10];
	int Menor = 0;
	int Maior = 0;
	
	for(int i = 0; i<a.length; i++) {
		System.out.print("Digite o "+(i+1)+"º número: ");
		a[i] = in.nextInt();
		if (a[i] < Menor) Menor = a[i];
		if (a[i] > Maior) Maior = a[i];
	}
	


	
	System.out.println("Maior é: "+Maior+". E menor é: "+Menor);
	
	in.close();
}	
}