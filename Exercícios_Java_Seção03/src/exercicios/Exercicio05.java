package exercicios;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		//Leia um número real e imprima a quinta parte desse número
		
		
		Scanner in = new Scanner(System.in);
		float Num;
		System.out.print("Digite um número real: ");
		Num = in.nextFloat();
		System.out.println("A quinta parte do número " + Num +" é " +(Num / 5));
		
	}

}
