package seção05;

import java.util.Scanner;

public class Exercicio08 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a[] = new int[10];
	int Menor = 2;
	int Maior = 2;
	
	for(int i = 0; i<a.length; i++) {
		System.out.print("Digite o "+(i+1)+"º número: ");
		a[i] = in.nextInt();
	}
	
	for(int i = 0; i< a.length; i++) {
		if (a[i] < Menor) Menor = a[i];
		if (a[i] > Maior) Maior = a[i];
	}
	
	System.out.println("Maior é: "+Maior+". E menor é: "+Menor);
	System.out.println(Menor);
	
	in.close();
}	
}