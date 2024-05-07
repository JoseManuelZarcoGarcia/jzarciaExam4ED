package jzarcia.cuartaEva.ExamED.controladores;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jzarcia.cuartaEva.ExamED.servicio.*;
import jzarcia.cuartaEva.ExamED.dtos.*;

/**
 * Clase principal que contiene el metodo main por donde empieza la app
 */
public class inicio {
	
	public static String log = "log-ddMMyyyy.txt", ficheroLogString = "C:\\Users\\csi22-jzarcia\\Desktop\\"+log;
/**
 * Metodo main por el que empieza la aplicacion
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {
		
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		//FicheroInterfaz fi = new FicheroImplementacion();
		List<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
		List<CitasMedicasDto> listaCitasMedicas = new ArrayList<CitasMedicasDto>();
		Scanner sc = new Scanner(System.in);
		int opcionSeleccionada;
		boolean cerrarMenu = false, cerrarMenu2 = false, cerrarMenu3 = false;
		FileWriter fW = new FileWriter(ficheroLogString, true);
		/*El nombre del fichero no lo pongo como fecha por que no se, y en donde haga fecha uso un string y ya. 
		Que no es que este vacilando ni nada*/
		

		try {
			
			
			do {
				opcionSeleccionada = mi.primerMenu(sc);
				switch (opcionSeleccionada) {
				case 0: 
					cerrarMenu = true;
					break;
				case 1: 
					do {
						opcionSeleccionada = mi.subMenuEmpleado(sc);
						switch (opcionSeleccionada) {
						case 0: 
							cerrarMenu2 = true;
							break;
						case 1: 
							oi.validarCliente(listaClientes);
							break;	
						case 2: 
							break;	
						default:
							System.out.println("No es una opcion valida, vuelva a intentarlo");
							break;
							
						}
						
					}while(!cerrarMenu2);
					break;	
				case 2:
					do {
						opcionSeleccionada = mi.subMenuCliente(sc);
						switch (opcionSeleccionada) {
						case 0: 
							cerrarMenu3 = true;
							break;
						case 1: 
							listaClientes = oi.altaNueCliente(listaClientes);
							break;	
						case 2: 
							break;	
						default:
							System.out.println("No es una opcion valida, vuelva a intentarlo");
							break;
						}
						
					}while(!cerrarMenu3);
					break;	
				default:
					System.out.println("No es una opcion valida, vuelva a intentarlo");
					break;
				}
				
			}while(!cerrarMenu);
			
		} catch (Exception e) {
			fW.write("Error al seleccionar una opciondel en el menu");
			fW.close();
		}
		
		
	

		
		
		 
		

	}
	
	
	/*
	string ruta = "C:\\Users\\csi22-jzarcia\\Desktop\\citas.txt";

    string[] fichero = File.ReadAllLines(ruta);

    long id = 0;

    foreach (string s in fichero)

    {

        UsuarioDto usuario = new UsuarioDto();
        string[] campos = s.Split(';');
        usuario.Dni = campos[0];
        usuario.Nombre = campos[1];
        usuario.Apellidos = campos[2];
        usuario.Especialidad = campos[3];
        usuario.FechaCita = Convert.ToDateTime(campos[4]);

        if (campos[5].Equals(""))

        {
            usuario.AsistenciaCita = false;
        }

        else { usuario.AsistenciaCita = Convert.ToBoolean(campos[5]); }

        usuario.IdUsuario = id++;

        Program.listaUsu.Add(usuario);
	*/
}
