package exercicios;


import java.util.Scanner;

public class Beecrowd1008 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);


	
	int Num = in.nextInt();
	int HorasTr = in.nextInt();
	double ValorPrHr = in.nextDouble();
	double Resul = HorasTr * ValorPrHr;
	
	System.out.println("NUMBER = "+Num);
    System.out.printf("SALARY = U$ %.2f%n" , Resul);
}
}
