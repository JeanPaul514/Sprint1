package pe.edu.upc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.dao.IAsesorDao;
import pe.edu.upc.entity.Asesor;

public class AsesorDaoimpl implements IAsesorDao {
	private Connection oCn;

	@Override
	public void insertar(Asesor asesor) {
		try {
			String consulta = "insert into Asesor(nombreAsesor,correoAsesor,nacionalidadAsesor,telefonoAsesor) values (?,?,?,?)";
			PreparedStatement ps = oCn.prepareStatement(consulta);
			ps.setString(1, asesor.getNombreAsesor());
			ps.setString(2, asesor.getCorreoAsesor());
			ps.setString(3, asesor.getNacionalidadAsesor());
			ps.setString(4, asesor.getTelefonoAsesor());
		} catch (Exception e) {
			System.out.println("Error al intentar insertar datos a la tabla Asesor, revisar DaoImpl");
		}
	}

	@Override
	public void delete(int idAsesor) {
		try {
			String consulta = "delete from Asesor where idAsesor = ?";
			PreparedStatement ps = oCn.prepareStatement(consulta);
			ps.setInt(1, idAsesor);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println("Error al eliminar el asesor seleccionado, revisar DaoImpl");
		}
	}

	@Override
	public java.util.List<Asesor> List() {
		List<Asesor> lista = new ArrayList<Asesor>();
		try {
			String sql = "select * from Asesor";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				Asesor asesor = new Asesor();
				asesor.setIdAsesor(rs.getInt("idAsesor"));
				asesor.setNombreAsesor(rs.getString("nombreAsesor"));
				asesor.setCorreoAsesor(rs.getString("correoAsesor"));
				asesor.setTelefonoAsesor(rs.getString("telefonoAsesor"));
				asesor.setNacionalidadAsesor(rs.getString("nacionalidadAsesor"));
				lista.add(asesor);
			}
		} catch (Exception e) {
			System.out.println("Error al listar los datos de la tabla Asesor");
			System.out.println(e.getLocalizedMessage());
		}
		return lista;
	}
}
