package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAsesorDao;
import pe.edu.upc.entity.Asesor;
import pe.edu.upc.service.IAsesorService;

@Named
@RequestScoped
public class AsesorServiceimpl implements IAsesorService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IAsesorDao aDao;

	@Override
	public void insertar(Asesor asesor) {
		aDao.insertar(asesor);
	}

	@Override
	public void eliminar(int idAsesor) {
		aDao.delete(idAsesor);
	}

	@Override
	public List<Asesor> listar() {
		return aDao.List();
	}

}
