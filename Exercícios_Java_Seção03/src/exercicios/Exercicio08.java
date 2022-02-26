package exercicios;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		//Leia uma temperatura em Kelvin e aprensente-a convertida em graus Celsius. A formula é C = K -273,15
		
		Scanner in = new Scanner(System.in);
		
		double Kelvin, Celsius;
		System.out.print("Digite a temperatura em Kelvin:");
		Kelvin = in.nextDouble();
		Celsius = (Kelvin - 273.15);
		System.out.println("A temperatura "+Kelvin+ " Kelvin em Celsius é: "+Celsius);

		}


}
