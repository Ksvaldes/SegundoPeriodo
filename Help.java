package scl.edu.gt;
import java.util.Scanner;


public class Help {

	
	public static void CommandList() {
		
		
		CommandList datos = new CommandList();
		int cantidadDeComandos =datos.command.length;
		
		System.out.println("");
		System.out.println("¿No sabes que comandos insertar? ¡Prueba con estos! :");
		System.out.println("");
		
		for (int i=0; i<cantidadDeComandos; i++) {
			System.out.println("");
			System.out.println("--> "+ datos.command[i]+" <-- \n"+"\n"+datos.information[i]+"\n");
		}
		
	}}

	
	
	
	
	
	

