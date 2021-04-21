package pe.edu.upc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.dao.IClienteDao;
import pe.edu.upc.entity.Cliente;

public class ClienteDaoimpl implements IClienteDao {
	private Connection oCn;

	@Override
	public void insertar(Cliente cliente) {
		try {
			String consulta = "insert into Cliente(nombreCliente,correoCliente,nacionalidadCliente,telefonoCliente,tipoCliente) values (?,?,?,?,?)";
			PreparedStatement ps = oCn.prepareStatement(consulta);
			ps.setString(1, cliente.getNombreCliente());
			ps.setString(2, cliente.getCorreoCliente());
			ps.setString(3, cliente.getNacionalidadCliente());
			ps.setString(4, cliente.getTelefonoCliente());
			ps.setString(5, cliente.getTipoCliente());
		} catch (Exception e) {
			System.out.println("Error al intentar insertar datos a la tabla Cliente, revisar DaoImpl");
		}
	}

	@Override
	public void delete(int idCliente) {
		try {
			String consulta = "delete from Cliente where idCliente = ?";
			PreparedStatement ps = oCn.prepareStatement(consulta);
			ps.setInt(1, idCliente);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println("Error al eliminar el cliente seleccionado, revisar DaoImpl");
		}
	}

	@Override
	public java.util.List<Cliente> List() {
		List<Cliente> lista = new ArrayList<Cliente>();
		try {
			String sql = "select * from Cliente";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setIdCliente(rs.getInt("idCliente"));
				cliente.setNombreCliente(rs.getString("nombreCliente"));
				cliente.setCorreoCliente(rs.getString("correoCliente"));
				cliente.setTelefonoCliente(rs.getString("telefonoCliente"));
				cliente.setNacionalidadCliente(rs.getString("nacionalidadCliente"));
				cliente.setTipoCliente(rs.getString("tipoCliente"));
				lista.add(cliente);
			}
		} catch (Exception e) {
			System.out.println("Error al listar los datos de la tabla Cliente");
			System.out.println(e.getLocalizedMessage());
		}
		return lista;
	}
}
