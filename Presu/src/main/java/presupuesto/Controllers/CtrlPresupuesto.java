package presupuesto.Controllers;

import java.text.DecimalFormat;
import presupuestos.dao.Presupuestodao;
import java.util.ArrayList;
import java.util.List;

public class CtrlPresupuesto {
	public List<Double> consultarDatos() {
		List<Double> data = new ArrayList<>();
		final Presupuestodao presupuestodao = new Presupuestodao();
		data = presupuestodao.consultarPresuspuesto();
		return data;
	}

	public List<Double> consultarFactuAcu() {
		List<Double> data1 = new ArrayList<>();
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data1 = presupuestodao1.consultarFacAcu();
		return data1;
	}

	public List<Double> consultarPresupuestoHoy() {
		List<Double> data1 = new ArrayList<>();
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data1 = presupuestodao1.consultarPresupuestoHoy();
		return data1;
	}

	public List<Double> consultarPresupuestoAcumulado() {
		List<Double> data1 = new ArrayList<>();
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data1 = presupuestodao1.consultarPresupuestoAcumulado();
		return data1;
	}

	public List<Double> consultarPresupuestoNeto() {
		List<Double> data1 = new ArrayList<>();
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data1 = presupuestodao1.consultarPresupuestoNeto();
		return data1;
	}

	public double consultarOcupacion(final int area, final int ccostos) {
		double data = 0.0;
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data = presupuestodao1.consultarOcupacion(area, ccostos);
		return data;
	}

	public List<Object[]> consultarHosp(final int unid) {
		List<Object[]> data1 = new ArrayList<Object[]>();
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data1 = presupuestodao1.consultarHosp(unid);
		return data1;
	}

	public List<Double[]> consultarGineco() {
		List<Double[]> data1 = new ArrayList<Double[]>();
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data1 = presupuestodao1.consultarGineco();
		return data1;
	}

	public String valorFormateado(final double valorP) {
		final DecimalFormat formateador = new DecimalFormat("###,###.##");
		final String valor = formateador.format(valorP);
		return valor;
	}

	public Object[] valorRango(final String area) {
		List<Object[]> data1 = new ArrayList<Object[]>();
		Object[] datos = new Object[0];
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data1 = presupuestodao1.consultarRangos(area);
		for (int i = 0; i < data1.size(); ++i) {
			datos = data1.get(i);
		}
		return datos;
	}

	public double indicadorCuatro() {
		double valor = 0.0;
		final Presupuestodao presupuestodao = new Presupuestodao();
		valor = presupuestodao.indicadorCuatro();
		return valor;
	}

	public double consultarOcupacionHosp(final int area, final int ccostos) {
		double data = 0.0;
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data = presupuestodao1.ocupacionHospitalizacion(area, ccostos);
		return data;
	}

	public double consultarOcupacionAdultos(final int area, final int ccostos) {
		double data = 0.0;
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data = presupuestodao1.ocupacionAdultos(area, ccostos);
		return data;
	}

	public double consultarOcupacionneonatal(final int area, final int ccostos) {
		double data = 0.0;
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data = presupuestodao1.ocupacionNeonatal(area, ccostos);
		return data;
	}

	public double consultarOcupacionCirugia() {
		double data = 0.0;
		final Presupuestodao presupuestodao1 = new Presupuestodao();
		data = presupuestodao1.ocupacionCirugia();
		return data;
	}
}