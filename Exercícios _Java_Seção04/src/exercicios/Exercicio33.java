package exercicios;

import java.util.Scanner;

public class Exercicio33 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double PrecAn;
	System.out.print("Digite o preço antigo: ");
	PrecAn = in.nextDouble();
	if(PrecAn <50) {
		System.out.print("O preço antigo ("+PrecAn+") com acréscimo de 5% é: "+(PrecAn+=PrecAn * 0.05));
	}
	else if(PrecAn >= 50 || PrecAn <= 100) {
		System.out.print("O preço antigo ("+PrecAn+") com acréscimo de 10% é: "+(PrecAn+=PrecAn * 0.10));
	}
	else if(PrecAn >100) {
		System.out.print("O preço antigo ("+PrecAn+") com acréscimo de 15% é: "+(PrecAn+=PrecAn * 0.15));
	}
	
	in.close();
}
}
