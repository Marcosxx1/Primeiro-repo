package exercicios;

import java.util.Scanner;

public class Beecrowd1007 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	String Nome = in.nextLine();
	double SalFix = in.nextDouble();
	double TotalV = in.nextDouble();
	SalFix += (TotalV * 0.150);
	System.out.println(String.format("TOTAL = %.2f", SalFix));
	in.close();
}
}
