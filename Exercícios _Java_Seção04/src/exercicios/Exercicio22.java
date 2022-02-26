package exercicios;

import java.util.Scanner;

public class Exercicio22 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler idade e tempode serviço, imprimir se pode ou não se aposentar.
	//*Ter pelo menos 65 anos
	//OU ter trabalhado pelo menos 30 anos
	//OU ter pelo menos 60 E trabalhado pelo menos 25 anos
	int Idade, TdS;
	System.out.println("Digite a idade: ");
	Idade = in.nextInt();
	System.out.println("Digite quantos anos de serviço: ");
	TdS = in.nextInt();
	
	if(Idade >=65 || TdS >30 || ((Idade >= 60 &TdS > 25))) {
		System.out.println("Apto(a) a se aposentar.");
	}else {
		System.out.println("Inapto(a) a se aposentar.");
	}
	
	in.close();
}
}
