package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1014 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner in = new Scanner(System.in);
    int X = in.nextInt();
    double Y = in.nextDouble();
    double Consumo = X / Y;
    System.out.println((String.format("%.3f km/l", Consumo)));
    
	
}
}
