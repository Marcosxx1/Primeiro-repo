package exercicios;
import java.util.Scanner;
public class Exercicio41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Ler o valor da hora de trabalho e o n�mero de horas trabalhadas no m�s. Imprimir o valor a ser pago ao funcion�rio + 10% 
		double HorTra, HorTraMes, Resul;
		System.out.print("Digite o valor por hora de trabalho: ");
		HorTra = in.nextDouble();
		System.out.print("Digite a quantidade de horas trabalhadas no m�s: ");
		HorTraMes = in.nextDouble();
		Resul = (HorTraMes * HorTra);
		Resul += (Resul* 0.10);
		System.out.print("Voc� receber�: "+Resul);
	}
}
