package Entities;

import java.util.Locale;
import java.util.Scanner;

public class ProductExecutavel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.print("Valor:");
		double price = sc.nextDouble();
		
		
		
        Product product = new Product(nome, price);
        product.setNome("TV8k");
        product.setPrice(1200);
        System.out.println("Update name product :" + product.getNome());
        System.out.println("Update price product :" + product.getPrice());
		System.out.println();
		System.out.println("Status :" + product);

		System.out.println("Quantos produtos deseja adicionar?");

		int quantity = sc.nextInt();

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
