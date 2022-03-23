package Entities;

import java.util.Locale;
import java.util.Scanner;

public class ProductExecutavel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Valor:");
		double price = sc.nextDouble();
		System.out.print("Quantidade :");
		int quantity = sc.nextInt();
		
		Product product = new Product(nome, price, quantity);

		System.out.println();
		System.out.println("Status :" + product);

		System.out.println("Quantos produtos deseja adicionar?");

		quantity = sc.nextInt();

		product.addProducts(quantity);

		System.out.println();
		System.out.println("Status :" + product);

		System.out.println("Quantos produtos deseja remover");

		quantity = sc.nextInt();
		product.remove(quantity);


		System.out.println();
		System.out.println("Status :" + product);

		sc.close();
	}

}
