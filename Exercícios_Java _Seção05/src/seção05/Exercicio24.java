package seção05;

import java.util.Scanner;

public class Exercicio24 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int Num, Contador = 0, Soma = 0, Resultado;
	 Num = in.nextInt();
	
		for(int i = 1 ; i < Num; i++) {
			Contador ++;
			Resultado = Num % Contador;
			
			
			if (Resultado == 0) {
				Soma += Contador;
			}
		}
				System.out.println(Soma );

	
	in.close();
}
}
