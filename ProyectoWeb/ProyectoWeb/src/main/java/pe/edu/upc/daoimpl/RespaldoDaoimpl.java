package pe.edu.upc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.dao.IRespaldoDao;
import pe.edu.upc.entity.RespaldoAcademico;

public class RespaldoDaoimpl implements IRespaldoDao {
	private Connection oCn;

	@Override
	public void insertar(RespaldoAcademico respaldoAcademico) {
		try {
			String consulta = "insert into Respaldo_Academico(nombreRespaldo,paisRespaldo,tipoRespaldo) values (?,?,?)";
			PreparedStatement ps = oCn.prepareStatement(consulta);
			ps.setString(1, respaldoAcademico.getNombreRespaldo());
			ps.setString(2, respaldoAcademico.getPaisRespaldo());
			ps.setString(3, respaldoAcademico.getTipoRespaldo());
		} catch (Exception e) {
			System.out.println("Error al intentar insertar datos a la tabla Respaldo Academico, revisar DaoImpl");
		}
	}

	@Override
	public void delete(int idRespaldo) {
		try {
			String consulta = "delete from Respaldo_Academico where idRespaldo = ?";
			PreparedStatement ps = oCn.prepareStatement(consulta);
			ps.setInt(1, idRespaldo);
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println("Error al eliminar el respaldo academico seleccionado, revisar DaoImpl");
		}
	}

	@Override
	public java.util.List<RespaldoAcademico> List() {
		List<RespaldoAcademico> lista = new ArrayList<RespaldoAcademico>();
		try {
			String sql = "select * from Respaldo_Academico";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				RespaldoAcademico respaldoAcademico = new RespaldoAcademico();
				respaldoAcademico.setIdRespaldo(rs.getInt("idRespaldo"));
				respaldoAcademico.setNombreRespaldo(rs.getString("nombreRespaldo"));
				respaldoAcademico.setPaisRespaldo(rs.getString("paisRespaldo"));
				respaldoAcademico.setTipoRespaldo(rs.getString("tipoRespaldo"));
				lista.add(respaldoAcademico);
			}
		} catch (Exception e) {
			System.out.println("Error al listar los datos de la tabla Respaldo Academico");
			System.out.println(e.getLocalizedMessage());
		}
		return lista;
	}
}
