package exercicios;

import java.util.Scanner;

public class Exercicio11 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um n�mero inteiro maior que 0 e imprima a soma de todo seus algarismos. 251 corresponder� a 8 (2+5+1)
	int Num, Cont = 0;
	System.out.println("Digite um n�mero: ");
	Num = in.nextInt();
	while(Num >0 ) {
		Cont+= Num %10;
        Num /= 10;//num = num / 10;

	}
	System.out.println(Cont);

	
	in.close();
}
}
