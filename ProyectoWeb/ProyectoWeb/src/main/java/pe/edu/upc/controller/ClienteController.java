package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped
public class ClienteController {
	@Inject
	private IClienteService cService;

	private Cliente cliente;

	List<Cliente> listaClientes;

	@PostConstruct
	public void init() {
		this.cliente = new Cliente();
		this.listaClientes = new ArrayList<Cliente>();
	}

	// metodos

	public String nuevoCliente() {
		this.setCliente(new Cliente());
		return "cliente.xhtml";
	}

	public void insertarCliente() {
		try {
			cService.insertar(cliente);
		} catch (Exception e) {
			System.out.println("Error al insertar Cliente en el controller");
		}
	}

	public void listar() {
		try {
			listaClientes = cService.listar();
		} catch (Exception e) {
			System.out.println("Error al listar Clientes en el controller");
		}
	}

	public void eliminar(Cliente cliente) {
		try {
			cService.eliminar(cliente.getIdCliente());
			this.listar();
		} catch (Exception e) {
			System.out.println("Error al eliminar Cliente en el controller");
		}
	}

	// get and set

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}
