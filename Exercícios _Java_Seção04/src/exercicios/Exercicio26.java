package exercicios;
import java.util.Scanner;

public class Exercicio26 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//Ler a distância em Km quantidade de letros de gasolina consimidos por um carro em um percurso, carcular o consumo em Km/l. Mostrar a mensagem
	float Dist, Gasol, Media;
	
	System.out.println("Informe a distância percorrida: ");
	Dist = in.nextFloat();
	System.out.println("Informe a quantida de litros de combustível consumida: ");
	Gasol = in.nextFloat();
	
	Media = Dist / Gasol;
	if(Media < 8) {
		System.out.println("O carro esta fazendo "+Media+" Km/l. Venda o carro!");
	}
	if((Media >= 8) & (Media <= 14)) {
		System.out.println("O carro esta fazendo "+Media+" Km/l. Economico!");
	}
	if(Media > 12) {
		System.out.println("O carro esta fazendo "+Media+" Km/l. Super economico!");
	}
	
	
	
	in.close();
}
}
