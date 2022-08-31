package unlam.pb2;

public class Contacto {
	private String nombre;
	private String apellido;
	private String celular;
	private String email;
	private Integer cp;
	private Provincia provincia;
	private String estadoCliente;
	private String volverALlamar;

	public Contacto(String nombre, String apellido, String celular, String email, Integer cp, Provincia provincia,
			String estadoCliente, String volverALlamar) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.email = email;
		this.cp = cp;
		this.provincia = provincia;
		this.estadoCliente = estadoCliente;
		this.volverALlamar = volverALlamar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public String getVolverALlamar() {
		return volverALlamar;
	}

	public void setVolverALlamar(String volverALlamar) {
		this.volverALlamar = volverALlamar;
	}
	
	@Override
	public String toString() {
        return "Nombre: " + nombre + " Apellido: " + apellido + " Telefon: " + celular;
    }

}
