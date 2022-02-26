package exercicios;

import java.util.Scanner;

public class Exercicio27 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int Idade;
	System.out.println("Digite a idade: ");
	Idade = in.nextInt();
	
	if(Idade >= 5 & Idade <= 7) {
		System.out.println("Infantil A");
	}
	if(Idade >= 8 & Idade <= 10) {
		System.out.println("Infantil B");
	}
	if(Idade >= 11 & Idade <= 13) {
		System.out.println("Juvenil A");
	}
	if(Idade >= 14 & Idade <= 17) {
		System.out.println("Juvenil b");
	}
	if(Idade > 18) {
		System.out.println("Senior");
	}else {
		System.out.println("Idade insuficiente.");
	}

	
	in.close();
}
}
