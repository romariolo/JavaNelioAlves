package PooExercicios;

public class Funcionario {
	String name;
	double salarioBruto;
	double descontos;
	double aumento;
	
	
	public double calcularSalarioLiquido() {
		return salarioBruto - descontos;
	}

	public double calcularAumentoSalarioBruto(double porcentagem) {
		
		return salarioBruto += salarioBruto * porcentagem /100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getDescontos() {
		return descontos;
	}

	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}

	public double getAumento() {
		return aumento;
	}

	public void setAumento(double aumento) {
		this.aumento = aumento;
	}
	
	public String toString() {
		
		return 
				name
			+ " -"
			+ " R$ "
			+ String.format("%.2f%n", calcularSalarioLiquido());
		
	}

	
}
