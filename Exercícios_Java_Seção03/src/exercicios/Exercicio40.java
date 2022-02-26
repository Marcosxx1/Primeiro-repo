package exercicios;
import java.util.Scanner;
public class Exercicio40 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Encanador recebe 30 por dia. Receber e imprimir dias trabalhados - 8% de imposto de renda
	Double DiasTra;
	System.out.println("Digite a quantidade de dias trabalhados: ");
	DiasTra = in.nextDouble();
	DiasTra *= 30;
	DiasTra -= (DiasTra *0.08);
	System.out.println("Recebera: "+ DiasTra);
	
	
}
}
