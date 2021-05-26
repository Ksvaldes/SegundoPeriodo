package scl.edu.gt;

import java.util.Scanner;

public class HELP {

	public static void CommandList() {
		
		
		CommandList datos = new CommandList();
		int cantidadDeComandos =datos.command.length;
		
		System.out.println("");
		
		for (int i=0; i<cantidadDeComandos; i++) {
			System.out.println("");
			System.out.println("--> "+ datos.command[i]+" <-- \n"+"\n"+datos.information[i]+"\n");
		}
		
	}}
