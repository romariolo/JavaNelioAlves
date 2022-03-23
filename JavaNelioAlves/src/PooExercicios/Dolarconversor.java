package PooExercicios;



public class Dolarconversor {
	
	
		
	public static double converter(double cotacao, double quant) {
       double valorConvertido =0;
       
       valorConvertido = (cotacao * quant) + (cotacao * quant * 6 /100) ;
       
       return valorConvertido;
		
	}
	
	
}
