package pe.edu.upc.entity;

public class RespaldoAcademico {
	private int idRespaldo;
	private String nombreRespaldo;
	private String paisRespaldo;
	private String tipoRespaldo;

	public RespaldoAcademico(int idRespaldo, String nombreRespaldo, String paisRespaldo, String tipoRespaldo) {
		super();
		this.idRespaldo = idRespaldo;
		this.nombreRespaldo = nombreRespaldo;
		this.paisRespaldo = paisRespaldo;
		this.tipoRespaldo = tipoRespaldo;
	}

	public RespaldoAcademico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdRespaldo() {
		return idRespaldo;
	}

	public void setIdRespaldo(int idRespaldo) {
		this.idRespaldo = idRespaldo;
	}

	public String getNombreRespaldo() {
		return nombreRespaldo;
	}

	public void setNombreRespaldo(String nombreRespaldo) {
		this.nombreRespaldo = nombreRespaldo;
	}

	public String getPaisRespaldo() {
		return paisRespaldo;
	}

	public void setPaisRespaldo(String paisRespaldo) {
		this.paisRespaldo = paisRespaldo;
	}

	public String getTipoRespaldo() {
		return tipoRespaldo;
	}

	public void setTipoRespaldo(String tipoRespaldo) {
		this.tipoRespaldo = tipoRespaldo;
	}

}
