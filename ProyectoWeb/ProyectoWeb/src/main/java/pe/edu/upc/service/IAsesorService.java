package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Asesor;

public interface IAsesorService {

	public void insertar(Asesor asesor);

	public void eliminar(int idAsesor);

	public List<Asesor> listar();
}
