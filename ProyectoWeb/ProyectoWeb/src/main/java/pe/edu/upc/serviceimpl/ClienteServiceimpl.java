package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IClienteDao;
import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped
public class ClienteServiceimpl implements IClienteService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private IClienteDao cDao;

	@Override
	public void insertar(Cliente cliente) {
		cDao.insertar(cliente);
	}

	@Override
	public void eliminar(int idCliente) {
		cDao.delete(idCliente);
	}

	@Override
	public List<Cliente> listar() {
		return cDao.List();
	}

}
