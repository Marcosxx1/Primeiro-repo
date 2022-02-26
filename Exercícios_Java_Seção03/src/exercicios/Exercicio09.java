package exercicios;
import java.util.Scanner;

public class Exercicio09 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Leia uma temperatura em graus Celsius e apresente-a convertida em Kelvin. K = C +273.15
		
		double Celsius, Kelvin;
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = in.nextDouble();
		Kelvin = Celsius + 273.15;
		System.out.println("A temperatura, "+Celsius+" graus Celsius é: " + Kelvin +" Kelvin");
	}

}
