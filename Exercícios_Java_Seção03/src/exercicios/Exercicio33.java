package exercicios;

import java.util.Scanner;

public class Exercicio33 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Leia o tamanho do lado de um quadrado e imprima como resultado sua área
	
	int Lado = in.nextInt();
	System.out.println(Lado*Lado);
	
	
	
	in.close();
}
}
