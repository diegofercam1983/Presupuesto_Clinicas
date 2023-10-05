package presupuesto.config;

import java.sql.SQLException;
//import java.awt.Component;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {
	private String CONTROLADOR;
	private String USUARIO;
	private String PASS;
	private String URL;
	Connection connection;
	public static final String dgempres = "dgempres01";
	public static final String CfWeb = "CfWeb";

	public Conexion() {
		this.CONTROLADOR = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		this.USUARIO = "DGNET";
		this.PASS = "sj4T2rsU2Uhf8j7Pg8VJ05s";
		this.URL = "";
		this.connection = null;
		this.getConexion("");
	}

	public Connection getConexion(final String baseDatos) {
		try {
			Class.forName(this.CONTROLADOR);
			this.URL = "jdbc:sqlserver://10.24.248.17\\MSSQLFARA:1433;databaseName=";
			this.URL += baseDatos;
			return this.connection = DriverManager.getConnection(this.URL, this.USUARIO, this.PASS);
		} catch (final ClassNotFoundException | SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error estableciendo conexion con la base de datos",
					"Error de conexion", 0);
			return this.connection;
		}
	}

	public void close() {
		try {
			this.connection.close();
		} catch (final SQLException excepcionSql) {
			JOptionPane.showMessageDialog(null, "Error: " + excepcionSql);
		}
	}
}