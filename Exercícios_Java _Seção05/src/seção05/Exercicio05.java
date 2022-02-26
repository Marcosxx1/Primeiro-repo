package seção05;

import java.util.Scanner;

public class Exercicio05 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double a[] = new double[10], Num = 0;
	
	for(int i = 0; i<10; i++) {
		System.out.println("Digite o "+(i+1)+"º número");
		a[i] = in.nextDouble();
	}
	for(int i = 0; i<10; i++) {
		Num+=a[i];
	}
	System.out.println(Num);

	
	
	in.close();
}
}
