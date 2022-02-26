package exercicios;

import java.util.Scanner;

public class Exercicio23 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int Ano;
	System.out.println("Digite o ano: ");
	Ano = in.nextInt();
			if((Ano % 4 == 0) & (Ano % 100 != 0 || Ano % 400 == 0)) {
				System.out.println("O ano é bisesto.");
			}else {
				System.out.println("O ano não é bisesto.");
			}
	
	
	in.close();
}
}
