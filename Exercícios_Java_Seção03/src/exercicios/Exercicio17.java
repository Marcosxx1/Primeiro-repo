package exercicios;
import java.util.Scanner;

public class Exercicio17 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Polegadas para cent�metros. Cm = Pl *2,54
	double Cm, Pl;
	System.out.print("Digite o comprimento em cent�metros: ");
	Cm = in.nextDouble();
	Pl = Cm / 2.54;
	System.out.print(Cm+" cent�metros � igual a "+Pl+" polegadas.");
	
}
}
