package AulasBasicas;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro n�mero:");
		int x = sc.nextInt();
		System.out.println("Segundo n�mero:");
		int y = sc.nextInt();
		
		int soma = x+y;
		
		System.out.println("A soma de " +x+ "+" +y+ "� igual a :" + soma);
		
		sc.close();
		
	}

}
