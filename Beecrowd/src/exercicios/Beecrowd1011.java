package exercicios;


import java.util.Scanner;

public class Beecrowd1011 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	/*Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
	 * A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.*/

   double pi = 3.14159;
   double Raio = in.nextDouble();
   double Volume =(4.0/3) * pi * (Raio * Raio * Raio);
   System.out.printf("VOLUME = %.3f%n", Volume);

}
}
