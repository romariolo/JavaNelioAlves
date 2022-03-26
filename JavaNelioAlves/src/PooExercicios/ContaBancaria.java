package PooExercicios;

public class ContaBancaria {

	public String nome;
	private int contaNumero;
	private double saldo;

	
	
	public void sacar(double quantidade) {
		
		saldo = saldo - quantidade - 5;
	}
	
	public void depositar(double quantitade) {
		
		 saldo += quantitade;
		
	}
	
	
	public ContaBancaria() {

	}

	public ContaBancaria(String nome, int contaNumero) {
		this.nome = nome;
		this.contaNumero = contaNumero;

	}

	
	public ContaBancaria(String nome, int contaNumero, double depositoInicial) {
		this.nome = nome;
		this.contaNumero = contaNumero;
        depositar(depositoInicial);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getContaNumero() {
		return contaNumero;
	}

	

	public double getSaldo() {
		return saldo;
	}

	

	@Override
	public String toString() {
		return "ContaBancaria [nome=" 
	+ nome 
	+ ", contaNumero=" 
	+ contaNumero 
	+ ", saldo=" 
	+ saldo + "]";
	}
	
	

}
