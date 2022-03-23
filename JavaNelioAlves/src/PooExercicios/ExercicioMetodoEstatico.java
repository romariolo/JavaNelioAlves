package PooExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMetodoEstatico {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dolarconversor dolarConversor = new Dolarconversor();
		
		System.out.println("Cotação de Hoje:");
		double cotacaoAtual = sc.nextDouble();
		
		System.out.println("Quantos dólares deseja comprar?");
		double quantDolares = sc.nextDouble();
		
		double valorEmReais = Dolarconversor.converter(cotacaoAtual, quantDolares);
		
		System.out.println(valorEmReais);
		
		
		sc.close();
	}

}
