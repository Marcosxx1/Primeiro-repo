package exercicios;
import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		//Leia um n�mero inteiro e imprima seu antecessor e seu sucessor
		int Num;
		System.out.print("Digite o n�mero: ");
		Num = in.nextInt();
		System.out.print(Num-1+" � o antecessor de "+Num+", e "+(Num+1)+" � seu sucessor!");
		
	}
}
