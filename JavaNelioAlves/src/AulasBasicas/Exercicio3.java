package AulasBasicas;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		System.out.println("Valor de A:");
		int A = sc.nextInt();
		System.out.println("Valor de B:");
		int B = sc.nextInt();
		System.out.println("Valor de C:");
		int C = sc.nextInt();
		System.out.println("Valor de D:");
		int D = sc.nextInt();

		int resultado = (A*B - C*D);
		
		System.out.println("A difernça de " +A+ "x" +B+ "-" +C+ "x" +D+ "=" +resultado);
		sc.close();
	}

}
