package exercicios;

import java.util.Scanner;

public class Exercicio34 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double Nota;
	int Faltas;
	System.out.print("Digite a nota: ");
	Nota = in.nextDouble();
	System.out.print("Digite a quantidade de faltas: ");
	Faltas = in.nextInt();
	
	if(Nota <= 3.9 & Faltas <=20) {
		System.out.println("Nota conceito E");
	}
	if((Nota > 4.0 & Nota <= 4.9 ) & Faltas <=20) {
		System.out.println("Nota conceito D");
	}
	if((Nota > 5.0 & Nota <= 7.4 ) & Faltas <=20) {
		System.out.println("Nota conceito C");
	}
	if((Nota > 7.5 & Nota <= 8.9 ) & Faltas <=20) {
		System.out.println("Nota conceito B");
	}
	if((Nota > 9.0 & Nota <= 10. ) & Faltas <=20) {
		System.out.println("Nota conceito C");
	}
	if((Nota > 9.0 & Nota <= 10. ) & Faltas >20) {
		System.out.println("Nota conceito B");
	}
	if((Nota > 7.5 & Nota <= 8.9 ) & Faltas >20) {
		System.out.println("Nota conceito C");
	}
	if((Nota > 5.0 & Nota <= 7.4 ) & Faltas >20) {
		System.out.println("Nota conceito D");
	}
	if((Nota > 4.0 & Nota <= 4.9 ) & Faltas >20) {
		System.out.println("Nota conceito E");
	}
	if(Nota <= 3.9 & Faltas >20) {
		System.out.println("Nota conceito E");
	}
	
	in.close();
}
}
