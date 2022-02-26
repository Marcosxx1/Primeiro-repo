package exercicios;
import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		//Leia um número inteiro e imprima seu antecessor e seu sucessor
		int Num;
		System.out.print("Digite o número: ");
		Num = in.nextInt();
		System.out.print(Num-1+" é o antecessor de "+Num+", e "+(Num+1)+" é seu sucessor!");
		
	}
}
