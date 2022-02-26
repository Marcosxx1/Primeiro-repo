package seção05;

import java.util.Scanner;

public class Exercicio19a {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String Valor = in.nextLine(); //nextLine para string      
	
	for(int i = 0; i<Valor.length(); i++ ) {
		System.out.println(Valor.charAt(i));
	}
	
	
	
	in.close();
}
}
