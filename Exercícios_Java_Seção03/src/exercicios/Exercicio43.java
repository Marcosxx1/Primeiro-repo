package exercicios;
import java.util.Scanner;
public class Exercicio43 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*Apartir de um valor lido, mostre : 
		O total a pagar com desconto de 10%.
		O valor  de cada parcela, no parcelamento de 3x sem juros.
		A comissão do vendedor, no caso da venda ser a vista(5% sobre o valor com desconto).
		A comissão do vendedor, no caso da venda ser parcelada*/
		
		double Valor, Parc, ComissAVist, ComissParc;
		System.out.print("Digite o valor do produto: ");
		Valor = in.nextDouble();
		ComissParc = Valor * 0.05;
		Valor -= Valor * 0.10;
		Parc = Valor /3;
		ComissAVist = Valor * 0.05;
		

		System.out.println("Total a pagar com desconto de 10%: "+Valor);
		System.out.println("Valor da parcela (1 de 3), sem jutos: "+Parc);
		System.out.println("A comissão do vendedor (Caso pagamento a vista): "+ComissAVist);
		System.out.println("A comissão do vendedor (Caso pagamento parcelado): "+ComissParc);



		
	}
}
