package AulasBasicas;

import java.util.Scanner;


public class PrecoMetroTerreno {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno :");
		
		double largura = sc.nextDouble();
		
		System.out.println("Digite o cumprimento do terreno");
		
		double cumprimento = sc.nextDouble();
		
		System.out.println("Digite o preco do metro");
		
		double preco = sc.nextDouble();
		
		double area = largura * cumprimento;
		
		double precoTerreno = area * preco;
		
		System.out.printf("Area = %.2f%n", area);
		
		System.out.printf("Preco  = %.2f%n", precoTerreno);
		
		sc.close();
		
		
	}

}
