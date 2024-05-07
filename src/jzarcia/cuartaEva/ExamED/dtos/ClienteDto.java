package jzarcia.cuartaEva.ExamED.dtos;

/**
 * Clase que representa la entidad cliente
 */
public class ClienteDto {

	//Atributos
	private long idCliente;
	private String dniCliente = "aaa";
	private String nombreYApellidoCliente = "aaa";
	private boolean validadorCliente = false;
	private String fechaAltaClienteDate = "31/12/9999";
	
	
	//getter and setter
	public long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}


	public String getDniCliente() {
		return dniCliente;
	}


	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}


	public String getNombreYApellidoCliente() {
		return nombreYApellidoCliente;
	}


	public void setNombreYApellidoCliente(String nombreYApellidoCliente) {
		this.nombreYApellidoCliente = nombreYApellidoCliente;
	}


	public boolean getValidadorCliente() {
		return validadorCliente;
	}


	public void setValidadorCliente(boolean validadorCliente) {
		this.validadorCliente = validadorCliente;
	}


	public String getFechaAltaClienteDate() {
		return fechaAltaClienteDate;
	}


	public void setFechaAltaClienteDate(String fechaAltaClienteDate) {
		this.fechaAltaClienteDate = fechaAltaClienteDate;
	}
	
	
	//Contructores
	public ClienteDto() {}
	
	public ClienteDto(long idCliente, String dniCliente, String nombreYApellidoCliente, boolean validadorCliente,
			String fechaAltaClienteDate) {
		super();
		this.idCliente = idCliente;
		this.dniCliente = dniCliente;
		this.nombreYApellidoCliente = nombreYApellidoCliente;
		this.validadorCliente = validadorCliente;
		this.fechaAltaClienteDate = fechaAltaClienteDate;
	}
	
	public ClienteDto(long id, String dni, String nombre, String apellidos, String fecha) {
		super();
		this.idCliente = id;
		this.dniCliente = dni;
		this.nombreYApellidoCliente = nombre + ", "+ apellidos;
		this.validadorCliente = false;
		this.fechaAltaClienteDate = fecha;
		
	}
	
	
}
