package seção05;

import java.util.Scanner;

public class Teste1 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int x[] = new int[10];
	
		int menor = 0, maior = 0, aux;
		 for (int i= 0; i< x.length; i++) {
			x[i] = in.nextInt();
			
			
			if (x[i] >  maior) maior = x[i];
			if (x[i] <  menor) menor = x[i];
		 }
		 
		 System.out.println(maior);
		 System.out.println(menor);
}
}
