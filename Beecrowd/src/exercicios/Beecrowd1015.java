package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1015 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	Locale.setDefault(Locale.US);
    
    double x1 = in.nextDouble();
    double y1 = in.nextDouble();
    double x2 = in.nextDouble();
    double y2 = in.nextDouble();
    double Dist = Math.sqrt((x2 - x1) *(x2 - x1) + (y2 - y1)* (y2 - y1));
    
    System.out.printf("%.4f", Dist);
}
}
