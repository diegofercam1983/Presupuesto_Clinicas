package presupuestos.dao;
 
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
//import java.awt.Component;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import presupuesto.config.Conexion;
import java.util.List;

public class DialogosDao {
	public List<Double[]> consultarUrgencias() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT EJECUTADO FROM Cfweb..CTLPPTO WHERE MES = MONTH(GETDATE()) AND ANO = YEAR(GETDATE())\nAND CENCOS = 4001 AND (CODACT = 'COSINTR' OR CODACT = 'COCONTR')";
		final Conexion conexion = new Conexion();
		List<Double[]> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		datos = new ArrayList<>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				final Double[] f = {resultSet.getDouble("EJECUTADO")};
				datos.add(f);
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public double consultarCirugia(final int complejidad) {
		final String baseDatos = "Cfweb";
		final String consulta = "select COUNT(*) AS CANT  from dgempres01..HCMWNOTAQ A inner join\ndgempres01..GENSERIPS B ON A.HCCM22N24 = B.OID INNER JOIN\ndgempres01..HCNFOLIO C ON A.HCNFOLIO = C.OID\nWHERE YEAR(C.HCFECFOL) = YEAR(GETDATE())  AND MONTH(C.HCFECFOL) = MONTH(GETDATE()) AND B.SIPCOMPLE = "
				+ complejidad + "\n" + "GROUP BY SIPCOMPLE\n" + "order by B.SIPCOMPLE";
		final Conexion conexion = new Conexion();
		double datos = 0.0;
		final Connection connection = conexion.getConexion(baseDatos);
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos = resultSet.getDouble("CANT");
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public List<Double[]> consultarImagenes() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT EJECUTADO FROM Cfweb..CTLPPTO \nWHERE CENCOS = 4009 AND MES = MONTH(GETDATE()) AND ANO = YEAR(GETDATE())\nAND (CODACT = 'ECOMINI' OR CODACT = 'FLUOMIN' OR CODACT = 'MAMOMIN' OR\n CODACT = 'PORTMIN' OR CODACT = 'TOMOMIN' OR CODACT = 'RAYOMIN')\n ORDER BY CODACT";
		final Conexion conexion = new Conexion();
		List<Double[]> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		datos = new ArrayList<>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				final Double[] f = {resultSet.getDouble("EJECUTADO")};
				datos.add(f);
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public List<Double[]> consultarConsultaExt() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT EJECUTADO FROM Cfweb..CTLPPTO \n WHERE CENCOS = 4010 AND MES = MONTH(GETDATE()) AND ANO = YEAR(GETDATE())\n AND CODACT = 'CAPAMIN'";
		final Conexion conexion = new Conexion();
		List<Double[]> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		datos = new ArrayList<>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				final Double[] f = {resultSet.getDouble("EJECUTADO")};
				datos.add(f);
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public List<Double[]> consultarMesAnterior() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT SUM(PPTO) AS PPTO,SUM(FACTURADO) AS FACTURADO\nFROM Cfweb..PRESUPUESTO \nwhere MES = (MONTH(GETDATE()))-1\nGROUP BY ANIO,MES";
		final Conexion conexion = new Conexion();
		List<Double[]> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		datos = new ArrayList<>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				final Double[] f = {resultSet.getDouble("PPTO"), resultSet.getDouble("FACTURADO")};
				datos.add(f);
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public int consultarCantidadFacturas(final int estado, final String fechaInicial, final String fechaFinal) {
		final String baseDatos = "dgempres01";
		final String consulta = "select count(*) AS CANT\nfrom crncxc a inner join CRNCXCC b on a.OID = b.crncxc \ninner join gentercer c on a.gentercer = c.oid\ninner join SLNFACTUR d on a.CXCDOCUME = d.SFANUMFAC\ninner join GENUSUARIO e on d.GENUSUARIO1 = e.OID\nwhere  CXCDOCFECHA >= '"
				+ fechaInicial + "' and CXCDOCFECHA <= '" + fechaFinal
				+ "' and c.TERDIGITO is not null and d.SFADOCANU = 0\n"
				+ "and b.ccvalor+b.CCVALDEB-b.ccvalcre-CCVALTRA-ccvalabo > 0 and a.CXCESTCAR = " + estado + "";
		final Conexion conexion = new Conexion();
		int datos = 0;
		final Connection connection = conexion.getConexion(baseDatos);
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos = resultSet.getInt("CANT");
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public double consultarValorFacturas(final int estado, final String fechaInicial, final String fechaFinal) {
		final String baseDatos = "dgempres01";
		final String consulta = "select sum(b.ccvalor) AS VALOR\nfrom crncxc a inner join CRNCXCC b on a.OID = b.crncxc \ninner join gentercer c on a.gentercer = c.oid\ninner join SLNFACTUR d on a.CXCDOCUME = d.SFANUMFAC\ninner join GENUSUARIO e on d.GENUSUARIO1 = e.OID\nwhere CXCDOCFECHA >= '"
				+ fechaInicial + "' and CXCDOCFECHA <= '" + fechaFinal
				+ "' and c.TERDIGITO is not null and d.SFADOCANU = 0\n"
				+ "and b.ccvalor+b.CCVALDEB-b.ccvalcre-CCVALTRA-ccvalabo > 0 and a.CXCESTCAR = " + estado + "";
		final Conexion conexion = new Conexion();
		double datos = 0.0;
		final Connection connection = conexion.getConexion(baseDatos);
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos = resultSet.getDouble("VALOR");
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}
}