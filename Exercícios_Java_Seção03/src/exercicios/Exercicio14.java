package exercicios;
import java.util.Scanner;

public class Exercicio14 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Leia um �ngulo em graus e converta para radianos. R - G * 180/PI  (3.14)
	
	double A, R;
	System.out.print("Digite o �ngulo em graus: ");
	A = in.nextDouble();
	R = A * (3.14159265359 /180);
	
	System.out.println("O �ngulo " +A+" em radianos �: " +R);
	
}
}
