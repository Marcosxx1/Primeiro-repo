package exercicios;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um n�mero real. Se positivo, imprimir ra�z quadrada. Do contr�rio imprimir o n�mero ao quadrado
	
	double Num;
	System.out.print("Digite um n�mero: ");
	Num = in.nextDouble();
    double	Resul = Math.pow(Num, 2);

	if (Num > 0) {
		System.out.print("A ra�z quadrada de "+Num+" �: "+Math.sqrt(Num));
	}else {
		System.out.print("O quadrado de " +Num+" �: "+Resul);
	} 
	in.close();
}
}
