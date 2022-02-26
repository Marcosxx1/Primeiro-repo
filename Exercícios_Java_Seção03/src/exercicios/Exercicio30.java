package exercicios;
import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		//Ler o valor em real e a cotação do dolar, em seguida imprimir o valor correspondente em dolares;
		
		Scanner in = new Scanner(System.in);
		double Real, Dolar;
		System.out.print("Digite o valor em reais: ");
		Real = in.nextDouble();
		System.out.print("O valor '"+Real+"' reais em dolar com a cotação a 5.44 é: "+Real * 5.44);
	}
}
