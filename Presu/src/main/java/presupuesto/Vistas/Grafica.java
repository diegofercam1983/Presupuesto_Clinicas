package presupuesto.Vistas;

import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import java.awt.Paint;
import java.awt.Color;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Component;
import javax.swing.JFrame;

public class Grafica extends JFrame {
	double val1;
	double val2;
	double val3;
	double val4;
	double val5;
	double val6;
	double val7;
	double val8;
	double val9;
	double val10;
	double val11;
	double val12;
	double val13;
	double val14;
	double val15;
	double val16;

	public Grafica(final double val1, final double val2, final double val3, final double val4, final double val5,
			final double val6, final double val7, final double val8, final double val9, final double val10,
			final double val11, final double val12, final double val13, final double val14, final double val15,
			final double val16) {
		this.val1 = 0.0;
		this.val2 = 0.0;
		this.val3 = 0.0;
		this.val4 = 0.0;
		this.val5 = 0.0;
		this.val6 = 0.0;
		this.val7 = 0.0;
		this.setSize(1000, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		this.val4 = val4;
		this.val5 = val5;
		this.val6 = val6;
		this.val7 = val7;
		this.val8 = val8;
		this.val9 = val9;
		this.val10 = val10;
		this.val11 = val11;
		this.val12 = val12;
		this.val13 = val13;
		this.val14 = val14;
		this.val15 = val15;
		this.val16 = val16;
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(this.val1, (Comparable) "Facturado", (Comparable) "Urgencias");
		dataset.setValue(this.val2, (Comparable) "Presupuesto", (Comparable) "Urgencias");
		dataset.setValue(this.val3, (Comparable) "Facturado", (Comparable) "Cirugia");
		dataset.setValue(this.val4, (Comparable) "Presupuesto", (Comparable) "Cirugia");
		dataset.setValue(this.val5, (Comparable) "Facturado", (Comparable) "Hospitalización");
		dataset.setValue(this.val6, (Comparable) "Presupuesto", (Comparable) "Hospitalización");
		dataset.setValue(this.val7, (Comparable) "Facturado", (Comparable) "Rehabilitacion");
		dataset.setValue(this.val8, (Comparable) "Presupuesto", (Comparable) "Rehabilitacion");
		dataset.setValue(this.val9, (Comparable) "Facturado", (Comparable) "Uci Adultos");
		dataset.setValue(this.val10, (Comparable) "Presupuesto", (Comparable) "Uci Adultos");
		dataset.setValue(this.val11, (Comparable) "Facturado", (Comparable) "Gastro"); //Ginecoobs.
		dataset.setValue(this.val12, (Comparable) "Presupuesto", (Comparable) "Gastro");
		dataset.setValue(this.val13, (Comparable) "Facturado", (Comparable) "Imagenes");
		dataset.setValue(this.val14, (Comparable) "Presupuesto", (Comparable) "Imagenes");
		dataset.setValue(this.val15, (Comparable) "Facturado", (Comparable) "Consulta Ext.");
		dataset.setValue(this.val16, (Comparable) "Presupuesto", (Comparable) "Consulta Ext.");
		final JFreeChart chart = ChartFactory.createBarChart3D("Facturado Vs Presupuesto", "Unidad Estratégica",
				"Valor", (CategoryDataset) dataset, PlotOrientation.VERTICAL, true, true, false);
		chart.setBackgroundPaint((Paint) new Color(240, 240, 240));
		final CategoryPlot p = chart.getCategoryPlot();
		p.setRangeGridlinePaint((Paint) Color.DARK_GRAY);
		final ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setVisible(true);
		this.add((Component) chartPanel);
	}
}