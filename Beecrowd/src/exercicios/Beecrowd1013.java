package exercicios;

import java.util.Scanner;

public class Beecrowd1013 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int A = in.nextInt();
	int B = in.nextInt();
	int C = in.nextInt();
	
	int Maior = ((A > B && A > C)?A : (B > C)? B:C);
	System.out.println(Maior+" eh o maior");
	
	
	/*if(A > B && A > C ) {
		System.out.println(A+ " eh o maior");
	}else if(B > A && B >C) {
		System.out.println(B+ " eh o maior");
	}else if (C > A && C> B){
		System.out.println(C+ " eh o maior");
	}*/
}
}
