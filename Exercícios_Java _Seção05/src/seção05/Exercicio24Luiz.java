package seção05;

import java.util.Scanner;

public class Exercicio24Luiz {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int Num, Soma = 0;
	 Num = in.nextInt();
	
		for(int i = 1 ; i < Num; i++) {
			
			if (Num % i == 0) {
				Soma +=i;
			}
		}
				System.out.println(Soma );

	
	in.close();
}
}
