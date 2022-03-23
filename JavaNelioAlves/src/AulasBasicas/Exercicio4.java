package AulasBasicas;

import java.util.Scanner;

public class Exercicio4 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de idntificação:");
		int number = sc.nextInt();
		System.out.println("Quantidade de horas trabalhadas :");
		int horas =sc.nextInt();
		System.out.println("Valor da hora de trabalho:");
		double valorHora = sc.nextDouble();
		
		double salario = (double) horas * valorHora;
		
		System.out.printf
		("O funcionário número " +number+ "Trabalhou " +horas+ " e receberá um salário de :" +salario);
		
		sc.close();
	}
}
