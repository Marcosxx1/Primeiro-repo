package exercicios;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		//Leia um n�mero real e imprima a quinta parte desse n�mero
		
		
		Scanner in = new Scanner(System.in);
		float Num;
		System.out.print("Digite um n�mero real: ");
		Num = in.nextFloat();
		System.out.println("A quinta parte do n�mero " + Num +" � " +(Num / 5));
		
	}

}
