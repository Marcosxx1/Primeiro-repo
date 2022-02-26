package exercicios;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Leia uma temperatura em graus Celsius e aprensente-a convertida em graus Fahrenheit. A formula de conversão é: F = C *(9/5 ) + 32.
		//Sendo F a temperatura em Fahrenheit e C a temperatura em Celsius
		float Celsius, Fah;
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = in.nextFloat();
		Fah = (Celsius *	 9 / 5 ) + 32;
		System.out.println("A temperatura "+Celsius+ " graus Celsius em Fharenheit é: "+ Fah);
		
	}
}
