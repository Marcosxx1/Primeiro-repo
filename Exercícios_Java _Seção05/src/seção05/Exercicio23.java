package seção05;

import java.util.Scanner;

public class Exercicio23 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int Num, Contador = 0, Resultado;
	 Num = in.nextInt();
	   
	   for(int i = 1 ; i <= Num; i++) { //Loop será executado até o valor da entrada
		   	Contador ++ ;   			//Adiciona 1 por 1 enquanto o loop executa
	    	Resultado = Num % Contador; // Atribui ao resultado o resto da divisão do número pelo contador 
	    		
	    	if (Resultado == 0){
	    		System.out.println(Contador);
	    }
	 } 
in.close();
}
}
