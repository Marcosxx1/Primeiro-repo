package exercicios;

import java.util.Scanner;

public class Exercicio32 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um número int, imprimir a soma do sucessor de seu triplo com o antecessor de seu dobro
	
	int Numero = in.nextInt();
	int Sucessor = Numero * 3 + 1;
	int Dobro = Numero * 2;
	int Antecessor =  Dobro - 1;
	System.out.println(Sucessor + Antecessor);
	
	
	in.close();
}
}
