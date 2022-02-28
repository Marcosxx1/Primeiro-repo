package exercicios;

import java.util.Scanner;

public class Beecrowd1006 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double A = in.nextDouble();
		double B = in.nextDouble();
		double C = in.nextDouble();
		double MEDIA = ((A*2) + (B*3) + (C*5))/10;
		System.out.println(String.format("MEDIA = %.1f", MEDIA));
		
		
in.close();
}

}
