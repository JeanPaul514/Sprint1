package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Cliente;

public interface IClienteDao {

	public void insertar(Cliente cliente);

	public void delete(int idCliente);

	public List<Cliente> List();
}
