package seção05;

import java.util.Scanner;

public class Exercicio22 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cont = 0;
	float Media = 0;
	float notaAluno = in.nextFloat();
	
	while(notaAluno >=10 && notaAluno <=20) {
		cont++;
		Media += notaAluno;
		notaAluno = in.nextFloat();

	}
	
	System.out.println(Media / cont);
	
	
	
	
	
	
	in.close();
}
}
