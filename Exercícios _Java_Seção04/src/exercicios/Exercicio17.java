package exercicios;

import java.util.Scanner;

public class Exercicio17 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Ler e calcular a �rea de um trap�zio. Area = (BaseMaior + BaseMenor) * Altura /2
	double BaseMaior, BaseMenor, Altura, Area;
	System.out.println("****Calculo da �rea de um trap�zio****");
	System.out.println("Digite o comprimento da Base Maior: ");
	BaseMaior = in.nextDouble();
	System.out.println("Digite o comprimento da Base Menor: ");
	BaseMenor = in.nextDouble();
	System.out.println("Digite a altura: ");
	Altura = in.nextDouble();
	
	Area = ((BaseMaior + BaseMenor) * Altura) /2;
	
	System.out.println("A �re do trap�zio �: "+Area);
	
	in.close();
}
}
