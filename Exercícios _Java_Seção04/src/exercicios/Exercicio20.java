package exercicios;

import java.util.Scanner;

public class Exercicio20 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	/*Menu. Ler a op��o do usu�rio, mostrar mensagem de erro caso inv�lodo.
	1- Soma de dois n�meros. 
	2- Diferen�a enre doisn�meros (Maior pelo menor).
	3-Produto entre 2 n�meros.
	4- Divis�o entre 2 n�meros(Den n�o pode ser 0)*/
	
	int Entrada;
	double Num1, Num2;
	do {System.out.println("Escolha a op��o:\n1- Soma de dois n�meros.\n2- Diferen�a entre dois n�meros.\n3- Produto entre dois n�meros.\n4- Divis�o entre dois n�meros.\nEntre com 123 para sair.");
    Entrada = in.nextInt();
    
	System.out.println("Digite o primeiro n�mero: ");
	Num1 = in.nextDouble();
	System.out.println("Digite o Segundo n�mero: ");
	Num2 = in.nextDouble();
	
	switch (Entrada) {
	case 1:

		System.out.println("A soma de "+Num1+" e "+Num2+" �: "+(Num1+Num2));
		break;
		
	case 2:

		System.out.println("A diferen�a de "+Num1+" e "+Num2+" �: "+(Num2-Num1));
		break;
		
	case 3:

		System.out.println("O produto de "+Num1+" e "+Num2+" �: "+(Num1*Num2));
		break;
		
	case 4:
		while(Num2 <= 0) {
			System.out.println("N�mero inv�lido");
			System.out.println("Digite o Segundo n�mero: ");
			Num2 = in.nextDouble();
		}
		System.out.println("A divis�o de "+Num1+" e "+Num2+" �: "+(Num1/Num2));
		break;

	default:
		break;
	}
	
	}while(Entrada !=123);
	in.close();
}
}
