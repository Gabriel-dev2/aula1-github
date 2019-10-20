package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int tam = sc.nextInt();
		System.out.println("Informe um número inteiro: ");
		int tam2 = sc.nextInt();
		
		
		int[][] matriz = new int[tam][tam2];
		
		for (int i = 0; i < matriz.length; i++) {
		    for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe o número");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println(" ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Buscar ocorrencia: ");
		int num = sc.nextInt();
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == num) {
					System.out.println("Position " + i + ", " + j + ":");
					if(j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);	
					}
					
					if(i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					
					if(j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					
					if(i < matriz[i].length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
					
				}
			}
		}
		
		sc.close();
	}

}