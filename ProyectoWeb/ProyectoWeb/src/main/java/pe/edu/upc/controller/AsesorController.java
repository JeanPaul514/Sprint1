package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Asesor;
import pe.edu.upc.service.IAsesorService;

@Named
@RequestScoped
public class AsesorController {
	@Inject
	private IAsesorService aService;

	private Asesor asesor;

	List<Asesor> listaAsesores;

	@PostConstruct
	public void init() {
		this.asesor = new Asesor();
		this.listaAsesores = new ArrayList<Asesor>();
	}

	// metodos

	public String nuevoAsesor() {
		this.setAsesor(new Asesor());
		return "asesor.xhtml";
	}

	public void insertarAsesor() {
		try {
			aService.insertar(asesor);
		} catch (Exception e) {
			System.out.println("Error al insertar Asesor en el controller");
		}
	}

	public void listar() {
		try {
			listaAsesores = aService.listar();
		} catch (Exception e) {
			System.out.println("Error al listar Asesor en el controller");
		}
	}

	public void eliminar(Asesor asesor) {
		try {
			aService.eliminar(asesor.getIdAsesor());
			this.listar();
		} catch (Exception e) {
			System.out.println("Error al eliminar Asesor en el controller");
		}
	}

	// get and set

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	public List<Asesor> getListaAsesores() {
		return listaAsesores;
	}

	public void setListaAsesores(List<Asesor> listaAsesores) {
		this.listaAsesores = listaAsesores;
	}

}
