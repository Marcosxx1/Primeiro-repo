package seção05;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		//Determinar e mostrar os cinco primeiros múltiplos de 3>0	
		Scanner in = new Scanner (System.in);
		int Num = 0;
		for(int i = 0; i < 5; i++) {
			Num+= + 3;
			System.out.println(Num);
			
		}
	
	in.close();
	}

}