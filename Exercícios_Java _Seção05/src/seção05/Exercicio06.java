package seção05;

import java.util.Scanner;

public class Exercicio06 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler dez inteiros, imprimir média
	int a[] = new int[10], Num = 0;
	
	for(int i = 0; i<10; i++) {
		System.out.println("Digite o "+(i+1)+"º número");
		a[i] = in.nextInt();
	}
	for(int i = 0; i<10; i++) {
		Num+= a[i];
	}
	System.out.println(Num/10);

	
	in.close();
}
}
