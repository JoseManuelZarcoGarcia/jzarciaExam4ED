package jzarcia.cuartaEva.ExamED.servicio;

import java.io.IOException;
import java.util.Scanner;
/**
 * clase interfaz que implementa el menu principal y los submenus
 */
public interface MenuInterfaz {

	/**
	 * Metodo que implemeta el primer menu que tendra las opciones del menu empleado y menu cliente, devuelve un int con la opcion elegida
	 * @param sc
	 * @return
	 * @throws IOException 
	 */
	public int primerMenu(Scanner sc) throws IOException;
	/**
	 * Metodo que implementa el menu de los empleados con sus opciones, devuelve un int con la opcion elegida
	 * @param sc
	 * @return
	 */
	public int subMenuEmpleado(Scanner sc) throws IOException;
	/**
	 * Metodo que implementa el menu de los clientes con sus opciones, devuelve un int con la opcion elegida
	 * @param sc
	 * @return
	 */
	public int subMenuCliente(Scanner sc) throws IOException;
	
}
