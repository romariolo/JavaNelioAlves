package AulasBasicas;

import java.util.Scanner;

public class Exercicio4 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("N�mero de idntifica��o:");
		int number = sc.nextInt();
		System.out.println("Quantidade de horas trabalhadas :");
		int horas =sc.nextInt();
		System.out.println("Valor da hora de trabalho:");
		double valorHora = sc.nextDouble();
		
		double salario = (double) horas * valorHora;
		
		System.out.printf
		("O funcion�rio n�mero " +number+ "Trabalhou " +horas+ " e receber� um sal�rio de :" +salario);
		
		sc.close();
	}
}
