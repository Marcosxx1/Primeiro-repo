package exercicios;

import java.util.Scanner;

public class Exercicio08 {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	//Ler duas notas, verificar se s�o v�lidas, exibir a m�dia. V�lido � entre 0.0 e 10.0. Informar quando a nota n�o � valida
	
	float Nota1, Nota2, Media;
	System.out.println("Digite a primeira nota: ");
	Nota1 = in.nextFloat();
	System.out.println("Digite a segunda nota: ");
	Nota2 = in.nextFloat();
	Media = (Nota1 + Nota2) /2;

	
	if(Nota1 < 0  || Nota1 > 10) {
		System.out.println("Nota "+Nota1+" inv�lida!");
	}
	
	if(Nota2 < 0 || Nota2 > 10) {
		System.out.println("Nota "+Nota2+" inv�lida!");
	}
	
	if(Nota1 > 0  & Nota2 <=10) {
		System.out.println("A m�dia entre as duas notas �: "+Media);

	}
	in.close();
}
}
