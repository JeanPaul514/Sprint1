package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.RespaldoAcademico;

public interface IRespaldoService {

	public void insertar(RespaldoAcademico respaldoAcademico);

	public void eliminar(int idRespaldo);

	public List<RespaldoAcademico> listar();
}
