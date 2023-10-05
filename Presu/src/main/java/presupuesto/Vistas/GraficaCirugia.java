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

public class GraficaCirugia {
	double val1;
	double val2;
	double val3;

	public GraficaCirugia() {
		this.val1 = 0.0;
		this.val2 = 0.0;
		this.val3 = 0.0;
	}

	public BufferedImage GraficaCir(final double val1, final double val2, final double val3) {
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(this.val1, (Comparable) "Alta", (Comparable) "Complejidad Cirugia");
		dataset.setValue(this.val2, (Comparable) "Media", (Comparable) "Complejidad Cirugia");
		dataset.setValue(this.val3, (Comparable) "Baja", (Comparable) "Complejidad Cirugia");
		final JFreeChart chart = ChartFactory.createBarChart3D("", "", "Valor", (CategoryDataset) dataset,
				PlotOrientation.VERTICAL, true, false, false);
		chart.setBackgroundPaint((Paint) new Color(240, 240, 240));
		final CategoryPlot p = chart.getCategoryPlot();
		p.setRangeGridlinePaint((Paint) Color.DARK_GRAY);
		final BufferedImage imagen = chart.createBufferedImage(176, 130);
		return imagen;
	}
}