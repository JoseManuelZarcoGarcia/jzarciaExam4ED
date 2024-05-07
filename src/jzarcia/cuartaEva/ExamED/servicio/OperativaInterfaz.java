package jzarcia.cuartaEva.ExamED.servicio;

import java.io.IOException;
import java.util.List;

import jzarcia.cuartaEva.ExamED.dtos.CitasMedicasDto;
import jzarcia.cuartaEva.ExamED.dtos.ClienteDto;

public interface OperativaInterfaz {

	/**
	 * Metodo que pide la lista de clientes para añadir un nuevo clienteDto
	 * @param listaClientes
	 * @return
	 * @throws Exception 
	 */
	public List<ClienteDto> altaNueCliente(List<ClienteDto> listaClientes) throws Exception;
	/**
	 * Metodo que pide la lista clinte para validar al clienteDto
	 * @param listaClientes
	 * @throws Exception 
	 */
	public void validarCliente(List<ClienteDto> listaClientes) throws Exception;
	/**
	 * Metodo que pide la lista de citas para luego registrar una nueva cita medica
	 * @param listaCitasMedicas
	 * @return
	 * @throws IOException
	 */
	public List<CitasMedicasDto> crearCita(List<CitasMedicasDto> listaCitasMedicas) throws IOException;
	
}
