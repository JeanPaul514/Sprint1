package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.RespaldoAcademico;

public interface IRespaldoDao {

	public void insertar(RespaldoAcademico respaldoAcademico);

	public void delete(int idRespaldo);

	public List<RespaldoAcademico> List();
}
