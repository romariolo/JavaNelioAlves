package AulasBasicas;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
         
		double valorTotal = 0;
		for (int i = 1; i <= 2; i++) {

			System.out.println("Informe o c�digo da pe�a:");
			int code = sc.nextInt();

			System.out.println("Informe a quantidade :");
			int quantPecas = sc.nextInt();

			System.out.println("Valor unit�rio");
			double valorUnitario = sc.nextDouble();
			

			valorTotal = valorUnitario *quantPecas; 
			System.out.println(valorTotal);
		}
		
		sc.close();
		
	}
}
