package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1021 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner in = new Scanner(System.in);
		
	double Num = in.nextDouble();
	int aux = 0;
	
	System.out.println("NOTAS:");
	aux = (int) Num / 100;      
	System.out.printf("%d nota(s) de R$ 100.00%n", aux);
	Num %= 100;					
	
	aux = (int) Num / 50;     
	System.out.printf("%d nota(s) de R$ 50.00%n", aux);
	Num %= 50;	
	
	aux = (int) Num / 20;       
	System.out.printf("%d nota(s) de R$ 20.00%n", aux);
	Num %= 20;	
	
	aux = (int) Num / 10;       
	System.out.printf("%d nota(s) de R$ 10.00%n", aux);
	Num %= 10;	
	
	aux = (int) Num / 5;       
	System.out.printf("%d nota(s) de R$ 5.00%n", aux);
	Num %= 5;	
	
	aux = (int) Num / 2;       
	System.out.printf("%d nota(s) de R$ 2.00%n", aux);
	Num %= 2;	
	
	Num *=100;
	
	System.out.println("MOEDAS:");


	aux = (int) Num / 100; 
	System.out.printf("%d moeda(s) de R$ 1.00%n", aux);
	Num %= 100.0;
	
	aux = (int) Num /50;
	System.out.printf("%d moeda(s) de R$ 0.50%n", aux);
	Num %= 50.0;

	aux = (int) Num /25;
	System.out.printf("%d moeda(s) de R$ 0.25%n", aux);
	Num %= 25.0;

	aux = (int) Num /10;
	System.out.printf("%d moeda(s) de R$ 0.10%n", aux);
	Num %= 10.0;

	aux = (int) Num /5;
	System.out.printf("%d moeda(s) de R$ 0.05%n", aux);
	Num %= 5.0;

	aux = (int) Num /1;
	System.out.printf("%d moeda(s) de R$ 0.01%n", aux);
	Num %= 1.0;

	

	
	in.close();
}
}
