package exercicios;
import java.util.Scanner;

public class Exercicio19 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Litros para metros c�bicos. M = L /1000
	
	double M, L;
	System.out.print("Digite o valor em Litros: ");
	L = in.nextDouble();
	M = L /1000;
	System.out.print(L+" litros s�o o mesmo que " +L+" metros c�bicos.");
}
}
