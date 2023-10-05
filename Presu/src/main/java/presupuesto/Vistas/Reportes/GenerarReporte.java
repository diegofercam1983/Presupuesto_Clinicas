package presupuesto.Vistas.Reportes;

import net.sf.jasperreports.engine.JasperPrint;
import java.util.Map;
import net.sf.jasperreports.engine.JasperReport;
import java.io.InputStream;
//import java.awt.Component;
import javax.swing.JOptionPane;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperFillManager;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import presupuesto.config.Conexion;
import java.sql.Connection;
import net.sf.jasperreports.engine.JRException;

public class GenerarReporte {
	Connection connection;
	Conexion conexion;
	String baseDatos;

	public GenerarReporte() {
		this.connection = null;
		this.baseDatos = "dgempres01";
	}

	public void ejecutarReporte(final String fechaInicial, final String fechaFinal, final int estado) {
		this.conexion = new Conexion();
		this.connection = this.conexion.getConexion(this.baseDatos);
		try {
			final InputStream ruta = this.getClass().getResourceAsStream("ListaFacturas.jrxml");
			final JasperReport masterReport1 = JasperCompileManager.compileReport(ruta);
			final String imagen = "/Imagenes/Logosinfondo.png";
			final Map parametro = new HashMap();
			parametro.put("fechaInicial", fechaInicial);
			parametro.put("fechaFinal", fechaFinal);
			parametro.put("estado", estado);
			final JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport1, parametro, this.connection);
			final JasperViewer jviewer = new JasperViewer(jasperPrint, false);
			jviewer.setTitle("CPR-Lista de Facturas");
			jviewer.setVisible(true);
			this.conexion.close();
		} catch (final JRException j) {
			JOptionPane.showMessageDialog(null, "Mensaje de Error:" + j.getMessage());
			this.conexion.close();
		}
	}
}