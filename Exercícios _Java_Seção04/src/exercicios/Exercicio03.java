package exercicios;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler um número real. Se positivo, imprimir raíz quadrada. Do contrário imprimir o número ao quadrado
	
	double Num;
	System.out.print("Digite um número: ");
	Num = in.nextDouble();
    double	Resul = Math.pow(Num, 2);

	if (Num > 0) {
		System.out.print("A raíz quadrada de "+Num+" é: "+Math.sqrt(Num));
	}else {
		System.out.print("O quadrado de " +Num+" é: "+Resul);
	} 
	in.close();
}
}
