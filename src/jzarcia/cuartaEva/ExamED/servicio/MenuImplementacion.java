package jzarcia.cuartaEva.ExamED.servicio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Clase que contiene los metodos que implementan el menu y los submenu
 */
public class MenuImplementacion implements MenuInterfaz {

	
public int primerMenu(Scanner sc) throws IOException {
		
	try {
		
		System.out.println("----------------");
		System.out.println("0. Cerrar menu");
		System.out.println("1. menu empleado");
		System.out.println("2. menu cliente");
		System.out.println("----------------");
		int opcionSeleccionada = sc.nextInt();
		return opcionSeleccionada;
		
		} catch (Exception e) {
			FileWriter fW = new FileWriter(jzarcia.cuartaEva.ExamED.controladores.inicio.ficheroLogString, true);
			fW.write("Error al implementar el menu principal");
			fW.close();
			
		}
	return 4;
	}

public int subMenuEmpleado(Scanner sc) throws IOException {
	
try {
		
		System.out.println("----------------");
		System.out.println("0. Cerrar menu");
		System.out.println("1. validar nuevo pacient");
		System.out.println("2. imprimir citas medicas");
		System.out.println("----------------");
		int opcionSeleccionada = sc.nextInt();
		return opcionSeleccionada;
		
		} catch (Exception e) {
			FileWriter fW = new FileWriter(jzarcia.cuartaEva.ExamED.controladores.inicio.ficheroLogString, true);
			fW.write("Error al implementar el menu de Empleado");
			fW.close();
		}
	return 4;
	}


public int subMenuCliente(Scanner sc) throws IOException {
	
try {
		
		System.out.println("----------------");
		System.out.println("0. Cerrar menu");
		System.out.println("1. registro de cliente");
		System.out.println("2. solicitud de cita medica");
		System.out.println("----------------");
		int opcionSeleccionada = sc.nextInt();
		return opcionSeleccionada;
		
		} catch (Exception e) {
			FileWriter fW = new FileWriter(jzarcia.cuartaEva.ExamED.controladores.inicio.ficheroLogString, true);
			fW.write("Error al implementar el menu de Cliente");
			fW.close();
		}
	return 4;
	}
	
}
