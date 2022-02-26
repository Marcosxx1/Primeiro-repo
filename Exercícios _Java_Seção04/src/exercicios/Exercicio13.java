package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Media ponderada de três notas,
		//Primeira e segunda prova = peso1. 
		//Terceira tem o peso 2. Mostrar a media do aluno e indicar se aprovado ou reprovado. Aprovação deve ser maior que 60 pontos
		
		float Nota1, Nota2, Nota3, Media;
		System.out.println("Digite a primeira nota: ");
		Nota1 = in.nextFloat();
		System.out.println("Digite a segunda nota: ");
		Nota2 = in.nextFloat();
		System.out.println("Digite a terceira nota: ");
		Nota3 = in.nextFloat();
		
		Media = ((Nota1 * 1) + (Nota2 * 1) + (Nota3 * 2)) /4;
		
		if(Media < 60) {
			System.out.println("A nota "+ Media+" não foi o suficiente. REPROVADO.");
		}else if (Media > 60) {
			System.out.println("A nota "+ Media+"  foi o suficiente. APROVADO.");
		}
		
		in.close();
	}

}
