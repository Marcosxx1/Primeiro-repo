package exercicios;
import java.util.Scanner;

public class Exercicio32 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int Cod, Quant;
	System.out.println("Digite o c�digo do produto: ");
	Cod = in.nextInt();
	System.out.println("Digite a quantidade: ");
	Quant = in.nextInt();
	switch (Cod) {
	case 100:
		System.out.println(Quant+" cachorro quente. Valor unit�rio (1,20r$). Valor total: "+Quant*1.20);
		
		break;
	case 101:
		System.out.println(Quant+" Bauru Simples. Valor unit�rio (1,30r$). Valor total: "+Quant*1.30);
		
		break;
	case 102:
		System.out.println(Quant+" Bauru com Ovo. Valor unit�rio (1,50r$). Valor total: "+Quant*1.50);
		
		break;
	case 103:
		System.out.println(Quant+" Hamburguer. Valor unit�rio (1,20r$). Valor total: "+Quant*1.20);
		
		break;
	case 104:
		System.out.println(Quant+" CheeseBurguer. Valor unit�rio (1,70r$). Valor total: "+Quant*1.70);
		
		break;
	case 105:
		System.out.println(Quant+" Suco. Valor unit�rio (2,20r$). Valor total: "+Quant*2.20);
		
		break;
	case 106:
		System.out.println(Quant+" Refrigerante. Valor unit�rio (1,00r$). Valor total: "+Quant*1.00);
		
		break;

	default:
		break;
	}
	
	
	in.close();
}
}
