package exercicios;

import java.util.Scanner;

public class Exercicio18 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Criar um menu com 4 op��es matem�ticas (B�sicas) Usu�rio escolhe uma das op��es, depois ler dois valores
	int Entrada;
	double Num1, Num2;
	System.out.println("Escolha a op��o:\n'+' para adi��o\n'-' para subtra��o\n'/'para divis�o\n'*' para multiplica��o. ");
    Entrada = in.next().charAt(0);
    
	System.out.println("Digite o primeiro n�mero: ");
	Num1 = in.nextDouble();
	System.out.println("Digite o Segundo n�mero: ");
	Num2 = in.nextDouble();
	
	switch (Entrada) {
	case '+':

		System.out.println("A soma de "+Num1+" e "+Num2+" �: "+(Num1+Num2));
		break;
		
	case '-':

		System.out.println("A subtra��o de "+Num1+" e "+Num2+" �: "+(Num1-Num2));
		break;
		
	case '/':

		System.out.println("A divis�o de "+Num1+" e "+Num2+" �: "+(Num1/Num2));
		break;
		
	case '*':

		System.out.println("A multiplica��o de "+Num1+" e "+Num2+" �: "+(Num1*Num2));
		break;

	default:
		break;
	}
	
	in.close();
}
}
