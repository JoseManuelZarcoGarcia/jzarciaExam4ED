package jzarcia.cuartaEva.ExamED.servicio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jzarcia.cuartaEva.ExamED.dtos.*;
 /**
  * clase que contiene los metodos de la operativa
  */
public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);
	
	public List<ClienteDto> altaNueCliente(List<ClienteDto> listaClientes) throws Exception {
		
		try {
			
			long id = calcularNuevoId(listaClientes);
			System.out.println("Escriba su DNI");
			String dni = sc.next();
			System.out.println("Escriba su nombre");
			String nombre = sc.next();
			System.out.println("Escriba su apellido");
			String apellido = sc.next();
			System.out.println("Escriba la fecha actual en formanto dd/MM/yyyy");
			String fecha = sc.next();
			
			ClienteDto nuevoCliente = new ClienteDto(id, dni, nombre, apellido, fecha);
			
			listaClientes.add(nuevoCliente);
			
			return listaClientes;
			
			
		} catch (Exception e) {
			FileWriter fW = new FileWriter(jzarcia.cuartaEva.ExamED.controladores.inicio.ficheroLogString, true);
			fW.write("Error al");
			fW.close();
		}
		return listaClientes;
	}
	
	/**
	 * Metodo que pide la lista de clientes y comprueba las id de los cliente para autogenerar una nueva id
	 * @param listaClientes
	 * @return
	 */
	private long calcularNuevoId(List<ClienteDto> listaClientes)throws Exception{
		
		try {
			
			long idCalculado;
			int tamanioLista = listaClientes.size();
			if (tamanioLista == 0)
			{
			   idCalculado = 1;
			}
			else
			{
			   idCalculado = listaClientes.get(tamanioLista-1).getIdCliente() + 1;
			}

			return idCalculado;
			
		} catch (Exception e) {
			FileWriter fW = new FileWriter(jzarcia.cuartaEva.ExamED.controladores.inicio.ficheroLogString, true);
			fW.write("Error al");
			fW.close();
		}
		return 0;
		
	
	}
	
	
	public void validarCliente(List<ClienteDto> listaClientes) throws Exception{
		
		try {
			
			System.out.println("---CLIENTES NO VALIDADOS---");
		    List<ClienteDto> listaAux = new ArrayList<ClienteDto>();

		    for (ClienteDto cliente : listaClientes)
		    {
		        if (cliente.getValidadorCliente() == false)
		        {
		            System.out.println("------------------------");
		            System.out.println("(" + cliente.getDniCliente() + " - " + cliente.getNombreYApellidoCliente() + ")");
		            System.out.println("------------------------");
		            listaAux.add(cliente);
		        }

		    }

		    if (listaAux.size() > 0)
		    {
		        System.out.println("Indica el DNI del cliente que quiera validar: ");
		        String dniClienteAValidar = sc.next();
		        for (ClienteDto cliente : listaClientes)
		        {
		            if (cliente.getDniCliente().equals(dniClienteAValidar))
		            {
		                cliente.setValidadorCliente(true);
		            }
		        }
		    }
			
			
		} catch (Exception e) {
			FileWriter fW = new FileWriter(jzarcia.cuartaEva.ExamED.controladores.inicio.ficheroLogString, true);
			fW.write("Error al");
			fW.close();
		}
		
		
		

	}
	
	public List<CitasMedicasDto> crearCita(List<CitasMedicasDto> listaCitasMedicas, List<ClienteDto> listaClientes) throws IOException{
		
		try {
			
			System.out.println("Escriba su DNI");
			String dniACompararString = sc.next(), especialidad = "a";
			long audxIdCliente;
			boolean cerrar = false;
			
			for (ClienteDto clienteABuscar : listaClientes) {
				
				if(clienteABuscar.getValidadorCliente()==true) {
					if(clienteABuscar.getDniCliente().equals(dniACompararString)) {
						
						audxIdCliente = clienteABuscar.getIdCliente();
					}
				}
			}
			System.out.println("----------------------------");
			System.out.println("Seleccione la especialidad");
			System.out.println("01. Psycología");
			System.out.println("02. Traumatología");
			System.out.println("03. Fisioterapia");
			System.out.println("----------------------------");
			int especialidadSeleccionada = sc.nextInt();
			
			do {
				switch (especialidadSeleccionada) {
			
			case 01: 
				especialidad = "Psycología";
				break;
			case 02: 
				especialidad = "Traumatología";
				break;
			case 03: 
				especialidad = "Fisioterapia";
				break;
			default:
				System.out.println("no es una opcion valida");
				break;
				}
			}while(!cerrar);
				
			System.out.println("escriba la fecha en formato dd/MM/yyyy");
			String fecha = sc.next();
			
			CitasMedicasDto nuevaCitasMedicas = new CitasMedicasDto();
			long id = calcularNuevoIdCitas(listaCitasMedicas);
			nuevaCitasMedicas.setIdCitaMedica(id);
			nuevaCitasMedicas.setDniCliente(dniACompararString);
			nuevaCitasMedicas.setEspecialidad(especialidad);
			nuevaCitasMedicas.setFechaCita(fecha);
			
			
		} catch (Exception e) {
			FileWriter fW = new FileWriter(jzarcia.cuartaEva.ExamED.controladores.inicio.ficheroLogString, true);
			fW.write("Error al");
			fW.close();
		}
		return listaCitasMedicas;
		
	}

	@Override
	public List<CitasMedicasDto> crearCita(List<CitasMedicasDto> listaCitasMedicas) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
private long calcularNuevoIdCitas(List<CitasMedicasDto> listaCitas)throws Exception{
		
		try {
			
			long idCalculado;
			int tamanioLista = listaCitas.size();
			if (tamanioLista == 0)
			{
			   idCalculado = 1;
			}
			else
			{
			   idCalculado = listaCitas.get(tamanioLista-1).getIdCitaMedica() + 1;
			}

			return idCalculado;
			
		} catch (Exception e) {
			FileWriter fW = new FileWriter(jzarcia.cuartaEva.ExamED.controladores.inicio.ficheroLogString, true);
			fW.write("Error al");
			fW.close();
		}
		return 0;
		
	
	}
	
	
}
