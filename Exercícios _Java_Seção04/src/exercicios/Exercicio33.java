package exercicios;

import java.util.Scanner;

public class Exercicio33 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double PrecAn;
	System.out.print("Digite o pre�o antigo: ");
	PrecAn = in.nextDouble();
	if(PrecAn <50) {
		System.out.print("O pre�o antigo ("+PrecAn+") com acr�scimo de 5% �: "+(PrecAn+=PrecAn * 0.05));
	}
	else if(PrecAn >= 50 || PrecAn <= 100) {
		System.out.print("O pre�o antigo ("+PrecAn+") com acr�scimo de 10% �: "+(PrecAn+=PrecAn * 0.10));
	}
	else if(PrecAn >100) {
		System.out.print("O pre�o antigo ("+PrecAn+") com acr�scimo de 15% �: "+(PrecAn+=PrecAn * 0.15));
	}
	
	in.close();
}
}
