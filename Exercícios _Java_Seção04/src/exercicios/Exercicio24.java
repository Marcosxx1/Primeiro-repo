package exercicios;

import java.util.Scanner;

public class Exercicio24 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//ler o valor e estado de destino. Retornar preço final do produto com impostos. Mostrar inválido se algo errado. (MG 7%, SP 12%, RJ 15% MS8%)
	
	double Valor;
	int Estado;
	System.out.println("Digite o valor: ");
	Valor = in.nextDouble();
	System.out.println("Digite o estado\n1- MG\n2- SP\n3- RJ\n4- MS");
	Estado = in.nextInt();
		switch (Estado) {
		case 1:
			System.out.println("O valor "+Valor+" no MS, acrescido de impostos é: "+(Valor+=( Valor * 0.07)));

			break;

		case 2:
			System.out.println("O valor "+Valor+" no SP, acrescido de impostos é: "+(Valor+=( Valor * 0.12)));

			break;
		case 3:
			System.out.println("O valor "+Valor+" no RJ, acrescido de impostos é: "+(Valor+=( Valor * 0.15)));

			break;
		case 4:
			System.out.println("O valor "+Valor+" no MS, acrescido de impostos é: "+(Valor+=( Valor * 0.08)));

			break;
		default:
			break;
		}

	
	in.close();
}
}
