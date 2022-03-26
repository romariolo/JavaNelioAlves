package PooExercicios;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaBancariaExecutavel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		ContaBancaria cb = new ContaBancaria();
		ContaBancaria contaBancaria;

		System.out.println("-------------");
		System.out.print("Inform seu nome :");
		String nome = sc.nextLine();
		System.out.print("N�mero da conta :");
		int contaNumero = sc.nextInt();
		System.out.println("Far� dep�sito inicial? S/N");
		char resposta = sc.next().charAt(0);

		if (resposta == 'S') {
			System.out.print("Qual o valor do dep�sito?");
			double depositoInicial = sc.nextDouble();
			contaBancaria = new ContaBancaria(nome, contaNumero, depositoInicial);
		} else {
			contaBancaria = new ContaBancaria(nome, contaNumero);
		}

		System.out.println();
		System.out.println("Dados da conta : ");
		System.out.println(contaBancaria);
		System.out.println();

		System.out.print("Valor do dep�sito: ");
		double deposito = sc.nextDouble();
		contaBancaria.depositar(deposito);
		System.out.println("Dados da conta : ");
		System.out.println(contaBancaria);
		System.out.println();		

		System.out.println();
		System.out.print("Valor do saque: ");
		double saque = sc.nextDouble();
		System.out.println("Dados da conta : ");
		System.out.println(contaBancaria);
		System.out.println();

		contaBancaria.sacar(saque);

		System.out.println(contaBancaria);

		sc.close();
	}

}
