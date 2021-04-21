package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Asesor;

public interface IAsesorDao {

	public void insertar(Asesor asesor);

	public void delete(int idAsesor);

	public List<Asesor> List();
}