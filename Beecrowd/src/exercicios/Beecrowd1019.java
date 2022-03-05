package exercicios;

import java.util.Scanner;

public class Beecrowd1019 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int Entrada = in.nextInt();
	int Horas = Entrada / 3600;
	Entrada %= 3600;
	
	int Minutos = Entrada / 60;
	Entrada %= 60;
	
	Entrada = Entrada;
	
	System.out.printf("%d:%d:%d%n", Horas, Minutos, Entrada);
	
	in.close();
}
}
