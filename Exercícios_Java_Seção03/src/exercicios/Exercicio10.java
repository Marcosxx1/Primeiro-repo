package exercicios;
import java.util.Scanner;

public class Exercicio10 {
public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Leia uma velocidade em km/h e apresente-a convertida em m/s. A formulada conversão é M = K/3.6
	
	double KmpH, MpS;
	System.out.print("Digite a velocidade em Km/h: ");
	KmpH = in.nextDouble();
	MpS = KmpH /3.6;
	
	System.out.print("A velocidade "+ KmpH+ " km/h é igual a "+MpS+" m/s.");
	
}
}
