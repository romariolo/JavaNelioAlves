package Entities;

import java.util.Locale;
import java.util.Scanner;

public class PooExecutavel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		 x = new Triangle();
		 y = new Triangle();
		 
		 System.out.println("Enter three numbers triangle x:");
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		 
		 System.out.println("Enter three numbers triangle Y:");
		 y.a = sc.nextDouble();
		 y.b = sc.nextDouble();
		 y.c = sc.nextDouble();
         
		 
		 double areaX = x.area();
		 double areaY = y.area();
		 
		 if(areaX > areaY) {
			 System.out.println("A area do triangulo X é maior " + areaX);
			 
		 }else {
			 System.out.println("A area do triangulo Y é maior " + areaY);
		 }
		 
		 sc.close();
	}

}
