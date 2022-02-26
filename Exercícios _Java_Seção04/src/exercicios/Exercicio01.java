package exercicios;
import java.util.Scanner;
public class Exercicio01 {
 public static void main (String[] args) {
	 //Receber dois números e mostrar qual é maior
	 Scanner in = new Scanner(System.in);
	 int A, B;
	 System.out.print("Digite o primeiro: ");
	 A = in.nextInt();
	 
	 System.out.print("Digite o segundo: ");
	 B = in.nextInt();
	 
	 if (A > B) {
		 System.out.print("O primeiro é maior que o segundo");
	 }else {

			 System.out.print("O segundo é maior que o primeiro");
	 }
	 

	 
	 
	 in.close();
 }
}
