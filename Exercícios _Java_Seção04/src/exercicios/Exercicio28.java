package exercicios;

import java.util.Scanner;

public class Exercicio28 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double A[] = new double [3], Media;
	char Entrada;

	System.out.println("Digite a op��o:\n(a)- Geom�trica\n(b)- Ponderada\n(c)- Harm�nica\n(d)- Aritim�tica");
	Entrada = in.next().charAt(0);
		switch (Entrada) {
		case 'a':
			System.out.println("***M�DIA GEOM�TRICA***");
			for (int i = 0; i<3; i++) {
				System.out.println("Digite o "+(i+1)+" n�mero: ");
				A[i] = in.nextDouble();
			}
			Media = Math.cbrt((A[0] + A[1]+ A[2]));
			System.out.println("A m�dia geom�trica dos n�meros informados �: "+Media);
		
				
			break;

		case 'b':
			System.out.println("***M�DIA PONDERADA***");
			for (int i = 0; i<3; i++) {
				System.out.println("Digite o "+(i+1)+" n�mero: ");
				A[i] = in.nextDouble();
			}
			Media = (A[0] + (A[1] * 2) + (A[2]) * 3) /6;
			System.out.println("A m�dia ponderada dos n�meros informados �: "+Media);

			
			break;

			
		case 'c':
			System.out.println("***M�DIA Harm�nica***");
			for (int i = 0; i<3; i++) {
				System.out.println("Digite o "+(i+1)+" n�mero: ");
				A[i] = in.nextDouble();
			}
			Media = 1/ ((1/A[0]) + (1/A[1])+ (1/A[2])) ;
			System.out.println("A m�dia harm�nica dos n�meros informados �: "+Media);

			
			break;
			
		case 'd':
			System.out.println("***M�DIA ARITIM�TICA***");
			for (int i = 0; i<3; i++) {
				System.out.println("Digite o "+(i+1)+" n�mero: ");
				A[i] = in.nextDouble();
			}
			Media = (A[0] + A[1]+ A[2]) /3;
			System.out.println("A m�dia aritim�tica dos n�meros informados �: "+Media);
			

			
			break;

		default:
			break;
		}
	
	
	
	in.close();
}
}