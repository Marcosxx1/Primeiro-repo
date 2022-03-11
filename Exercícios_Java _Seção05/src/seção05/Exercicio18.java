package seção05;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos números serão informados? ");
		int Tamanho = in.nextInt();
		
		int Maior = 0;
		int cont = 1;
		int[] Entrada = new int[Tamanho];
		
		for(int i = 0; i < Tamanho; i++ ) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			Entrada[i] = in.nextInt();
		}
		for(int i = 0; i <Entrada.length; i++) {
			
			if(Entrada[i] > Maior) {
				Maior = Entrada[i];
				
			}else if(Maior == Maior) {
				cont ++;
			}
				
		}
		System.out.println(" maior: "+Maior+" e foi digitado: "+cont+" vezes");
		in.close();
	}
}
