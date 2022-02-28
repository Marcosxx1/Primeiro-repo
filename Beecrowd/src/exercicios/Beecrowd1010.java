package exercicios;


import java.util.Scanner;

public class Beecrowd1010 {
public static void main(String[] args) {
	
	/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
	 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
	 *  Após, calcule e mostre o valor a ser pago.*/
	Scanner in = new Scanner(System.in);


	  
	  int Cod1 = in.nextInt();
	  int Pec1 = in.nextInt();
	  double Val1 = in.nextDouble();
	  int Cod2 = in.nextInt();
	  int Pec2 = in.nextInt();
	  double Val2 = in.nextDouble();
	  
	  Val1 *= Pec1;
	  Val2 *= Pec2;
	  System.out.printf(String.format("VALOR A PAGAR: R$ %.2f%n", (Val1+Val2)));
in.close();
}
}
