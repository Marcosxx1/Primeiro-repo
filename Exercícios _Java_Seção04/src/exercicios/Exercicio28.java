package exercicios;

import java.util.Scanner;

public class Exercicio28 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double A[] = new double [3], Media;
	char Entrada;

	System.out.println("Digite a opção:\n(a)- Geométrica\n(b)- Ponderada\n(c)- Harmônica\n(d)- Aritimética");
	Entrada = in.next().charAt(0);
		switch (Entrada) {
		case 'a':
			System.out.println("***MÉDIA GEOMÊTRICA***");
			for (int i = 0; i<3; i++) {
				System.out.println("Digite o "+(i+1)+" número: ");
				A[i] = in.nextDouble();
			}
			Media = Math.cbrt((A[0] + A[1]+ A[2]));
			System.out.println("A média geométrica dos números informados é: "+Media);
		
				
			break;

		case 'b':
			System.out.println("***MÉDIA PONDERADA***");
			for (int i = 0; i<3; i++) {
				System.out.println("Digite o "+(i+1)+" número: ");
				A[i] = in.nextDouble();
			}
			Media = (A[0] + (A[1] * 2) + (A[2]) * 3) /6;
			System.out.println("A média ponderada dos números informados é: "+Media);

			
			break;

			
		case 'c':
			System.out.println("***MÉDIA Harmônica***");
			for (int i = 0; i<3; i++) {
				System.out.println("Digite o "+(i+1)+" número: ");
				A[i] = in.nextDouble();
			}
			Media = 1/ ((1/A[0]) + (1/A[1])+ (1/A[2])) ;
			System.out.println("A média harmônica dos números informados é: "+Media);

			
			break;
			
		case 'd':
			System.out.println("***MÉDIA ARITIMÉTICA***");
			for (int i = 0; i<3; i++) {
				System.out.println("Digite o "+(i+1)+" número: ");
				A[i] = in.nextDouble();
			}
			Media = (A[0] + A[1]+ A[2]) /3;
			System.out.println("A média aritimética dos números informados é: "+Media);
			

			
			break;

		default:
			break;
		}
	
	
	
	in.close();
}
}