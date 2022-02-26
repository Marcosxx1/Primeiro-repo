package seção05;

import java.util.Scanner;

public class Exercicio09 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int Num, Impar= 1;
	System.out.println("Digite o número: ");
	Num = in.nextInt();
	
	
		for(int i = 0; i <Num; i++) {
			System.out.println(Impar =+ Impar + 2);
		}
	
	
	
	in.close();
}
}
