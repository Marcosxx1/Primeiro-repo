package exercicios;

import java.util.Scanner;

public class Exercicio14 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Receber três notas. Trabalho de laboratório P2, Avaliação Semestral P3, Exame final P5. 
	//REPOVRADO SE (0~2,9) RECUPERAÇÃO SE (3 E 4,9) OU APROVADO (>4,9}
	
	float Nota1, Nota2, Nota3, Media;
	System.out.println("Digite nota do Trabalho de laboratório: ");
	Nota1 = in.nextFloat();
	System.out.println("Digite a nota da Avaliação Semestral: ");
	Nota2 = in.nextFloat();
	System.out.println("Digite a nota do Exame final: ");
	Nota3 = in.nextFloat();
	
	Media = ((Nota1 * 2) + (Nota2 * 3) + (Nota3 * 5)) /10;
	
	if(Media < 2.9) {
		System.out.println("Reprovado");
	}else if(Media >=2.9 & Media <= 4.9) {
		System.out.println("Recuperação");
	}else {
		System.out.println("Aprovado");
	}
	
	
	in.close();
}
}