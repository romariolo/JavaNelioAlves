package PooExercicios;

public class Retangulo {

	double width;
	double height;
	
	double area() {
		return width * height;
	}
	
	double perimeter() {
		
		return (width *2) + (height *2);
		
	}
	
	double diagonal() {
		return Math.sqrt(width*width + height*height );
		
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
