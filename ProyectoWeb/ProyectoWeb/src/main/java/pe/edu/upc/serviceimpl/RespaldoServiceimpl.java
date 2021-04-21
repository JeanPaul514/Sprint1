package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRespaldoDao;
import pe.edu.upc.entity.RespaldoAcademico;
import pe.edu.upc.service.IRespaldoService;

@Named
@RequestScoped
public class RespaldoServiceimpl implements IRespaldoService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IRespaldoDao rDao;

	@Override
	public void insertar(RespaldoAcademico respaldoAcademico) {
		rDao.insertar(respaldoAcademico);
	}

	@Override
	public void eliminar(int idRespaldo) {
		rDao.delete(idRespaldo);
	}

	@Override
	public List<RespaldoAcademico> listar() {
		return rDao.List();
	}

}
