package scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 
		/*MENSAJE INICIAL DEL PROGRAMA*/
		
		img textoMensaje =new img();
		textoMensaje.Mensaje();
		boolean on= true;
		do {
		Scanner imputCommand = new Scanner (System.in);
		System.out.print("¿Que quieres relalizar? : ");
		String  output = imputCommand.nextLine();
		
		/*FIN DE MENSAJE INICIAL*/
		
        /*BUSCA EN LA LIBRERIA EL COMADO INGRESADO*/
		
		CommandList datacommand =new CommandList ();
	
		/*OPERACIONES MATEMÁTICAS*/
		
		for (int i=0;i<5;i++) {
			if(output.equals(datacommand.command[0])) {
		    ArithmeticFunctions sum = new ArithmeticFunctions();
			sum.sumar();
			i=6;
			}else if(output.equals(datacommand.command[1])) { 
			
			ArithmeticFunctions res = new ArithmeticFunctions();
		    res.restar();
			i=6;
			
			}else if(output.equals(datacommand.command[2])) { 
				
			ArithmeticFunctions div = new ArithmeticFunctions();
			div.dividir();
			i=6;
				
			}else if(output.equals(datacommand.command[3])) { 
					
			ArithmeticFunctions mul = new ArithmeticFunctions();
			mul.multiplicar();
			i=6;
			}
			
			/*FIN DE OPERACIONES MATEMÁTICAS*/
			
			/*OPCIÓN HELP*/
			
			else if(output.equals(datacommand.command[4])) { 
			Help comand =new Help();
			comand.CommandList();
			i=6;
		    }
			
			/*FIN DE OPCIÓN HELP*/
			 
			/*OPCIÓN SALIR DEL PROGRAMA*/
			
			else if(output.equals(datacommand.command[5])) { 
			Help comand =new Help();
			on=false;
			
			/*FIN DE LA OPCIÓN SALIR DEL PROGRAMA*/
			
			/*TEMAS*/
		
			}else if(output.equals(datacommand.command[6])) { 
				
				Temas LenguajeAscii =new Temas();
				LenguajeAscii.ascii();
				i=6;
				
			}else if(output.equals(datacommand.command[7])) { 
				
				Temas JavaScript =new Temas();
				JavaScript.Java();
				i=6;
				
				
			}else if(output.equals(datacommand.command[8])) { 
				
				Temas software =new Temas();
				software.Software();
				i=6;
				
				
			}else if(output.equals(datacommand.command[9])) { 
				
				Temas SistemasOperativos =new Temas();
				SistemasOperativos.SistemasOperativos();
				i=6;
				
			}else if(output.equals(datacommand.command[10])) { 
				
				Temas consejos =new Temas();
				consejos.Tips();
				i=6;
				
			}else if(output.equals(datacommand.command[11])) { 
				
				Temas nombre =new Temas();
				nombre.info();
				i=6;}
		
			/*FIN DE TEMAS*/
		
			/*OTRO*/
			
			else{
				
				System.out.println("                    \r\n"
						+ "Comando no encontrado,\r\n"
						+ "Inserte HELP para conocer comandos disponibles.");
				        i=6;
				        Scanner ayuda = new Scanner (System.in);
						String  comandos = imputCommand.nextLine();
						Help comand =new Help();
						comand.CommandList();
						i=6;}
			
			/*FINDE OTRO*/
	
			
	}		
		}while (on);
	}
}
