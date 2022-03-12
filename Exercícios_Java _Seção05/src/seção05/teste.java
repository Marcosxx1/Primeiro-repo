package seção05;

import java.util.Scanner;

public class teste {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int Num = in.nextInt();
	
	for(int i = 1; i <= Num; i+=1) {
		if (Num % i  == 0) {
			System.out.println(" "+ i);
		}
		
	}
}
}
