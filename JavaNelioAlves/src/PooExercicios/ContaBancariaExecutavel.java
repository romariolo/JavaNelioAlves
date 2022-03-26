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
		System.out.print("Número da conta :");
		int contaNumero = sc.nextInt();
		System.out.println("Fará depósito inicial? S/N");
		char resposta = sc.next().charAt(0);

		if (resposta == 'S') {
			System.out.print("Qual o valor do depósito?");
			double depositoInicial = sc.nextDouble();
			contaBancaria = new ContaBancaria(nome, contaNumero, depositoInicial);
		} else {
			contaBancaria = new ContaBancaria(nome, contaNumero);
		}

		System.out.println();
		System.out.println("Dados da conta : ");
		System.out.println(contaBancaria);
		System.out.println();

		System.out.print("Valor do depósito: ");
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
