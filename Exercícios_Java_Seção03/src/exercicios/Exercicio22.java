package exercicios;
import java.util.Scanner;

public class Exercicio22 {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	//Ler o valor em jardas, converter para metros. M = 0,91 *J
	
	double M, J;
	System.out.print("Digite a distância em Jardas: ");
	J = in.nextDouble();
	M = 0.91 * J;
	
	System.out.print(J+" Jardas é o mesmo que "+M+" metros");
}
}