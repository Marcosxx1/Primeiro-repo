package exercicios;

import java.util.Scanner;

public class Beecrowd1005 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A = in.nextDouble();
		double B = in.nextDouble();
		double MEDIA = ((A*3.5) + (B*7.5))/11;
		System.out.println(String.format("MEDIA = %.5f", MEDIA));
		
		
		
		in.close();
	}

}
