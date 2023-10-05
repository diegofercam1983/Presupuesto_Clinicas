package presupuesto.Controllers;

import java.text.DecimalFormat;
import presupuestos.dao.DialogosDao;
import java.util.List;

public class CtrlPresupuestoDiag {
	public List<Double[]> consultarUrgencias() {
		final DialogosDao dao = new DialogosDao();
		final List<Double[]> datos = dao.consultarUrgencias();
		return datos;
	}

	public double consultarCirugia(final int complejidad) {
		final DialogosDao dao = new DialogosDao();
		final double datos = dao.consultarCirugia(complejidad);
		return datos;
	}

	public List<Double[]> consultarImagenes() {
		final DialogosDao dao = new DialogosDao();
		final List<Double[]> datos = dao.consultarImagenes();
		return datos;
	}

	public List<Double[]> consultarConsultaExt() {
		final DialogosDao dao = new DialogosDao();
		final List<Double[]> datos = dao.consultarConsultaExt();
		return datos;
	}

	public String valorFormateado(final double valorP) {
		final DecimalFormat formateador = new DecimalFormat("###,###.##");
		final String valor = formateador.format(valorP);
		return valor;
	}

	public List<Double[]> consultarDatosMesAnterior() {
		final DialogosDao dao = new DialogosDao();
		final List<Double[]> datos = dao.consultarMesAnterior();
		return datos;
	}

	public int consultarCantidadFacturas(final int estado, final String fechaInicial, final String fechaFinal) {
		final DialogosDao dao = new DialogosDao();
		final int datos = dao.consultarCantidadFacturas(estado, fechaInicial, fechaFinal);
		return datos;
	}

	public double consultarValorFacturas(final int estado, final String fechaInicial, final String fechaFinal) {
		final DialogosDao dao = new DialogosDao();
		final double datos = dao.consultarValorFacturas(estado, fechaInicial, fechaFinal);
		return datos;
	}
}