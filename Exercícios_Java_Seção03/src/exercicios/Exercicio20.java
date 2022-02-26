package exercicios;
import java.util.Scanner;

public class Exercicio20 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	//Ler um valor de massa em quilos, converter para livras; L = K * 2.205
	Double K, L;
	System.out.print("Digite o valor em quilos: ");
	K = in.nextDouble();
	L = K * 2.205;
	System.out.print(K+" quilos é o mesmo que "+L+" libras");

}
}
