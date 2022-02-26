package exercicios;
import java.util.Scanner;

public class Exercicio16 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Polegadas para centímetros. Cm = Pl *2,54
	double Cm, Pl;
	System.out.print("Digite o comprimento em Polegadas: ");
	Pl = in.nextDouble();
	Cm = Pl * 2.54;
	
	System.out.print(Pl+" Polegadas é igual a "+Cm+" Centímetros.");
	
}
}
