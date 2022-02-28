package exercicios;

import java.util.Scanner;

public class Beecrowd1012 {
public static void main(String[] args) {
	double pi = 3.14159;
	
	Scanner in = new Scanner(System.in);
    double A = in.nextDouble();
    double B = in.nextDouble();
    double C = in.nextDouble();
    
    double TRIANGULO = (A * C)/2;
    double CIRCULO = pi *(C * C);
    double TRAPEZIO = ((A+B) * C ) / 2;
    double QUADRADO = B*B;
    double RETANGULO = A * B;
    
    System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
    System.out.printf("CIRCULO: %.3f%n", CIRCULO);
    System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
    System.out.printf("QUADRADO: %.3f%n", QUADRADO);
    System.out.printf("RETANGULO: %.3f%n", RETANGULO);



in.close();
}
}
