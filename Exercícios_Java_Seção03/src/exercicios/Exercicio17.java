package exercicios;
import java.util.Scanner;

public class Exercicio17 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Polegadas para centímetros. Cm = Pl *2,54
	double Cm, Pl;
	System.out.print("Digite o comprimento em centímetros: ");
	Cm = in.nextDouble();
	Pl = Cm / 2.54;
	System.out.print(Cm+" centímetros é igual a "+Pl+" polegadas.");
	
}
}
