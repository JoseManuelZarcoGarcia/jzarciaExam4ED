package jzarcia.cuartaEva.ExamED.dtos;

public class CitasMedicasDto {
	
	//atributos
	long idCitaMedica;
	String dniCliente = "aaa";
	String especialidad = "aaa";
	String fechaCita = "31/12/9999";

	
	//getter and setter
	public long getIdCitaMedica() {
		return idCitaMedica;
	}
	public void setIdCitaMedica(long idCitaMedica) {
		this.idCitaMedica = idCitaMedica;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}
	
	//constructores
	public CitasMedicasDto(){}
	
}
