package PooExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2Poo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("Salário Bruto :");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.println("Desontos em folha: ");
		funcionario.descontos = sc.nextDouble();
		
		System.out.println(funcionario);
		
		double porcentagem =0;
		
		System.out.println("porcentagem  do aumento :");
		porcentagem = sc.nextDouble();
		porcentagem = funcionario.calcularAumentoSalarioBruto(porcentagem);
		
		System.out.println(funcionario);
		
		sc.close();
	}

}
