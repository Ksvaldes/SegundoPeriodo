package scl.edu.gt;

import java.util.Scanner;

public class ArithmeticFunctions {

	 public static void sumar() {
		    
		 	Scanner numeral1= new Scanner (System.in);
			System.out.print("numero 1: ");
			double num_1 = numeral1.nextDouble();
			
			Scanner numeral2= new Scanner (System.in);
			System.out.print("numero 2: ");
			double num_2 = numeral2.nextDouble();
	 
	 double respuesta = num_1 + num_2;
	 System.out.println("La respuesta es: "+ respuesta);
	 }
	 
	 
	 public static void restar() {
		    
		 	Scanner minuendo= new Scanner (System.in);
			System.out.print("numero 1: ");
			double num_1 = minuendo.nextDouble();
			
			Scanner sustraendo= new Scanner (System.in);
			System.out.print("numero 2: ");
			double num_2 = sustraendo.nextDouble();
	 
	 double diferencia = num_1 - num_2;
	 System.out.println("La respuesta es: "+ diferencia);
	 }
	 public static void dividir() {
		    
		 	Scanner dividendo= new Scanner (System.in);
			System.out.print("nuemro1: ");
			double num_1 = dividendo.nextDouble();
			
			Scanner divisor= new Scanner (System.in);
			System.out.print("numero2: ");
			double num_2 = divisor.nextDouble();
	 
	 double cociente = num_1 / num_2;
	 System.out.println("La respuesta es: "+ cociente);
	 }
	 public static void multiplicar() {
		    
		 	Scanner factor1= new Scanner (System.in);
			System.out.print("numero 1: ");
			double num_1 = factor1.nextDouble();
			
			Scanner factor2= new Scanner (System.in);
			System.out.print("numero 2: ");
			double num_2 = factor2.nextDouble();
	 
	 double producto = num_1 * num_2;
	 System.out.println("La respuesta es: "+ producto);
	 }
	
	 
	    
}