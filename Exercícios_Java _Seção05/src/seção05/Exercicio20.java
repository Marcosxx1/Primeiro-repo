package se��o05;

import java.util.Scanner;

public class Exercicio20 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler uma sequ�ncia de n�meros inteiros, determinar se s�o pares ou n�o.
	//Informar quantos n�meros foram lidos, e quantos pares. Terminar quando digitado 1000

	int Entrada =0, contTotal = -1, contPar = -1;
	
	while( Entrada < 1000) {
	Entrada = in.nextInt();
	if(Entrada % 2 == 0) {
		contPar++;
		}
	contTotal++;
	}
	System.out.println(contPar+" par(es) de "+contTotal+" lido(s)");
	in.close();
}
}