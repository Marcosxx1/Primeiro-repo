package exercicios;


import java.util.Scanner;

public class Beecrowd1018 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		

    int Entrada = in.nextInt();
    int  Num = Entrada;
   
	
	System.out.println(Entrada);
     
	System.out.println(  Num / 100+" nota(s) de R$ 100,00");
	Num %= 100;					
	
	     
	System.out.println(  Num / 50+" nota(s) de R$ 50,00");
	Num %= 50;	
	
	System.out.println(  Num / 20+" nota(s) de R$ 20,00");
	Num %= 20;	
	
	System.out.println(  Num / 10+" nota(s) de R$ 10,00");
	Num %= 10;	
	
	System.out.println(  Num / 5+" nota(s) de R$ 5,00");
	Num %= 5;	
	
	System.out.println(  Num / 2+" nota(s) de R$ 2,00");
	Num %= 2;
	
	System.out.println(  Num / 1+" nota(s) de R$ 1,00");
	Num %= 100;
}
}
