package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.RespaldoAcademico;
import pe.edu.upc.service.IRespaldoService;

@Named
@RequestScoped
public class RespaldoController {
	@Inject
	private IRespaldoService rService;

	private RespaldoAcademico respaldo;

	List<RespaldoAcademico> listaRespaldos;

	@PostConstruct
	public void init() {
		this.respaldo = new RespaldoAcademico();
		this.listaRespaldos = new ArrayList<RespaldoAcademico>();
	}

//metodos
	
	public String nuevoRespaldo() {
		this.setRespaldo(new RespaldoAcademico());
		return "respaldo.xhtml";
	}

	public void insertarRespaldo() {
		try {
			rService.insertar(respaldo);
		} catch (Exception e) {
			System.out.println("Error al insertar Respaldo Academico en el controller");
		}
	}

	public void listar() {
		try {
			listaRespaldos = rService.listar();
		} catch (Exception e) {
			System.out.println("Error al listar Respaldo Academico en el controller");
		}
	}

	public void eliminar(RespaldoAcademico respaldoAcademico) {
		try {
			rService.eliminar(respaldoAcademico.getIdRespaldo());
			this.listar();
		} catch (Exception e) {
			System.out.println("Error al eliminar Respaldo Academico en el controller");
		}
	}

// get and set

	public RespaldoAcademico getRespaldo() {
		return respaldo;
	}

	public void setRespaldo(RespaldoAcademico respaldo) {
		this.respaldo = respaldo;
	}

	public List<RespaldoAcademico> getListaRespaldos() {
		return listaRespaldos;
	}

	public void setListaRespaldos(List<RespaldoAcademico> listaRespaldos) {
		this.listaRespaldos = listaRespaldos;
	}

}
