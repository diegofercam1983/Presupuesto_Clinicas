package presupuesto.Vistas;

import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.JFreeChart;
import java.awt.Paint;
import java.awt.Color;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.image.BufferedImage;

public class GraficaPqMesA {
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

	public GraficaPqMesA() {
		this.val1 = 0.0;
		this.val2 = 0.0;
		this.val3 = 0.0;
		this.val4 = 0.0;
		this.val5 = 0.0;
		this.val6 = 0.0;
		this.val7 = 0.0;
	}

	public BufferedImage GraficaPqv(final double val1, final double val2) {
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = this.val3;
		this.val4 = this.val4;
		this.val5 = this.val5;
		this.val6 = this.val6;
		this.val7 = this.val7;
		this.val8 = this.val8;
		this.val9 = this.val9;
		this.val10 = this.val10;
		this.val11 = this.val11;
		this.val12 = this.val12;
		this.val13 = this.val13;
		this.val14 = this.val14;
		this.val15 = this.val15;
		this.val16 = this.val16;
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(this.val1, (Comparable) "Facturado", (Comparable) "Total");
		dataset.setValue(this.val2, (Comparable) "Presupuesto", (Comparable) "Total");
		final JFreeChart chart = ChartFactory.createBarChart3D("", "", "Valor", (CategoryDataset) dataset,
				PlotOrientation.VERTICAL, true, false, false);
		chart.setBackgroundPaint((Paint) new Color(240, 240, 240));
		final CategoryPlot p = chart.getCategoryPlot();
		p.setRangeGridlinePaint((Paint) Color.DARK_GRAY);
		final BufferedImage imagen = chart.createBufferedImage(290, 140);
		return imagen;
	}
}