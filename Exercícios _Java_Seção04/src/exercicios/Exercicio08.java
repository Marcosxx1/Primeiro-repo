package exercicios;

import java.util.Scanner;

public class Exercicio08 {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	//Ler duas notas, verificar se são válidas, exibir a média. Válido é entre 0.0 e 10.0. Informar quando a nota não é valida
	
	float Nota1, Nota2, Media;
	System.out.println("Digite a primeira nota: ");
	Nota1 = in.nextFloat();
	System.out.println("Digite a segunda nota: ");
	Nota2 = in.nextFloat();
	Media = (Nota1 + Nota2) /2;

	
	if(Nota1 < 0  || Nota1 > 10) {
		System.out.println("Nota "+Nota1+" inválida!");
	}
	
	if(Nota2 < 0 || Nota2 > 10) {
		System.out.println("Nota "+Nota2+" inválida!");
	}
	
	if(Nota1 > 0  & Nota2 <=10) {
		System.out.println("A média entre as duas notas é: "+Media);

	}
	in.close();
}
}
