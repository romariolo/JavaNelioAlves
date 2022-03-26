package Entities;

public class Product {

	private String nome;
	private double price;
	private int quantity;
	
	public Product() {
		
	}

	public Product (String nome, double price, int quantity) {
		this.nome =nome;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public Product (String nome, double price) {
		this.nome =nome;
		this.price = price;
	
	}
	
	public double totalValue() {

		return quantity * price;

	}
	
	
	public void addProducts(int quantity) {
	    
	    this.quantity += quantity;
	    
	}
	
	public void remove(int quantity) {
		
		this.quantity -= quantity;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	

	public String toString() {
		return nome
			+ " ; "
			+ String.format("%.2f", price)
			+ " Reais "
			+" ; "
			+ quantity
			+" Unidades "
			+ String.format("%.2f", totalValue());
		
	}
}
