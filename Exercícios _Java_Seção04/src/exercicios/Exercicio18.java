package exercicios;

import java.util.Scanner;

public class Exercicio18 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Criar um menu com 4 opções matemáticas (Básicas) Usuário escolhe uma das opções, depois ler dois valores
	int Entrada;
	double Num1, Num2;
	System.out.println("Escolha a opção:\n'+' para adição\n'-' para subtração\n'/'para divisão\n'*' para multiplicação. ");
    Entrada = in.next().charAt(0);
    
	System.out.println("Digite o primeiro número: ");
	Num1 = in.nextDouble();
	System.out.println("Digite o Segundo número: ");
	Num2 = in.nextDouble();
	
	switch (Entrada) {
	case '+':

		System.out.println("A soma de "+Num1+" e "+Num2+" é: "+(Num1+Num2));
		break;
		
	case '-':

		System.out.println("A subtração de "+Num1+" e "+Num2+" é: "+(Num1-Num2));
		break;
		
	case '/':

		System.out.println("A divisão de "+Num1+" e "+Num2+" é: "+(Num1/Num2));
		break;
		
	case '*':

		System.out.println("A multiplicação de "+Num1+" e "+Num2+" é: "+(Num1*Num2));
		break;

	default:
		break;
	}
	
	in.close();
}
}
