package presupuestos.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
//import java.awt.Component;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import presupuesto.entidades.Presupuesto;
import presupuesto.config.Conexion;
import java.util.List;

public class Presupuestodao {
	public List<Double> consultarPresuspuesto() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT ANIO,MES,SUM(PPTO) AS PPTO,convert(numeric,SUM(FACTURADO)) AS FACTURADO,CODP,NOMP\nFROM Cfweb..PRESUPUESTO\nwhere MES = MONTH(GETDATE()) AND ANIO = YEAR(GETDATE())\nGROUP BY ANIO,MES,CODP,NOMP\nORDER BY CODP";
		final Conexion conexion = new Conexion();
		List<Double> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		final Presupuesto presu = new Presupuesto();
		datos = new ArrayList<>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos.add(resultSet.getDouble("facturado"));
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public List<Double> consultarFacAcu() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT ANIO,SUM(PPTO) AS PPTO,SUM(FACTURADO) AS FACTURADO,CODP,NOMP\nFROM Cfweb..PRESUPUESTO\nwhere MES <= MONTH(GETDATE()) AND ANIO = YEAR(GETDATE())\nGROUP BY ANIO,CODP,NOMP\nORDER BY CODP";
		final Conexion conexion = new Conexion();
		List<Double> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		final Presupuesto presu2 = new Presupuesto();
		datos = new ArrayList<Double>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos.add(resultSet.getDouble("facturado"));
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public List<Double> consultarPresupuestoHoy() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT ANIO,convert(numeric,((SUM(PPTO))/(DAY(dateadd(ms,-3,DATEADD(mm, DATEDIFF(m,0,getdate())+1, 0)))))*DAY(GETDATE())) AS PPTOHOY,\nSUM(FACTURADO) AS FACTURADO,CODP,NOMP\nFROM Cfweb..PRESUPUESTO \nwhere MES = MONTH(GETDATE()) AND ANIO = YEAR(GETDATE())\nGROUP BY ANIO,CODP,NOMP\nORDER BY CODP";
		final Conexion conexion = new Conexion();
		List<Double> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		final Presupuesto presu2 = new Presupuesto();
		datos = new ArrayList<Double>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos.add(resultSet.getDouble("PPTOHOY"));
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public List<Double> consultarPresupuestoAcumulado() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT SUM(PPTO) AS PPTOACU\nFROM Cfweb..PRESUPUESTO \nwhere MES < MONTH(GETDATE()) AND ANIO = YEAR(GETDATE())\nGROUP BY ANIO,CODP,NOMP\nORDER BY CODP";
		final Conexion conexion = new Conexion();
		final Connection connection = conexion.getConexion(baseDatos);
		final Presupuesto presu2 = new Presupuesto();
		final List<Double> datos = new ArrayList<Double>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos.add(resultSet.getDouble("PPTOACU"));
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public List<Double> consultarPresupuestoNeto() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT SUM(PPTO) AS PPTO\nFROM Cfweb..PRESUPUESTO\nwhere MES = MONTH(GETDATE()) AND ANIO = YEAR(GETDATE())\nGROUP BY ANIO,CODP,NOMP\nORDER BY CODP";
		final Conexion conexion = new Conexion();
		List<Double> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		final Presupuesto presu2 = new Presupuesto();
		datos = new ArrayList<Double>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos.add(resultSet.getDouble("PPTO"));
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public double consultarOcupacion(final int area, final int ccostos) {
		final String baseDatos = "Cfweb";
		final String consulta = "select convert(numeric,(convert(numeric,(select count(*) from dgempres01..HPNDEFCAM where HCAESTADO = 2 and HPNSUBGRU = "
				+ area + ")\n" + "/convert(numeric,(select top(1) CAMAS from " + "Cfweb"
				+ "..PRESUPUESTO where CCOSTOS = " + ccostos + "))*100))) as total";
		final Conexion conexion = new Conexion();
		double datos = 0.0;
		final Connection connection = conexion.getConexion(baseDatos);
		final Presupuesto presu2 = new Presupuesto();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos = resultSet.getDouble("TOTAL");
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public double ocupacionHospitalizacion(final int area, final int ccostos) {
		final String baseDatos = "dgempres01";
		final String consulta = "select convert(numeric,(convert(numeric,(select count(*) from dgempres01..HPNDEFCAM where HCAESTADO = 2 and HPNGRUPOS in (5,6,7))\n/convert(numeric,(select sum(CAMAS) from Cfweb..PRESUPUESTO where CCOSTOS in (3,111,112) and mes = month(GETDATE()) AND ANIO = YEAR(GETDATE())))*100))) as total";
		final Conexion conexion = new Conexion();
		double datos = 0.0;
		final Connection connection = conexion.getConexion(baseDatos);
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos = resultSet.getDouble("total");
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public double ocupacionNeonatal(final int area, final int ccostos) {
		final String baseDatos = "dgempres01";
		final String consulta = "select convert(numeric,(convert(numeric,(select count(*) from dgempres01..HPNDEFCAM where HCAESTADO = 2 and HPNGRUPOS in (4))\n/convert(numeric,(select sum(CAMAS) from Cfweb..PRESUPUESTO where CCOSTOS in (4,113,114) and mes = month(GETDATE()) AND ANIO = YEAR(GETDATE())))*100))) as total";
		final Conexion conexion = new Conexion();
		double datos = 0.0;
		final Connection connection = conexion.getConexion(baseDatos);
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos = resultSet.getDouble("total");
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public double ocupacionAdultos(final int area, final int ccostos) {
		final String baseDatos = "dgempres01";
		final String consulta = "select convert(numeric,(convert(numeric,(select count(*) from dgempres01..HPNDEFCAM where HCAESTADO = 2 and HPNGRUPOS in (3))\n/convert(numeric,(select sum(CAMAS) from Cfweb..PRESUPUESTO where CCOSTOS in (5,115) and mes = month(GETDATE()) AND ANIO = YEAR(GETDATE())))*100))) as total";
		final Conexion conexion = new Conexion();
		double datos = 0.0;
		final Connection connection = conexion.getConexion(baseDatos);
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				datos = resultSet.getDouble("total");
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public List<Object[]> consultarHosp(final int unid) {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT A.ANIO,A.MES,B.CCNOMBRE,SUM(A.OCUPACION) AS OCUPACION,A.CODP,A.NOMP \nFROM Cfweb..PRESUPUESTO A INNER JOIN\ndgempres01..CTNCENCOS B ON A.CCOSTOS = B.OID\nwhere A.MES = MONTH(GETDATE()) AND A.ANIO = YEAR(GETDATE()) AND A.CODP = "
				+ unid + "and a.CCOSTOS != 45\n" + "GROUP BY A.ANIO,A.MES,A.CODP,A.NOMP,B.CCNOMBRE\n"
				+ "ORDER BY A.CODP";
		final Conexion conexion = new Conexion();
		List<Object[]> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		final Presupuesto presu2 = new Presupuesto();
		datos = new ArrayList<>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				final Object[] f = {resultSet.getDouble("OCUPACION"), resultSet.getString("CCNOMBRE")};
				datos.add(f);
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public List<Double[]> consultarGineco() {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT EJECUTADO FROM Cfweb..CTLPPTO \nWHERE CENCOS = 4008 AND MES = MONTH(GETDATE()) AND ANO = YEAR(GETDATE())\nAND (CODACT = 'PARTONO' OR CODACT = 'CESAREA' OR CODACT = 'COURGIN')";
		final Conexion conexion = new Conexion();
		List<Double[]> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		final Presupuesto presu2 = new Presupuesto();
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

	public List<Object[]> consultarRangos(final String area) {
		final String baseDatos = "Cfweb";
		final String consulta = "SELECT * FROM Cfweb..PRESU_RANGO WHERE CODAREA = '" + area + "'";
		final Conexion conexion = new Conexion();
		List<Object[]> datos = null;
		final Connection connection = conexion.getConexion(baseDatos);
		datos = new ArrayList<>();
		try {
			final Statement instruccion = connection.createStatement();
			final ResultSet resultSet = instruccion.executeQuery(consulta);
			while (resultSet.next()) {
				final Object[] f = {resultSet.getDouble("RANROJO"), resultSet.getDouble("RANAMARILLO"),
						resultSet.getDouble("RANVERDE"), resultSet.getDouble("RANTOTAL"), resultSet.getDouble("VALOR"),
						resultSet.getString("NOMINDICA"), resultSet.getString("NOMAREA")};
				datos.add(f);
			}
			return datos;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return datos;
		}
	}

	public double indicadorCuatro() {
		final String baseDatos = "dgempres01";
		int tiempo = 0;
		int ejecutado = 0;
		int cantidad = 0;
		int resultado = 0;
		final double valor = 0.0;
		final Conexion conexion = new Conexion();
		final Connection connection = conexion.getConexion(baseDatos);
		try {
			final Statement instruccion1 = connection.createStatement();
			final Statement instruccion2 = connection.createStatement();
			final Statement instruccion3 = connection.createStatement();
			final ResultSet resultSet1 = instruccion1.executeQuery(
					"SELECT EJECUTADO FROM Cfweb..CTLPPTO WHERE MES = MONTH(GETDATE()) AND ANO = YEAR(GETDATE()) AND CENCOS = 4001 AND (CODACT = 'COSINTR')");
			final ResultSet resultSet2 = instruccion2.executeQuery(
					"Select cast(convert(numeric,sum(DateDiff(MINUTE, D.AINFECING,B.HCFECFOL)))\nas integer ) as tiempo\nFrom .HCMINGURG As A Inner Join\n.HCNFOLIO As B On A.HCNFOLIO = B.OID Inner Join\n.GENPACIEN As C On B.GENPACIEN = C.OID Inner Join\n.ADNINGRESO As D On B.ADNINGRESO = D.OID inner Join\n.HCNTRIAGE As E On D.HCENTRIAGE = E.OID Inner Join\n.GENMEDICO On GENMEDICO.OID = B.GENMEDICO Inner Join\n.GENDETCON As F On D.GENDETCON = F.OID\nWhere month(D.AINFECING) = MONTH(GETDATE()) and year(D.AINFECING) = year(GETDATE()) \nAnd E.HCNCLAURGTR In (2,3,6,7) AND DateDiff(MINUTE, D.AINFECING,B.HCFECFOL) < 400");
			final ResultSet resultSet3 = instruccion3.executeQuery(
					"Select count(a.oid) as cantidad\nFrom .HCMINGURG As A Inner Join\n.HCNFOLIO As B On A.HCNFOLIO = B.OID Inner Join\n.GENPACIEN As C On B.GENPACIEN = C.OID Inner Join\n.ADNINGRESO As D On B.ADNINGRESO = D.OID inner Join\n.HCNTRIAGE As E On D.HCENTRIAGE = E.OID Inner Join\n.GENMEDICO On GENMEDICO.OID = B.GENMEDICO Inner Join\n.GENDETCON As F On D.GENDETCON = F.OID\nWhere month(D.AINFECING) = MONTH(GETDATE()) and year(D.AINFECING) = year(GETDATE()) \nAnd E.HCNCLAURGTR In (2,3,6,7) AND DateDiff(MINUTE, D.AINFECING,B.HCFECFOL) < 400");
			while (resultSet1.next()) {
				ejecutado = resultSet1.getInt("EJECUTADO");
			}
			while (resultSet2.next()) {
				tiempo = resultSet2.getInt("tiempo");
			}
			while (resultSet3.next()) {
				cantidad = resultSet3.getInt("cantidad");
			}
			resultado = tiempo / (cantidad + ejecutado);
			return resultado;
		} catch (final SQLException ex) {
			JOptionPane.showMessageDialog(null, ex);
			conexion.close();
			return valor;
		}
	}

	public double ocupacionCirugia() {
		final String baseDatos = "dgempres01";
		final String consulta = "select COUNT(*) as cant from dgempres01..HCMNOTAQU A INNER JOIN\ndgempres01..HCNFOLIO B ON A.HCNFOLIO = B.OID\nwhere YEAR(B.HCFECFOL) = YEAR(GETDATE())  AND MONTH(B.HCFECFOL) = MONTH(GETDATE()) ";
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
}