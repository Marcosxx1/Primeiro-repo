package exercicios;
import java.util.Scanner;

public class Exercicio07 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Leia uma temperatura em graus Fahrenheit e aprensente-a convertida 
	//em graus Celsius. A fórmula de conversão é C = 5 * (F - 32 )/9
	
	float Fah, Celsius;
	System.out.println("Digite a temperatura em Fahrenheit: ");
	Fah = in.nextFloat();
	Celsius = 5 * (Fah - 32) / 9;
	System.out.println(+Fah+" Fahrenheit, em Celsius é: " + Celsius);
	
} 
}
