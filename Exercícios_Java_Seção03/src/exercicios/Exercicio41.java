package exercicios;
import java.util.Scanner;
public class Exercicio41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Ler o valor da hora de trabalho e o número de horas trabalhadas no mês. Imprimir o valor a ser pago ao funcionário + 10% 
		double HorTra, HorTraMes, Resul;
		System.out.print("Digite o valor por hora de trabalho: ");
		HorTra = in.nextDouble();
		System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
		HorTraMes = in.nextDouble();
		Resul = (HorTraMes * HorTra);
		Resul += (Resul* 0.10);
		System.out.print("Você receberá: "+Resul);
	}
}
