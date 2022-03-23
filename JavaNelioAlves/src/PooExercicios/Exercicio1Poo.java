package PooExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1Poo {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Altura do retângulo");
		retangulo.width = sc.nextDouble();

		System.out.println("Cumprimento retângulo");
		retangulo.height = sc.nextDouble();
		
		double areaRetangulo =0;
		areaRetangulo = retangulo.area();
		System.out.println("Area = " + areaRetangulo);
		
		double perimetro =0;
		
		perimetro = retangulo.perimeter();
		System.out.println("Perímetro = " + perimetro);
		
		double diagonal = 0;
		diagonal = retangulo.diagonal();
		System.out.printf("Diagonal = %.2f%n" , diagonal);
		
		
	}

}
