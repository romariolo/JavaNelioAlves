package AulasBasicas;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double  r = 0, a, pi =3.14159; 
		System.out.println("Valor do Raio:");
		
		r = sc.nextDouble();
		
		a = r*r*pi;
		
		
		System.out.printf("O valor da area do circulo é : %.4f%n", a );
		
		sc.close();
	}

}
