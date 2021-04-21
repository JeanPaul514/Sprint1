package pe.edu.upc.entity;

public class Asesor {
	private int idAsesor;
	private String nombreAsesor;
	private String correoAsesor;
	private String nacionalidadAsesor;
	private String telefonoAsesor;

	public Asesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asesor(int idAsesor, String nombreAsesor, String correoAsesor, String nacionalidadAsesor,
			String telefonoAsesor) {
		super();
		this.idAsesor = idAsesor;
		this.nombreAsesor = nombreAsesor;
		this.correoAsesor = correoAsesor;
		this.nacionalidadAsesor = nacionalidadAsesor;
		this.telefonoAsesor = telefonoAsesor;
	}

	public int getIdAsesor() {
		return idAsesor;
	}

	public void setIdAsesor(int idAsesor) {
		this.idAsesor = idAsesor;
	}

	public String getNombreAsesor() {
		return nombreAsesor;
	}

	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}

	public String getCorreoAsesor() {
		return correoAsesor;
	}

	public void setCorreoAsesor(String correoAsesor) {
		this.correoAsesor = correoAsesor;
	}

	public String getNacionalidadAsesor() {
		return nacionalidadAsesor;
	}

	public void setNacionalidadAsesor(String nacionalidadAsesor) {
		this.nacionalidadAsesor = nacionalidadAsesor;
	}

	public String getTelefonoAsesor() {
		return telefonoAsesor;
	}

	public void setTelefonoAsesor(String telefonoAsesor) {
		this.telefonoAsesor = telefonoAsesor;
	}

}
