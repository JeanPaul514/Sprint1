package pe.edu.upc.entity;

public class Cliente {
	private int idCliente;
	private String nombreCliente;
	private String correoCliente;
	private String telefonoCliente;
	private String nacionalidadCliente;
	private String tipoCliente;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int idCliente, String nombreCliente, String correoCliente, String telefonoCliente,
			String nacionalidadCliente, String tipoCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.correoCliente = correoCliente;
		this.telefonoCliente = telefonoCliente;
		this.nacionalidadCliente = nacionalidadCliente;
		this.tipoCliente = tipoCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getNacionalidadCliente() {
		return nacionalidadCliente;
	}

	public void setNacionalidadCliente(String nacionalidadCliente) {
		this.nacionalidadCliente = nacionalidadCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

}
