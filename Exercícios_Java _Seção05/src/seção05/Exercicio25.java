package seção05;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		//Determinar e mostrar os cinco primeiros múltiplos de 3>0	
		Scanner in = new Scanner (System.in);
		int Num = 0;
		int Num2 = 0;
		int Soma =0;
		do {
			
				Num+=   3;
				Soma += Num;
				Num2+=   5;
				Soma += Num2;
				System.out.println(Num);
				
		
		}while ((Num % 3 == 0 || Num % 5 == 0 ) && Num <999 && Num2 <1000);

		
		
		
		
		System.out.println(Num2);

	in.close();
	


}
	}