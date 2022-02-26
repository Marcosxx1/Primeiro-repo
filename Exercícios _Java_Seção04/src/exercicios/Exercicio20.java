package exercicios;

import java.util.Scanner;

public class Exercicio20 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	/*Menu. Ler a opção do usuário, mostrar mensagem de erro caso inválodo.
	1- Soma de dois números. 
	2- Diferença enre doisnúmeros (Maior pelo menor).
	3-Produto entre 2 números.
	4- Divisão entre 2 números(Den não pode ser 0)*/
	
	int Entrada;
	double Num1, Num2;
	do {System.out.println("Escolha a opção:\n1- Soma de dois números.\n2- Diferença entre dois números.\n3- Produto entre dois números.\n4- Divisão entre dois números.\nEntre com 123 para sair.");
    Entrada = in.nextInt();
    
	System.out.println("Digite o primeiro número: ");
	Num1 = in.nextDouble();
	System.out.println("Digite o Segundo número: ");
	Num2 = in.nextDouble();
	
	switch (Entrada) {
	case 1:

		System.out.println("A soma de "+Num1+" e "+Num2+" é: "+(Num1+Num2));
		break;
		
	case 2:

		System.out.println("A diferença de "+Num1+" e "+Num2+" é: "+(Num2-Num1));
		break;
		
	case 3:

		System.out.println("O produto de "+Num1+" e "+Num2+" é: "+(Num1*Num2));
		break;
		
	case 4:
		while(Num2 <= 0) {
			System.out.println("Número inválido");
			System.out.println("Digite o Segundo número: ");
			Num2 = in.nextDouble();
		}
		System.out.println("A divisão de "+Num1+" e "+Num2+" é: "+(Num1/Num2));
		break;

	default:
		break;
	}
	
	}while(Entrada !=123);
	in.close();
}
}
