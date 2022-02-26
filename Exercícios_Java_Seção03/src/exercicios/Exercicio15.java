package exercicios;
import java.util.Scanner;

public class Exercicio15 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Leia um Ângulo em graus e converta para radianos. R - G * 180/PI  (3.14)
	
	double A, R;
	System.out.print("Digite o ângulo em radianos: ");
	R = in.nextDouble();
	A = R * (180 / 3.14159265359 );
	
	System.out.println("O Radiano " +R+" em graus é: " +A);
	
}
}
