package exercicios;
import java.util.Scanner;
public class Exercicio37 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Ler o valor de um produto, imprimir o valor com desconto de 12%
		double Preco;
		System.out.print("Digite o valor do produto: ");
		Preco = in.nextDouble();
		Preco+=( Preco * 0.12) ;
		System.out.print("O valor do produto com desconto é: "+Preco);
	}
}
